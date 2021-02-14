package com.callor.practice;

import java.util.Scanner;

import com.callor.test.YourGuGuDan;

public class Practice_06 {

	public static void main(String[] args) {

		YourGuGuDan yourGu = new YourGuGuDan();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("숫자입력 >> ");
			int num = scan.nextInt();

			if (num >= 2 && num <= 9) {
				yourGu.print(num);
			}
			else {
				System.out.println("2~9가 아니잖아");
				System.out.println("다시입력해");
			}
		}

	}

}
