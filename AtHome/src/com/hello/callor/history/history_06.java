package com.hello.callor.history;

public class history_06 {
	
	public static void main(String args[]) {
		
		int sum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			
			int i2 = i + 7;
			boolean bYes = i2 % 3 == 0;
			
			if(!bYes) {
				System.out.println(i2 + "는(은) 7 ~ 106까지 3의 배수가 아님");
				sum += i2; 
			}
		}
		System.out.println(sum + "는(은) 7 ~ 106까지 3의 배수가 아닌 수들의 합");
	}

}
