
package com.callor.student;

import java.util.Random;

/*
 * 정수형 배열 100개를 선언하여 
 * 10 ~ 100까지 임의의 정수를 생성하여 저장
 * 
 * 100개의 배열에 담긴 정수중에 소수들만 찾아서
 * Console에 출력
 */

public class Ex_08 {

	public static void main(String[] args) {

		int[] intNum = new int[10];
		Random rnd = new Random();

		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(90) + 10;
			System.out.print(intNum[i] + ", ");
		}
		
		for(int i = 0; i < intNum.length; i++) {
			//if(intNum[i] % i > 0) {
				//System.out.println(intNum[i] + "는 소수");
			//}
		}
	}

}
