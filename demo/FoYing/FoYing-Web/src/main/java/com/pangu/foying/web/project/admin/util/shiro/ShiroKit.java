package com.pangu.foying.web.project.admin.util.shiro;

import com.pangu.foying.web.project.admin.util.shiro.realm.ShiroDBRealm;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.mgt.RealmSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;

import java.util.Random;

/**
 * @Author 陈漫斌
 * @Description Shiro 常用工具类
 * @Date 2018/12/9 16:18
 * @Modified By
 */
public class ShiroKit {
    //加密算法
    public final static String hashAlgorithmName = "MD5";

    //加密次数
    public final static int hashIterations = 1024;

    /**
     * @Description MD5 加密
     * @author 陈漫斌
     * @date 2018/4/17 15:12
     * @param password 密码
     * @param saltSource 密码盐
     * @Modified By
     */
    public static String MD5(String password, String saltSource){
        ByteSource salt = ByteSource.Util.bytes(saltSource);
        return new SimpleHash(hashAlgorithmName, password, salt, hashIterations).toString();
    }

    /**
     * 获取随机盐值
     * @param length 长度
     * @return
     */
    public static String getRandomSalt(int length) {
        if(length <= 0){
            return null;
        }
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
        //return ToolUtil.getRandomString(length);
    }

    /**
     * 获取当前 Subject（用户）
     * @return Subject
     */
    public static Subject getSubject() {
        return SecurityUtils.getSubject();
    }

    /**
     * @Description 获取 Session
     */
    public static Session getSession(){
        Session session = SecurityUtils.getSubject().getSession(true);
        return session;
    }


    public static SecurityManager getSecurityManager(){
        return SecurityUtils.getSecurityManager();
    }

    /**
     * @Description 获取登陆信息 Principal
     */
    public static Object getPrincipal(){
        return getSubject().getPrincipal();
    }

    /**
     * 清理缓存权限
     */
    public static void clearCachedAuthorizationInfo(){
        RealmSecurityManager rsm = (RealmSecurityManager)getSecurityManager();
        ShiroDBRealm shiroDBRealm = (ShiroDBRealm)rsm.getRealms().iterator().next();
        shiroDBRealm.clearCachedAuthorizationInfo();
    }

    /**
     * 清理缓存权限
     */
    public static void clearCachedAuthorizationInfo(String id){
        RealmSecurityManager rsm = (RealmSecurityManager)getSecurityManager();
        ShiroDBRealm shiroDBRealm = (ShiroDBRealm)rsm.getRealms().iterator().next();
        shiroDBRealm.clearCachedAuthorizationInfo(id);
    }

    /**
     * 清理principalsMap缓存
     */
    public static void removePrincipalsMap(String id){
        RealmSecurityManager rsm = (RealmSecurityManager)getSecurityManager();
        ShiroDBRealm shiroDBRealm = (ShiroDBRealm)rsm.getRealms().iterator().next();
        shiroDBRealm.removePrincipalsMap(id);
    }

    /**
     * 清理EhCache 认证缓存
     */
    public static void clearEhAuthenticationcache(Object key){
        Cache<Object, Object> cache = realmSecurityManager("authenticationcache");
        cache.remove(key);
    }

    /**
     * 清理EhCache 权限缓存
     */
    public static void clearEhAuthorizationcache(Object key){
        Cache<Object, Object> cache = realmSecurityManager("authorizationcache");
        cache.remove(key);
    }

    /**
     * 清理EhCache Session缓存
     */
    public static void clearEhSessioncache(Object key){
        Cache<Object, Object> cache = realmSecurityManager("shiroactivesessioncache");
        cache.remove(key);
    }

    private static Cache<Object, Object> realmSecurityManager(String cacheName){
        RealmSecurityManager rsm = (RealmSecurityManager)getSecurityManager();
        CacheManager cacheManager =  rsm.getCacheManager();
        return cacheManager.getCache(cacheName);
    }

}
