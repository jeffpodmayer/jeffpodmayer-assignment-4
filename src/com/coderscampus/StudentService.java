package com.coderscampus;

import java.util.Arrays;
import java.util.Comparator;

public class StudentService {
	FileService fileService = new FileService();

	private Student[] students;

	private Student[] compSciStudents = new Student[34];
	private Student[] statStudents = new Student[33];
	private Student[] apMathStudents = new Student[33];

	private int compSciCtr = 0;
	private int statCtr = 0;
	private int apMathCtr = 0;

	public Student[] getCompSciStudents() {
		return compSciStudents;
	}

	public Student[] getStatStudents() {
		return statStudents;
	}

	public Student[] getApMathStudents() {
		return apMathStudents;
	}

	public void divideCourses() {
		for (Student student : students) {
			if (student.getCourse().contains("COMPSCI")) {
				compSciStudents[compSciCtr] = student;
				compSciCtr++;
			} else if (student.getCourse().contains("STAT")) {
				statStudents[statCtr] = student;
				statCtr++;
			} else if (student.getCourse().contains("APMTH")) {
				apMathStudents[apMathCtr] = student;
				apMathCtr++;
			}
		}

	}

	public StudentService() throws Exception {
		loadStudents();
		sortStudents();
	}

	private void loadStudents() throws Exception {
		students = fileService.readMasterFile();

	}

	private void sortStudents() {
		Arrays.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student student1, Student student2) {
				int grade1 = Integer.parseInt(student1.getGrade());
				int grade2 = Integer.parseInt(student2.getGrade());

				return Integer.compare(grade2, grade1);
			}
		});
	}
}
