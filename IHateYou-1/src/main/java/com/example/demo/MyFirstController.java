package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {
	
	@RequestMapping("/theshafeeq")
		public String Boom() {
		return "Hello my Friends";
		
	}
	
		@RequestMapping("/home")
			public String Home() {
				return "This is the home page";
			}
	}
