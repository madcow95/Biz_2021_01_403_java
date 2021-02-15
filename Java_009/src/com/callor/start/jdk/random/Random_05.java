package com.callor.start.jdk.random;

/*
 * for(int = 0 ; i < 100 ; i++) {
 * Random 클래스를 이용
 * 
 * 1 ~ 100 범위에서 임의의 숫자 100개를 만들고
 * 100개 중에 짝수가 있으면 짝수들의 합을 계산
 */

import java.util.Random;

public class Random_05 {
	
	public static void main(String args[]) {
		
		Random rnd = new Random();
		int intSum = 0;

		for(int i = 0 ; i < 100 ; i++) {
			
			int num = rnd.nextInt(100) + 1;
			// boolean bYes = num % 2 == 0;
			
			//if((i + 1) % 2 == 0)
			//	if(bYes)
				if(num % 2 == 0) {
					intSum += num;
					System.out.println(num);
				}
			} // for end
		System.out.println(intSum + "는(은) 1 ~ 100 랜덤짝수의 합");
	}

}
