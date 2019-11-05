package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordController {

		@RequestMapping (method = RequestMethod.GET, value = "/showrecord")
		public Record showrecord() {
			Record ref = new Record(2, "The Shafeeq", 75);
			return ref;
		}
		
		@RequestMapping (method = RequestMethod.POST, value ="/myrecord/{R}/{N}/{M}")
		public Record ShowmyRecord (@PathVariable int R, @PathVariable String N, @PathVariable int M) {
			Record ref =  new Record(R, N, M);
			ref.setRegNo(R);
			ref.setName(N);
			ref.setMarks(M);
			return ref;
		}
	}
