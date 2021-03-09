package com.callor.student;

import com.callor.student.impl.StudentServiceImplV1;
import com.callor.student.service.StudentService;

public class StudentEx_01 {
	
	public static void main(String args[]) {
		
		StudentService stService = new StudentServiceImplV1();
		
		stService.loadStudentFromFile();
		stService.searchStudent();
		
	}

}
