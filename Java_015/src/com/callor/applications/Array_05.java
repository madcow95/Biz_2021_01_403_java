package com.callor.applications;

import java.util.Random;

public class Array_05 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		Random rnd = new Random();

		for (int i = 0; i < intNums.length; i++) {
			
			intNums[i] = rnd.nextInt(100) + 1;
		}

		int intSum1 = 0;
		System.out.println("3의배수");
		for (int i = 0; i < intNums.length; i++) {
			
			if (intNums[i] % 3 == 0) {
				System.out.print(intNums[i] + ", ");
				intSum1 += intNums[i];
			}
		}
		System.out.println();
		System.out.println("3의 배수의 합 : " + intSum1);
		
		int intSum2 = 0;
		System.out.println("5의배수");
		for (int i = 0; i < intNums.length; i++) {

			if (intNums[i] % 5 == 0) {
				System.out.print(intNums[i] + ", ");
				intSum2 += intNums[i];
			}
		}
		System.out.println();
		System.out.println("5의 배수의 합 : " + intSum2);
		
		int intSum = intSum1 + intSum2;
		System.out.println("3의 배수와 5의 배수의 합 : " + intSum);
	}

}
