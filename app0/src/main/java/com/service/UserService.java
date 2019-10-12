package com.service;

import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @PackageName:com.service Description
 * @author:王朝阳
 * @date:2019/10/11
 */
@Service
public class UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<User> getList(){
        try {
            String sql = "SELECT id, name, pwd FROM public.user";
            return (List<User>) jdbcTemplate.query(sql, new RowMapper<User>(){
                @Override
                public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setName(rs.getString("name"));
                    user.setPwd(rs.getString("pwd"));
                    return user;
                }
            });
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public void insert(User user){
        try {
            String sql1="insert into public.user values(4,'admin','root')";
            jdbcTemplate.execute(sql1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void update(User user){
        try {
            String sql2="update public.user set name='wangchaoyang'";
            jdbcTemplate.update(sql2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
   public  void  delete(int id){
        try {
            String sql3="delete from public.user where id=3";
            jdbcTemplate.execute(sql3);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
