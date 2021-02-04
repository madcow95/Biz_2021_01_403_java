package com.callor.varriable;

public class Loop_03 {
	
	public static void main(String args[]) {
		
		int num1 = 0;
		
		// 유한 반복 코드 = for 반복문		
		for( ; num1 < 10 ; ) {
			
			num1 += 1;
			System.out.println(num1);
		}
		
		System.out.println("for이후코드");
		
			num1 = 0;
		for( ; num1 < 100 ; ) {
			
			num1 += 1;
			System.out.println(num1);
		}
	}

}
