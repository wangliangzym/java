package com.zym.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        /*当配置bean中的scope=singleton的时候，在初始化这个容器的时候，相应的bean就会被创建
        在用getBean方法的时候，就会直接获取这个创建好的bean，而当scope=prototype的时候，
        初始化容器的时候不会去创建相应的bean，而是在gebean()的时候采取创建这个bean*/
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-scope.xml");
        Person person = (Person) ctx.getBean("person");
//        System.out.println(person);
    }
}
