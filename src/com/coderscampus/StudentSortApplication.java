package com.coderscampus;

public class StudentSortApplication {
	
	public static void main (String[] args) throws Exception {
		
		FileService fileService = new FileService();
		fileService.readMasterFile();
		
		
	}
}
