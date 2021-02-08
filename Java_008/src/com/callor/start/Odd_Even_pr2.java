package com.callor.start;

public class Odd_Even_pr2 {
	
	public static void main(String args[]) {
		
		int i = 0;
		int intSum = 0;
		int intSum1 = 0;
		for(i = 0 ; i < 100 ; i++) {
			int i2 = (1 + i);
			boolean bYes = i2 % 2 == 0;
			
			if(bYes) {
				intSum += i2;
				}
			
			else{
				
				intSum1 += i;
				}
			
		}
		System.out.println(intSum);
		System.out.println(intSum1);
	}

}
