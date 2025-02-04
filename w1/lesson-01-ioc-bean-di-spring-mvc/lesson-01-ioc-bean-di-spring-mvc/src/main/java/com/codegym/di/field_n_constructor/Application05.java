package com.codegym.di.field_n_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application05 {

    public static void main(String[] args) {
        // Just using solution 1 or solution 2,
        // not use 2 solutions at the same time

        // Solution 1: Declare type method level -> @Bean
        ApplicationContext context = new AnnotationConfigApplicationContext(IoCContainer05.class);

        CustomerService customerService = (CustomerService) context.getBean("customerService");
        System.out.println(customerService.eat());
        System.out.println(customerService.drink());

        OrderService orderService = (OrderService) context.getBean("orderService");
        System.out.println(orderService.orderFood());

        // Solution 2: Declare type class level -> @Component, @ComponentScan
//        OrderService orderService = new OrderServiceImpl();
//        CustomerService customerService = new CustomerServiceImpl(orderService);
//        System.out.println(customerService.eat());
//        System.out.println(customerService.drink());
    }
}
