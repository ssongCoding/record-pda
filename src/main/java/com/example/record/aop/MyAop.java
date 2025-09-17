package com.example.record.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAop {
    @Pointcut("execution(* com.example.record.aop.AopDemo.*(..))")
    private void cut() {}

    @Before("cut()")
    private void 들어감() {
        System.out.println("들어옴1");
        System.out.println("들어옴2");
        System.out.println("들어옴3");
    }

    @After("cut()")
    private void 나감() {
        System.out.println("이제");
        System.out.println("나감");
    }
}