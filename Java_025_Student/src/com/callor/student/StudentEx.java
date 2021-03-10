package com.callor.student;

//import com.callor.student.VO.StudentVO;

public class StudentEx {
	
	public static void main(String[] args) {
		//MenuStudent ms = new MenuStudent();
		ServiceStudent ss = new ServiceStudent();
		
		ss.loadFile();
		ss.printFile();
			
		}
		
		
	

}
