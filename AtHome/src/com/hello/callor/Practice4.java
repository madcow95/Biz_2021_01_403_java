package com.hello.callor;

public class Practice4 {
	
	public static void main(String args[]) {
		
		for(int i = 0 ; i < 100 ; i++) {
			int num = i + 1;
			
			System.out.print(num + "\t");
			if(num % 5 == 0) {
				System.out.println();
			}
			
		}
		
		for(int i = 0 ; i < 100 ; i++) {
			int num1 = i + 1;
			
			System.out.print(num1 + ",");
			if(num1 % 5 == 0) {
				System.out.println();
			}
		}
	}
	

}
