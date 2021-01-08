package com.offcn;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.offcn.properties.CompanyProperties;
import com.offcn.properties.CourseProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableDubbo
//启动类
@SpringBootApplication
//开启配置参数类
@EnableConfigurationProperties(
        {CompanyProperties.class,CourseProperties.class})//放在启动类上，所有的controller，service。。都可以使用
public class Demo02Application {
    public static void main(String[] args) {
        SpringApplication.run(Demo02Application.class,args);
    }
}
