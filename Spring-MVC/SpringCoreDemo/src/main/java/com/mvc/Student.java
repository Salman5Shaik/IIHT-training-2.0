package com.mvc;

public class Student {
	private Integer studentId;
	private String studentname;
	private String address;	


	public Student() {
		super();
	}


	public Student(Integer studentId, String studentname, String address) {
		super();
		this.studentId = studentId;
		this.studentname = studentname;
		this.address = address;
	}
	
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		System.out.println("setting student id");
		this.studentId = studentId;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		System.out.println("setting student name");
		this.studentname = studentname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		System.out.println("setting student address");
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname=" + studentname + ", address=" + address + "]";
	}
	

}
