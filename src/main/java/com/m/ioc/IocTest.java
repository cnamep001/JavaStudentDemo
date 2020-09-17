package com.m.ioc;

import com.m.ioc.autowire.TestService;
import com.m.ioc.controller.BaseController;
import com.m.ioc.entity.Classes;
import com.m.ioc.entity.Student;
import com.m.ioc.factory.Car;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

public class IocTest {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//
//        BaseController controller = (BaseController) applicationContext.getBean("baseController");
//        controller.test();
//        Student student = (Student) applicationContext.getBean("student1");
//        Classes classes = (Classes) applicationContext.getBean("classes");
//        System.out.println(classes);
//        Car car = (Car)applicationContext.getBean("car1");
//        System.out.println(car);

//        TestService service = (TestService)applicationContext.getBean("service");
//        System.out.println(service);

        //创建Class三种方式
        //1
        Class clazz1 = Student.class;
        //2
        Class clazz2 = null;
        try {
            clazz2 = Class.forName("com.m.ioc.entity.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(clazz1 == clazz2);   //true
        //3
        Student student = new Student();
        Class clazz3 = student.getClass();
        System.out.println(clazz2 == clazz3);   //true

    }
}
