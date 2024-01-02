package com.example.aop;

import com.example.aop.Aspect.MedicalService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AopServiceApplicationTests {
	@Autowired
	MedicalService medicalService;


	@Test
	void contextLoads() {
		medicalService.medicalMethod();
	}

}
