package com.smile.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * @description: 装配第三方bean
 * @author Tom Smile
 * @date 2024/5/18 9:36
 * @version 1.0
 */

// 使用@Configuration并不是标识为一个bean，而是说明这是一个配置类
@Configuration
public class DemoConfig {
    @Bean
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");     //第三方bean装配到Spring容器，实例化一次之后可以重复用
    }

}
