package com.callor.applications;

import java.util.Random;

public class HomeWork_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		int[] rndNum = new int[100];
		int[] intPrime = new int[rndNum.length];

		for (int i = 0; i < rndNum.length; i++) {

			rndNum[i] = rnd.nextInt(100) + 2;
		}

		for (int i = 0; i < rndNum.length; i++) {
			intPrime[i] = psV2.prime(rndNum[i]);
		}
		
		int intSum = 0;
		for (int i = 0; i < rndNum.length; i++) {
			if (intPrime[i] == -1) {

			} else {
				intSum += intPrime[i];
			}
		}

		System.out.println("임의의 정수 " + rndNum.length + "개 중 소수");
		for (int i = 0; i < rndNum.length; i++) {
			if (intPrime[i] == -1) {

			} else {
				System.out.print(intPrime[i] + ", ");
			}
		}
		System.out.println();
		System.out.println("소수인 수들의 합 : " + intSum);

	}

}
