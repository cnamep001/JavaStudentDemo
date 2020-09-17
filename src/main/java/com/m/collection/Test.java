package com.m.collection;


import java.util.*;

public class Test {
    public static void main(String[] args) {

    }


    public static  <T> void replaceAll(List<T> list, T old, T newVal){
        for (int i = 0; i <list.size() ; i++) {
            if(old.equals(list.get(i))){
                list.set(i,newVal);
            }
        }
    }

    public static  <T> void addAll(Collection<? super T> c,T ...args){
        for (T arg:args) {
            c.add(arg);
        }
    }
}
