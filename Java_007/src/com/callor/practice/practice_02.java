package com.callor.practice;

public class practice_02 {
	
	public static void main(String args[]) {
		
		int pay = 51_892;
		int paper = 10_000;		
		int count = 0;
		int i = 0;
				
		while(pay > 0) {
			
			count = pay / paper;
			System.out.println(paper + "원권은" + count + "장");
			pay -= (count * paper);
			
			if(i % 2 == 0) {
				
				paper /= 2;
			}
			
			else{
				
				paper /= 5;
			}
			
			
			
			i += 1;
			
		}
		
	}

}
