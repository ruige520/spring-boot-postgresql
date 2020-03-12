package com.pangu.foying.web.project.admin.service.bizImpl;

import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.dto.req.ReqEntityByIdsDTO;
import com.pangu.foying.commom.dto.req.ReqPaginationDTO;
import com.pangu.foying.commom.pgenum.SystemEnum;
import com.pangu.foying.commom.util.CommomUtil;
import com.pangu.foying.commom.util.DTOMappingUtil;
import com.pangu.foying.commom.wrapper.response.PageTResponse;
import com.pangu.foying.commom.wrapper.response.TResponse;
import com.pangu.foying.web.project.admin.dto.req.*;
import com.pangu.foying.web.project.admin.dto.res.ResGetBaseManagerDTO;
import com.pangu.foying.web.project.admin.dto.res.ResGetBaseManagerPageDTO;
import com.pangu.foying.web.project.admin.dto.res.ResLoginInfoDTO;
import com.pangu.foying.web.project.admin.entity.*;
import com.pangu.foying.web.project.admin.mapper.BaseManagerMapper;
import com.pangu.foying.web.project.admin.mapper.BaseManagerRoleMapper;
import com.pangu.foying.web.project.admin.mapper.BaseRoleMapper;
import com.pangu.foying.web.project.admin.service.biz.BaseManagerBiz;
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
 * @Date 2019/7/17 15:40
 * @Modified By
 */
@Service
public class BaseManagerBizImpl implements BaseManagerBiz {
    // dto映射工具
    private DTOMappingUtil mapper = DTOMappingUtil.getInstance();
    @Autowired
    private BaseManagerMapper baseManagerMapper;
    @Autowired
    private BaseRoleMapper baseRoleMapper;
    @Autowired
    private BaseManagerRoleMapper baseManagerRoleMapper;

