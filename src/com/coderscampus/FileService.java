package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileService {

	public Student[] readMasterFile() throws Exception {
		Student[] studentInfoArray = new Student[101];
		BufferedReader fileReader = null;
		String studentInfo;

		fileReader = new BufferedReader(new FileReader("student-master-list.csv"));

		int i = 0;

		while ((studentInfo = fileReader.readLine()) != null) {
			String[] studentData = studentInfo.split(",");
			studentInfoArray[i] = new Student(studentData[0], studentData[1], studentData[2], studentData[3]);
//			String printedStudent = studentInfoArray[i].toString();
//			System.out.println(printedStudent);
			i++;
		}
		fileReader.close();
		return studentInfoArray;

	}

}
