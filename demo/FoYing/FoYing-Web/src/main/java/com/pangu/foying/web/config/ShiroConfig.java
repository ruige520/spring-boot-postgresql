package com.pangu.foying.web.config;

import com.pangu.foying.web.project.admin.util.shiro.realm.ShiroDBRealm;
import com.pangu.foying.web.project.admin.util.shiro.web.session.ShiroCacheSessionDAO;
import com.pangu.foying.web.project.admin.util.shiro.web.session.SpringSessionValidationScheduler;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.session.mgt.eis.JavaUuidSessionIdGenerator;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.LinkedHashMap;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/16 17:38
 * @Modified By
 */
@Configuration
public class ShiroConfig {
    // Session超时时间，单位为毫秒（默认30分钟）
    @Value("${shiro.session.expireTime}")
    private int expireTime;

    // 相隔多久检查一次session的有效性，单位毫秒，默validationInterval认就是10分钟
    @Value("${shiro.session.validationInterval}")
    private int validationInterval;

    // 设置Cookie的域名
    @Value("${shiro.cookie.domain}")
    private String domain;

    // 设置cookie的有效访问路径
    @Value("${shiro.cookie.path}")
    private String path;

    // 设置HttpOnly属性
    @Value("${shiro.cookie.httpOnly}")
    private boolean httpOnly;

    // 设置Cookie的过期时间，秒为单位
    @Value("${shiro.cookie.maxAge}")
    private int maxAge;

    // 设置Cookie的过期时间，秒为单位
    @Value("${shiro.cookie.sessionIdname}")
    private String sessionIdname;

    // 登录地址
    @Value("${shiro.user.loginUrl}")
    private String loginUrl;

    // 权限认证失败地址
    @Value("${shiro.user.unauthorizedUrl}")
    private String unauthorizedUrl;

    // 网页授权文件
    @Value("${wx.verifyFile}")
    private String verifyFile;


    /**
     * 全部缓存配置
     */
    @Bean
    public EhCacheManagerFactoryBean ehCacheManagerFactoryBean() {
        EhCacheManagerFactoryBean factoryBean = new EhCacheManagerFactoryBean();
        Resource configLocation = new ClassPathResource("ehcache/ehcache.xml");
        factoryBean.setConfigLocation(configLocation);
        factoryBean.setShared(true);//共用一个缓存管理器
        return factoryBean;
    }

    /**
     * 缓存管理器 使用Ehcache实现
     */
    @Bean
    public EhCacheManager shiroCacheManager() {
        EhCacheManager ehCacheManager = new EhCacheManager();
        ehCacheManager.setCacheManager(ehCacheManagerFactoryBean().getObject());
        return ehCacheManager;
    }

    /**
     * 自定义Realm
     */
    @Bean
    public ShiroDBRealm shiroDBRealm() {
        //ShiroDBRealm的父类 实现了 CacheManagerAware接口，所以会自动注入cacheManager缓存管理器
        ShiroDBRealm shiroDBRealm = new ShiroDBRealm();
        //设置认证的缓存名字，这个名字与ehcache.xml中cache节点 名称一致
        shiroDBRealm.setAuthenticationCacheName("authenticationcache");
        //是开启认证缓存，默认为false
        shiroDBRealm.setAuthenticationCachingEnabled(true);
        //设置授权的缓存名字，这个名字与ehcache.xml中cache节点 名称一致
        shiroDBRealm.setAuthorizationCacheName("authorizationcache");
        //是开启授权缓存，默认为false
        shiroDBRealm.setAuthorizationCachingEnabled(true);
        return shiroDBRealm;
    }

    /**
     * 自定义sessionFactory调度器
     */
    @Bean
    public SpringSessionValidationScheduler sessionValidationScheduler()
    {
        SpringSessionValidationScheduler sessionValidationScheduler = new SpringSessionValidationScheduler();
        // 相隔多久检查一次session的有效性，单位毫秒
        sessionValidationScheduler.setSessionValidationInterval(validationInterval * 60 * 1000);
        // 设置会话验证调度器进行会话验证时的会话管理器
        sessionValidationScheduler.setSessionManager(sessionManager());
        return sessionValidationScheduler;
    }

