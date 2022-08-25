package com.discover.program3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Program3Application {

	public static void main(String[] args) {
		SpringApplication.run(Program3Application.class, args);
	}

}
