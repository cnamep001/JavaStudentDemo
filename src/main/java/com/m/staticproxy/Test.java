package com.m.staticproxy;

import com.m.staticproxy.impl.AppleImpl;
import com.m.staticproxy.impl.HuaWeiImpl;
import com.m.staticproxy.proxy.MyInvocationHandler;

public class Test {
    public static void main(String[] args) {
        Phone phone1 = new AppleImpl();

        Phone phone2 = new HuaWeiImpl();

        Computer computer1 = new AppleImpl();

        Computer computer2 = new HuaWeiImpl();

//        PhoneProxy phoneProxy = new PhoneProxy(phone1);
//
//        System.out.println(phoneProxy.salePhone());
//
//        System.out.println(new PhoneProxy(phone2).salePhone());

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();

        myInvocationHandler.setName(phone1.salePhone().substring(2));
        phone1 = (Phone) myInvocationHandler.bind(phone1);
        phone1.salePhone();

        myInvocationHandler.setName(phone2.salePhone().substring(2));
        phone2 = (Phone) myInvocationHandler.bind(phone2);
        phone2.salePhone();

        myInvocationHandler.setName(computer1.saleComputer().substring(2));
        computer1 = (Computer) myInvocationHandler.bind(computer1);
        computer1.saleComputer();

        myInvocationHandler.setName(computer2.saleComputer().substring(2));
        computer2 = (Computer) myInvocationHandler.bind(computer2);
        computer2.saleComputer();




    }
}
