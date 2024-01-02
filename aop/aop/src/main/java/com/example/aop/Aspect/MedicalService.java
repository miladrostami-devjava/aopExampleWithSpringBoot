package com.example.aop.Aspect;


import org.springframework.stereotype.Service;

@Service
public class MedicalService {

    @Log
    public void medicalMethod(){
        System.out.println("In Medical Service!!!");
    }


    @Log
    public void calculateMedicalMethod(Long number){
        System.out.println(" calculate In Medical Service!!!" + " " + number);
    }





}
