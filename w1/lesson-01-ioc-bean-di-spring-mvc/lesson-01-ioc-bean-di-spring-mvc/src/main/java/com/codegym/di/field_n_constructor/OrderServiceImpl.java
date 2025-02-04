package com.codegym.di.field_n_constructor;

import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

    @Override
    public String orderFood() {
        return "Pizza ordering...";
    }
}
