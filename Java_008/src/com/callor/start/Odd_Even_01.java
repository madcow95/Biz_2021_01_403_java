package com.callor.start;

public class Odd_Even_01 {
	
	public static void main(String args[]) {
		
		int intSum = 0;
		int i = 0;						
				
		for(i = 0 ; i < 100 ; i++) {
			int i2 = (i + 1);
			boolean bYes = i2 % 2 == 0;
			
			if(bYes) {
				intSum += i2;					
			}			
		}
		System.out.println("0 ~ 100의 짝수 합 = " + intSum);
					
		intSum = 0;
		
		for(i = 0 ; i < 100 ; i++) {
			boolean bYes = i % 2 == 1;
			
			if(bYes) {
				intSum += i;
			}			
		}
		System.out.println("0 ~ 100의 홀수 합 = " + intSum);
	}
}
