package com.pangu.foying.web.project.admin.service.bizImpl;

import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.web.project.admin.dto.res.ResGetOrgForEditDTO;
import com.pangu.foying.commom.pgenum.SystemEnum;
import com.pangu.foying.commom.util.CommomUtil;
import com.pangu.foying.commom.util.DTOMappingUtil;
import com.pangu.foying.commom.wrapper.response.ListTResponse;
import com.pangu.foying.commom.wrapper.response.TResponse;
import com.pangu.foying.web.project.admin.dto.req.ReqAddBaseOrganizeDTO;
import com.pangu.foying.web.project.admin.dto.req.ReqEditBaseOrganizeDTO;
import com.pangu.foying.web.project.admin.dto.res.ResOrgListForAddOrEditDTO;
import com.pangu.foying.web.project.admin.dto.res.ResOrgListForShowDTO;
import com.pangu.foying.web.project.admin.entity.BaseOrganize;
import com.pangu.foying.web.project.admin.entity.BaseOrganizeExample;
import com.pangu.foying.web.project.admin.mapper.BaseOrganizeMapper;
import com.pangu.foying.web.project.admin.service.biz.BaseOrganizeBiz;
import com.pangu.foying.web.project.admin.util.SetPGEntityFieldUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class BaseOrganizeBizImpl implements BaseOrganizeBiz{
    // dto映射工具
    private DTOMappingUtil mapper = DTOMappingUtil.getInstance();

    @SuppressWarnings("ALL")
    @Autowired
    private BaseOrganizeMapper baseOrganizeMapper;

    /**
     * 添加单个组织架构
     *
     * @param reqDto
     * @return
     */
    @Transactional
    @Override
    public TResponse<?> addBaseOrganize(ReqAddBaseOrganizeDTO reqDto) {
        try {
            List<BaseOrganize> baseOrganizeList = getBaseOrganizes(reqDto.getOrganizeEnCode());
            if (baseOrganizeList != null && !baseOrganizeList.isEmpty())
                return TResponse.error("机构编号已存在");
            else {
                BaseOrganize baseOrganize = mapper.map(reqDto, BaseOrganize.class);
                SetPGEntityFieldUtil.setAddMethod(baseOrganize);
                //删除标识
                baseOrganize.setDeleteMark(false);
                //排序标号
                baseOrganize.setSortCode(reqDto.getSortCode());
                String id = CommomUtil.getUUID();
                baseOrganize.setId(id);
                int insert = baseOrganizeMapper.insertSelective(baseOrganize);
                if (insert > 0){
                    return TResponse.success("新增机构成功");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return TResponse.error("新增机构失败");
    }

    /**
     * 该方法返回组织机构列表,用于添加机构时下拉选择父机构
     *
     * @return
     */
    @Override
    public ListTResponse<?> getBaseOrganizeListForAdd() {
        ListTResponse listTResponse = new ListTResponse();
        try {
            BaseOrganizeExample example = new BaseOrganizeExample();
            example.setDistinct(true);
            BaseOrganizeExample.Criteria criteria = example.createCriteria();
            criteria.andDeleteMarkEqualTo(false);
            List<BaseOrganize> list = baseOrganizeMapper.selectByExample(example);
            if (list == null && list.isEmpty())
                return ListTResponse.error("获取不到组织架构列表");
            else {
                //将组织机构分层
                List<ResOrgListForAddOrEditDTO> listDto = layerListBaseOrganizeForAddOrEdit(list);
                listTResponse.setEntityList(listDto);
                listTResponse.set_ResCode(SystemEnum.SUCCESS.get_ResCode());
                listTResponse.set_ResMsg("获取组织架构列表成功");
                return listTResponse;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 将组织列表分层用于前台展示
     *
     * @param
     * @return
     */
    @Transactional
    @Override
    public ListTResponse<?> getBaseOrganizeListForShow() {
        ListTResponse listTResponse = new ListTResponse();
        try {
            //获取组织机构列表
            BaseOrganizeExample example = new BaseOrganizeExample();
            example.setDistinct(true);
            BaseOrganizeExample.Criteria criteria = example.createCriteria();
            criteria.andDeleteMarkEqualTo(false);
            List<BaseOrganize> list = baseOrganizeMapper.selectByExample(example);
            if (list == null && list.isEmpty())
                return ListTResponse.error("获取不到组织架构列表");
            //将组织机构分层
            List<ResOrgListForShowDTO> listDto = layerListBaseOrganizeForShow(list);
            listTResponse.setEntityList(listDto);
            listTResponse.set_ResCode(SystemEnum.SUCCESS.get_ResCode());
            listTResponse.set_ResMsg("获取组织架构列表成功");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return listTResponse;
    }

    /**
     * 根据id获取组织架构用于前台修改
     *
     * @param reqDto
     * @return
     */
    @Override
    public TResponse<?> getSingleBaseOrganizeForEdit(ReqEntityByIdDTO reqDto) {
        try {
            List<BaseOrganize> baseOrganizeList = getBaseOrganizesById(reqDto.getId());
            if (baseOrganizeList == null || baseOrganizeList.isEmpty())
                return TResponse.error("未找到该条数据");
            else {
                //转化
                ResGetOrgForEditDTO dto = mapper.map(baseOrganizeList.get(0), ResGetOrgForEditDTO.class);
                return TResponse.success(dto, "查询成功");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 根据id编辑组织架构
     *
     * @param reqDto
     * @return
     */
    @Transactional
    @Override
    public TResponse<?> editBaseOrganize(ReqEditBaseOrganizeDTO reqDto) {
        try {
            List<BaseOrganize> baseOrganizeList = getBaseOrganizesById(reqDto.getId());
            if (baseOrganizeList == null || baseOrganizeList.isEmpty())
                return TResponse.error("删除失败!未找到该条数据");
            else {
                BaseOrganize baseOrganize = baseOrganizeList.get(0);
                if (!baseOrganize.getOrganizeEnCode().equals(reqDto.getOrganizeEnCode())) {
                    List<BaseOrganize> baseOrganizeList1 = getBaseOrganizesByIdCode(reqDto.getOrganizeEnCode(), reqDto.getId());
                    if (baseOrganizeList1 != null && !baseOrganizeList1.isEmpty()) {
                        return TResponse.error("机构编号已存在");
                    }

                }
                baseOrganize.setParentId(reqDto.getParentId());
                baseOrganize.setOrganizeName(reqDto.getOrganizeName());
                baseOrganize.setOrganizeEnCode(reqDto.getOrganizeEnCode());
                baseOrganize.setName(reqDto.getName());
                baseOrganize.setMobilePhone(reqDto.getMobilePhone());
                baseOrganize.setWeChat(reqDto.getWeChat());
                baseOrganize.setTelephone(reqDto.getTelephone());
                baseOrganize.setEmail(reqDto.getEmail());
                baseOrganize.setFax(reqDto.getFax());
                baseOrganize.setAddress(reqDto.getAddress());
                baseOrganize.setRemark(reqDto.getRemark());
                SetPGEntityFieldUtil.setModifyMethod(baseOrganize);
                int result = baseOrganizeMapper.updateByPrimaryKey(baseOrganize);
                if (result> 0) {
                    return TResponse.success("修改组织机构成功");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return TResponse.error("修改组织架构失败");
    }

    /**
     * 根据id删除组织架构
     *
     * @param reqDto
     * @return
     */
    @Transactional
    @Override
    public TResponse<?> deleteSingleBaseOrganize(ReqEntityByIdDTO reqDto) {
        try {
            List<BaseOrganize> baseOrganizeList = getBaseOrganizesById(reqDto.getId());
            if (baseOrganizeList == null || baseOrganizeList.isEmpty())
                return TResponse.error("删除失败!未找到该条数据");
            else {
                //获取全部组织架构
                BaseOrganizeExample example = new BaseOrganizeExample();
                example.setDistinct(true);
                BaseOrganizeExample.Criteria criteria = example.createCriteria();
                criteria.andDeleteMarkEqualTo(false);
                List<BaseOrganize> baseOrganizeList1 = baseOrganizeMapper.selectByExample(example);
                //获取该机构下的子机构
                List<BaseOrganize> newBaseOrganizeList = getMainIdByParentId(baseOrganizeList1, baseOrganizeList.get(0).getMainId());
                newBaseOrganizeList.add(baseOrganizeList.get(0));
                //组织机构id列表
                List<String> orgIdList = new ArrayList<>(newBaseOrganizeList.size());
                for (BaseOrganize item : newBaseOrganizeList) {
                    orgIdList.add(item.getId());
                    SetPGEntityFieldUtil.setDeleteMethod(item);
                    item.setDeleteMark(true);
                }
                //将组织机构下所有的管理员关联关联权限
                //删除组织架构
                for (BaseOrganize baseOrganize : newBaseOrganizeList) {
                    baseOrganizeMapper.updateByPrimaryKeySelective(baseOrganize);
                }
                return TResponse.success("删除组织架构成功");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    /*
     * 判断组织机构编号是否唯一
     * @param code
     * @return
     */
    private List<BaseOrganize> getBaseOrganizes(String code) {
        //判断组织机构编号是否唯一
        BaseOrganizeExample example = new BaseOrganizeExample();
        example.setDistinct(true);
        BaseOrganizeExample.Criteria criteria = example.createCriteria();
        criteria.andDeleteMarkEqualTo(false).andOrganizeEnCodeEqualTo(code);
        List<BaseOrganize> list = baseOrganizeMapper.selectByExample(example);
        return list;
    }

    private List<BaseOrganize> getBaseOrganizesByIdCode(String code, String id) {
        //判断组织机构编号是否唯一
        BaseOrganizeExample example = new BaseOrganizeExample();
        example.setDistinct(true);
        BaseOrganizeExample.Criteria criteria = example.createCriteria();
        criteria.andDeleteMarkEqualTo(false).andOrganizeEnCodeEqualTo(code).andIdEqualTo(id);
        List<BaseOrganize> list = baseOrganizeMapper.selectByExample(example);
        return list;
    }

    /*
     * 判断组织机构id查找
     * @param id
     * @return
     */
    private List<BaseOrganize> getBaseOrganizesById(String id) {
        BaseOrganizeExample example = new BaseOrganizeExample();
        example.setDistinct(true);
        BaseOrganizeExample.Criteria criteria = example.createCriteria();
        criteria.andDeleteMarkEqualTo(false).andIdEqualTo(id);
        List<BaseOrganize> list = baseOrganizeMapper.selectByExample(example);
        //获取当前组织机构
        return list;
    }

    /*
     * 将 组织机构列表分层(用于前台添加或修改)
     *
     * @return
     */
    private List<ResOrgListForAddOrEditDTO> layerListBaseOrganizeForAddOrEdit(List<BaseOrganize> listBaseOrganize) {
        List<ResOrgListForAddOrEditDTO> listDto = new ArrayList<>(listBaseOrganize.size());
        ResOrgListForAddOrEditDTO top = new ResOrgListForAddOrEditDTO();
        //mainId
        top.setMainId(0);
        layerSubListBaseOrganizeForAddOrEdit(listBaseOrganize, listDto, top, -1);
        return listDto;
    }

    private void layerSubListBaseOrganizeForAddOrEdit(List<BaseOrganize> listBaseOrganize, List<ResOrgListForAddOrEditDTO> listDto, ResOrgListForAddOrEditDTO parent, int classLayer) {
        classLayer++;
        ResOrgListForAddOrEditDTO dto = null;
        List<BaseOrganize> parentList = new ArrayList<BaseOrganize>();
        List<BaseOrganize> childrenList = new ArrayList<BaseOrganize>();
        int parentId = parent.getMainId();//mainId
        for (BaseOrganize item : listBaseOrganize) {
            if (parentId == item.getParentId())
                parentList.add(item);
            else
                childrenList.add(item);
        }
        if (!parentList.isEmpty() && (parent.getMainId() != 0))
            //有子节点
            parent.setIsLeaf("false");
        else if (parentList.isEmpty() && (parent.getMainId() != 0))
            //是叶子节点
            parent.setIsLeaf("true");
        for (BaseOrganize item : parentList) {
            dto = mapper.map(item, ResOrgListForAddOrEditDTO.class);
            dto.setClassLayer(classLayer);
            listDto.add(dto);
            layerSubListBaseOrganizeForAddOrEdit(childrenList, listDto, dto, classLayer);
        }
    }

    private List<ResOrgListForShowDTO> layerListBaseOrganizeForShow(List<BaseOrganize> listBaseOrganize) {
        List<ResOrgListForShowDTO> listDto = new ArrayList<ResOrgListForShowDTO>(listBaseOrganize.size());
        ResOrgListForShowDTO top = new ResOrgListForShowDTO();
        //mainId
        top.setId(0);
        layerSubListBaseOrganizeForShow(listBaseOrganize, listDto, top, -1);
        return listDto;
    }

    private void layerSubListBaseOrganizeForShow(List<BaseOrganize> listBaseOrganize, List<ResOrgListForShowDTO> listDto, ResOrgListForShowDTO parent, int classLayer) {
        classLayer++;
        ResOrgListForShowDTO dto;
        List<BaseOrganize> parentList = new ArrayList<>();
        List<BaseOrganize> childrenList = new ArrayList<>();
        int parentId = parent.getId();//mainId
        for (BaseOrganize item : listBaseOrganize) {
            if (parentId == item.getParentId()) {
                parentList.add(item);
            } else {
                childrenList.add(item);
            }
        }
        if (!parentList.isEmpty() && (parent.getId() != 0)) {
            //有子节点
            parent.setIsLeaf("false");
        } else if (parentList.isEmpty() && (parent.getId() != 0)) {
            //是叶子节点
            parent.setIsLeaf("true");
        }
        for (BaseOrganize item : parentList) {
            dto = mapper.map(item, ResOrgListForShowDTO.class);
            dto.setClassLayer(classLayer);
            listDto.add(dto);
            layerSubListBaseOrganizeForShow(childrenList, listDto, dto, classLayer);
        }
    }

    /**
     * 通过父节点ID查找其下所有子节点的mainId
     *
     * @param parentId
     * @return
     */
    private List<BaseOrganize> getMainIdByParentId(List<BaseOrganize> listBaseOrganize, int parentId) {
        List<BaseOrganize> mainIdList = new ArrayList<>();
        if (listBaseOrganize == null || listBaseOrganize.isEmpty()) {
            return mainIdList;
        }
        getSubMainId(listBaseOrganize, mainIdList, parentId);
        return mainIdList;
    }

    private void getSubMainId(List<BaseOrganize> listBaseOrganize, List<BaseOrganize> mainIdList, int parentId) {
        List<BaseOrganize> parentList = new ArrayList<BaseOrganize>();
        List<BaseOrganize> childrenList = new ArrayList<BaseOrganize>();
        for (BaseOrganize item : listBaseOrganize) {
            if (parentId == item.getParentId()) {
                parentList.add(item);
            } else {
                childrenList.add(item);
            }
        }
        for (BaseOrganize item : parentList) {
            mainIdList.add(item);
            getSubMainId(childrenList, mainIdList, item.getMainId());
        }
    }

}
