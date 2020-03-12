package com.pangu.foying.web;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan(basePackages = {"com.pangu.foying.web.project.*.mapper"})
@SpringBootApplication
@EnableScheduling //启动定时任务
public class FoYingWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(FoYingWebApplication.class, args);
    }
}
