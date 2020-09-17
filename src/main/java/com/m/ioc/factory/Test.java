package com.m.ioc.factory;

public class Test {
    public static void main(String[] args) {
        Car car = StaticFactory.getCar(2);
        System.out.println(car);
    }
}
