package com.callor.start;

public class Multiple_02_01 {
	
	public static void main(String args[]) {
		
		// ~ 범위의 값을 덧셈(합산, 누적)용 변수선언		
		int intSum = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			int num = i + 7;
			boolean bYes = num % 9 == 0;
						
			if(!bYes) {
				intSum += num;
				// System.out.println(num + "는 7 ~ 106에서 3의 배수가 아닌 수");
			}			
		}
		System.out.println(intSum + "는 7 ~ 106에서 9의 배수가 아닌 수의 합");
	}	

}
