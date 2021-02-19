package com.callor.applications;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intNum = new int[10];

		int intSum = 0;
		for (int i = 0; i < 10; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		}
		
		for (int i = 0 ; i < 10 ; i++) {
			intSum += intNum[i];
		}
		
		int evenSum = 0;
		for (int i = 0; i < 10; i++) {
			if (intNum[i] % 2 == 0) {
				evenSum += intNum[i];
			}
		}
		System.out.println("intNum배열의 합 : " + intSum);
		System.out.println("intNum배열 중 짝수들의 합 : " + evenSum);

	}
}