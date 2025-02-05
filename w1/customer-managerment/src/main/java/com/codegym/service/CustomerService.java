package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private static List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer(1, "Nguyen Van A", "a@b.com", "Da Nang"));
        customers.add(new Customer(2, "Nguyen Van B", "b@c.com", "Ha Noi"));
        customers.add(new Customer(3, "Nguyen Van C", "c@d.com", "Hue"));
        customers.add(new Customer(4, "Nguyen Van D", "d@e.com", "Can Tho"));
    }

    private static CustomerService instance;

    private CustomerService() {}

    public static CustomerService getInstance() {
        if (instance == null) {
            instance = new CustomerService();
        }
        return instance;
    }

    public List<Customer> findAll() {
        if (customers == null) {
            customers = new ArrayList<>();
        }
        return customers;
    }

    public Customer getCustomerById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
}
