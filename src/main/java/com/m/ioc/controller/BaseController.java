package com.m.ioc.controller;

import com.m.ioc.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("baseController")
public class BaseController {
    @Autowired
    @Qualifier("baseServiceImpl")
    private BaseService baseService;

    @Resource(name = "baseServiceImpl1")
    private BaseService baseService1;

    public void test(){
        baseService.test();
        baseService1.test();
    }

//    public BaseService getBaseService() {
//        return baseService;
//    }
//
//    public void setBaseService(BaseService baseService) {
//        this.baseService = baseService;
//    }
}
