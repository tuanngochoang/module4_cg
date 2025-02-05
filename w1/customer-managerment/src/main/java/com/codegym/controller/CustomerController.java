package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    private CustomerService customerService = CustomerService.getInstance();

    @GetMapping
    public String showList(Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "list";
    }

    @GetMapping("{id}")
    public String getCustomerDetail(@PathVariable int id, Model model) {
        Customer customer = customerService.getCustomerById(id);
        if (Optional.ofNullable(customer).isPresent()) {
            model.addAttribute("customer", customer);
            return "detail";
        } else {
            model.addAttribute("customerDetailNotFound",
                    "Not found customer: " + id);
            return "customer/list";
        }
    }
}
