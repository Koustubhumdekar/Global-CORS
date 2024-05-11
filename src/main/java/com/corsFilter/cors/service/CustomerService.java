package com.corsFilter.cors.service;


import com.corsFilter.cors.model.CustomerInformation;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
        public CustomerInformation information() {
        return new CustomerInformation("ABC_customer", "12345678", "tracking_Id_1234");
    }
}
