package com.m.orm;


import com.m.orm.mybatis.AccountMapper;
import com.m.orm.mybatis.entity.Account;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test {
    public static void main(String[] args) {
        //加载 MyBatis 配置文件
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("mybatis.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //操作API
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        Account account = new Account();
        account.setName("李四");
        mapper.save(account);

        mapper.findAll().forEach(System.out::println);
    }
}
