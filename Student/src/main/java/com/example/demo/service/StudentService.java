package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.example.demo.data.Student;

@Component
public class StudentService {
	ArrayList<Student> records = new ArrayList <>();

	public void addRecord() {
		Student ref = new Student(2, "Peter", 76);
		records.add(ref);
	}
	public ArrayList<Student> showAll() {
		
		return records;
}
	public void addnewRecord(int r, String n, int m) {
		Student ref = new Student(m, n, m);
		ref.setRegNo(r);
		ref.setName(n);
		ref.setMarks(m);
		records.add(ref);
	}
	
	public Student findRecord(int R) {
		for(Student x : records) {
			if (x.getRegNo()==R) {
				return x;
			}
		}
		return null;
	}
	
	public String deleteRecord (int R) {
		Student S = findRecord(R);
		if(S == null) {
			return "Result not found";
		}
		records.remove(S);
		return "Records deleted";
		}
	
	public Student updateRecord (int R, String N, int M) {
		for(Student x : records) {
			if (x.getName()==N) {
				return x;
			}
		}
		return null;
	}
}
	

