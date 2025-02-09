package com.pipe.spring6.aop.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        ClassLoader classLoader = target.getClass().getClassLoader();  // 类加载器
        Class<?>[] interfaces = target.getClass().getInterfaces();  // 接口类型数组
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {  //代理对象，重写方法，方法参数
                System.out.println("[日志] " + method.getName() + ", 参数：" + Arrays.toString(args));
                Object result = method.invoke(target, args);
                System.out.println("[日志] " + method.getName() + ", 结果：" +result);
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }

}
