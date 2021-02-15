package com.callor.book;

public class Page_97 {
	
	public static void main(String args[]) {
		
		int fee = 0;
		int age = 0;
		age = 88;
		
		if(age < 8) {
			System.out.println("미취학아동");
			fee = 1000;
		}
		else if(age < 14) {
			System.out.println("초등학생");
			fee = 2000;
		}
		else if(age < 20) {
			System.out.println("중,고등학생");
			fee = 2500;
		}
		else{
			System.out.println("성인");
			fee = 3000;
		}
		if(age >= 60) {
			System.out.println("경로우대입니다.");
			fee = 0;
		}
		System.out.println("요금은 " + fee + "원 입니다.");
	}

}
