package com.codegym.bean.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application04 {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(IoCContainer02.class);

        Developer fullstack = (Developer) context.getBean("fullstack");
        Developer devops = (Developer) context.getBean("devops");
        System.out.println(fullstack);
        System.out.println(devops);
    }
}
