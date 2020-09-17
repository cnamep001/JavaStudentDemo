package com.m.staticproxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");

        Phone phone = (Phone) applicationContext.getBean("apple");
        Computer computer1 = (Computer) applicationContext.getBean("apple");
        phone.salePhone();
        computer1.saleComputer();

        Computer computer = (Computer) applicationContext.getBean("hua");
        Phone phone1 = (Phone) applicationContext.getBean("hua");
        computer.saleComputer();
        phone1.salePhone();
    }
}
