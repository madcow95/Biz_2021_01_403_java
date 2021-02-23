package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		int[] intNums = new int[100];

		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = rnd.nextInt(10) + 1;
		}

		System.out.print("1 ~ 10 중 숫자 입력 : ");
		int num = scan.nextInt();
		
		System.out.printf("값 %d가 저장된위치",num);
		for (int position = 0; position < intNums.length; position++) {

			if (intNums[position] == num) {

				System.out.print(position + ", ");
			}
		}
	}
}