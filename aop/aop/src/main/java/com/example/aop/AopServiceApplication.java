package com.example.aop;

import com.example.aop.Aspect.MedicalService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopServiceApplication {



	public static void main(String[] args) {

		SpringApplication.run(AopServiceApplication.class, args);



	}


}
