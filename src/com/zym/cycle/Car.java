package com.zym.cycle;

public class Car {

    private String brand;

    public Car(){
        System.out.println("构造器");
    }

    public void setBrand(String brand) {
        System.out.println("Car 的set方法");
        this.brand = brand;
    }

    public void init(){
        System.out.println("初始化方法被执行了");
    }

    public void destroy(){
        System.out.println("销毁方法被执行了");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
