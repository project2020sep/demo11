package com.example.demo.controller;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping("/test")
    public String test(){
        return "in account controller";

    }
    @GetMapping("/getaccts")
       public List<Account> findAll() {
        List<Account> accountList = accountService.findAll();
        return accountList;
    }

    @PostMapping("/add")
    Account addAccount(@RequestBody Account account){
        Account a = accountService.save(account);
        return a;
    }
}
