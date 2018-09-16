package com.zym.hello;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDemo {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //通过属性注入的方法得到
        Car car1 = (Car)applicationContext.getBean("car1");
        System.out.println(car1);

        //通过注入构造的方法得到
        Animal dog = (Animal)applicationContext.getBean("dog");
        System.out.println(dog);

        //xml中注入list演示
        Person person = (Person)applicationContext.getBean("person");
        System.out.println(person);

        //xml中注入map
        NewPerson newPerson = (NewPerson) applicationContext.getBean("newPerson");
        System.out.println(newPerson);

    }
}
