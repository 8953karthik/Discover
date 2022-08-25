package com.discover.program5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker

public class Program5Application {

	public static void main(String[] args) {
		SpringApplication.run(Program5Application.class, args);
	}

}
