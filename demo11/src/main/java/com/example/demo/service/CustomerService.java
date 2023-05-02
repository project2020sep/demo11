package com.example.demo.service;

import com.example.demo.model.Customer2;

import java.util.List;

public interface CustomerService {
    List<Customer2> getAll();
    Customer2  save(Customer2 custobj);
    void deleteAll();
}
