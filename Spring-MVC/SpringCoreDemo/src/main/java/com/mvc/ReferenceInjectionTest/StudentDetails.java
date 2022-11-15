package com.mvc.ReferenceInjectionTest;

public class StudentDetails {

	private String studentName;
	private int studentClass;
	private int studentAge;
	private String studentCity;
	private StudentSubjects ss;

	public StudentDetails() {
		super();
	}

	public StudentDetails(String studentname, int studentClass, int studentAge, String studentCity,
			StudentSubjects ss) {
		super();
		this.studentName = studentname;
		this.studentClass = studentClass;
		this.studentAge = studentAge;
		this.studentCity = studentCity;
		this.ss = ss;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentname) {
		this.studentName = studentname;
	}

	public int getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public StudentSubjects getSs() {
		return ss;
	}

	public void setSs(StudentSubjects ss) {
		this.ss = ss;
	}

}
