package com.callor.start.logic;

public class Logic_02 {
	
	public static void main(String args[]) {
		// 불값, 논리연산결과를 담는 변수
		// boolean자바 나올 때부터, Boolean다른 기능 추가
		// boolean = true 와 false 를 가지고 연산하는 변수
		// = 기준으로 오른쪽 먼저 계산
		// 하고 나온 결과 값을 bYes에 저장해라
		boolean bYes = 3 == 3;
		bYes = 3 > 3;
		System.out.println(bYes);
		
		bYes = 3 >= 3;
		
		int num1 = 55;
		int num2 = 65;
		
		bYes = num1 >= num2;
		
		bYes = num1 * 2 >= num2;
		bYes = (num1 * 2) >= num2; 
		
	}

}
