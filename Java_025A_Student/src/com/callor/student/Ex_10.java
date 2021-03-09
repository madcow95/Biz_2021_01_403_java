package com.callor.student;

/*
 * =================================
 * 구구단 7단
 * ---------------------------------
 * 7 X 1 = 7
 * :
 * :
 * 7 X 9 = 63
 */

public class Ex_10 {
	
	public static void main(String args[]) {
		
		int dan = 7;
		System.out.printf("구구단 %d단\n",dan);
		
		for(int i = 0; i < 9; i++) {
			int i2 = i + 1;
			
			System.out.printf("%d x %d = %d\n",dan,i2,i2 * dan);
		}
	}

}
