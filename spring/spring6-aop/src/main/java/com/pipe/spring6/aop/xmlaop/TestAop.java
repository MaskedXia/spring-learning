package com.pipe.spring6.aop.xmlaop;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanxmlaop.xml");
        Calculator bean = context.getBean(Calculator.class);
        bean.div(1,2);
    }

}
