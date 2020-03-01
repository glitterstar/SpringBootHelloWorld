package com.javafullstacktraining.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld1Controller {

	@RequestMapping("/")
	public String showMsg() {
	   return	"Welcome to First Spring Boot Application";
		
	}
}
