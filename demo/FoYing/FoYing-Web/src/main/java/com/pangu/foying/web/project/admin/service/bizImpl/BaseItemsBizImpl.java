package com.pangu.foying.web.project.admin.service.bizImpl;

import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.pgenum.SystemEnum;
import com.pangu.foying.commom.util.CommomUtil;
import com.pangu.foying.commom.util.DTOMappingUtil;
import com.pangu.foying.commom.wrapper.response.ListTResponse;
import com.pangu.foying.commom.wrapper.response.PageTResponse;
import com.pangu.foying.commom.wrapper.response.TResponse;
import com.pangu.foying.web.project.admin.dto.req.ReqAddBaseItemsDTO;
import com.pangu.foying.web.project.admin.dto.req.ReqEditBaseItemsDTO;
import com.pangu.foying.web.project.admin.dto.res.ResGetBaseItemsForEditDTO;
import com.pangu.foying.web.project.admin.dto.res.ResItemsListForLeftShowDTO;
import com.pangu.foying.web.project.admin.dto.res.ResItemsListForShowDTO;
import com.pangu.foying.web.project.admin.entity.BaseItems;
import com.pangu.foying.web.project.admin.entity.BaseItemsDetail;
import com.pangu.foying.web.project.admin.entity.BaseItemsDetailExample;
import com.pangu.foying.web.project.admin.entity.BaseItemsExample;
import com.pangu.foying.web.project.admin.mapper.BaseItemsDetailMapper;
import com.pangu.foying.web.project.admin.mapper.BaseItemsMapper;
import com.pangu.foying.web.project.admin.service.biz.BaseItemsBiz;
import com.pangu.foying.web.project.admin.util.SetPGEntityFieldUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : 邱杭锐
 * @Date :  2019/7/18 9:09
 * @Version : 01
 * @Description :
 * @ProjectName : FoYing
 */
@Service
public class BaseItemsBizImpl implements BaseItemsBiz {

    // dto映射工具
    private DTOMappingUtil mapper = DTOMappingUtil.getInstance();

    @SuppressWarnings("all")
    @Autowired
    private BaseItemsMapper baseItemsMapper;

    @SuppressWarnings("all")
    @Autowired
    private BaseItemsDetailMapper baseItemsDetailMapper;

