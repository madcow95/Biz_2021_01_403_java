package com.callor.applications;

import java.util.Random;

public class HomeWork_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		int[] rndNum = new int[100];
		int[] intPrime = new int[rndNum.length];

		for (int i = 0; i < rndNum.length; i++) {
			// rndNum[0 ~ 99] 배열에 2 ~ 101 중 임의의 정수 저장
			rndNum[i] = rnd.nextInt(100) + 2;
		}
		
		for (int i = 0; i < rndNum.length; i++) {
			// prime() method에 rndNum[i] 배열 전달 후 결과값 intPrime[i]배열에 저장
			intPrime[i] = psV2.prime(rndNum[i]);
		}
		
		int intSum = 0;
		for (int i = 0; i < rndNum.length; i++) {
			if (intPrime[i] == -1) {
				// -1 값이 return되면 뭘시키지;
			} else {
				// -1이 아닌 값이 return 되면 임의의 정수 중 소수들 intSum에 더하여 저장
				intSum += intPrime[i];
			}
		}

		System.out.println("임의의 정수 " + rndNum.length + "개 중 소수");
		for (int i = 0; i < rndNum.length; i++) {
			if (intPrime[i] == -1) {
				// ?
			} else {
				// -1이 아닌 값이 return 되면 임의의 정수 중 소수들만 Console에 출력
				System.out.print(intPrime[i] + ", ");
			}
		}
		System.out.println();
		System.out.println("소수인 수들의 합 : " + intSum);

	}

}
