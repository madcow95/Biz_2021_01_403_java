package com.hello.callor;

public class PracticeMultiple {
	/*
	 * 1 ~ 100 까지 5의 배수의 합
	 */
	public static void main(String args[]) {
		
		int intSum = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			int i2 = i + 1;
			
			boolean bYes = i2 % 5 == 0;
			
			if(bYes) {
				int num = i2;
				System.out.println(num + "은 5의 배수");
				intSum += num;
			}
			
		}
		System.out.println(intSum + "은 5의 배수의 합");
		
	}

}
