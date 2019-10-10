package com.wcy.demo.dao;

import com.wcy.demo.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> queryUserList(User user);
}
