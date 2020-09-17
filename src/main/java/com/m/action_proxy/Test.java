package com.m.action_proxy;

import com.m.action_proxy.impl.CalImpl;
import com.m.action_proxy.proxy.MyInvocationHandler;

public class Test {
    public static void main(String[] args) {

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        Cal cal = (Cal)myInvocationHandler.bind(new CalImpl());
        System.out.println(cal.add(1,5));
        System.out.println(cal.sub(1,5));
        System.out.println(cal.mul(1,5));
        System.out.println(cal.div(9,5));
    }
}
