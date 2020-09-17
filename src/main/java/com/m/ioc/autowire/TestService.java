package com.m.ioc.autowire;

public class TestService {
    private Integer id;
    private TestDao dao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TestDao getDao() {
        return dao;
    }

    public void setDao(TestDao dao) {
        this.dao = dao;
    }

    @Override
    public String toString() {
        return "TestService{" +
                "id=" + id +
                ", dao=" + dao +
                '}';
    }
}
