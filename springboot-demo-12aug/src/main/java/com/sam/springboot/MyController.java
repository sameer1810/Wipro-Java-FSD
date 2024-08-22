package com.sam.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ang")
public class MyController {

	public static final String myTemplate = "Hello, %s!!!";
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome everyone";
	}
	
	@GetMapping("/spring")
	public String welcome2() {
		return "This is Spring Boot";
	}
	
	@GetMapping("/greet")
	public String greet(@RequestParam(value="name", defaultValue=" World") String name) {
		return String.format(myTemplate, name);
	}
}
