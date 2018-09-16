package com.zym.annotation;

import org.springframework.stereotype.Component;

@Component
public class TestObject {

    public void myMethod(){
        System.out.println("Component...");
    }
}
