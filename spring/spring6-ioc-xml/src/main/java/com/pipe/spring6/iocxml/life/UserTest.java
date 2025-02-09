package com.pipe.spring6.iocxml.life;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void testUser() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-life.xml");
        User user = context.getBean("user", User.class);
        System.out.println("6 bean object is created");
        System.out.println(user);
        context.close();
    }
}
