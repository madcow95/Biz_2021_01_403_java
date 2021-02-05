package com.callor.start.pay;

public class pay_03 {
	
	public static void main(String args[]) {
		
		int pay = 4_789_800;
		int paper = 50_000;
		
		int count = 0;
		
		for(int i = 0 ; pay > 0 ; i++) {
			// 컴퓨터에서는 0도 짝수로 취급
			count = pay / paper;
			pay -= (paper * count);
			System.out.println(paper + "원권" + count);
				if(i % 2 == 0) { // i가 짝수이면
					paper = paper / 5;
				}
				
				else { // 이건 그렇지 않다
					paper = paper / 2;
				}
						
		}
		
	}

}
