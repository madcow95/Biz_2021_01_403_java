package com.hello.callor;

public class Practice2 {
	// 0 ~ 100 사이의 짝수의 합 and 홀수의 합
	public static void main(String args[]) {
		
		int intSum = 0;
			for(int i = 0 ; i < 100 ; i++) {

				int i2 = i + 1;
				boolean bYes = i2 % 2 == 0;
				if(bYes) {
					intSum += i2;
				}
			}	
			System.out.println(intSum);	
			
			intSum = 0;
			for (int i = 0 ; i < 100 ; i++) {
				
				boolean bYes = i % 2 == 1;
								
				if(bYes) {
					intSum += i;
				}
				
			}
			System.out.println(intSum);
		
	}

}
