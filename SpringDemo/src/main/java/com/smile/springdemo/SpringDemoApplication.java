package com.smile.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
* Springboot容器启动后，会做三件事情
* 1.访问Tomcat
* 2.创建Spring容器（管理Bean）
* 3.自动扫描路径并注入为Bean（4个注解）
* @Controller（控制器），@Service（业务层），@Repository（数据访问层），@ComponentScan（任何地方）
* */



@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}
