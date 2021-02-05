package com.callor.practice;

public class practice_01 {
	
	public static void main(String args[]) {
		// pay를 한국 돈으로 지폐 몇 장씩 나누는 코드
		int pay = 78_542_700;
		int paper = 50_000;		
		int count = 0;
		int i = -1;
		for( ; pay > 0 ;) {			
			count = pay / paper;
			pay -= (count * paper);	
			System.out.println(paper + "원은 " + count + "장이다.");
			
					
			if(i < 0) {				
				paper /= 5;				
			}			
			else{				
				paper /= 2;
			}			
			i = i * -1;			
		}
		
	}
	
	

}
