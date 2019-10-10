package com.zm.demo;

import com.zm.service.DiConfig;
import com.zm.service.UserFunctionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
       // SpringApplication.run(DemoApplication.class, args);
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DiConfig.class);
        UserFunctionService userFunctionService=context.getBean(UserFunctionService.class);
        System.out.println(userFunctionService.SayHello("di"));
        context.close();
    }

}
