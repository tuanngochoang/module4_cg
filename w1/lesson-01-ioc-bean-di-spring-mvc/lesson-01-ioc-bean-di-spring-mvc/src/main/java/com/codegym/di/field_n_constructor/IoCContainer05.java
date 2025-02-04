package com.codegym.di.field_n_constructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// Solution 2
//@ComponentScan(basePackageClasses = {
//                CustomerServiceImpl.class,
//                OrderServiceImpl.class
//})
public class IoCContainer05 {

    // Solution 1
    @Bean
    public CustomerService customerService() {
        return new CustomerServiceImpl(orderService());
    }

    // Solution 1
    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl();
    }
}
