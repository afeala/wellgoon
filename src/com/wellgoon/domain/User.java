package com.wellgoon.domain;

/**
 * 项目名称：studyssh
 * 项目包名：com.wellgoon.domain
 * 类    名：User
 * 创 建 人：Rocky
 * 创 建 于：2015/7/23
 */
public class User {
    private String id;
    private String username;
    private String password;

    public boolean login(){
        return true;
    }

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
