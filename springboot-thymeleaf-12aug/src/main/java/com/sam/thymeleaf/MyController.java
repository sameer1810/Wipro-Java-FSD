package com.sam.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@GetMapping("/thymeleaf/greet")
	public String myTemplate(@RequestParam(value="name",defaultValue=" World") String name,
			Model model) {
		
		model.addAttribute("name",name);
		return "thymeleafTemplate";
	}
}
