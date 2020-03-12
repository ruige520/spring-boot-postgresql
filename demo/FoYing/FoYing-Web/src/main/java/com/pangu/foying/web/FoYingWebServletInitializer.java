package com.pangu.foying.web;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author 陈漫斌
 * @Description web容器中进行部署
 * @Date 2019/8/23 9:57
 * @Modified By
 */
public class FoYingWebServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(FoYingWebApplication.class);
    }
}
