package com.main.wcy.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.main.wcy.dao")
public class WcyApplication {

    public static void main(String[] args) {
        SpringApplication.run(WcyApplication.class, args);
    }

}
