package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_01 {

	public static void main(String args[]) {
		
		// 정수 100개를 저장할 배열변수를 선언
		// 생성(초기화 : 사용할 준비를 해라)하라
		int[] intNums = new int[100];
		// Random class를 사용하여 rnd 객체를 선언하고 = new Random() 명령을 사용하여
		// rnd 객체를 인스턴스화 시킨다.
		// rnd : Random class의 인스턴스
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		// int num = rnd.nextInt(100);
		// : Random class의 nextInt() method에 정수 100을 전달하고 실행하여
		// return하는 결과를 num 변수에 저장해라
		// num 변수에는 0 ~ 99까지 중 1개의 숫자가 저장된다.
		
		/*
		 * 0 ~ intNums.length 까지의 정수를 만들어서
		 * intNums의 위치값으로 정하고
		 * 
		 * 1 ~ 10 까자의 임의 숫자를 생성하여 intNums의 배열에 채워넣어라.
		 */
		for (int i = 0; i < intNums.length; i++) {
			// num 변수에는 1 ~ 10 까지 중 1개의 숫자가 저장된다.
			// Random class의 nextInt() method를 호출하면서 정수 10을 전달하고
			// return된 결과에 1을 더해라.
			// 1 ~ 10까지 중 임의 숫자 1개를 만들어라
			// 임의로 생성된 숫자를
			// intNums의 i번째 위치에 저장해라
			intNums[i] = rnd.nextInt(10) + 1;
		}

		System.out.print("숫자입력 >> ");
		int num = scan.nextInt();

		int intCount = 0;
		for (int i = 0; i < intNums.length; i++) {

			if (intNums[i] == num) {
				
				intCount++;
			}
		}
		System.out.println("intNums[i]에서 " + num + "의 갯수 : " + intCount + "개");
	}

}
