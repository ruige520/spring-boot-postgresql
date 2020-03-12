package com.pangu.foying.web.project.admin.util.shiro.realm;

import com.pangu.foying.web.project.admin.dto.res.ResLoginInfoDTO;
import com.pangu.foying.web.project.admin.service.biz.ShiroServiceBiz;
import com.pangu.foying.web.project.admin.util.shiro.ShiroKit;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2018/12/9 16:16
 * @Modified By
 */
public class ShiroDBRealm extends AuthorizingRealm {
    @Autowired
    private ShiroServiceBiz shiroServiceBiz;

    private Map<String, PrincipalCollection> principalsMap = new HashMap<>();

    /**
     * @Description 认证（登陆）
     * @author 陈漫斌
     * @date 2018/12/10 10:08
     * @param token
     * @Modified By
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        return shiroServiceBiz.doGetAuthenticationInfo(token, getName());
    }

    /**
     * @Description 授权
     * @author 陈漫斌
     * @date 2018/12/10 10:08
     * @param principals
     * @Modified By
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        this.clearCache(ShiroKit.getSubject().getPrincipals());
        ResLoginInfoDTO principal = (ResLoginInfoDTO) principals.getPrimaryPrincipal();
        principalsMap.put(principal.getId(), principals);
        return shiroServiceBiz.doGetAuthorizationInfo(principals);
    }

    /**
     * @Description 密码匹配器，设置认证加密方式
     * @author 陈漫斌
     * @date 2018/12/10 10:09
     * @param credentialsMatcher
     * @Modified By
     */
    @Override
    public void setCredentialsMatcher(CredentialsMatcher credentialsMatcher) {
        HashedCredentialsMatcher md5CredentialsMatcher = new HashedCredentialsMatcher();
        md5CredentialsMatcher.setHashAlgorithmName(ShiroKit.hashAlgorithmName);
        md5CredentialsMatcher.setHashIterations(ShiroKit.hashIterations);
        super.setCredentialsMatcher(md5CredentialsMatcher);
    }

    /**
     * 清理缓存权限
     */
    public void clearCachedAuthorizationInfo() {
        this.clearCachedAuthorizationInfo(ShiroKit.getSubject().getPrincipals());
    }

    /**
     * 清理缓存权限
     */
    public synchronized void clearCachedAuthorizationInfo(String id) {
        this.clearCachedAuthorizationInfo(principalsMap.get(id));
    }

    /**
     * 清理principalsMap缓存
     */
    public synchronized void removePrincipalsMap(String id) {
        principalsMap.remove(id);
    }
}
