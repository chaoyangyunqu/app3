package com.controller;

import com.entity.User;
import com.serviceIpml.UserServiceIpml;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PackageName:com.controller Description
 * @author:王朝阳
 * @date:2019/10/10
 */
@Controller
public class UserController {
    @Resource
    private UserServiceIpml userServiceIpml;
    @RequestMapping(value="/showList",method = RequestMethod.POST)
    public String showList(User user){
        List<User> userList=userServiceIpml.queryUserList(user);
        if(userList!=null){
            return "index";
        }
        return null;
    }
}
