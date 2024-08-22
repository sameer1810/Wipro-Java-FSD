package com.sam.spring_javaconfigbeans_07aug.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyMessageConfig {

	@Bean
	public MyMessage myMessage() {
		return new MyMessage();
	}
}