    /**
     * 配置Session 管理器
     */
    @Bean
    public DefaultWebSessionManager sessionManager() {
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        //session 失效时间
        sessionManager.setGlobalSessionTimeout(expireTime * 60 * 1000);
//        //session 验证失效时间（单位：毫秒）15分钟
//        sessionManager.setSessionValidationInterval(1000 * 60 * 15);
        //Session 无效后自动删除
        sessionManager.setDeleteInvalidSessions(true);
        //需要让此session可以使用该定时调度器进行检测
        sessionManager.setSessionValidationSchedulerEnabled(true);
        //定义sessionIdCookie模版可以进行操作的启用
        sessionManager.setSessionIdCookieEnabled(true);
        SimpleCookie simpleCookie = new SimpleCookie();
        //在Tomcat运行下默认使用的Cookie的名字为JSESSIONID
        simpleCookie.setName(sessionIdname);
        simpleCookie.setDomain(domain);
        simpleCookie.setPath(path);
        simpleCookie.setHttpOnly(httpOnly);//保证该系统不会受到跨域的脚本操作供给
        simpleCookie.setMaxAge(maxAge * 24 * 60 * 60);// 定义Cookie的过期时间（单位：秒）
        sessionManager.setSessionIdCookie(simpleCookie);
        // 是否定时检查session
        sessionManager.setSessionValidationSchedulerEnabled(true);
        // 去掉 JSESSIONID
        sessionManager.setSessionIdUrlRewritingEnabled(false);
        // 自定义SessionDao
        sessionManager.setSessionDAO(shiroCacheSessionDAO());
        return sessionManager;
    }

    /**
     * 针对自定义的ShiroSession的db操作，可以将session进行持久化
     */
    @Bean
    public ShiroCacheSessionDAO shiroCacheSessionDAO() {
        //ShiroCacheSessionDAO的父类 实现了 CacheManagerAware接口，所以会自动注入cacheManager缓存管理器
        ShiroCacheSessionDAO shiroCacheSessionDAO = new ShiroCacheSessionDAO();
        //设置session缓存的名字，这个名字与ehcache.xml中cache节点 名称一致
        shiroCacheSessionDAO.setActiveSessionsCacheName("shiroactivesessioncache");
        //定义该SessionDAO操作中所使用的ID生成器,使用UUID
        shiroCacheSessionDAO.setSessionIdGenerator(new JavaUuidSessionIdGenerator());
        return shiroCacheSessionDAO;
    }

//    /**
//     * shiro 自定义过滤器——太保APP访问过滤器
//     */
//    @Bean
//    public AppAccessFilter appAccessFilter() {
//        return new AppAccessFilter();
//    }
//
//    /**
//     * 将自定义 Filter 注册到 Shiro，不注册到 ApplicationFilterChain
//     */
//    @Bean
//    public FilterRegistrationBean registration() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        registration.setFilter(appAccessFilter());
//        registration.setOrder(1);
//        registration.setEnabled(false);//不注册到 ApplicationFilterChain
//        return registration;
//    }

    /**
     * shiro 安全管理器
     */
    @Bean
    public DefaultWebSecurityManager securityManager(){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //注入缓存管理器;
        securityManager.setCacheManager(shiroCacheManager());
        // 设置realm.
        securityManager.setRealm(shiroDBRealm());
        // session管理器
        securityManager.setSessionManager(sessionManager());
        return securityManager;
    }

    /**
     * shiro 安全管理器
     */
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean() {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        // Shiro的核心安全接口,这个属性是必须的
        shiroFilterFactoryBean.setSecurityManager(securityManager());
        // 身份认证失败，则跳转到登录页面的配置
        shiroFilterFactoryBean.setLoginUrl(loginUrl);
        // 权限认证失败，则跳转到指定页面
        shiroFilterFactoryBean.setUnauthorizedUrl(unauthorizedUrl);

        //加入自定义过滤器
        //shiroFilterFactoryBean.getFilters().put("appAccessFilter", appAccessFilter());

        // Shiro连接约束配置，即过滤链的定义
        LinkedHashMap<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
        filterChainDefinitionMap.put("/content/html/Home/Index.html", "authc");
        filterChainDefinitionMap.put("/content/**", "anon");//对静态资源设置匿名访问
        filterChainDefinitionMap.put("/profile/**", "anon");//上传资源设置匿名访问
        filterChainDefinitionMap.put("/foying/web/admin/Login/captchaImage", "anon");
        filterChainDefinitionMap.put("/foying/web/admin/Login/login", "anon");

        //微信公众号
        filterChainDefinitionMap.put("/" + verifyFile, "anon");
        //filterChainDefinitionMap.put("/foying/web/app/**", "appAccessFilter");//太保APP访问过滤器

        filterChainDefinitionMap.put("/**", "authc");//所有请求需要认证
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }

    /**
     * 开启Shiro注解通知器
     */
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor() {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager());
        return authorizationAttributeSourceAdvisor;
    }
































}
