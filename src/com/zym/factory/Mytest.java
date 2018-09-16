package com.zym.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-factory.xml");

        //通过静态工厂方法
        Car car = (Car)ctx.getBean("car");
        System.out.println(car);

        //通过实例化工厂的方法
        Car car2 = (Car)ctx.getBean("car2");
        System.out.println(car2);

        //通过spring自带的FactoryBean的方法
        Car car3 = (Car) ctx.getBean("car3");
        System.out.println(car3);


    }


}
