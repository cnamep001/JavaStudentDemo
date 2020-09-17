package com.m.ioc.service.impl;

import com.m.ioc.dao.BaseDao;
import com.m.ioc.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("baseServiceImpl")
public class BaseServiceImpl implements BaseService {
    @Autowired
    @Qualifier("baseDaoImpl")
    private BaseDao baseDao;
    @Override
    public void test() {
        baseDao.test();
        System.out.println("service0...");
    }
//
//    public BaseDao getBaseDao() {
//        return baseDao;
//    }
//
//    public void setBaseDao(BaseDao baseDao) {
//        this.baseDao = baseDao;
//    }
}
