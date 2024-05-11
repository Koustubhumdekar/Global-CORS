package com.corsFilter.cors.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInformation {

    private String customerName;
    private String customerId;
    private String trackingId;
}
