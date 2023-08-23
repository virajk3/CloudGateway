package com.springmicroservices.CloudGateway.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class FallBackController {

    @GetMapping("/orderServiceFallBack")
    public String orderServiceFallBack(){
        return "Order Service is Down Get";
    }
    @PostMapping("/orderServiceFallBack")
    public String orderServiceFallBackPost(){
        return "Order Service is Down Post";
    }

    @GetMapping("/productServiceFallBack")
    public String productServiceFallBack(){
        return "Product Service is Down";
    }
    @GetMapping("/paymentServiceFallBack")
    public String paymentServiceFallBack(){
        return "payment Service is Down";
    }


}
