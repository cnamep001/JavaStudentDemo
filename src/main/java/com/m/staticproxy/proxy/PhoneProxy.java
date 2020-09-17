package com.m.staticproxy.proxy;

import com.m.staticproxy.Phone;

public class PhoneProxy implements Phone {
    private Phone phone;

    public PhoneProxy(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String salePhone() {
        System.out.println(this.phone.salePhone().substring(2)+"卖的好!");
        return this.phone.salePhone();
    }
}
