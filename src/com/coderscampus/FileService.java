package com.coderscampus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {
	Student[] students = new Student[100];
	BufferedWriter writer = null;
	BufferedReader fileReader = null;

	public Student[] readMasterFile() throws Exception {
		String studentInfo;

		fileReader = new BufferedReader(new FileReader("student-master-list.csv"));
		int i = 0;

		fileReader.readLine();
		while ((studentInfo = fileReader.readLine()) != null) {
			String[] studentData = studentInfo.split(",");
			students[i] = new Student(studentData[0], studentData[1], studentData[2], studentData[3]);
			i++;
		}
		fileReader.close();
		return students;

	}

	public void saveStudentsOfCourseCSV(Student[] classArray, String fileName) throws IOException {
		try {
			writer = new BufferedWriter(new FileWriter(fileName));
			writer.write("Student ID, Student Name, Course, Grade");
			writer.newLine();
			for (Student student : classArray) {
				writer.write(student.toString());
				writer.newLine();
			}

		} finally {
			if (writer != null)
				writer.close();
		}

	}

}
