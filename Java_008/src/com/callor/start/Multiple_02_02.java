package com.callor.start;

public class Multiple_02_02 {
	
	public static void main(String args[]) {
		
		// ~ 범위의 값을 덧셈(합산, 누적)용 변수선언
		// 수준 '하'
		int intSum = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			int num = i + 7;
			boolean bYes1 = num % 3 == 1;
						
			if(bYes1) {
				intSum += num;
			}
			
			boolean bYes2 = num % 3 == 2;
			if(bYes2) {
				intSum += num;
			}
		}
		System.out.println(intSum + "는 7 ~ 106에서 3의 배수가 아닌 수의 합");
		
		// 수준 '중'
		intSum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			
			int num = i + 7;
			boolean bYes = num % 3 > 0;
			if(bYes) {
				intSum += num;
			}
		}
		System.out.println(intSum + "는 7 ~ 106에서 3의 배수가 아닌 수의 합");
		
		// 수준 '상'
		intSum = 0;		
		for(int i = 0 ; i < 100 ; i++) {
			
			int num = i + 7;
			boolean bYes = num % 3 == 0;
			if(!bYes) {
				intSum += num;
			}
		}
		System.out.println(intSum + "는 7 ~ 106에서 3의 배수가 아닌 수의 합");
		
		intSum = 0;		
		for(int i = 0 ; i < 100 ; i++) {
			
			int num = i + 7;
			boolean bYes = num % 3 != 0; // 3의 배수가 아니냐 라고 묻는거 (num % 3 == 1 이랑 num % 3 == 2)를 하나로 묶은것
			if(bYes) {					 // 3의 배수가 아닌 값을 찾는거? 
				intSum += num;
			}
		}
		System.out.println(intSum + "는 7 ~ 106에서 3의 배수가 아닌 수의 합");
		
	}	

}
