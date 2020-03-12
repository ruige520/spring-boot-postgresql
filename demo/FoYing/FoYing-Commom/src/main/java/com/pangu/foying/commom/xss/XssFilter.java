package com.pangu.foying.commom.xss;

import com.pangu.foying.commom.util.CommomUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2018/12/10 9:29
 * @Modified By
 */
public class XssFilter implements Filter {

    //无需过滤的连接
    private List<Pattern> excludesPattern = null;

    @Override
    public void init(FilterConfig filterConfig) {
        String excludes = filterConfig.getInitParameter("excludes");
        if (CommomUtil.isNotNullOrEmpty(excludes)) {
            String[] urls = excludes.split(",");
            excludesPattern = new ArrayList<>(urls.length);
            for (String url : urls) {
                excludesPattern.add(Pattern.compile("^" + url.trim()));
            }
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        res.setHeader("Access-Control-Allow-Origin", "*");
        //res.setHeader("Access-Control-Max-Age", "3600");
        res.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        res.setHeader("Access-Control-Allow-Credentials","true");
        res.setHeader("Access-Control-Allow-Methods", "POST, GET, HEAD");
        res.setHeader("X-XSS-Protection","1;mode=block");
        res.setHeader("X-Content-Type-Options","nosniff");
        //CSP 防止 XSS 攻击
        res.setHeader("Content-Security-Policy","default-src 'self';"
                + "script-src 'self' 'unsafe-inline' 'unsafe-eval' ;"
                + "style-src 'self' 'unsafe-inline' ;"
                + "connect-src 'self' ;"
                + "worker-src 'self' ;"
                + "img-src 'self' ;"
                + "frame-src 'self' ;");
        String servletPath = httpServletRequest.getServletPath();
        if (excludesPattern != null && !excludesPattern.isEmpty()) {
            //白名单过滤
            for (Pattern p : excludesPattern) {
                if (p.matcher(servletPath).find()) {
                    chain.doFilter(new ComHttpServletRequestWrapper((HttpServletRequest) request), response);
                    return;
                }
            }
        }
        chain.doFilter(new XssHttpServletRequestWrapper((HttpServletRequest) request), response);
    }
}
