package com.pipe.spring6.resource;

import com.pipe.spring6.SpringConfig;
import com.pipe.spring6.resource.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testUser() {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController bean = context.getBean(UserController.class);
        bean.addUser();
    }
}
