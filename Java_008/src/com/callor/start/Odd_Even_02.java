package com.callor.start;

public class Odd_Even_02 {
	
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
		
		//위에서 선언하고 사용했던 변수를 "재사용" 하기 위해서
		// 반드시 초기화(clear) 해야 한다.
		
		int intSumOdd = 0;
		for(i = 0 ; i < 100 ; i++) {
			
			int num = i + 1;
			boolean bYes = num % 2 == 0;
			
			// if(bYes == false) {
			
			// ! : bYes가 true가 아니면 = bYes가 false 면
			if(!bYes) {
				
				intSumOdd += num;
			}
		}
		System.out.println("홀수의합 : " + intSumOdd);
	}
}
