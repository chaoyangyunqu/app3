package com.main.wcy.controller;

import com.main.wcy.dao.UserMapper;
import com.main.wcy.entity.UserEntity;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @PackageName:com.main.wcy.controller Description
 * @author:王朝阳
 * @date:2019/10/11
 */
@Controller
@SpringBootApplication
@RequestMapping("user/")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("getUser")
    @ResponseBody
    public Object getUser(String name){
        UserEntity user =null;
        if(StringUtils.isNotBlank(name)){
            user = userMapper.getUser(name);
        }
        return user;
    }
}