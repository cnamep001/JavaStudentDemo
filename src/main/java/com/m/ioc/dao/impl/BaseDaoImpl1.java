package com.m.ioc.dao.impl;

import com.m.ioc.dao.BaseDao;
import org.springframework.stereotype.Repository;

@Repository("baseDaoImpl1")
public class BaseDaoImpl1 implements BaseDao{
    @Override
    public void test() {
        System.out.println("dao1...");
    }
}
