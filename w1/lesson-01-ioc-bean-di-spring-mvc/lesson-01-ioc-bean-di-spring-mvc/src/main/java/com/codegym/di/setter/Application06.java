package com.codegym.di.setter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application06 {

    public static void main(String[] args) {
        BeanFactory context = new ClassPathXmlApplicationContext("ioc_container_06.xml");

        Clazz clazz = (Clazz) context.getBean("clazz");
        System.out.println(clazz);
        System.out.println(clazz.getStudentBinh().getName());
    }
}
