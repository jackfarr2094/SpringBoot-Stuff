package com.nationwide;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity

@NamedQueries 
(value = { 
		@NamedQuery(name = "schools.findMaxMarks", query = "select Max(p.Marks) from schools p") } )
		@NamedQuery(name = "schools.findMarksfromDept", query = "select Max(p.Marks) from schools p where p.Dept = ?1")

public class Schools {
	
	@Id
	private int regno;
	private String name;
	private int marks;
	private String subject;
	private String dept;
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}	
}