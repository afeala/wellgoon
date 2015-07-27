package com.wellgoon.service;

import com.wellgoon.bean.User;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        User user = new User("tesltaldsf","afeala","adfdsfasdfkdjfld");
        userService.add(user);
    }
}