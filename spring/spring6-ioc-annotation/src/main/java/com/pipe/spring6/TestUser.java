package com.pipe.spring6;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testUser() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User bean = context.getBean(User.class);
        System.out.println(bean);
    }

    @Test
    public void testUser2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User bean = context.getBean(User.class);
        System.out.println(bean);
    }
}
