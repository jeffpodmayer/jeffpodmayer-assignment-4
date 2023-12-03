package com.coderscampus;

public class Student {
	String ID;
	String studentName;
	String course;
	String grade;

	public Student(String ID, String studentName, String course, String grade) {
		this.ID = ID;
		this.studentName = studentName;
		this.course = course;
		this.grade = grade;
	}
	
	public String toString() {
		return "ID: " + ID + " Name: " + studentName + " Course: " + course + " Grade: " + grade;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}
