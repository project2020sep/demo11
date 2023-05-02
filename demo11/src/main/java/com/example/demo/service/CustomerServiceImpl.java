package com.example.demo.service;

import com.example.demo.model.Customer2;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List<Customer2> getAll() {
       List<Customer2> clist =  customerRepository.findAll();
       return clist;
    }

    @Override
    public Customer2 save(Customer2 custobj) {
       Customer2 c = customerRepository.save(custobj);
       return c;
    }

    @Override
    public void deleteAll() {
        customerRepository.deleteAll();
    }
}
