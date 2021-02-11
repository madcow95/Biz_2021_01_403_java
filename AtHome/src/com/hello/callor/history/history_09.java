package com.hello.callor.history;

import java.util.Random;

public class history_09 {
	
	public static void main(String args[]) {
		
		Random rnd = new Random();
		for(int i = 0 ; i < 100 ; i++) {
			int i2 = i + 1;
			int num = rnd.nextInt(100) + 1;
			boolean bYes = num < 34;
			
			if(bYes) {
				System.out.println(num);
			}
			else {
				System.out.println(i2 + "번째 " + num );
				break;
			}
			
		}
		
	}

}
