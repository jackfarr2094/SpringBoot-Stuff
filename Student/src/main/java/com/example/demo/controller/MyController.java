package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Student;
import com.example.demo.service.StudentService;

@RestController
public class MyController {
	
	@Autowired
	private StudentService service;
	
	@RequestMapping(method = RequestMethod.POST, value = "/addRecord")
	public void addRecord() {
		service.addnewRecord(0, null, 0);
	}
	@RequestMapping(method = RequestMethod.GET, value = "/ShowAllRecord")
	public ArrayList<Student> showAll() {
		return service.showAll();
	}
	@RequestMapping(method = RequestMethod.GET, value = "/AddNewRecord/{r}/{n}/{m}")
	public void addnewRecord(@PathVariable int r, @PathVariable String n, @PathVariable int m) {
		service.addnewRecord(r, n, m);
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteRecord/{r}")
	public String deleteRecord (@PathVariable int R) {
		return service.deleteRecord(R);
	}
	@RequestMapping(method = RequestMethod.GET, value = "/findRecord{r}")
	public Student findRecord (@PathVariable int R) {
		return service.findRecord(R);
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/updateRecord/{r}")
	public Student updateRecord (@PathVariable int R) {
		return service.updateRecord(R);
	}
}
