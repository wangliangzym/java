package com.zym.externalConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-external.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
