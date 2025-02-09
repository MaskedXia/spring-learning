package com.pipe.spring6.aop.example;

import org.junit.jupiter.api.Test;

public class TestCal {
    @Test
    public void testCal() {
        ProxyFactory proxyFactory = new ProxyFactory(new calc());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1, 2);
    }
}
