package com.star.agile.assignment.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping
	public String getMsg() {
	
		return "Welcome to spring boot application";
	}

}
