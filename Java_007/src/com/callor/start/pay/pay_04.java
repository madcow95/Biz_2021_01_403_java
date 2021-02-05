package com.callor.start.pay;

/*
 * 이 코드는 for() 반복문의 코드 실행순서를 참조하는 용도이며
 * pay 계산에는 오류가 있다.
 */
public class pay_04 {
	
	public static void main(String args[]) {
		
		
		int paper = 50_000;
		int count = 0;
		
		int sw = -1;
		for(int pay = 4_789_800 ; pay > 0 ; pay -= (paper * count)) {
			
			count = pay / paper;
			
			System.out.println(paper + "원권 : " + count);
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
