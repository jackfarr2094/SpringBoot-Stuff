package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThirdController {
	
	@RequestMapping(method = RequestMethod.GET, value ="/Add/{A}/{B}")
		public String Add (@PathVariable int A, @PathVariable int B) {
		int Result = A+B;
		return "Result:" + Result;
	}
	@RequestMapping(method = RequestMethod.GET, value ="/Subtract/{A}/{B}")
	public String Subtract (@PathVariable int A, @PathVariable int B) {
	int Result = A-B;
	return "Result:" + Result;
}
	@RequestMapping(method = RequestMethod.GET, value ="/Multiply/{A}/{B}")
	public String Multiply (@PathVariable int A, @PathVariable int B) {
	int Result = A*B;
	return "Result:" + Result;
}
	@RequestMapping(method = RequestMethod.GET, value ="/Divide/{A}/{B}")
	public String Divide (@PathVariable int A, @PathVariable int B) {
	int Result = A/B;
	return "Result:" + Result;
	}
	}
