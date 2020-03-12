package com.pangu.foying.web.project.admin.service.bizImpl;

import com.pangu.foying.commom.util.DTOMappingUtil;
import com.pangu.foying.web.commom.constant.RoleTypeEnum;
import com.pangu.foying.web.project.admin.dto.res.ResLoginInfoDTO;
import com.pangu.foying.web.project.admin.entity.*;
import com.pangu.foying.web.project.admin.mapper.*;
import com.pangu.foying.web.project.admin.service.biz.ShiroServiceBiz;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/16 17:36
 * @Modified By
 */
@Service
public class ShiroServiceBizImpl implements ShiroServiceBiz {
    // dto映射工具
    private DTOMappingUtil mapper = DTOMappingUtil.getInstance();
    @Autowired
    private BaseManagerMapper baseManagerMapper;
    @Autowired
    private BaseRoleMapper baseRoleMapper;
    @Autowired
    private BaseNavigationMapper baseNavigationMapper;
    @Autowired
    private BaseManagerRoleMapper baseManagerRoleMapper;
    @Autowired
    private BaseNavigationRoleMapper baseNavigationRoleMapper;

    /**
     * @param token
     * @param realmName
     * @Description 认证（登陆）
     * @author 陈漫斌
     * @date 2018/12/12 9:51
     * @Modified By
     */
    @Override
    public AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token, String realmName) throws AuthenticationException {
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        //账号
        String account = upToken.getUsername();
        BaseManagerExample example = new BaseManagerExample();
        example.setDistinct(true);
        BaseManagerExample.Criteria criteria = example.createCriteria();
        criteria.andDeleteMarkEqualTo(false).andAccountEqualTo(account);
        List<BaseManager> list = baseManagerMapper.selectByExample(example);
        if(list == null || list.size() != 1){
            throw new UnknownAccountException("未知账号");
        }
        BaseManager baseManager = list.get(0);
        if(baseManager.getIsLock()){
            throw new LockedAccountException("账号被禁用");
        }
        //管理员信息
        ResLoginInfoDTO principal = mapper.map(baseManager, ResLoginInfoDTO.class);
        //密码
        Object credentials = baseManager.getPassword();
        //密码盐
        ByteSource credentialsSalt = ByteSource.Util.bytes(baseManager.getSalt());
        //获取角色列表
        List<BaseRole> baseRoles = getBaseRoles(principal.getId());
        if (baseRoles != null && !baseRoles.isEmpty()) {
            String roleName = "";
            for (BaseRole role : baseRoles) {
                roleName = roleName + role.getRoleName();
            }
            principal.setRoleName(roleName);
        }
        //密码验证
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, credentials, credentialsSalt, realmName);
        return info;
    }

    /**
     * @param principals
     * @Description 授权
     * @author 陈漫斌
     * @date 2018/12/12 9:45
     * @Modified By
     */
    @Override
    public AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        try {
            //管理员信息
            ResLoginInfoDTO principal = (ResLoginInfoDTO) principals.getPrimaryPrincipal();
            // 角色列表
            List<BaseRole> baseRoles = getBaseRoles(principal.getId());
            if(baseRoles == null || baseRoles.isEmpty()){
                return info;
            }
            Set<String> roles = new HashSet<>();
            boolean isSuper = false;
            List<String> values = new ArrayList<>();
            for (BaseRole role : baseRoles){
                values.add(role.getId());
                roles.add(role.getRoleEncode());
                if(RoleTypeEnum.SuperManager.toString().equals(role.getRoleType())){
                    isSuper = true;//是否为超级管理员
                }
            }
            info.addRoles(roles);

            // 权限列表
            Set<String> perms = new HashSet<String>();
            if(isSuper){
                perms.add("*:*:*");
            }
            BaseNavigationRoleExample baseNavigationRoleExample = new BaseNavigationRoleExample();
            baseNavigationRoleExample.createCriteria().andBaseRoleIdIn(values);
            List<BaseNavigationRole> baseNavigationRoles = baseNavigationRoleMapper.selectByExample(baseNavigationRoleExample);
            if (baseNavigationRoles == null || baseNavigationRoles.isEmpty()){
                info.addStringPermissions(perms);
                return info;
            }
            values.clear();
            for (BaseNavigationRole item : baseNavigationRoles) {
                values.add(item.getBaseNavigationId());
            }
            List<String> types = new ArrayList<>(2);
            types.add("control");
            types.add("page");
            BaseNavigationExample baseNavigationExample = new BaseNavigationExample();
            baseNavigationExample.createCriteria()
                    .andIsLockEqualTo(false)
                    .andDeleteMarkEqualTo(false)
                    .andNavigationTypeIn(types)
                    .andIdIn(values);
            List<BaseNavigation> baseNavigations = baseNavigationMapper.selectByExample(baseNavigationExample);
            if(baseNavigations != null && !baseNavigations.isEmpty()){
                for (BaseNavigation item : baseNavigations){
                    perms.add(item.getActionType());
                }
            }
            info.addStringPermissions(perms);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return info;
    }

    //获取角色列表
    private List<BaseRole> getBaseRoles(String managerId) {
        BaseManagerRoleExample baseManagerRoleExample = new BaseManagerRoleExample();
        baseManagerRoleExample.createCriteria().andBaseManagerIdEqualTo(managerId);
        List<BaseManagerRole> baseManagerRoles = baseManagerRoleMapper.selectByExample(baseManagerRoleExample);
        if(baseManagerRoles == null || baseManagerRoles.isEmpty()){
            return null;
        }
        List<String> values = new ArrayList<>(baseManagerRoles.size());
        for (BaseManagerRole item : baseManagerRoles) {
            values.add(item.getBaseRoleId());
        }
        BaseRoleExample baseRoleExample = new BaseRoleExample();
        baseRoleExample.createCriteria().andIdIn(values);
        List<BaseRole> list = baseRoleMapper.selectByExample(baseRoleExample);
        return list;
    }
}
