package com.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 测试aop用
 */
@Aspect
@Component
public class Logger {

    @AfterReturning("execution(* com.demo.service.DoSomeService.*(..))")
    public void log(JoinPoint joinPoint) throws Throwable {
        String name = joinPoint.getSignature().getName();
        System.out.println(name);
    }
}
