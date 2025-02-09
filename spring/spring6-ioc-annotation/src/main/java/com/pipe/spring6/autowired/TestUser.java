package com.pipe.spring6.autowired;

import com.pipe.spring6.autowired.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testUser() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserController bean = context.getBean(UserController.class);
        bean.addUser();
    }
}
