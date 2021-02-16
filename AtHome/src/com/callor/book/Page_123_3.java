package com.callor.book;

public class Page_123_3 {
	
	public static void main(String args[]) {
		
		int num = 0;
		int dan = 0;
		
		for(dan = 0 ; dan < 9 ; dan++) {
			int dan2 = dan + 1;
			
			for(num = 0 ; num < 9 ; num++) {
				int num2 = num + 1;
				
				if(dan2 >= num2) {
					System.out.println(dan2 + " x " + num2 + " = " + (dan2 * num2));
				}
			}
			System.out.println("==========");
		
		}
		
	}

}
