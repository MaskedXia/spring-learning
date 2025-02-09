package com.pipe.spring6.aop.annoaop;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Calculator bean = context.getBean(Calculator.class);
        bean.div(1,2);
    }

}