    /**
     * @param dto
     * @Description 添加管理员
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    @Transactional
    @Override
    public TResponse<?> addBaseManager(ReqAddBaseManagerDTO dto) {
        try {
            //密码复杂程度校验
            if (!CommomUtil.passwordCheck(dto.getPassword())) {
                return TResponse.error("密码必须是包含大写字母、小写字母、数字、特殊符号（不是字母，数字，下划线，汉字的字符）的8位以上组合！");
            }
            //判断账号是否已存在
            BaseManagerExample baseManagerExample = new BaseManagerExample();
            baseManagerExample.createCriteria().andDeleteMarkEqualTo(false).andAccountEqualTo(dto.getAccount());
            int count = baseManagerMapper.countByExample(baseManagerExample);
            if (count > 0) {
                return TResponse.error("添加管理员失败，账号已存在！");
            }
            //转化
            BaseManager entity = mapper.map(dto, BaseManager.class);
            //主键
            String id = CommomUtil.getUUID();
            entity.setId(id);
            //密码盐
            String salt = ShiroKit.getRandomSalt(6);
            entity.setSalt(salt);
            //MD5加密
            entity.setPassword(ShiroKit.MD5(entity.getPassword(), salt));
            entity.setIsLock(false);//默认不禁用
            SetPGEntityFieldUtil.setAddMethod(entity);
            //保存
            int result = baseManagerMapper.insert(entity);
            if (result > 0) {
                //添加角色
                if (CommomUtil.isNotNullOrEmpty(dto.getRoleIds())){
                    String[] roleIds = dto.getRoleIds().split(",");
                    BaseManagerRole item = null;
                    for (String roldId : roleIds){
                        item = new BaseManagerRole();
                        item.setId(CommomUtil.getUUID());
                        item.setBaseManagerId(id);
                        item.setBaseRoleId(roldId);
                        baseManagerRoleMapper.insert(item);
                    }
                }
                return TResponse.success("添加管理员成功");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return TResponse.error("添加管理员失败");
    }

    /**
     * @param dto
     * @Description 获取管理员信息
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    @Override
    public TResponse<?> getBaseManager(ReqEntityByIdDTO dto) {
        try {
            BaseManager entity = baseManagerMapper.selectByPrimaryKey(dto.getId());
            if (entity == null){
                return TResponse.error("获取管理员信息失败");
            }
            ResGetBaseManagerDTO resDto = mapper.map(entity, ResGetBaseManagerDTO.class);
            //获取角色列表
            List<BaseRole> baseRoles = getBaseRoles(dto.getId());
            if (baseRoles != null && !baseRoles.isEmpty()){
                String roleName = "";
                for (BaseRole role : baseRoles){
                    roleName = roleName + role.getRoleName() + " ";
                }
                resDto.setRoleName(roleName);
            }
            TResponse<ResGetBaseManagerDTO> response = new TResponse<ResGetBaseManagerDTO>();
            response.setEntity(resDto);
            response.set_ResCode(SystemEnum.SUCCESS.get_ResCode());
            response.set_ResMsg("获取管理员信息成功");
            return response;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param dto
     * @Description 修改管理员信息
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    @Transactional
    @Override
    public TResponse<?> updateBaseManager(ReqUpdateBaseManagerDTO dto) {
        try {
            BaseManager entity = baseManagerMapper.selectByPrimaryKey(dto.getId());
            if (entity == null){
                return TResponse.error("修改管理员信息失败");
            }
            entity.setRealName(dto.getRealName());
            entity.setTelephone(dto.getTelephone());
            entity.setEmail(dto.getEmail());
            entity.setRemark(dto.getRemark());
            entity.setSortCode(dto.getSortCode());
            entity.setWorkNumber(dto.getWorkNumber());
            entity.setExtentionNumber(dto.getExtentionNumber());
            SetPGEntityFieldUtil.setModifyMethod(entity);
            //保存
            baseManagerMapper.updateByPrimaryKey(entity);
            return TResponse.success("修改管理员信息成功");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param dto
     * @Description 是否禁用管理员
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    @Transactional
    @Override
    public TResponse<?> lockBaseManager(ReqLockBaseManagerDTO dto) {
        try {
            BaseManager entity = baseManagerMapper.selectByPrimaryKey(dto.getId());
            if (entity == null){
                return TResponse.error("修改管理员信息失败");
            }
            entity.setIsLock(dto.getLock());
            SetPGEntityFieldUtil.setModifyMethod(entity);
            //保存
            baseManagerMapper.updateByPrimaryKey(entity);
            return TResponse.success("修改管理员信息成功");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param dto
     * @Description 管理员绑定角色
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    @Transactional
    @Override
    public TResponse<?> updateBaseManagerRole(ReqUpdateBaseManagerRoleDTO dto) {
        try {
            //先删除对应的管理员角色信息
            BaseManagerRoleExample baseManagerRoleExample = new BaseManagerRoleExample();
            baseManagerRoleExample.createCriteria().andBaseManagerIdEqualTo(dto.getId());
            baseManagerRoleMapper.deleteByExample(baseManagerRoleExample);
            if(dto.getRoleIds() == null || dto.getRoleIds().isEmpty()){
                return TResponse.success("修改成功");
            }
            String[] roleIds = dto.getRoleIds().split(",");
            BaseManagerRole item = null;
            for (String roleId : roleIds){
                item = new BaseManagerRole();
                item.setId(CommomUtil.getUUID());
                item.setBaseManagerId(dto.getId());
                item.setBaseRoleId(roleId);
                //保存
                baseManagerRoleMapper.insert(item);
            }
            return TResponse.success("修改成功");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param dto
     * @Description 删除管理员
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    @Transactional
    @Override
    public TResponse<?> deleteBaseManager(ReqEntityByIdsDTO dto) {
        try {
            //登陆信息
            ResLoginInfoDTO principal = (ResLoginInfoDTO) ShiroKit.getPrincipal();
            String[] ids = dto.getIds().split(",");
            for (String id : ids){
                if (id.equals(principal.getId())){
                    return TResponse.error("删除管理员失败,管理员在线");
                }
            }
            BaseManagerExample baseManagerExample = new BaseManagerExample();
            baseManagerExample.createCriteria().andDeleteMarkEqualTo(false).andIdIn(Arrays.asList(ids));
            List<BaseManager> list = baseManagerMapper.selectByExample(baseManagerExample);
            if (list == null || list.isEmpty()){
                return TResponse.error("删除管理员失败，查询不到管理员信息");
            }
            List<String> values = new ArrayList<>(list.size());
            for (BaseManager entity : list){
                SetPGEntityFieldUtil.setDeleteMethod(entity);//删除
                baseManagerMapper.updateByPrimaryKey(entity);
                values.add(entity.getId());
            }
            //删除管理员角色关联
            BaseManagerRoleExample baseManagerRoleExample = new BaseManagerRoleExample();
            baseManagerRoleExample.createCriteria().andBaseManagerIdIn(values);
            baseManagerRoleMapper.deleteByExample(baseManagerRoleExample);
            return TResponse.success("删除管理员成功");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param dto
     * @Description 分页查询管理员列表
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    @Override
    public PageTResponse<?> getBaseManagerByPage(ReqPaginationDTO dto) {
        try {
            BaseManagerExample baseManagerExample = new BaseManagerExample();
            if(CommomUtil.isNotNullOrEmpty(dto.getKeyword())) {
                //a and ( b or c ) = ( a and b) or ( a and c )
                baseManagerExample.createCriteria().andDeleteMarkEqualTo(false).andAccountLike('%' + dto.getKeyword() + '%');
                baseManagerExample.or().andDeleteMarkEqualTo(false).andRealNameLike('%' + dto.getKeyword() + '%');
                baseManagerExample.or().andDeleteMarkEqualTo(false).andTelephoneLike('%' + dto.getKeyword() + '%');
            } else {
                baseManagerExample.createCriteria().andDeleteMarkEqualTo(false);
            }
            int count = baseManagerMapper.countByExample(baseManagerExample);
            if (count <= 0) {
                return PageTResponse.error("查询不到管理员列表");
            }
            //总页数
            int pageCount = (count + dto.getRows() - 1)/dto.getRows();
            baseManagerExample.setOrderByClause("sortCode asc, modifyTime desc");
            baseManagerExample.setPageIndex(dto.getPage());
            baseManagerExample.setPageSize(dto.getRows());
            List<BaseManager> list = baseManagerMapper.selectByExampleByPage(baseManagerExample);
            if (list == null || list.isEmpty()){
                return PageTResponse.error("查询不到管理员列表");
            }
            ResGetBaseManagerPageDTO managerDTO = null;
            List<ResGetBaseManagerPageDTO> listDto = new ArrayList<>(list.size());
            for (BaseManager item : list){
                managerDTO = mapper.map(item, ResGetBaseManagerPageDTO.class);
                listDto.add(managerDTO);
                //获取角色列表
                List<BaseRole> roles = getBaseRoles(managerDTO.getId());
                if (roles == null || roles.isEmpty()){
                    continue;
                }
                String roleName = "";
                for (BaseRole role : roles){
                    roleName = roleName + role.getRoleName() + " ";
                }
                managerDTO.setRoleName(roleName);
            }
            PageTResponse<ResGetBaseManagerPageDTO> response = new PageTResponse<>();
            response.set_ResCode(SystemEnum.SUCCESS.get_ResCode());
            response.set_ResMsg("获取管理员列表成功");
            response.setEntityList(listDto);
            response.setPageCount(pageCount);
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
     * @Description 修改管理员密码
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    @Transactional
    @Override
    public TResponse<?> updatePassword(ReqUpdatePasswordDTO dto) {
        try {
            //密码复杂程度校验
            if (!CommomUtil.passwordCheck(dto.getNewPassword())) {
                return TResponse.error("密码必须是包含大写字母、小写字母、数字、特殊符号（不是字母，数字，下划线，汉字的字符）的8位以上组合！");
            }
            //登陆信息
            ResLoginInfoDTO principal = (ResLoginInfoDTO) ShiroKit.getPrincipal();
            BaseManager entity = baseManagerMapper.selectByPrimaryKey(principal.getId());
            if (entity == null){
                return TResponse.error("密码修改失败，查询不到管理员信息");
            }
            String oldPassword = ShiroKit.MD5(dto.getOldPassword(), entity.getSalt());
            if (!entity.getPassword().equals(oldPassword)){
                return TResponse.error("密码修改失败，旧密码不正确");
            }
            //密码盐
            String salt = ShiroKit.getRandomSalt(6);
            entity.setSalt(salt);
            //MD5加密
            entity.setPassword(ShiroKit.MD5(dto.getNewPassword(), salt));
            SetPGEntityFieldUtil.setModifyMethod(entity);
            //保存
            baseManagerMapper.updateByPrimaryKey(entity);
            return TResponse.success("密码修改成功");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //通过管理员id,获取角色列表
    private List<BaseRole> getBaseRoles(String baseManagerId){
        BaseManagerRoleExample baseManagerRoleExample = new BaseManagerRoleExample();
        baseManagerRoleExample.createCriteria().andBaseManagerIdEqualTo(baseManagerId);
        List<BaseManagerRole> baseManagerRoles = baseManagerRoleMapper.selectByExample(baseManagerRoleExample);
        if (baseManagerRoles != null && !baseManagerRoles.isEmpty()) {
            List<String> values = new ArrayList<>(baseManagerRoles.size());
            for (BaseManagerRole item : baseManagerRoles) {
                values.add(item.getBaseRoleId());
            }
            BaseRoleExample baseRoleExample = new BaseRoleExample();
            baseRoleExample.createCriteria().andIdIn(values);
            return baseRoleMapper.selectByExample(baseRoleExample);
        }
        return null;
    }
}
