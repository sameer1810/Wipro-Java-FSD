package com.sam.elearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="Course Mgmt API", version ="1.0", description = "Course Review Service"))
public class Elearning14augApplication {

	public static void main(String[] args) {
		SpringApplication.run(Elearning14augApplication.class, args);
	}

}
