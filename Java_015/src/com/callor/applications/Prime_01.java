package com.callor.applications;

import java.util.Scanner;

public class Prime_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("2이상의 정수 입력 (범위 2 ~ 100) : ");
		int num = scan.nextInt();

		for (int i = 2; i < num; i++) {
			boolean bYes = num % i == 0;

			if (bYes) {
				System.out.println("소수 x");
				break;
			}
//			else {
//				System.out.println("소수 o");
//				break;
//			}
		}
		int pos = 0;
		for (pos = 2; pos < num; pos++) {
			if (num % pos == 0) {
				break;
			}
		}
		// pos의 값은?
		System.out.println(pos);
		// for 반복문이 중간에 break 되면
		// 항상 pos < num 관계가 된다.

		if (pos < num) {
			System.out.println(num + "는 소수 x");
		}
		// for 반복문이 break 없이 모두 완료되었으면
		// 여기는 for 반복문에서 break 없이 도달한 곳으로
		// pos = num이 되므로 아래의 값이 돼서 소수o 가 출력된다.
		else {
			System.out.println(num + "는 소수 o");
		}
	}

}
