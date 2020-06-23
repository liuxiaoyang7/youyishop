package com.cn.youyi.service;

import com.cn.youyi.dao.UserDao;
import com.cn.youyi.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service("UserService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User getUserById(int uid) {
        return userDao.getUserById(uid);
    }

}
