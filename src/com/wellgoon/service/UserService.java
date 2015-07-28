package com.wellgoon.service;

import com.wellgoon.domain.User;

import java.util.List;

/**
 * 项目名称：studyssh
 * 项目包名：com.wellgoon.service
 * 类    名：UserService
 * 创 建 人：Rocky
 * 创 建 于：2015/7/25
 */
public interface UserService {
    /**
     * 用户业务逻辑管理
     * @param user
     */
    public void add(User user);
    public void edit(User user);
    public void del(String id);
    public User get(String id);
    public List<User> getAll();
}
