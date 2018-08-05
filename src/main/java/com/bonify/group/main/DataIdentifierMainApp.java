package com.bonify.group.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.bonify.group"})
public class DataIdentifierMainApp {
	
	public static void main(String[] args) {
		SpringApplication.run(DataIdentifierMainApp.class, args);
	}

}
