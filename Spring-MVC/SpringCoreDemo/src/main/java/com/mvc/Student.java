package com.mvc;

public class Student {
	private Integer studentId;
	private String studentname;
	private String adress;	


	public Student(Integer studentId, String studentname, String adress) {
		super();
		this.studentId = studentId;
		this.studentname = studentname;
		this.adress = adress;
	}
	
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname=" + studentname + ", adress=" + adress + "]";
	}
	

}
