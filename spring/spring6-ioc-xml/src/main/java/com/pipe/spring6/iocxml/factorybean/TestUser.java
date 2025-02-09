package com.pipe.spring6.iocxml.factorybean;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testUser() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-factorybean.xml");
        User user1 = context.getBean("user", User.class);
        User user2 = context.getBean("user", User.class);
        System.out.println(user1);
        System.out.println(user2);
    }
}
