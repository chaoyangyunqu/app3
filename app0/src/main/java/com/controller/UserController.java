package com.controller;

/**
 * @PackageName:com.controller Description
 * @author:王朝阳
 * @date:2019/10/11
 */

import com.entity.User;
import com.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public List<User> getStus(){
        logger.info("从数据库读取user集合");
        return userService.getList();
    }
     @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void save(User user) {
        userService.insert(user);
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public void update(User user) {
        userService.update(user);
    }
   @RequestMapping(value="/delete/{id}",method = RequestMethod.POST)
    public void delete(@PathVariable("id") int id) {
       userService.delete(id);
    }

}
