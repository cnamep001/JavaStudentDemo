package com.m.ioc.factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceFactory {
    private Map<Integer,Car> carMap;
    public InstanceFactory(){
        carMap = new HashMap<>();
        carMap.put(1,new Car(1,"宝马"));
        carMap.put(2,new Car(2,"奥迪"));
    }

    public Car getCar(int num){
        return carMap.get(num);
    }
}
