package com.callor.start;

public class Multiple_02 {
	
	public static void main(String args[]) {
		
		int int3M = 0;
		// 7 ~ 106
		for(int i = 0 ; i < 100 ; i++) {
			int num = i + 7;
			boolean bYes = num % 2 == 0;
			
			if(bYes) {				
				System.out.println(num + "는 3의배수");
				
				int3M += num;
			}			
		}// for end
		System.out.println("7 ~ 106에서 3의 배수의 합 = " + int3M);
	}

}
