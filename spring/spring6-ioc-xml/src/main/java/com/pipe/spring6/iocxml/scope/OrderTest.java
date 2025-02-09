package com.pipe.spring6.iocxml.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderTest {
    @Test
    public void test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        Orders orders = context.getBean("orders2", Orders.class);
        System.out.println(orders);
        Orders ordersx = context.getBean("orders2", Orders.class);
        System.out.println(ordersx);
    }
}
