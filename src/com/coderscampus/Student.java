package com.coderscampus;

public class Student {
	private String ID;
	private String studentName;
	private String course;
	private String grade;

	public Student(String ID, String studentName, String course, String grade) {
		this.ID = ID;
		this.studentName = studentName;
		this.course = course;
		this.grade = grade;
	}

	public String toString() {
		return ID + studentName + course + grade;
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
