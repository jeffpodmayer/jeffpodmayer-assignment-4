package com.coderscampus;

public class UserService {
	FileService fileService = new FileService();
	
	Student[] students = fileService.readMasterFile();

	Student[] compSciStudents = new Student[34];
	Student[] statStudents = new Student[33];
	Student[] apMathStudents = new Student[33];

	int i = 0;
	int j = 0;
	int k = 0;

	public void divideCourses() {
		for (Student student : students) {
			if (student.getCourse().contains("COMPSCI")) {
				compSciStudents[i] = student;
				i++;
			} else if (student.getCourse().contains("STAT")) {
				statStudents[j] = student;
				j++;
			} else if (student.getCourse().contains("APMTH")) {
				apMathStudents[k] = student;
				k++;
			}
		}

	}

	public UserService() throws Exception {
		this.students = fileService.readMasterFile();
	}

}