    /**
     * @Author : 邱杭锐
     * @Date : 2019/7/18 10:33
     * @Version : 01
     * @Description : 添加字典信息
     * @param : [reqDto]
     * @return : com.pangu.foying.commom.wrapper.response.TResponse<?>
     */
    @Transactional
    @Override
    public TResponse<?> addBaseItems(ReqAddBaseItemsDTO reqDto) {
        try {
            //判断 字典编号 是否唯一
            BaseItemsExample example = new BaseItemsExample();
            example.setDistinct(true);
            BaseItemsExample.Criteria criteria = example.createCriteria();
            criteria.andEnCodeEqualTo(reqDto.getEnCode()).andDeleteMarkEqualTo(false);
            List<BaseItems> list = baseItemsMapper.selectByExample(example);
            if (list != null && list.size() > 0 ) {
                return TResponse.error("字典编号已存在!");
            }
            BaseItems baseItems = mapper.map(reqDto, BaseItems.class);
            baseItems.setId(CommomUtil.getUUID());
            //添加时间及用户
            SetPGEntityFieldUtil.setAddMethod(baseItems);
            //是否默认(默认为false, 表示为用户自定义添加,true表示为系统预定义添加)
            baseItems.setIsDefault(false);
            //启用标识(扩展用的，默认为true)
            baseItems.setEnabledMark(true);

            int result = baseItemsMapper.insertSelective(baseItems);
            if (result > 0) {
                return TResponse.success("添加字典成功!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return TResponse.error("添加字典失败!");
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2019/7/18 10:34
     * @Version : 01
     * @Description : 获取单个字典信息
     * @param : [reqDto]
     * @return : com.pangu.foying.commom.wrapper.response.TResponse<?>
     */
    @Override
    public TResponse<?> getBaseItemsForAdd(ReqEntityByIdDTO reqDto) {
        try {
            BaseItems baseItems = baseItemsMapper.selectByPrimaryKey(reqDto.getId());
            if (baseItems != null ) {
                return TResponse.success(baseItems,"查询成功!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return TResponse.error("查询失败!");
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2019/7/18 10:35
     * @Version : 01
     * @Description : 用于前台左边下拉展示
     * @param : []
     * @return : com.pangu.foying.commom.wrapper.response.ListTResponse<?>
     */
    @Override
    public ListTResponse<?> getBaseItemsListForLeftShow() {
        try{
            //判断 字典编号 是否唯一
            BaseItemsExample example = new BaseItemsExample();
            example.setDistinct(true);
            BaseItemsExample.Criteria criteria = example.createCriteria();
            criteria.andDeleteMarkEqualTo(false);
            List<BaseItems> baseItemsList = baseItemsMapper.selectByExample(example);
            if (!baseItemsList.isEmpty() || baseItemsList.size() > 0 ) {
                List<ResItemsListForLeftShowDTO> list = new ArrayList<ResItemsListForLeftShowDTO>(baseItemsList.size());
                for (BaseItems baseItems : baseItemsList) {
                    ResItemsListForLeftShowDTO map = mapper.map(baseItems, ResItemsListForLeftShowDTO.class);
                    list.add(map);
                }
                return new ListTResponse<ResItemsListForLeftShowDTO>(SystemEnum.SUCCESS.get_ResCode(),"查询成功!",list);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return ListTResponse.error("查询失败!");
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2019/7/18 10:36
     * @Version : 01
     * @Description : 获取单个字典信息,用于前端修改
     * @param : [reqDto]
     * @return : com.pangu.foying.commom.wrapper.response.TResponse<?>
     */
    @Override
    public TResponse<?> getSingleBaseItemsForEdit(ReqEntityByIdDTO reqDto) {
        try {
            BaseItems baseItems = baseItemsMapper.selectByPrimaryKey(reqDto.getId());
            if (baseItems != null ){
                ResGetBaseItemsForEditDTO map = mapper.map(baseItems, ResGetBaseItemsForEditDTO.class);
                return TResponse.success(map,"查询成功!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return TResponse.error("查询失败!");
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2019/7/18 10:36
     * @Version : 01
     * @Description : 用于前台弹窗展示
     * @param : []
     * @return : com.pangu.foying.commom.wrapper.response.PageTResponse<?>
     */
    @Override
    public PageTResponse<?> getBaseItemsListForShow() {
        try{
            //判断 字典编号 是否唯一
            BaseItemsExample example = new BaseItemsExample();
            example.setDistinct(true);
            BaseItemsExample.Criteria criteria = example.createCriteria();
            criteria.andDeleteMarkEqualTo(false);
            List<BaseItems> baseItemsList = baseItemsMapper.selectByExample(example);
            if(!baseItemsList.isEmpty() || baseItemsList.size() > 0){
                //将字典信息分层
                List<ResItemsListForShowDTO> listDto = layerListBaseItemsForShow(baseItemsList);
                return new PageTResponse<ResItemsListForShowDTO>(SystemEnum.SUCCESS.get_ResCode(),"查询成功!",listDto,1,1,listDto.size(),1);
            }

        }catch(Exception e){
            throw new RuntimeException(e);
        }
        return PageTResponse.error("查询失败!");
    }

    private List<ResItemsListForShowDTO> layerListBaseItemsForShow(List<BaseItems> baseItemsList) {
        List<ResItemsListForShowDTO> listDto = new ArrayList<ResItemsListForShowDTO>(baseItemsList.size());
        ResItemsListForShowDTO top = new ResItemsListForShowDTO();
        //mainId
        top.setId(0);
        layerSubListBaseOrganizeForShow(baseItemsList, listDto, top, -1);
        return listDto;
    }

    private void layerSubListBaseOrganizeForShow(List<BaseItems> baseItemsList, List<ResItemsListForShowDTO> listDto, ResItemsListForShowDTO parent, int classLayer) {
        classLayer++;
        ResItemsListForShowDTO dto = null;
        List<BaseItems> parentList = new ArrayList<BaseItems>();
        List<BaseItems> childrenList = new ArrayList<BaseItems>();
        int parentId = parent.getId();//mainId
        for(BaseItems item : baseItemsList){
            if(parentId == item.getParentId()){
                parentList.add(item);
            }else{
                childrenList.add(item);
            }
        }
        if(!parentList.isEmpty() && (parent.getId() != 0)){
            //有子节点
            parent.setIsLeaf("false");
        }else if(parentList.isEmpty() && (parent.getId() != 0)){
            //是叶子节点
            parent.setIsLeaf("true");
        }
        for(BaseItems item : parentList){
            //dto = mapper.map(item, ResItemsListForShowDTO.class);
            dto = new ResItemsListForShowDTO();
            dto.setPrimarykey(CommomUtil.isNotNullOrEmpty(item.getId())?item.getId():null);
            dto.setId(item.getMainId()>0?item.getMainId():0);
            dto.setPid(item.getParentId()>0?item.getParentId():0);
            dto.setEnCode(CommomUtil.isNotNullOrEmpty(item.getEnCode())?item.getEnCode():null);
            dto.setItemName(CommomUtil.isNotNullOrEmpty(item.getItemName())?item.getItemName():null);
            dto.setRemark(CommomUtil.isNotNullOrEmpty(item.getRemark())?item.getRemark():null);
            dto.setClassLayer(classLayer);
            listDto.add(dto);
            layerSubListBaseOrganizeForShow(childrenList, listDto, dto, classLayer);
        }
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2019/7/18 10:37
     * @Version : 01
     * @Description : 修改单个字典信息
     * @param : [reqDto]
     * @return : com.pangu.foying.commom.wrapper.response.TResponse<?>
     */
    @Transactional
    @Override
    public TResponse<?> editSingleBaseItems(ReqEditBaseItemsDTO reqDto) {
        try {
            BaseItems baseItems = baseItemsMapper.selectByPrimaryKey(reqDto.getId());
            if ( baseItems!=null ){
                //判断是否需要修改字典编号
                if (!baseItems.getEnCode().equals(reqDto.getEnCode())) {
                    //判断 字典编号 是否唯一
                    BaseItemsExample example = new BaseItemsExample();
                    example.setDistinct(true);
                    BaseItemsExample.Criteria criteria = example.createCriteria();
                    criteria.andEnCodeEqualTo(reqDto.getEnCode()).andDeleteMarkEqualTo(false);
                    List<BaseItems> list = baseItemsMapper.selectByExample(example);
                    if (list != null || list.size() > 0 ){
                        return TResponse.error("字典编号已存在!");
                    }
                    //修改字典编号
                    baseItems.setEnCode(reqDto.getEnCode());
                }

                baseItems.setParentId(reqDto.getParentId());
                baseItems.setItemName(reqDto.getItemName());
                baseItems.setRemark(reqDto.getRemark());
                baseItems.setSortCode(reqDto.getSortCode());
                //修改用户及时间
                SetPGEntityFieldUtil.setModifyMethod(baseItems);

                //修改字典信息
                int result = baseItemsMapper.updateByPrimaryKey(baseItems);
                if ( result > 0 ) {
                    return TResponse.success("修改成功!");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return TResponse.error("修改失败!");
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2019/7/18 10:37
     * @Version : 01
     * @Description :根据字典信息id,删除单个字典信息
     * @param : [reqDto]
     * @return : com.pangu.foying.commom.wrapper.response.TResponse<?>
     */
    @Transactional
    @Override
    public TResponse<?> deleteSingleBaseItems(ReqEntityByIdDTO reqDto) {
        try {
            //从数据库中获取字典信息
            BaseItems baseItems = baseItemsMapper.selectByPrimaryKey(reqDto.getId());
            if(baseItems == null || baseItems.getDeleteMark()){
                return TResponse.error("删除失败,未查询到该数据!");
            }
            //该字典为系统默认添加，无法删除
            if(baseItems.getIsDefault()){
                return TResponse.error("删除失败,该字典为系统默认添加!");
            }
            //从数据库中获取字典信息列表
            BaseItemsExample example = new BaseItemsExample();
            example.setDistinct(true);
            BaseItemsExample.Criteria criteria = example.createCriteria();
            criteria.andDeleteMarkEqualTo(false);
            List<BaseItems> listBaseItems = baseItemsMapper.selectByExample(example);

            //获取该字典信息下的子级字典信息
            List<BaseItems> newListBaseItems = getMainIdByParentId(listBaseItems, baseItems.getMainId());
            newListBaseItems.add(baseItems);

            //字典信息id列表
            List<String> baseItemsIdList = new ArrayList<String>(newListBaseItems.size());
            //字典信息enCode列表(用于删除缓存中的字典详情)
            List<String> baseItemsEncodeList = new ArrayList<String>(newListBaseItems.size());
            for(BaseItems item : newListBaseItems){
                baseItemsIdList.add(item.getId());
                baseItemsEncodeList.add(item.getEnCode());
                SetPGEntityFieldUtil.setDeleteMethod(item);
            }

            //通过对应的字典信息Id删除对应的字典详情
            //从数据库中删除字典详情列表
            List<BaseItemsDetail> listBaseItemsDetail = baseItemsDetailMapper.getBaseItemsDetailListByBaseItemsId(baseItemsIdList);
            List<BaseItemsDetail> list = new ArrayList<>();
            if(listBaseItemsDetail != null && !listBaseItemsDetail.isEmpty()){
                for(BaseItemsDetail item : listBaseItemsDetail){
                    SetPGEntityFieldUtil.setDeleteMethod(item);
                    list.add(item);
                }
            }
            //删除字典详细信息
            int result = baseItemsDetailMapper.batchUpdate(list);
            if (result <= 0) {
                return TResponse.error("删除数据失败!");
            }

            //从数据库中删除字典信息列表
            result = baseItemsMapper.batchUpdate(newListBaseItems);
            if (result > 0) {
                return TResponse.success("删除数据成功!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return TResponse.error("删除数据失败!");
    }

    private List<BaseItems> getMainIdByParentId(List<BaseItems> listBaseItems, Integer parentId) {
        List<BaseItems> mainIdList = new ArrayList<BaseItems>();
        if(listBaseItems == null || listBaseItems.isEmpty()){
            return mainIdList;
        }
        getSubMainId(listBaseItems,mainIdList,parentId);
        return mainIdList;
    }

    private void getSubMainId(List<BaseItems> listBaseItems, List<BaseItems> mainIdList, Integer parentId) {
        List<BaseItems> parentList = new ArrayList<BaseItems>();
        List<BaseItems> childrenList = new ArrayList<BaseItems>();
        for(BaseItems item : listBaseItems){
            if(parentId == item.getParentId()){
                parentList.add(item);
            }else{
                childrenList.add(item);
            }
        }
        for(BaseItems item : parentList){
            mainIdList.add(item);
            getSubMainId(childrenList,mainIdList,item.getMainId());
        }
    }
}
