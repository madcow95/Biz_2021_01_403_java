package com.hello.callor.history;

import java.util.Random;

public class history_08 {
	
	public static void main(String args[]) {
		
		int sum = 0;
		Random rnd = new Random();
		
		for(int i = 0 ; i < 100 ; i++) {
			int num = rnd.nextInt(100) + 1;
			
			if(num % 2 == 0) {
				System.out.println(num + "은(는) 1 ~ 100 까지 임의의 짝수");
				sum += num;
			}
		}
		System.out.println(sum + "은(는) 1 ~ 100 까지 임의의 짝수의 합");
		
	}

}
