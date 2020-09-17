package com.m.ioc.autowire.impl;

import com.m.ioc.autowire.TestDao;

public class TestDaoImpl implements TestDao {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestDaoImpl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
