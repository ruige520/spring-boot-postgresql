package com.pangu.foying.web.project.admin.service.biz;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/16 17:35
 * @Modified By
 */
public interface ShiroServiceBiz {
    /**
     * @Description 认证（登陆）
     * @author 陈漫斌
     * @date 2018/12/12 9:51
     * @param token
     * @param realmName
     * @Modified By
     */
    AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token, String realmName) throws AuthenticationException;

    /**
     * @Description 授权
     * @author 陈漫斌
     * @date 2018/12/12 9:45
     * @param principals
     * @Modified By
     */
    AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals);
}
