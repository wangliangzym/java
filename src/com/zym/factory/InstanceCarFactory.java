package com.zym.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂方法：首先实例化工厂的方法，在调用工厂的实例方法来返回bean
 */
public class InstanceCarFactory{

    private Map<String,Car> cars = null;

    public InstanceCarFactory(){
        cars = new HashMap<String, Car>();
        cars.put("audi",new Car("audi",300000));
        cars.put("ford",new Car("ford",400000));
    }

    public Car getCar(String brand){
        return cars.get(brand);
    }
}
