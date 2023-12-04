package com.coderscampus;

public class StudentSortApplication {

	public static void main(String[] args) throws Exception {
		FileService fileService = new FileService();
		fileService.readMasterFile();

		UserService userService = new UserService();
		userService.divideCourses();

		fileService.sortAndOutputCourse(userService.compSciStudents, "course1.csv");
		fileService.sortAndOutputCourse(userService.statStudents, "course2.csv");
		fileService.sortAndOutputCourse(userService.apMathStudents, "course3.csv");

	}
}
