package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {

	public static void main(String args[]) {

		int[] intNums = new int[100];
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = rnd.nextInt(10) + 1;
		}

		System.out.print("숫자입력 : ");
		int num = scan.nextInt();

		for (int i = 0; i < intNums.length; i++) {

			if (intNums[i] == num) {

				System.out.printf("%d번째 처음으로 출력\n", i);
				break;
			}
		}
	}

}
