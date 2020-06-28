package com.cn.youyi.dao;

import com.cn.youyi.entity.User;
import org.hibernate.Session;

import java.util.List;

public interface UserDao {

    public Session getSession();
    public void addUser(User user);
    public User getUserById(int id);
    public List<User> getAllUser();
}
