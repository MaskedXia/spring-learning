package com.pipe.spring6.aop.annoaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect  // 切面类
@Component //ioc容器
public class LogAspect {
    // 设置切入点和通知类型
    /*
    * 前置：@Before()
    * 返回：@AfterReturning
    * 异常：@AfterThrowing
    * 后置：@After()
    * 环绕：@Around()
    * */
    @Before(value = "execution(public int com.pipe.spring6.aop.annoaop.CalculatorImpl.*(..))")  // *通配，..任意参数
    public void beforeMethod(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("beforeMethod " + name + "， 参数：" + Arrays.toString(args));
    }

    @After(value = "pointcut()")  // *通配，..任意参数
    public void afterMethod(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("afterMethod " + name);
    }

    @AfterReturning(value = "pointcut()", returning = "result")  // *通配，..任意参数
    public void afterReturningMethod(JoinPoint joinPoint, Object result){
        String name = joinPoint.getSignature().getName();
        System.out.println("afterReturningMethod " + name + "， 结果：" + result);
    }

    @AfterThrowing(value = "pointcut()", throwing = "ex")  // *通配，..任意参数
    public void afterThrowingMethod(JoinPoint joinPoint, Throwable ex){
        String name = joinPoint.getSignature().getName();
        System.out.println("afterThrowingMethod " + name + "， 异常：" + ex);
    }

    @Around(value = "pointcut()")  // *通配，..任意参数
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
    @Pointcut(value = "execution(public int com.pipe.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public void pointcut(){
    }

}
