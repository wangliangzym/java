package com.zym.annotation;

import com.zym.annotation.controller.MyController;
import com.zym.annotation.repository.MyRespositoryImpl;
import com.zym.annotation.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-annotation.xml");

//        TestObject testObject = (TestObject) ctx.getBean("testObject");
//        System.out.println(testObject);

        MyController myController = (MyController)ctx.getBean("myController");
        System.out.println(myController);
        myController.add();

//        MyService myService = (MyService)ctx.getBean("myService");
//        System.out.println(myService);
//
//        MyRespositoryImpl myRespository = (MyRespositoryImpl)ctx.getBean("myRespository");
//        System.out.println(myRespository);


    }
}
