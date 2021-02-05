package com.callor.start.pay;

public class pay_02 {
	
	public static void main(String args[]) {
		
		int pay = 4_789_800;
		int paper = 50_000;
		
		int count = 0;
		
		int sw = -1;
		for(; pay > 0 ;) {
			
			count = pay / paper;
			pay -= (paper * count);
			System.out.println(paper + "원권" + count);
				if(sw < 0) { // sw가 0보다 작으면
					paper = paper / 5;
				}
				// else는 if와 항상 같이 다닌다 
				// if가 true 면 else는 false
				else { // 그렇지 않으면
					paper = paper / 2;
				}
				sw *= (-1);
			
				
									
			
		}
		
	}

}
