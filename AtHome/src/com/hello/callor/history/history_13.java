package com.hello.callor.history;

import java.util.Scanner;

public class history_13 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("숫자입력 >> ");
			int num = scan.nextInt();
			boolean bYes = num >= 2;
			boolean bYes1 = num <= 9;

			if (bYes && bYes1) {
				System.out.println("=====================");
				System.out.println("구구단" + num + "단");
				System.out.println("=====================");
			}

			for (int i = 0; i < 9; i++) {
				int i2 = i + 1;

				if (bYes && bYes1) {
					System.out.println(num + " x " + i2 + " = " + (num * i2));
				} else {
					System.out.println("2 ~ 9 를 벗어났습니다.");
					System.out.println("다시 입력하세요.");
					System.out.println("=====================");
					break;
				}
			}

		}

	}
}
