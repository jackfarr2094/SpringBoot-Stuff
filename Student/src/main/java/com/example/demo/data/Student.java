package com.example.demo.data;

public class Student {

	private int RegNo;
	private String Name;
	private int Marks;
	public int getRegNo() {
		return RegNo;
	}
	public void setRegNo(int regNo) {
		RegNo = regNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public Student(int regNo, String name, int marks) {
		super();
		RegNo = regNo;
		Name = name;
		Marks = marks;
	}
}
