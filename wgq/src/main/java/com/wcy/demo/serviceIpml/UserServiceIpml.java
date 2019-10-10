package com.wcy.demo.serviceIpml;

import com.wcy.demo.entity.User;
import com.wcy.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PackageName:com.wcy.demo.serviceIpml Description
 * @author:王朝阳
 * @date:2019/9/30
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
