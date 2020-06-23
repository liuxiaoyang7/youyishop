package com.cn.youyi.service;

import com.cn.youyi.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {

    public void addUser(User user );
    public User getUserById(int uid);
}
