package com.demo.rentcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.demo.rentcalc"})
public class RentCalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentCalcApplication.class, args);
	}

}
