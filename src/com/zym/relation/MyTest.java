package com.zym.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-relation.xml");
        Family family = (Family) ctx.getBean("family");
        System.out.println(family);
    }
}
