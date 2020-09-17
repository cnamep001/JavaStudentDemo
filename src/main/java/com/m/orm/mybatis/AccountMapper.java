package com.m.orm.mybatis;

import com.m.orm.mybatis.entity.Account;

import java.util.List;

public interface AccountMapper {
    public List<Account> findAll();
    public Account findById(Integer id);
    public void save(Account account);
    public void update(Account account);
    public void deleteById(Integer id);
}
