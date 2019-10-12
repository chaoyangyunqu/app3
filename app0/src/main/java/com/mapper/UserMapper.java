package com.mapper;

import com.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> getAll();
    void insert(User user);
    void update(User user);
    void delete(int id);
}
