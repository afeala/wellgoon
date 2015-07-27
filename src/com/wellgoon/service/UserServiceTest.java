package com.wellgoon.service;

import com.wellgoon.bean.User;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserServiceTest extends TestCase {
    private static UserService userService;

    public void setUp() throws Exception {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
            userService = (UserService) applicationContext.getBean("userService");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tearDown() throws Exception {

    }

    public void testAdd() throws Exception {
        User user = new User("test","adfdsfa1564sdfkdjfld");
        userService.add(user);
    }

    public void testGet() throws Exception{
        String id = "402881b24ecd7372014ecd73737d0000";
        User user = userService.get(id);
        System.out.println(user.getId());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
    }

    public void testEdit() throws Exception{
        User user = userService.get("402881b24ecd7372014ecd73737d0000");
        user.setUsername("updateUsernameTest");
        userService.edit(user);
    }

    public void testDel() throws Exception{
        userService.del("402881b24ecd7372014ecd73737d0000");
    }

    public void testGetAll() throws Exception{
        List<User> ls = userService.getAll();
        for (User u : ls){
            System.out.println(u.getUsername());
        }
    }

}