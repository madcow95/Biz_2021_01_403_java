package com.hello.callor.history;

import java.util.Scanner;

public class GoGoDan {

	public void gogo() {

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요(2 ~ 9) >> ");
		int num = scan.nextInt();
	}

	public void print(int num) {

		boolean bYes = num >= 2;
		boolean bYes1 = num <= 9;

		if (bYes && bYes1) {
			System.out.println("=============");
			System.out.println("구구단" + num + "단");
			System.out.println("=============");

			for (int i = 0; i < 8; i++) {
				int i2 = i + 1;

				if (bYes && bYes1) {
					System.out.println(num + " x " + i2 + " = " + (num * i2));
				}
				if (!bYes) {
					System.out.println("2미만");
					System.out.println("다시 입력하세요");
				}
				if (!bYes1) {
					System.out.println("9초과");
					System.out.println("다시 입력하세요");
				}
			}

		}

	}

}

