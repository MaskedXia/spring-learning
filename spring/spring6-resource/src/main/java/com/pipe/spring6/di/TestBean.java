package com.pipe.spring6.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void testBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Resourcebean bean = context.getBean(Resourcebean.class);
        bean.parse();
    }
}
