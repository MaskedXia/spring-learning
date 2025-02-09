package com.pipe.spring6.aop.example;

public class calc implements Calculator{
    @Override
    public int add(int a, int b) {
        System.out.println("add test");
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}
