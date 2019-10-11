package com.serviceIpml;

import com.entity.User;
import com.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PackageName:com.serviceIpml Description
 * @author:王朝阳
 * @date:2019/10/10
 */
@Service
public class UserServiceIpml implements UserService {
    @Resource
    private UserService userService;
    @Override
    public List<User> queryUserList(User user){
        return userService.queryUserList(user);
    }
}
