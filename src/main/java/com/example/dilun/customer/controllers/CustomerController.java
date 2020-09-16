package com.example.dilun.customer.controllers;

import com.example.dilun.customer.models.Customer;
import com.example.dilun.customer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> findAllCustomers(){
        return customerService.findAll();
    }

    @PostMapping
    public Customer saveCustomer(Customer customer){
        return customerService.persist(customer);
    }
}
