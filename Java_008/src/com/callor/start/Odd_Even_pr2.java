package com.callor.start;

public class Odd_Even_pr2 {
	
	public static void main(String args[]) {
		
		int Dan = 2;
		int i = 0;
		int i2 = 0;
		int x = 0;
		
		for(i = 1 ; i < 10 ; i++) {
			i2 = i;					
			x = Dan * i2;
			System.out.println(x);
			
			Dan = 3;
			System.out.println(x);
		
		}
		
		
	}

}
