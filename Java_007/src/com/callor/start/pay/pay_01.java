package com.callor.start.pay;

public class pay_01 {
	
	public static void main(String args[]) {
		
		int pay = 4_789_800;
		int paper = 50_000;
		
		int count = 0;
		
		// for() 반복문이 무한 반복된다.
		// for() 문을 종료하는 조건을 부여해야 한다.
		int sw = -1;
		for(; pay > 0 ;) {
			
			count = pay / paper;
			pay -= (paper * count);
			System.out.println(paper + "원권" + count);
				if(sw < 0) {
					paper = paper / 5;
				}
				if(sw > 0) {
					paper = paper / 2;
				}
				sw *= (-1);
			
				// 최초에는 sw가 -1이다가 두번째 for()반복문을 시작하기전에
				// -1을 곱하여 sw를 1로 만든다.
			
									
			
		}
		
	}

}
