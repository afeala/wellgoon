package com.wellgoon.dao.impl;

import com.wellgoon.bean.User;
import com.wellgoon.dao.UserDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

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
    public void save(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
