package com.example.aop.Aspect;


import org.springframework.stereotype.Service;

@Service
public class OrderMedicalService {

    @Log
    public String orderMedical() {
        System.out.println("Ordering medical");
        return "Order";
    }
}
