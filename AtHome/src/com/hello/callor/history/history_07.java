package com.hello.callor.history;

public class history_07 {
	
	public static void main(String args[]) {
		
		int sum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			int i2 = i + 1;
			boolean bYes1 = i2 % 3 == 0;
			boolean bYes2 = i2 % 5 == 0;
			
			if(bYes1 && bYes2) {
				System.out.println(i2 + "는 3과 5의 배수");
				sum += i2;
			}
		}
		System.out.println(sum + "는 3과 5의 배수의 합");
	}

}
