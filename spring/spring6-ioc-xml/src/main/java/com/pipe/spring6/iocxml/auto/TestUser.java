package com.pipe.spring6.iocxml.auto;

import com.pipe.spring6.iocxml.auto.controller.UserController;
import com.pipe.spring6.iocxml.factorybean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testUser() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-auto.xml");
        UserController controller = context.getBean("userController", UserController.class);
        controller.addUser();
    }
}
