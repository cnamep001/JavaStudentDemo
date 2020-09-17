package com.m.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * String和八大基本数据类型
 */
public class Test1{
    public static void main(String[] args) {
        List<Test1> linkedList = new LinkedList<>();
        List<Test1> arrayList = new ArrayList<>();

        for (int i = 0; i <10000 ; i++) {
            linkedList.add(new Test1());
            arrayList.add(new Test1());
        }

        Long startTime = System.currentTimeMillis();
        for (int i = 0; i <linkedList.size() ; i++) {
            linkedList.get(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("时间1："+(endTime-startTime));


        System.out.println("---------------------------------");


        Long startTime1 = System.currentTimeMillis();

        for (int i = 0; i <arrayList.size() ; i++) {
            arrayList.get(i);
        }

        Long endTime1 = System.currentTimeMillis();

        System.out.println("时间2："+(endTime1-startTime1));
        /**
         *
         测试1：
         时间1：211
         ---------------------------------
         时间2：6

         测试2：
         时间1：204
         ---------------------------------
         时间2：2

         测试3：
         时间1：198
         ---------------------------------
         时间2：3

         */


    }
}
