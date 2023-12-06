package com.coderscampus;

public class StudentSortApplication {

	public static void main(String[] args) throws Exception {
		FileService fileService = new FileService();

		StudentService studentService = new StudentService();
		studentService.divideCourses();
		
		fileService.saveStudentsOfCourseCSV(studentService.getCompSciStudents(), "course1.csv");
		fileService.saveStudentsOfCourseCSV(studentService.getStatStudents(), "course2.csv");
		fileService.saveStudentsOfCourseCSV(studentService.getApMathStudents(), "course3.csv");

	}
}
