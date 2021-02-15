package com.callor.book;

public class Page_100 {
	
	public static void main(String args[]) {
		
		int grade = 0;
		// A = 65, B = 66, C = 67, D = 68, F = 70
		int score = 45;
		
		if(score >= 90) {
			grade = 'A';
			System.out.println(score + "점 : " + (char)grade);
		}else if(score >= 80) {
			grade = 'B';
			System.out.println(score + "점 : " + (char)grade);
		}else if(score >= 70) {
			grade = 'C';
			System.out.println(score + "점 : " + (char)grade);
		}else if(score >= 60) {
			grade = 'D';
			System.out.println(score + "점 : " + (char)grade);
		}else {
			grade = 'F';
			System.out.println(score + "점 : " + (char)grade);
		}
		
	}

}
