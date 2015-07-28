package com.wellgoon.service.impl;

import com.wellgoon.domain.User;
import com.wellgoon.dao.UserDao;
import com.wellgoon.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 项目名称：studyssh
 * 项目包名：com.wellgoon.service.impl
 * 类    名：UserServiceImpl
 * 创 建 人：Rocky
 * 创 建 于：2015/7/25
 */

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    /**
     * 用户业务逻辑管理
     * @param user
     */
    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void edit(User user) {
        userDao.edit(user);
    }

    @Override
    public void del(String id) {
        userDao.del(id);
    }

    @Override
    public User get(String id) {
        return userDao.get(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
