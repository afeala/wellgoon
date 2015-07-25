package com.wellgoon.action.admin;

import com.opensymphony.xwork2.ActionSupport;
import com.wellgoon.bean.User;
import com.wellgoon.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * 项目名称：studyssh
 * 项目包名：com.wellgoon.action.admin
 * 类    名：UserAction
 * 创 建 人：Rocky
 * 创 建 于：2015/7/23
 */
@Controller("userActionAdmin")
@Scope("prototype")
public class UserAction extends ActionSupport {
    private User user;
    @Resource
    private UserService userService;

    public void add(){
        userService.add(user);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
