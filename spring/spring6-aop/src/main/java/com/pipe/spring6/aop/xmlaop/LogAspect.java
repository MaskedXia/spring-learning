package com.pipe.spring6.aop.xmlaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component //ioc容器
public class LogAspect {

    public void beforeMethod(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("beforeMethod " + name + "， 参数：" + Arrays.toString(args));
    }

    public void afterMethod(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("afterMethod " + name);
    }

    public void afterReturningMethod(JoinPoint joinPoint, Object result){
        String name = joinPoint.getSignature().getName();
        System.out.println("afterReturningMethod " + name + "， 结果：" + result);
    }

    public void afterThrowingMethod(JoinPoint joinPoint, Throwable ex){
        String name = joinPoint.getSignature().getName();
        System.out.println("afterThrowingMethod " + name + "， 异常：" + ex);
    }

    public Object aroundMethod(ProceedingJoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        String s = Arrays.toString(args);
        Object proceed = null;
        try {
            System.out.println("aroundMethod Before");
            proceed = joinPoint.proceed();
            System.out.println("aroundMethod After");
        }catch (Throwable throwable){
            System.out.println("aroundMethod ex");
        }finally {
            System.out.println("aroundMethod finally");
        }
        return proceed;
    }

    // 重用切入点表达式
    @Pointcut(value = "execution(public int com.pipe.spring6.aop.xmlaop.CalculatorImpl.*(..))")
    public void pointcut(){

    }

}
