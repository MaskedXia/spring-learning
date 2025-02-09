package com.pipe.spring6.validator.two;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUser {
    @Test
    public void testUser1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidation1 bean = context.getBean(MyValidation1.class);
        User user = new User();
        user.setName("1312");
        user.setAge(300);
        boolean message = bean.validateByUserOne(user);
        System.out.println(message);
    }

    @Test
    public void testUser2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidation2 bean = context.getBean(MyValidation2.class);
        User user = new User();
        user.setName("1312");
        user.setAge(300);
        boolean message = bean.validateByUserTwo(user);
        System.out.println(message);
    }
}
