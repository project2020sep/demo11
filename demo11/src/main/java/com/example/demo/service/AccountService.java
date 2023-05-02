package com.example.demo.service;

import com.example.demo.model.Account;

import java.util.List;

public interface AccountService {


    public List<Account> findAll();


    public Account  save(Account accobj);


    public void deleteAll();
}
