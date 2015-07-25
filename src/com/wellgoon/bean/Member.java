package com.wellgoon.bean;

/**
 * 项目名称：wellgoon
 * 项目包名：com.wellgoon.bean
 * 类    名：Member
 * 创 建 人：Rocky
 * 创 建 于：2015/7/25
 */
public class Member {
    private String id;
    private String nickname;
    private int age;

    public Member(String id, String nickname, int age) {
        this.id = id;
        this.nickname = nickname;
        this.age = age;
    }

    public Member(String nickname, int age) {

        this.nickname = nickname;
        this.age = age;
    }

    public Member() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
