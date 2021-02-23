package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_011 {

	public static void main(String args[]) {

		Random rnd = new Random();
		// 키보드 입력을 받기위해 Scanner class를 scan객체로 선언
		// scan 객체를 인스턴스화 하기
		// 사용할 준비를 한다.
		Scanner scan = new Scanner(System.in);
		int[] intNums = new int[100];

		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = rnd.nextInt(10) + 1;
		}

		System.out.println("정수 1 ~ 10 까지 중 숫자 입력");
		System.out.print("숫자 >> ");
		int keyNum = scan.nextInt();

		// intNums에는 어떤 값이 저장되어있는지 모른다.
		// 단, 1 ~ 10 까지의 숫자들이 들어있을 것이다.
		// intNums 배열에 저장된 숫자들 중에서
		// 키보드로 입력받은 값(ketNums에 저장되어있다.)과 같은 값들이
		// 몇 번(개) 저장되어있는지 알고싶다.
		
		int count = 0; // 몇 개인지 개수를 헤아릴 변수
		for (int i = 0; i < intNums.length; i++) {

			// boolean bYes = intNums[i] == keyNum; 으로 해도 괜찮다.
			if (intNums[i] == keyNum) {
				// 카운트를 세서...
				// intNums[0 ~ 99] 배열에 저장된 값과 keyNum에 입력한 값이 같을 때마다
				// count 변수에 1씩 추가시켜라
				count++;
				//System.out.println(intNums[i]);
			}
		}
		System.out.println(keyNum + "의 갯수 : " + count);
	}

}
