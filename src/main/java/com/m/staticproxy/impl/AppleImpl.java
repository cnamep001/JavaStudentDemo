package com.m.staticproxy.impl;

import com.m.staticproxy.Computer;
import com.m.staticproxy.Phone;
import org.springframework.stereotype.Component;

@Component("apple")
public class AppleImpl implements Phone,Computer {
    @Override
    public String salePhone() {
        return "销售Apple手机";
    }

    @Override
    public String saleComputer() {
        return "销售Apple电脑";
    }
}
