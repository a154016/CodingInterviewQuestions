package com.ashish.interview;

public class Student {
	
	private int rolNumber;
	private String name;
	private int marks;
	public Student(int rolNumber, String name, int marks) {
		super();
		this.rolNumber = rolNumber;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rolNumber=" + rolNumber + ", name=" + name + ", marks=" + marks + "]";
	}
	public int getRolNumber() {
		return rolNumber;
	}
	public void setRolNumber(int rolNumber) {
		this.rolNumber = rolNumber;
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

}
