package com.discover.program.entity;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class Student {
	@NotNull
	private int id;
	private int mobileno;
	@NotEmpty
	private String name;
	private char grade;
	
	public Student(@NotNull int id, @NotNull int mobileno, @NotEmpty String name, char grade) {
		super();
		this.id = id;
		this.mobileno = mobileno;
		this.name = name;
		this.grade = grade;
	}
	
	public Student() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", mobileno=" + mobileno + ", name=" + name + ", grade=" + grade + "]";
	}

}
