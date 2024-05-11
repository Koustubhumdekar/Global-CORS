package com.corsFilter.cors.controller;

import com.corsFilter.cors.model.CustomerInformation;
import com.corsFilter.cors.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customer")
    public CustomerInformation getCustomerInformation(){
        return customerService.information();
    }

}
