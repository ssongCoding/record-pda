package com.example.record.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AopRunner implements ApplicationRunner {
    @Autowired
    private AopDemo aopDemo;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        aopDemo.aMethod();
        aopDemo.bMethod();
        aopDemo.cMethod();
    }
}
