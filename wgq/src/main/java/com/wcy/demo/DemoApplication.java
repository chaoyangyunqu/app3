package com.wcy.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan("com.wcy.demo")      //加载@Service @Control注解类
@MapperScan(value= "com.wcy.demo.dao")  //mybatis 需要扫描mapper接口 dao层
@EnableWebMvc                   //启用mvc
@EnableTransactionManagement    //启用事务管理

public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
