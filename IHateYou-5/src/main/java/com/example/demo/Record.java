package com.example.demo;

public class Record {
	private int RegNo;
	private String Name;
	private int Marks;
	
	public Record(int regNo, String name, int marks) {
		super();
		RegNo = regNo;
		Name = name;
		Marks = marks;
	}

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
}
