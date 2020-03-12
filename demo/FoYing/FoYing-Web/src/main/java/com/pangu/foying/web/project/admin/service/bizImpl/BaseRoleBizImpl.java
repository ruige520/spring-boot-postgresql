package com.pangu.foying.web.project.admin.service.bizImpl;

import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.dto.req.ReqEntityByIdsDTO;
import com.pangu.foying.commom.dto.req.ReqPaginationDTO;
import com.pangu.foying.commom.pgenum.SystemEnum;
import com.pangu.foying.commom.util.CommomUtil;
import com.pangu.foying.commom.util.DTOMappingUtil;
import com.pangu.foying.commom.wrapper.response.ListTResponse;
import com.pangu.foying.commom.wrapper.response.PageTResponse;
import com.pangu.foying.commom.wrapper.response.TResponse;
import com.pangu.foying.web.commom.constant.RoleTypeEnum;
import com.pangu.foying.web.project.admin.dto.req.ReqAddBaseRoleDTO;
import com.pangu.foying.web.project.admin.dto.req.ReqUpdateBaseNavigationRoleDTO;
import com.pangu.foying.web.project.admin.dto.req.ReqUpdateBaseRoleDTO;
import com.pangu.foying.web.project.admin.dto.res.ResGetBaseNavForRoleDTO;
import com.pangu.foying.web.project.admin.dto.res.ResGetBaseRoleDTO;
import com.pangu.foying.web.project.admin.dto.res.ResGetBaseRolePageDTO;
import com.pangu.foying.web.project.admin.dto.res.ResGetSubBaseNavForRoleDTO;
import com.pangu.foying.web.project.admin.entity.*;
import com.pangu.foying.web.project.admin.mapper.*;
import com.pangu.foying.web.project.admin.service.biz.BaseRoleBiz;
import com.pangu.foying.web.project.admin.util.SetPGEntityFieldUtil;
import com.pangu.foying.web.project.admin.util.shiro.ShiroKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/18 16:45
 * @Modified By
 */
