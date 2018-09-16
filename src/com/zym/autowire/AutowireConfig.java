package com.zym.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireConfig {
    public static void main(String[] args) {
        ApplicationContext ctx =  new ClassPathXmlApplicationContext("bean-autowire.xml");
        Person person = (Person)ctx.getBean("person");
        System.out.println(person);
    }
}
