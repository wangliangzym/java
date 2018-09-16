package com.zym.hello;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private Animal animal;
    private List<Car> cars;

    //无参构造
    public Person() {
    }

    //有参构造
    public Person(String name, int age, Animal animal, List<Car> cars) {
        this.name = name;
        this.age = age;
        this.animal = animal;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", animal=" + animal +
                ", cars=" + cars +
                '}';
    }
}
