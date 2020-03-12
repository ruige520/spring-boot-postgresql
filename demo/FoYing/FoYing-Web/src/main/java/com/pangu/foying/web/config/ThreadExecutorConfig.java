package com.pangu.foying.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.*;

/**
 * @Author 陈漫斌
 * @Description 线程池配置
 * @Date 2019/11/6 9:10
 * @Modified By
 */
@Configuration
@EnableAsync
public class ThreadExecutorConfig {

    @Bean("asyncServiceExecutor")
    public Executor asyncServiceExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        //配置核心线程数
        executor.setCorePoolSize(1);
        //配置最大线程数
        executor.setMaxPoolSize(100);
        //配置队列大小
        executor.setQueueCapacity(1000);
        //线程空闲时间（单位：秒）
        executor.setKeepAliveSeconds(300);
        //配置线程池中的线程的名称前缀
        executor.setThreadNamePrefix("pangu-async-");
        //rejection-policy：当pool已经达到max size的时候，如何处理新任务
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());//CALLER_RUNS：不在新线程中执行任务，而是有调用者所在的线程来执行
        //执行初始化
        executor.initialize();
        return executor;
    }
}
