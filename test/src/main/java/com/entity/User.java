package com.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @PackageName:com.entity Description
 * @author:王朝阳
 * @date:2019/10/10
 */
public class User implements Serializable{
    private Integer id;
    private String name;
    private  String pwd;

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
    public boolean equals(Object o) {
        if (this == o){return true;}
        if (!(o instanceof User)){return false;}
        User user = (User) o;
        return Objects.equals(getId(), user.getId()) &&
                Objects.equals(getName(), user.getName()) &&
                Objects.equals(getPwd(), user.getPwd());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPwd());
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