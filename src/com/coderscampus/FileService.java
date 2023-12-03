package com.coderscampus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
//import java.io.FileWriter;
import java.util.Comparator;

public class FileService {
	Student[] students = new Student[100];
	
	public Student[] readMasterFile() throws NullPointerException, IOException{
		BufferedReader fileReader = null;
		String studentInfo;

		fileReader = new BufferedReader(new FileReader("student-master-list.csv"));
		int i = 0;

		fileReader.readLine();
		while ((studentInfo = fileReader.readLine()) != null) {
			String[] studentData = studentInfo.split(",");
			students[i] = new Student(studentData[0], studentData[1], studentData[2], studentData[3]);
			String printedStudent = students[i].toString();
			System.out.println(printedStudent);
			i++;
		}
		fileReader.close();
		return students;

	}

//	public void sortAndOutputCourse(String[] classType, String fileName) {
//		BufferedWriter writer = null;
//		try {
//			writer = new BufferedWriter(new FileWriter(fileName));
//			writer.write(classType);
//		} finally {
//			if(writer != null) writer.close();
//		}
//
//	}

}


