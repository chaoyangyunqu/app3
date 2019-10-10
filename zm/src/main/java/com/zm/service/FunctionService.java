package com.zm.service;

import org.springframework.stereotype.Service;

/**
 * @PackageName:com.zm.service Description
 * @author:王朝阳
 * @date:2019/10/9
 * 编写功能类的bean
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "hello"+"\n"+"world";
    }
}
