package com.wellgoon.dao;

import com.wellgoon.domain.User;

import java.util.List;

/**
 * 项目名称：studyssh
 * 项目包名：com.wellgoon.dao
 * 类    名：UserDao
 * 创 建 人：Rocky
 * 创 建 于：2015/7/23
 */
public interface UserDao {
    public void add(User user);
    public void edit(User user);
    public void del(String id);
    public User get(String id);
    public List<User> getAll();
}
