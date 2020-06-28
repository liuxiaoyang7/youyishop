package com.cn.youyi.dao;

import com.cn.youyi.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    @Override
    public User getUserById(int uid) {
        return (User) sessionFactory.getCurrentSession().get(User.class, uid);
    }

    @Override
    public List<User> getAllUser() {
        String hql = "from User";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        return q.list();
    }
}
