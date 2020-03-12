package com.pangu.foying.web.project.admin.service.bizImpl;

import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.pgenum.SystemEnum;
import com.pangu.foying.commom.util.CommomUtil;
import com.pangu.foying.commom.util.DTOMappingUtil;
import com.pangu.foying.commom.wrapper.response.ListTResponse;
import com.pangu.foying.commom.wrapper.response.TResponse;
import com.pangu.foying.web.commom.constant.RoleTypeEnum;
import com.pangu.foying.web.project.admin.dto.req.ReqAddBaseNavigationDTO;
import com.pangu.foying.web.project.admin.dto.req.ReqUpdateBaseNavigationDTO;
import com.pangu.foying.web.project.admin.dto.res.ResGetBaseNavigationDTO;
import com.pangu.foying.web.project.admin.dto.res.ResLoginInfoDTO;
import com.pangu.foying.web.project.admin.entity.*;
import com.pangu.foying.web.project.admin.mapper.BaseManagerRoleMapper;
import com.pangu.foying.web.project.admin.mapper.BaseNavigationMapper;
import com.pangu.foying.web.project.admin.mapper.BaseNavigationRoleMapper;
import com.pangu.foying.web.project.admin.mapper.BaseRoleMapper;
import com.pangu.foying.web.project.admin.service.biz.BaseNavigationBiz;
import com.pangu.foying.web.project.admin.util.SetPGEntityFieldUtil;
import com.pangu.foying.web.project.admin.util.shiro.ShiroKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class BaseNavigationBizImpl implements BaseNavigationBiz {
    // dto映射工具
    private DTOMappingUtil mapper = DTOMappingUtil.getInstance();
    @SuppressWarnings("ALL")
    @Autowired
    private BaseNavigationMapper baseNavigationMapper;
    @SuppressWarnings("ALL")
    @Autowired
    private BaseManagerRoleMapper baseManagerRoleMapper;
    @SuppressWarnings("ALL")
    @Autowired
    private BaseRoleMapper baseRoleMapper;
    @SuppressWarnings("ALL")
    @Autowired
    private BaseNavigationRoleMapper baseNavigationRoleMapper;
    /**
     * 查询所有导航
     *
     * @param
     * @return
     */
    @Override
    public ListTResponse<?> getAllBaseNavigation() {
        try {
            List<BaseNavigation> baseNavigationList = baseNavigationMapper.selectAll();
            if (baseNavigationList == null || baseNavigationList.isEmpty())
                return ListTResponse.error("获取不到导航栏列表");
            else {
                ListTResponse<ResGetBaseNavigationDTO> response = new ListTResponse<>();
                response.setEntityList(this.getBaseNavigationPage(baseNavigationList));
                response.set_ResCode(SystemEnum.SUCCESS.get_ResCode());
                response.set_ResMsg("获取导航栏列表成功");
                return response;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 根据id查询导航数据,用于返回给前台
     *
     * @param reqDTO
     * @return
     */
    @Override
    public TResponse<?> getBaseNavigation(ReqEntityByIdDTO reqDTO) {
        try {
            List<BaseNavigation> baseNavigationList = getBaseNavigations(reqDTO.getId());
            if (baseNavigationList == null || baseNavigationList.isEmpty())
                return TResponse.error("没有查找到数据");
            else {
                ResGetBaseNavigationDTO baseNavigationDTO = mapper.map(baseNavigationList.get(0), ResGetBaseNavigationDTO.class);
                return new TResponse<>(SystemEnum.SUCCESS.get_ResCode(), "查询成功", baseNavigationDTO);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 添加单个导航数据
     *
     * @param reqDTO
     * @return
     */
    @Transactional
    @Override
    public TResponse<?> addBaseNavigation(ReqAddBaseNavigationDTO reqDTO) {
        try {
            List<BaseNavigation> baseNavigationList = getBaseNavigationsByName(reqDTO.getNavigationName());
            if (baseNavigationList != null && !baseNavigationList.isEmpty())
                return TResponse.error("导航名称已存在");
            else {
                BaseNavigation baseNavigation = mapper.map(reqDTO, BaseNavigation.class);
                SetPGEntityFieldUtil.setAddMethod(baseNavigation);
                //删除标识
                baseNavigation.setActionType(reqDTO.getActionType());
                String id = CommomUtil.getUUID();
                baseNavigation.setId(id);
                int result = baseNavigationMapper.insertSelective(baseNavigation);
                if (result >0)
                    return TResponse.success("添加成功");
                else
                    return TResponse.error("添加失败");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 用于修改单个导航数据
     *
     * @param reqDTO
     * @return
     */
    @Transactional
    @Override
    public TResponse<?> updateBaseNavigation(ReqUpdateBaseNavigationDTO reqDTO) {
        try {
            List<BaseNavigation> baseNavigationList = getBaseNavigations(reqDTO.getId());
            if (baseNavigationList == null || baseNavigationList.isEmpty())
                return TResponse.error("查找不到数据");
            else {
                BaseNavigation baseNavigation = baseNavigationList.get(0);
                baseNavigation.setParentId(Integer.parseInt(reqDTO.getParentId()));
                baseNavigation.setNavigationType(reqDTO.getNavigationType());
                baseNavigation.setTitle(reqDTO.getTitle());
                baseNavigation.setSubTitle(reqDTO.getSubTitle());
                baseNavigation.setIconUrl(reqDTO.getIconUrl());
                baseNavigation.setLinkUrl(reqDTO.getLinkUrl());
                baseNavigation.setIsLock(reqDTO.getLock());
                baseNavigation.setActionType(reqDTO.getActionType());
                baseNavigation.setIsSys(reqDTO.getSys());
                baseNavigation.setRemark(reqDTO.getRemark());
                baseNavigation.setSortCode(reqDTO.getSortCode());
                SetPGEntityFieldUtil.setModifyMethod(baseNavigation);
                baseNavigationMapper.updateByPrimaryKey(baseNavigation);
                return TResponse.success("修改成功");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 根据id进行逻辑删除导航数据
     *
     * @param reqDTO
     * @return
     */
    @Transactional
    @Override
    public TResponse<?> deleteBaseNavigation(ReqEntityByIdDTO reqDTO) {
        try {
            List<BaseNavigation> baseNavigationListAll = getBaseNavigationAll();
            if (baseNavigationListAll == null || baseNavigationListAll.isEmpty())
                return TResponse.error("删除失败,查找不到数据");
            List<BaseNavigation> baseNavigationList = getBaseNavigations(reqDTO.getId());
            if (baseNavigationList == null || baseNavigationList.isEmpty())
                return TResponse.error("删除失败,查找不到数据");
            else {
                BaseNavigation baseNavigation = baseNavigationList.get(0);
                //查找该后台导航下的子导航
                List<BaseNavigation> newListBaseNavigation = getMainIdByParentId(baseNavigationListAll, baseNavigation.getMainId());
                newListBaseNavigation.add(baseNavigation);
                for (BaseNavigation baseNavigation1 : newListBaseNavigation) {
                    SetPGEntityFieldUtil.setDeleteMethod(baseNavigation1);
                    baseNavigationMapper.updateByPrimaryKeySelective(baseNavigation1);
                }
                return TResponse.success("删除成功");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 上传自定义小图标
     *
     * @return
     */
    @Override
    public TResponse<?> getCustomIconUpload(HttpServletRequest request, MultipartFile imgFile) {
        try {
            if (imgFile != null) {// 判断上传的文件是否为空
                String path;// 文件路径
                String type;// 文件类型
                String appointPath = "WEB-INF\\upload\\";//指定存放路径
                String fileName = imgFile.getOriginalFilename();// 文件原名称
                // 判断文件类型
                type = fileName.indexOf(".") != -1 ? fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()) : null;
                if (type != null) {// 判断文件类型是否为空
                    if ("GIF".equals(type.toUpperCase()) || "PNG".equals(type.toUpperCase()) || "JPG".equals(type.toUpperCase())) {
                        // 项目在容器中实际发布运行的根路径
                        String realPath = request.getSession().getServletContext().getRealPath("/");
                        // 自定义的文件名称
                        String trueFileName = String.valueOf(System.currentTimeMillis()) + fileName;
                        // 设置存放图片文件的路径
                        path = realPath + appointPath + trueFileName;
                        // 转存文件到指定的路径
                        imgFile.transferTo(new File(path));
                        return new TResponse<>(SystemEnum.SUCCESS.get_ResCode(), "文件成功上传到指定目录下", path);
                    } else
                        return TResponse.error("不是我们想要的文件类型,请按要求重新上传");
                } else
                    return TResponse.error("文件类型为空");
            } else
                return TResponse.error("没有找到相对应的文件");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 获取左边导航栏
     *
     * @return
     */
    @Override
    public ListTResponse<?> getNavListForLeft() {
        try {
            //管理员信息
            ResLoginInfoDTO principal = (ResLoginInfoDTO) ShiroKit.getPrincipal();
            //获取导航栏
            BaseManagerRoleExample baseManagerRoleExample = new BaseManagerRoleExample();
            baseManagerRoleExample.createCriteria().andBaseManagerIdEqualTo(principal.getId());
            List<BaseManagerRole> baseManagerRoles = baseManagerRoleMapper.selectByExample(baseManagerRoleExample);
            if(baseManagerRoles == null || baseManagerRoles.isEmpty()){
                return ListTResponse.error("获取不到导航栏列表");
            }
            List<String> values = new ArrayList<>(baseManagerRoles.size());
            values.add(baseManagerRoles.get(0).getBaseRoleId());
            for(int i = 1; i < baseManagerRoles.size(); i++){
                values.add(baseManagerRoles.get(i).getBaseRoleId());
            }
            BaseRoleExample baseRoleExample = new BaseRoleExample();
            baseRoleExample.createCriteria().andIdIn(values);
            List<BaseRole> baseRoles = baseRoleMapper.selectByExample(baseRoleExample);
            if(baseRoles == null || baseRoles.isEmpty()){
                return ListTResponse.error("获取不到导航栏列表");
            }
            boolean isSuper = false;
            for (BaseRole role : baseRoles){
                if(RoleTypeEnum.SuperManager.toString().equals(role.getRoleType())){
                    isSuper = true;//是否为超级管理员
                }
            }
            List<String> type = new ArrayList<>(2);
            type.add("dir");
            type.add("page");
            if (isSuper){
                BaseNavigationExample baseNavigationExample = new BaseNavigationExample();

                baseNavigationExample.createCriteria().andDeleteMarkEqualTo(false).andIsLockEqualTo(false).andNavigationTypeIn(type);
                baseNavigationExample.setOrderByClause("sortCode asc, addTime asc");
                List<BaseNavigation> baseNavigations = baseNavigationMapper.selectByExample(baseNavigationExample);
                if (baseNavigations == null || baseNavigations.isEmpty()){
                    return ListTResponse.error("获取不到导航栏列表");
                }
                ListTResponse<ResGetBaseNavigationDTO> response = new ListTResponse<>();
                response.setEntityList(this.getBaseNavigationPage(baseNavigations));
                response.set_ResCode(SystemEnum.SUCCESS.get_ResCode());
                response.set_ResMsg("获取导航栏列表成功");
                return response;
            }
            List<String> list = new ArrayList<>(baseRoles.size());
            list.add(baseRoles.get(0).getId());
            for(int i = 1; i < baseRoles.size(); i++){
                list.add(baseRoles.get(i).getId());
            }
            BaseNavigationRoleExample baseNavigationRoleExample = new BaseNavigationRoleExample();
            baseNavigationRoleExample.createCriteria().andBaseRoleIdIn(list);
            List<BaseNavigationRole> baseNavigationRoles = baseNavigationRoleMapper.selectByExample(baseNavigationRoleExample);
            if (baseNavigationRoles == null || baseNavigationRoles.isEmpty()){
                return ListTResponse.error("获取不到导航栏列表");
            }

            List<String> idlist = new ArrayList<>(baseNavigationRoles.size());
            idlist.add(baseNavigationRoles.get(0).getBaseNavigationId());
            for(int i = 1; i < baseNavigationRoles.size(); i++){
                idlist.add(baseNavigationRoles.get(i).getBaseNavigationId());
            }            BaseNavigationExample baseNavigationExample = new BaseNavigationExample();
            baseNavigationExample.createCriteria().andIsLockEqualTo(false).andDeleteMarkEqualTo(false).andNavigationTypeIn(type).andIdIn(idlist);
            baseNavigationExample.setOrderByClause("sortCode asc,addTime asc");
            List<BaseNavigation> baseNavigations = baseNavigationMapper.selectByExample(baseNavigationExample);
            if (baseNavigations == null || baseNavigations.isEmpty()){
                return ListTResponse.error("获取不到导航栏列表");
            }
            ListTResponse<ResGetBaseNavigationDTO> response = new ListTResponse<>();
            response.setEntityList(this.getBaseNavigationPage(baseNavigations));
            response.set_ResCode(SystemEnum.SUCCESS.get_ResCode());
            response.set_ResMsg("获取导航栏列表成功");
            return response;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /*
     * 将 BaseNavigation对象列表分层(用于前台展示)
     *
     * @param listBaseNavigation 导航的父节点，0 表示从顶层开始分层
     * @param NavigationType     导航类型暂时用不到，以后可以进行System、业务导航的分类
     */
    private List<ResGetBaseNavigationDTO> getBaseNavigationPage(List<BaseNavigation> listBaseNavigation) {
        List<ResGetBaseNavigationDTO> listDto = new ArrayList<>(listBaseNavigation.size());
        ResGetBaseNavigationDTO top = new ResGetBaseNavigationDTO();
        //mainId
        top.setId(0);
        getBaseNavigationSubPage(listBaseNavigation, listDto, top, -1);
        return listDto;
    }

    private void getBaseNavigationSubPage(List<BaseNavigation> listBaseNavigation, List<ResGetBaseNavigationDTO> listDto, ResGetBaseNavigationDTO parent, int classLayer) {
        classLayer++;
        ResGetBaseNavigationDTO dto = null;
        List<BaseNavigation> parentList = new ArrayList<BaseNavigation>();
        List<BaseNavigation> childrenList = new ArrayList<BaseNavigation>();
        int parentId = parent.getId();//mainId
        for(BaseNavigation item : listBaseNavigation){
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
        for(BaseNavigation item : parentList){
            dto = mapper.map(item, ResGetBaseNavigationDTO.class);
            dto.setClassLayer(classLayer);
            listDto.add(dto);
            getBaseNavigationSubPage(childrenList, listDto, dto, classLayer);
        }
    }

    /*
     * 通过父节点ID查找其下所有子节点的mainId
     *
     * @param listBaseNavigation
     * @param parentId
     * @return
     */
    private List<BaseNavigation> getMainIdByParentId(List<BaseNavigation> listBaseNavigation, int parentId) {
        List<BaseNavigation> mainIdList = new ArrayList<>();
        getSubMainId(listBaseNavigation, mainIdList, parentId);
        return mainIdList;
    }

    private void getSubMainId(List<BaseNavigation> listBaseNavigation, List<BaseNavigation> mainIdList, int parentId) {
        List<BaseNavigation> parentList = new ArrayList<>();
        List<BaseNavigation> childrenList = new ArrayList<>();
        for (BaseNavigation item : listBaseNavigation) {
            if (parentId == item.getParentId()) {
                parentList.add(item);
            } else {
                childrenList.add(item);
            }
        }
        for (BaseNavigation item : parentList) {
            mainIdList.add(item);
            getSubMainId(childrenList, mainIdList, item.getMainId());
        }
    }

    /*
     * 根据id查询导航栏数据
     */
    private List<BaseNavigation> getBaseNavigations(String id) {
        BaseNavigationExample example = new BaseNavigationExample();
        example.setDistinct(true);
        BaseNavigationExample.Criteria criteria = example.createCriteria();
        criteria.andDeleteMarkEqualTo(false).andIdEqualTo(id);
        List<BaseNavigation> list = baseNavigationMapper.selectByExample(example);
        return list;

    }

    /*
     * 查询所有导航栏数据
     */
    private List<BaseNavigation> getBaseNavigationAll() {
        return baseNavigationMapper.selectAll();

    }

    /*
     * 根据导航栏名称查询导航栏数据
     */
    private List<BaseNavigation> getBaseNavigationsByName(String name) {
        BaseNavigationExample example = new BaseNavigationExample();
        example.setDistinct(true);
        BaseNavigationExample.Criteria criteria = example.createCriteria();
        criteria.andDeleteMarkEqualTo(false).andNavigationNameEqualTo(name);
        List<BaseNavigation> list = baseNavigationMapper.selectByExample(example);
        return list;
    }
}
