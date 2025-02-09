package com.pipe.spring6.resourceaware;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ResourceLoader;

public class TestDemo {
    @Test
    public void testDemo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        ResourceLoader resourceLoader = testBean.getResourceLoader();
        System.out.println(context == resourceLoader);
    }
}
