package com.example.dilun.customer.services;

import com.example.dilun.customer.interfaces.AbstractService;
import com.example.dilun.customer.models.Customer;
import com.example.dilun.customer.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements AbstractService<Customer, Integer> {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        return customerRepository.getOne(id);
    }

    @Override
    public Customer persist(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public boolean delete(Integer id) {
        customerRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Customer> search(Customer customer) {
        return null;
    }
}
