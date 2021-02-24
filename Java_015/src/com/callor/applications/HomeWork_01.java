package com.callor.applications;

import java.util.Random;

public class HomeWork_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		// 정수 100개를 저장할 배열 생성
		int[] rndNum = new int[100];
		// 임의의 정수 100개를 저장할 배열 생성
		int[] intPrime = new int[rndNum.length];
		// 1 ~ 100 의 범위 중 임의의 정수 100 개를 rndNum[0 ~ 99] 배열에 저장
		for (int i = 0; i < rndNum.length; i++) {

			rndNum[i] = rnd.nextInt(100) + 2;
		}

		int intSum = 0;
		for (int i = 0; i < rndNum.length; i++) {
			// PrimeServiceV2에 rndNum[0 ~ 99]의 배열에 저장된 값을 보내 계산하게하고
			// return에 의해 되돌아온 값을 intPrime[0 ~ 99] 배열에 저장
			intPrime[i] = psV2.prime(rndNum[i]);
		}

		for (int i = 0; i < rndNum.length; i++) {
			// intPrime[0 ~ 99] 배열에 저장된 값 중 소수를 뜻하는
			// 0이상의 수, (-1)이 아닌 수만 소수들의 합을 뜻하는 intSum 변수에 저장 후 덧셈
			if (intPrime[i] > 0) {
				intSum += intPrime[i];
			}
		}
		
		System.out.println("임의의 정수 " + rndNum.length + "개 중 소수");
		// intPrime[0 ~ 99] 배열에 저장된 소수의 값을 출력하기 위한 코드
		for (int i = 0; i < rndNum.length; i++) {
			boolean bYes = intPrime[i] > 0;
			if (bYes) {
				System.out.print(intPrime[i] + ", ");
			}
		}
		System.out.println();
		System.out.println("소수인 수들의 합 : " + intSum);

	}

}