@Service
public class BaseRoleBizImpl implements BaseRoleBiz {
    // dto映射工具
    private DTOMappingUtil mapper = DTOMappingUtil.getInstance();
    @Autowired
    private BaseRoleMapper baseRoleMapper;
    @Autowired
    private BaseNavigationMapper baseNavigationMapper;
    @Autowired
    private BaseManagerRoleMapper baseManagerRoleMapper;
    @Autowired
    private BaseOrganizeRoleMapper baseOrganizeRoleMapper;
    @Autowired
    private BaseNavigationRoleMapper baseNavigationRoleMapper;
    /**
     * @param dto
     * @Description 添加角色
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    @Transactional
    @Override
    public TResponse<?> addBaseRole(ReqAddBaseRoleDTO dto) {
        try {
            BaseRoleExample baseRoleExample = new BaseRoleExample();
            baseRoleExample.createCriteria().andRoleEncodeEqualTo(dto.getRoleEncode()).andDeleteMarkEqualTo(false);
            int count = baseRoleMapper.countByExample(baseRoleExample);
            if (count > 0) {
                return TResponse.error("添加角色失败,角色编号已存在");
            }
            //转化
            BaseRole entity = mapper.map(dto, BaseRole.class);
            String id = CommomUtil.getUUID();
            entity.setId(id);
            entity.setIsSys(true);//默认属于系统角色
            SetPGEntityFieldUtil.setAddMethod(entity);
            //保存
            int result = baseRoleMapper.insert(entity);
            if (result > 0) {
                //添加组织机构角色关系
                if (CommomUtil.isNotNullOrEmpty(dto.getBaseOrgIds())){
                    String[] orgIds = dto.getBaseOrgIds().split(",");
                    BaseOrganizeRole item = null;
                    for (String orgId : orgIds){
                        item = new BaseOrganizeRole();
                        item.setId(CommomUtil.getUUID());
                        item.setBaseOrganizeId(orgId);
                        item.setBaseRoleId(id);
                        baseOrganizeRoleMapper.insert(item);
                    }
                }
                //添加导航栏角色关系
                if (CommomUtil.isNotNullOrEmpty(dto.getBaseNavIds())){
                    String[] navIds = dto.getBaseNavIds().split(",");
                    BaseNavigationRole item = null;
                    for (String navId : navIds){
                        item = new BaseNavigationRole();
                        item.setId(CommomUtil.getUUID());
                        item.setBaseNavigationId(navId);
                        item.setBaseRoleId(id);
                        baseNavigationRoleMapper.insert(item);
                    }
                }
                return TResponse.success("添加角色成功");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return TResponse.error("添加角色失败");
    }

    /**
     * @param dto
     * @Description 分页查询角色列表
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    @Override
    public PageTResponse<?> getBaseRoleByPage(ReqPaginationDTO dto) {
        try {
            BaseRoleExample baseRoleExample = new BaseRoleExample();
            if(CommomUtil.isNotNullOrEmpty(dto.getKeyword())) {
                //a and ( b or c ) = ( a and b) or ( a and c )
                baseRoleExample.createCriteria().andDeleteMarkEqualTo(false).andRoleEncodeLike('%' + dto.getKeyword() + '%');
                baseRoleExample.or().andDeleteMarkEqualTo(false).andRoleNameLike('%' + dto.getKeyword() + '%');
                baseRoleExample.or().andDeleteMarkEqualTo(false).andRoleTypeLike('%' + dto.getKeyword() + '%');
            } else {
                baseRoleExample.createCriteria().andDeleteMarkEqualTo(false);
            }
            int count = baseRoleMapper.countByExample(baseRoleExample);
            if (count <= 0) {
                return PageTResponse.error("查询不到角色列表");
            }
            //总页数
            int pageCount = (count + dto.getRows() - 1)/dto.getRows();
            baseRoleExample.setOrderByClause("sortCode asc, modifyTime desc");
            baseRoleExample.setPageIndex(dto.getPage());
            baseRoleExample.setPageSize(dto.getRows());
            List<BaseRole> list = baseRoleMapper.selectByExampleByPage(baseRoleExample);
            if (list == null || list.isEmpty()){
                return PageTResponse.error("查询不到角色列表");
            }
            List<ResGetBaseRolePageDTO> listDto = new ArrayList<>(list.size());
            ResGetBaseRolePageDTO roleDTO = null;
            for (BaseRole role : list){
                roleDTO = mapper.map(role, ResGetBaseRolePageDTO.class);
                if (RoleTypeEnum.SuperManager.name().equals(roleDTO.getRoleType())){
                    roleDTO.setRoleType(RoleTypeEnum.SuperManager.getDescribe());
                } else {
                    roleDTO.setRoleType(RoleTypeEnum.SystemManager.getDescribe());
                }
                listDto.add(roleDTO);
            }
            PageTResponse<ResGetBaseRolePageDTO> response = new PageTResponse<>();
            response.set_ResCode(SystemEnum.SUCCESS.get_ResCode());
            response.set_ResMsg("获取角色列表成功");
            response.setEntityList(listDto);
            response.setPageCount((int)pageCount);
            response.setRecordCount(count);
            response.setPageIndex(dto.getPage());
            response.setPageSize(dto.getRows());
            return response;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param dto
     * @Description 获取角色信息
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    @Override
    public TResponse<?> getBaseRole(ReqEntityByIdDTO dto) {
        try {
            BaseRole entity = baseRoleMapper.selectByPrimaryKey(dto.getId());
            if (entity == null){
                return TResponse.error("获取角色信息失败");
            }
            ResGetBaseRoleDTO resDto = mapper.map(entity, ResGetBaseRoleDTO.class);
            //获取组织机构Id
            BaseOrganizeRoleExample baseOrganizeRoleExample = new BaseOrganizeRoleExample();
            baseOrganizeRoleExample.createCriteria().andBaseRoleIdEqualTo(entity.getId());
            List<BaseOrganizeRole> list = baseOrganizeRoleMapper.selectByExample(baseOrganizeRoleExample);
            if (list != null && !list.isEmpty()) {
                resDto.setBaseOrgIds(list.get(0).getBaseOrganizeId());
            }
            TResponse<ResGetBaseRoleDTO> response = new TResponse<>();
            response.setEntity(resDto);
            response.set_ResCode(SystemEnum.SUCCESS.get_ResCode());
            return response;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param dto
     * @Description 修改角色信息
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    @Transactional
    @Override
    public TResponse<?> updateBaseRole(ReqUpdateBaseRoleDTO dto) {
        try {
            BaseRole entity = baseRoleMapper.selectByPrimaryKey(dto.getId());
            if (entity == null){
                return TResponse.error("获取角色信息失败");
            }
            if (!entity.getRoleEncode().equals(dto.getRoleEncode())){
                BaseRoleExample baseRoleExample = new BaseRoleExample();
                baseRoleExample.createCriteria().andRoleEncodeEqualTo(dto.getRoleEncode()).andDeleteMarkEqualTo(false);
                int count = baseRoleMapper.countByExample(baseRoleExample);
                if (count > 0) {
                    return TResponse.error("修改角色信息失败,角色编号已存在");
                }
            }
            entity.setRoleEncode(dto.getRoleEncode());
            entity.setRoleType(dto.getRoleType());
            entity.setRoleName(dto.getRoleName());
            entity.setRemark(dto.getRemark());
            entity.setSortCode(dto.getSortCode());
            SetPGEntityFieldUtil.setModifyMethod(entity);
            //保存
            baseRoleMapper.updateByPrimaryKey(entity);
            //修改机构角色关系
            BaseOrganizeRoleExample baseOrganizeRoleExample = new BaseOrganizeRoleExample();
            baseOrganizeRoleExample.createCriteria().andBaseRoleIdEqualTo(entity.getId());
            baseOrganizeRoleMapper.deleteByExample(baseOrganizeRoleExample);
            BaseOrganizeRole baseOrganizeRole = new BaseOrganizeRole();
            baseOrganizeRole.setId(CommomUtil.getUUID());
            baseOrganizeRole.setBaseRoleId(entity.getId());
            baseOrganizeRole.setBaseOrganizeId(dto.getBaseOrgIds());
            baseOrganizeRoleMapper.insert(baseOrganizeRole);
            return TResponse.success("修改角色信息成功");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param dto
     * @Description 删除角色信息
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    @Transactional
    @Override
    public TResponse<?> deleteBaseRole(ReqEntityByIdsDTO dto) {
        try {
            List<String> values = Arrays.asList(dto.getIds().split(","));
            BaseRoleExample baseRoleExample = new BaseRoleExample();
            baseRoleExample.createCriteria().andIdIn(values);
            List<BaseRole> list = baseRoleMapper.selectByExample(baseRoleExample);
            if (list == null || list.isEmpty()){
                return TResponse.error("删除角色失败，查询不到角色信息");
            }
            for (BaseRole entity : list){
                SetPGEntityFieldUtil.setDeleteMethod(entity);//删除
                baseRoleMapper.updateByPrimaryKey(entity);
            }
            //删除管理员角色关联
            BaseManagerRoleExample baseManagerRoleExample = new BaseManagerRoleExample();
            baseManagerRoleExample.createCriteria().andBaseRoleIdIn(values);
            baseManagerRoleMapper.deleteByExample(baseManagerRoleExample);
            //删除机构角色关联
            BaseOrganizeRoleExample baseOrganizeRoleExample = new BaseOrganizeRoleExample();
            baseOrganizeRoleExample.createCriteria().andBaseRoleIdIn(values);
            baseOrganizeRoleMapper.deleteByExample(baseOrganizeRoleExample);
            //删除导航角色关联
            BaseNavigationRoleExample baseNavigationRoleExample = new BaseNavigationRoleExample();
            baseNavigationRoleExample.createCriteria().andBaseRoleIdIn(values);
            baseNavigationRoleMapper.deleteByExample(baseNavigationRoleExample);
            return TResponse.success("删除角色成功");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @Description 获取所有角色列表
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    @Override
    public ListTResponse<?> getAllBaseRole() {
        try {
            BaseRoleExample baseRoleExample = new BaseRoleExample();
            baseRoleExample.createCriteria().andDeleteMarkEqualTo(false);
            List<BaseRole> list = baseRoleMapper.selectByExample(baseRoleExample);
            if (list == null || list.isEmpty()){
                return ListTResponse.error("获取角色列表失败");
            }
            List<ResGetBaseRoleDTO> listDto = mapper.mapList(list, ResGetBaseRoleDTO.class);
            ListTResponse<ResGetBaseRoleDTO> response = new ListTResponse<>(SystemEnum.SUCCESS.get_ResCode(), "获取角色列表成功");
            response.setEntityList(listDto);
            return response;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param dto
     * @Description 修改导航栏角色
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    @Transactional
    @Override
    public TResponse<?> updateBaseNavigationRole(ReqUpdateBaseNavigationRoleDTO dto) {
        try {
            //先删除对应的导航栏角色关系
            BaseNavigationRoleExample baseNavigationRoleExample = new BaseNavigationRoleExample();
            baseNavigationRoleExample.createCriteria().andBaseRoleIdEqualTo(dto.getBaseRoleId());
            baseNavigationRoleMapper.deleteByExample(baseNavigationRoleExample);
            //清理权限缓存
            BaseManagerRoleExample baseManagerRoleExample = new BaseManagerRoleExample();
            baseManagerRoleExample.createCriteria().andBaseRoleIdEqualTo(dto.getBaseRoleId());
            List<BaseManagerRole> baseManagerRoles = baseManagerRoleMapper.selectByExample(baseManagerRoleExample);
            if (baseManagerRoles != null && !baseManagerRoles.isEmpty()) {
                for (BaseManagerRole baseManagerRole : baseManagerRoles) {
                    ShiroKit.clearCachedAuthorizationInfo(baseManagerRole.getBaseManagerId());
                }
            }
            if (CommomUtil.isNullOrEmpty(dto.getBaseNavIds())){
                return TResponse.success("修改导航栏角色关系成功");
            }
            //添加导航栏角色关系
            String[] navIds = dto.getBaseNavIds().split(",");
            BaseNavigationRole item = null;
            for (String navId : navIds){
                item = new BaseNavigationRole();
                item.setId(CommomUtil.getUUID());
                item.setBaseNavigationId(navId);
                item.setBaseRoleId(dto.getBaseRoleId());
                baseNavigationRoleMapper.insert(item);
            }
            return TResponse.success("修改导航栏角色关系成功");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @Description 获取导航栏列表用于角色添加
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    @Override
    public ListTResponse<?> getNavForRoleAdd() {
        try {
            List<ResGetBaseNavForRoleDTO> listDto = getNavForRole();
            if (listDto == null) {
                return ListTResponse.error("获取不到导航栏列表");
            }
            ListTResponse<ResGetBaseNavForRoleDTO> response = new ListTResponse<>();
            response.setEntityList(listDto);
            response.set_ResCode(SystemEnum.SUCCESS.get_ResCode());
            response.set_ResMsg("获取导航栏列表成功");
            return response;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param dto
     * @Description 获取导航栏列表用于角色绑定导航栏
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    @Override
    public ListTResponse<?> getNavForRoleEdit(ReqEntityByIdDTO dto) {
        try {
            List<ResGetBaseNavForRoleDTO> listDto = getNavForRole();
            if (listDto == null) {
                return ListTResponse.error("获取不到导航栏列表");
            }
            BaseNavigationRoleExample baseNavigationRoleExample = new BaseNavigationRoleExample();
            baseNavigationRoleExample.createCriteria().andBaseRoleIdEqualTo(dto.getId());
            List<BaseNavigationRole> baseNavigationRoles = baseNavigationRoleMapper.selectByExample(baseNavigationRoleExample);
            if (baseNavigationRoles != null && !baseNavigationRoles.isEmpty()) { ;
                for (BaseNavigationRole item : baseNavigationRoles){
                    for (ResGetBaseNavForRoleDTO navForRoleDTO : listDto) {
                        if (item.getBaseNavigationId().equals(navForRoleDTO.getPrimarykey())){
                            navForRoleDTO.setCheckArr(new ResGetSubBaseNavForRoleDTO("1"));//该导航拉被选中
                        }
                    }
                }
            }
            ListTResponse<ResGetBaseNavForRoleDTO> response = new ListTResponse<>();
            response.setEntityList(listDto);
            response.set_ResCode(SystemEnum.SUCCESS.get_ResCode());
            response.set_ResMsg("获取导航栏列表成功");
            return response;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private List<ResGetBaseNavForRoleDTO> getNavForRole(){
        BaseNavigationExample baseNavigationExample = new BaseNavigationExample();
        baseNavigationExample.createCriteria().andDeleteMarkEqualTo(false).andIsLockEqualTo(false);
        baseNavigationExample.setOrderByClause("sortCode asc, addTime asc");
        List<BaseNavigation> baseNavigations = baseNavigationMapper.selectByExample(baseNavigationExample);
        if (baseNavigations == null || baseNavigations.isEmpty()){
            return null;
        }
        return this.getBaseNavigationPage(baseNavigations);
    }

    /*
     * 将 BaseNavigation对象列表分层(用于前台展示)
     *
     * @param listBaseNavigation 导航的父节点，0 表示从顶层开始分层
     * @param NavigationType     导航类型暂时用不到，以后可以进行System、业务导航的分类
     */
    private List<ResGetBaseNavForRoleDTO> getBaseNavigationPage(List<BaseNavigation> listBaseNavigation) {
        List<ResGetBaseNavForRoleDTO> listDto = new ArrayList<>(listBaseNavigation.size());
        ResGetBaseNavForRoleDTO top = new ResGetBaseNavForRoleDTO();
        //mainId
        top.setId(0);
        getBaseNavigationSubPage(listBaseNavigation, listDto, top, -1);
        return listDto;
    }

    private void getBaseNavigationSubPage(List<BaseNavigation> listBaseNavigation, List<ResGetBaseNavForRoleDTO> listDto, ResGetBaseNavForRoleDTO parent, int classLayer) {
        classLayer++;
        ResGetBaseNavForRoleDTO dto = null;
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
            dto = mapper.map(item, ResGetBaseNavForRoleDTO.class);
            dto.setClassLayer(classLayer);
            listDto.add(dto);
            getBaseNavigationSubPage(childrenList, listDto, dto, classLayer);
        }
    }
}
