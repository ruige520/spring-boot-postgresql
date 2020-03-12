package com.pangu.foying.web.config;

import com.pangu.foying.commom.util.CommomUtil;
import com.pangu.foying.commom.xss.XssFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.DispatcherType;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/8/9 14:29
 * @Modified By
 */
@Configuration
public class XssFilterConfig {
    @Value("${xss.excludes}")
    private String excludes;

    @Value("${xss.url}")
    private String url;

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Bean
    public FilterRegistrationBean xssFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new XssFilter());
        registration.setName("xssFilter");
        registration.setDispatcherTypes(DispatcherType.REQUEST);
        registration.setOrder(1);
        registration.setEnabled(true);
        if (CommomUtil.isNotNullOrEmpty(url)) {
            String[] urlPatterns = url.split(",");
            for (int i = 0; i < urlPatterns.length; i++) {
                urlPatterns[i] = urlPatterns[i].trim();
            }
            registration.addUrlPatterns(urlPatterns);
        } else {
            registration.addUrlPatterns("/*");
        }
        Map<String, String> initParameters = new HashMap<>();
        initParameters.put("excludes", excludes);
        registration.setInitParameters(initParameters);
        return registration;
    }
}
