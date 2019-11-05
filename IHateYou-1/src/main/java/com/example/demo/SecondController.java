package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
	
	@RequestMapping 
	(method = RequestMethod.GET, value ="/record")
		public String Boom() {
			return "Show Record";
		}

@RequestMapping (method = RequestMethod.POST, value ="/record")
public String Go() {
	return "Save Record";
	}	
}
