
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

		Random rnd = new Random();
		int rndNum = 0;
		for (int i = 0; i < 100; i++) {
			rndNum = rnd.nextInt(90) + 10;
			int index = 0;
			for (index = 2; index < rndNum; index++) {
				if (rndNum % index == 0) {
					break;
				}

			}
			if (rndNum > index) {
				System.out.println(rndNum + "는 소수요");
			} else {
				System.out.println(rndNum + "는 소수가 아니오");
			}
		}

	}

}
