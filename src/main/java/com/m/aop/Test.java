package com.m.aop;

import com.m.action_proxy.Cal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        System.out.println(applicationContext);

//        Cal cal = applicationContext.getBean(Cal.class);
        Cal cal = (Cal)applicationContext.getBean("calImplTo");

        cal.add(1,5);
        cal.sub(1,5);
        cal.mul(1,5);
        cal.div(9,1);
    }
}
