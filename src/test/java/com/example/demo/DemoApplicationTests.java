package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		Calculator calculator = new Calculator();
	 	int raspuns = calculator.sum(2, 2);
		Assertions.assertEquals(4, raspuns);
	}

}
