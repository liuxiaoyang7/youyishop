package com.cn.youyi.service;

import com.cn.youyi.entity.User;

import java.util.List;

public interface UserService {

    public void addUser(User user );
    public User getUserById(int uid);
    public List<User> getAllUser();
}
