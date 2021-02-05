package com.callor.start.logic;

/*
 * 화폐매수 계산
 * 
 * 4789800
 * 50000 : 95
 * 10000 : 3  : 50000 / 5
 * 5000  : 1  : 10000 / 2
 * 1000  : 4  : 5000  / 5
 * 500   : 1  : 1000  / 2 
 * 100   : 3  : 500   / 5
 */

public class Logic_05 {
	
	public static void main(String args[]) {
		
		int pay = 4_789_800;
		// 가장큰 화폐값
		int paper = 50_000;
		// 정수를 정수로 나누는 연산을 했을 경우
		// 결과도 정수(몫)으로 나타내는 연산 규칙을 활용한 결과
		int count = pay / paper;
		System.out.println(paper + "원권 : " + count);
		
		// 1만원권
		// pay 에서 5만원권 금액만큼 제외하고
		// 1만원권 매수를 계산한다.
		pay -= (paper * count);
		paper = paper / 5;
		count = pay / paper;
		System.out.println(paper + "원권 : " + count);
		
		// 5천원권
		pay -= (paper * count);
		paper /= 2;
		count = pay / paper;
		System.out.println(paper + "원권 : " + count);
		
		
				
		
		
	}

}
