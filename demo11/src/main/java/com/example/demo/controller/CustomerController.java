package com.example.demo.controller;

import com.example.demo.model.Customer2;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @GetMapping("/testCustomer")
    public String test(){
        return "in Customer Controller";
    }
    @GetMapping("/getCustomers")
    List<Customer2> getCustomers(){
        List<Customer2> custList = customerService.getAll();
        return custList;
    }

    @PostMapping("/addCustomer")
    Customer2 addCustomer(@RequestBody Customer2 customer){
        System.out.println(customer);
        Customer2 c= customerService.save(customer);
        return c;
    }
    @DeleteMapping("/deleteall")
    String deleteAllCustomers(){
        customerService.deleteAll();
        return "deleted all rows";
    }


}
