package com.wellgoon.service;

import com.wellgoon.bean.User;

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
    public void save(User user);
}
