package com.wcy.demo.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.wcy.demo.entity.User;
import com.wcy.demo.service.UserService;
import com.wcy.demo.serviceIpml.UserServiceIpml;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PackageName:com.wcy.demo.controller Description
 * @author:王朝阳
 * @date:2019/9/30
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping(value = "/showList",method = RequestMethod.POST)
    public String showList(User user){
        List<User> userList=userService.queryUserList(user);
        if(userList!=null){
            return "index";
        }
        return null;
    }
}
