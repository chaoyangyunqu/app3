package com.bigdata.entity;

import java.io.Serializable;

/**
 * @PackageName:com.bigdata.entity Description
 * @author:王朝阳
 * @date:2019/10/12
 */
public class User implements Serializable {
    private Integer id;
    private String name;
    private String pwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public User(Integer id) {
        this.id = id;
    }
}
