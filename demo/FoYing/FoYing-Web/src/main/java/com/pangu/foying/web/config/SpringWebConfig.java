package com.pangu.foying.web.config;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.*;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringWebConfig implements WebMvcConfigurer {
    // 文件上传路径
    @Value("${pangu.profile}")
    private String profile;
    // 网页授权文件
    @Value("${wx.verifyFile}")
    private String verifyFile;

    /**
     * 处理静态资源的，例如：图片，js，css等,这里的静态资源是放置在WEB-INF目录下
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //文件上传路径
        String pathPatterns = profile.substring(profile.indexOf("/")) + "**";
        registry.addResourceHandler(pathPatterns).addResourceLocations("file:" + profile);
        registry.addResourceHandler("/content/**").addResourceLocations("classpath:/content/");
        //微信公众号网页授权
        registry.addResourceHandler("/" + verifyFile).addResourceLocations("classpath:/wx/" + verifyFile);
    }

    /**
     * 配置拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(wxWorkerInterceptor)
//                .addPathPatterns("/foying/web/wechatpublic2/WXPlaftormWorkerController/updatePassword",
//                        "/foying/web/wechatpublic2/WXPlaftormWorkerController/getShopQRCode");
    }

    /**
     * 此方法可以很方便的实现一个请求到视图的映射，而无需书写controller
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //registry.addViewController("/login").setViewName("web/login.html");
    }

    /**
     * 消息内容转换配置
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //converters.add(customJackson2HttpMessageConverter());
    }

    /**
     * 跨域CORS配置
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
    }



    //返回类型为application/json的数据使用jackson
    @Configuration
    @ConditionalOnClass({FastJsonHttpMessageConverter.class}) //1
    @ConditionalOnProperty(//2
            name = {"spring.http.converters.preferred-json-mapper"},
            havingValue = "fastjson",
            matchIfMissing = true
    )
    protected static class FastJson2HttpMessageConverterConfiguration {
        protected FastJson2HttpMessageConverterConfiguration() {
        }
        @Bean
        @ConditionalOnMissingBean({FastJsonHttpMessageConverter.class})//3
        public FastJsonHttpMessageConverter fastJsonHttpMessageConverter() {
            //创建fastJson消息转换器
            FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
            List<MediaType> supportedMediaTypes = new ArrayList<>();
            supportedMediaTypes.add(MediaType.APPLICATION_JSON);
            supportedMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
            fastConverter.setSupportedMediaTypes(supportedMediaTypes);
            //创建配置类
            FastJsonConfig fastJsonConfig = new FastJsonConfig();
            fastJsonConfig.setCharset(Charset.forName("UTF-8"));
            fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss");


//            //修改配置返回内容的过滤
//            fastJsonConfig.setSerializerFeatures(
//                    SerializerFeature.DisableCircularReferenceDetect, //消除对同一对象循环引用的问题，默认为false（如果不配置有可能会进入死循环）
//                    SerializerFeature.WriteMapNullValue, //是否输出值为null的字段,默认为false
//                    SerializerFeature.WriteNullStringAsEmpty, //字符类型字段如果为null,输出为"",而非null
//                    SerializerFeature.PrettyFormat,
//                    SerializerFeature.WriteNullBooleanAsFalse, //Boolean字段如果为null,输出为false,而非null
//                    SerializerFeature.WriteNullNumberAsZero, //数值字段如果为null，则输出为0
//                    SerializerFeature.WriteNullListAsEmpty //List字段如果为null,输出为[],而非null
//            );
            fastConverter.setFastJsonConfig(fastJsonConfig);
            return fastConverter;
        }
    }
}
