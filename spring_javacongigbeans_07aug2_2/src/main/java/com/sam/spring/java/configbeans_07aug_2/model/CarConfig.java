package com.sam.spring.java.configbeans_07aug_2.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {
	
	@Bean
	public Car car() {
		
		System.out.println("Instantiating Car Bean");
		return new Car("Tata Nexon", engine("Diesel"));
	}
	
	public Engine engine(String type) {
		
		System.out.println("Instantiating Engine Bean");
		return new Engine(type);
		
	}

}
