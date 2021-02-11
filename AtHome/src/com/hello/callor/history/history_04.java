package com.hello.callor.history;

public class history_04 {
	
	public static void main(String args[]) {
		
		int sum = 0;
		int sum1 = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			int i2 = 1 + i;
			
			if(i2 % 2 == 0) {
				sum += i2;
			}
			else {
				sum1 += i2;
			}
		}
		System.out.println(sum + "은 1 ~ 100에서 짝수의 합");
		System.out.println(sum1 + "은 1 ~ 100에서 홀수의 합");
	}

}
