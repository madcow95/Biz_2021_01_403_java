package com.callor.start;

public class Multiple_01 {
	
	public static void main(String args[]) {
		
		int intSum = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			int i2 = (i + 7);
			boolean bYes = i2 % 3 == 0;
			// if(i2 % 3 == 0) {
			if(bYes) {
				System.out.println(i2 + "는 3의배수");
				
				intSum += i2;
			}			
		}
		System.out.println("7 ~ 106에서 3의 배수의 합은 " + intSum);
	}
	

}
