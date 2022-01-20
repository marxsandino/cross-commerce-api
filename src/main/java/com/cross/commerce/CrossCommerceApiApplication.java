package com.cross.commerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CrossCommerceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrossCommerceApiApplication.class, args);
	}

}
