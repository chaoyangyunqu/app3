package com.bigdata.controller;

import com.bigdata.dao.UserDao;
import com.bigdata.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PackageName:com.bigdata.controller Description
 * @author:王朝阳
 * @date:2019/10/12
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserDao userDao;

    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public List<User> getAll() {
        try {
            List<User> users = userDao.getAllUsers();
            return users;
        }catch (Exception e){
            System.out.println(e.getStackTrace());
            return  null;
        }
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public void update(User user){
        userDao.update(user);
    }
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public void insert(User user){
        userDao.insert(user);
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.POST)
    public void delete(Integer id){
        userDao.delete(id);
    }
}
