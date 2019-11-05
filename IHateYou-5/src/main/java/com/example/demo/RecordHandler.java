package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordHandler {
	
	Service Ref = new Service();
	
	@RequestMapping (method = RequestMethod.GET, value = "/ShowRecord/{No}")
	public Record ShowRec(@PathVariable int No) {
		return Ref.ShowRecord(No);
	}
	@RequestMapping (method = RequestMethod.GET, value = "/findRecord/{No}")
	public Record findRegNo(@PathVariable int No) {
		return Ref.findRecord(No);
	}
	@RequestMapping (method = RequestMethod.GET, value = "/allRecords/{No}")
	public Record findRegNo(@PathVariable int No) {
		return Ref.allRecords(No);
	}
}
