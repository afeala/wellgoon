package com.wellgoon.dao.impl;

import com.wellgoon.domain.User;
import com.wellgoon.dao.UserDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 项目名称：studyssh
 * 项目包名：com.wellgoon.dao.impl
 * 类    名：UserDaoImpl
 * 创 建 人：Rocky
 * 创 建 于：2015/7/23
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void add(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void edit(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    @Override
    public void del(String id) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(User.class,id));
    }

    @Override
    public User get(String id) {
        return (User)sessionFactory.getCurrentSession().get(User.class , id);
    }

    @Override
    public List<User> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from User").list();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
