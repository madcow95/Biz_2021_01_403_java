package com.callor.blog;

public class GuGuDan_01 {
	
	public static void main(String args[]) {
		// 변수를 하나 선언하고 그 변수에 숫자를 입력했을 때
		// 나오는 수의 구구단이 출력되도록
		
		int dan = 4;
		System.out.println("구구단" + dan + "단");
		System.out.println();
		
		for(int i = 1 ; i < 10 ; i++) {
			
			System.out.println(dan + " x " + i + " = " + (dan * i));
			
		}
		
		
	}

}
