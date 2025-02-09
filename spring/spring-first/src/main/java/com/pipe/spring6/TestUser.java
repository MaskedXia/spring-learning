package com.pipe.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    private Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUser() {
        // 加载配置文件，解析，创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User)context.getBean("user");
        System.out.println(user);
        user.add();
        logger.info("test log");
    }

    @Test
    public void testUser2() throws Exception {
        Class clazz = Class.forName("com.pipe.spring6.User");
        User user = (User)clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }
}
