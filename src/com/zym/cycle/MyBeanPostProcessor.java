package com.zym.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        //在执行init方法之前执行
        System.out.println("postProcessBeforeInitialization: "+ bean + "---" + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        //在执行init方法之后执行
        System.out.println("postProcessAfterInitialization: "+ bean + "---"+beanName);

        //注意可以修改传进来bean的值，注意观察
        Car car = new Car();
        car.setBrand("捷豹");
        return car;
    }
}
