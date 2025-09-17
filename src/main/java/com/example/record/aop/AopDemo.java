package com.example.record.aop;

import org.springframework.stereotype.Component;

@Component
public class AopDemo {
    public void aMethod() {
        System.out.println("하하하하하하하");
    }

    public void bMethod() {
        System.out.println("히히히히희힇ㅎ히히");
    }

    public void cMethod() {
        int num1 = 3;
        int num2 = 7;
        System.out.println(num1 + num2);
    }
}
