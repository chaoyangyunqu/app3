package com.wcy.demo.service;

import com.wcy.demo.entity.User;

import java.util.List;

public interface UserService {
    public List<User> queryUserList(User user);
}
