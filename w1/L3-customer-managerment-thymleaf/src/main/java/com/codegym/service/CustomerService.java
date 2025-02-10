package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService{

    private static CustomerService instance;

    public static CustomerService getInstance() {
        if (instance == null) {
            instance = new CustomerService();
        }
        return instance;
    }

    private static final Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "John", "john@codegym.vn", "Ha Noi"));
        customers.put(2, new Customer(2, "Bill", "bill@codegym.vn", "Hai Phong"));
        customers.put(3, new Customer(3, "Alex", "alex@codegym.vn", "Sai Gon"));
        customers.put(4, new Customer(4, "Adam", "adam@codegym.vn", "Beijing"));
        customers.put(5, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        customers.put(6, new Customer(6, "Rose", "rose@codegym.vn", "NewYork"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        if (customers.containsKey(customer.getId())) {
            return;
        }
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        if (customers.containsKey(id)) {
            return customers.get(id);
        }
        return null;
    }

    @Override
    public void update(int id, Customer customer) {
        if (customers.containsKey(id)) {
            customers.put(id, customer);
        }
    }

    @Override
    public void remove(int id) {
        if (customers.containsKey(id)) {
            customers.remove(id);
        }
    }
}
