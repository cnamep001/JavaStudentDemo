package com.m.staticproxy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggerAspect1 {

    @Before(value = "execution(public String com.m.staticproxy.impl.*.*())")
    public void before(JoinPoint joinPoint){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println("连接点对象："
                +joinPoint.getTarget().getClass().getSimpleName());

        //获取参数列表
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println(name+"的参数是："+args);
    }
    @After(value = "execution(public String com.m.staticproxy.impl.*.*())")
    public void after(JoinPoint joinPoint){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法结束");

    }
    @AfterReturning(value = "execution(public String com.m.staticproxy.impl.*.*())",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法的结果是："+result);
        System.out.println("-----------------------------");
    }

}
