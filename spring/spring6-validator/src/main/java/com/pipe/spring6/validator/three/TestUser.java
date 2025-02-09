package com.pipe.spring6.validator.three;


import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUser {
    @Test
    public void testUser1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        Myservice bean = context.getBean(Myservice.class);
        User user = new User();
        user.setName("1312");
        user.setAge(100);
        user.setPhone("123456789");
        bean.testMethod(user);
    }
}
