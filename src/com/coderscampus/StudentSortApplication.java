package com.coderscampus;

import java.util.Arrays;

public class StudentSortApplication {
	
	public static void main (String[] args) throws Exception {
		FileService fileService = new FileService();
		fileService.readMasterFile();
		
		UserService userService = new UserService();
		userService.divideCourses();
		
	//	userService.sortArraysByGrade(userService.compSciStudents);
	}
}
