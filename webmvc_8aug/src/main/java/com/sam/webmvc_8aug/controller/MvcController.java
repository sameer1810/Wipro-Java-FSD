package com.sam.webmvc_8aug.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sam.webmvc_8aug.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MvcController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home1() {
		return "home";
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public String user(User user, Model model) {
		System.out.println("User page requested");
		model.addAttribute("userName", user.getUserName());
		return "user";
	}
}