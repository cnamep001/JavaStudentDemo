package com.m.staticproxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class MyInvocationHandler implements InvocationHandler {
    private Object proObject;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object bind(Object object) {
        this.proObject = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
}

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.proObject);
        System.out.println(name+"卖的好，这个"+name+"物美价廉,赶快来抢购吧!");
        System.out.println(result);
        System.out.println(method.getName()+"方法的结果是"+result);
        return result;
    }
}
