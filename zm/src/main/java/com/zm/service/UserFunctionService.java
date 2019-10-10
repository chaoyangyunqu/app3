package com.zm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PackageName:com.zm.service Description
 * @author:王朝阳
 * @date:2019/10/9
 * 使用功能类的bean
 */
@Service
public class UserFunctionService {
    @Autowired
    FunctionService functionService;
    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
