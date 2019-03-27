package com.yd.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * db自动配置类
 *
 * @data: 2018/8/3
 * @author: YD
 */
@Configuration
@EnableConfigurationProperties(DbProperties.class)
public class DbConfig {

    @Autowired
    DbProperties dBProperties;

    @Bean
    public int test() {
        System.out.println("username:"+dBProperties.getUsername());
        System.out.println("password:"+dBProperties.getPassword());
        System.out.println("port:"+dBProperties.getPort());
        return 0;
    }

}
