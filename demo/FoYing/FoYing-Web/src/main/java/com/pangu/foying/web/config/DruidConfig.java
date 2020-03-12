package com.pangu.foying.web.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/12 16:38
 * @Modified By
 */
@Configuration
public class DruidConfig {

    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource.druid")
    public DataSource dataSource() throws Exception {
        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDbType("sqlserver");
//        dataSource.setUrl("jdbc:sqlserver://127.0.0.1:1433;databaseName=homecare_customer2");
//        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        dataSource.setUsername("sa");
//        dataSource.setPassword("123456");
//        dataSource.setInitialSize(1);
//        dataSource.setMaxActive(1000);
//        dataSource.setMaxWait(60000);
//        dataSource.setTimeBetweenEvictionRunsMillis(60000);
//        dataSource.setMinEvictableIdleTimeMillis(300000);
//        dataSource.setValidationQueryTimeout(0);
//        dataSource.setValidationQuery("SELECT 1");
//        dataSource.setTestWhileIdle(true);
//        dataSource.setTestOnBorrow(false);
//        dataSource.setTestOnReturn(false);
//        dataSource.setPoolPreparedStatements(true);
//        dataSource.setMaxPoolPreparedStatementPerConnectionSize(20);
//        dataSource.setFilters("stat");
//        dataSource.setRemoveAbandoned(true);
//        dataSource.setRemoveAbandonedTimeout(1800);
//        dataSource.setLogAbandoned(false);
        return dataSource;
    }
}
