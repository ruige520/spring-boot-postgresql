package com.pangu.foying.web.project.admin.util.shiro.web.filter;

import org.apache.shiro.web.filter.AccessControlFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @Author 陈漫斌
 * @Description shiro 自定义过滤器
 * @Date 2019/2/18 15:20
 * @Modified By
 */
public class ShiroAccessControlFilter extends AccessControlFilter {
    /**
     * @Description
     * @author 陈漫斌
     * @date 2019/2/18 16:32
     * @Modified By
     */
    @Override
    public boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        return super.onPreHandle(request, response, mappedValue);
    }
    /**
     * @Description 表示是否允许访问；mappedValue就是[urls]配置中拦截器参数部分，如果允许访问返回true，否则false；
     * @author 陈漫斌
     * @date 2019/2/18 16:32
     * @Modified By
     */
    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object mappedValue) throws Exception {
//        ShiroHttpServletRequest httpServletRequest = (ShiroHttpServletRequest) servletRequest;
//        String contentType = httpServletRequest.getHeader("content-type");
//        System.out.println(contentType);
        return true;
    }

    /**
     * @Description 表示当访问拒绝时（即isAccessAllowed返回false）是否已经处理了；如果返回true表示需要继续处理；如果返回false表示该拦截器实例已经处理了，将直接返回即可。
     * @author 陈漫斌
     * @date 2019/2/18 16:32
     * @Modified By
     */
    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        return true;
    }
}
