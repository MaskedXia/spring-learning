package com.pipe.spring6.aop.xmlaop;

import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        System.out.println("internal test");
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return 0;
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }
}
