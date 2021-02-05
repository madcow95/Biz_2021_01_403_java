package com.callor.start.pay;

public class pay_05 {
	
	public static void main(String args[]) {
		
		int pay = 4_789_800;
		int paper = 50_000;
		
		int count = 0;
		
		int sw = -1;
		while(pay > 0) {
		// while = 괄호안의 연산이 true일 때까지만 연산을 반복
		/*
		 * 일반적으로 for() 반복문은 반복되는 횟수가 명확할때 사용
		 * while(조건문) 반복문은 반복되는 횟수가 경우에 따라 다를때 사용
		 * 		조건을 부여하여 반복 수행을 결정
		 * 		조건문이 true 일 때만 반복하고, 조건문이 false가 되면 종료한다.	
		 */
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
