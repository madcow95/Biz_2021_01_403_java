package com.hello.callor;

public class Practice {
	// 0 ~ 100 사이의 짝수의 합 and 홀수의 합
	public static void main(String args[]) {
		
		int intSum = 0;
		int i = 0;
		int num = 0;
		for(i = 0 ; i < 100 ; i++) {
			int i2 = i + 1;
			boolean bYes = i % 2 == 0;
			
			if(bYes) {
				intSum += i2;
			}
			else {
				num += i2;
			}
		}
		System.out.println(intSum);
		System.out.println(num);
		
		
	}

}
