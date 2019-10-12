package com.bigdata.dao;

import com.bigdata.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserDao {
    @Select("select * from public.user")
    List<User> getAllUsers();

    @Update("update public.user set name='wangguiqiong' where id=4")
    void update(User user);

    @Insert("insert into public.user(id,name,pwd) values(5,'zhangmin','123456')")
     void insert(User user);

    @Delete("delete from public.user where id=2")
    void delete(Integer id);
}
