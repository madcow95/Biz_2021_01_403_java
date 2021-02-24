package com.callor.applications;

import java.util.Random;

public class HomeWork_011 {

	public static void main(String[] args) {

		// 이 두개의 변수는 for()반복문에서 수행한 연산 덧셈, 개수세기를 수행한 후
		// 결과를 출력하는 곳에서 사용해야할 변수이다.
		// 따라서 for() 반복문이 시작되기전에
		// 변수를 선언 및 초기화 해 두어야 한다.
		int intPrimeSum = 0;
		int intPrimeCount = 0;
		Random rnd = new Random();
		PrimeServiceV2 psV2 = new PrimeServiceV2();

		// 0 ~ 9999까지의 난수를 새엇ㅇ하고 생성된 난수에 + 2를 수행해라
		// 실제 생성된 수는 2 ~ 10001 까지 중에 난수를 생성하여 rndNum에 저장
		for (int i = 0; i < 100; i++) {
			
			int rndNum = rnd.nextInt(10000) + 2;

			// psV2 class의 prime() method는 rndNum이 소수이면 그 수를 그대로 return
			// 아니면 -1을 return
			int result = psV2.prime(rndNum);
			if (result > 0) {
				System.out.print(rndNum + ", ");
				// intPrimeSum += rndNum;
				// intPRimeCount++;
			}
			// 소수들의 합을 계산하기
			// intPrimeSum 변수에 값을 누적하여 합계 계산
			if (result > 0) {
				intPrimeSum += rndNum;
			}
			// 소수들의 개수를 count
			if (result > 0) {
				intPrimeCount++;
			}

		} // end for
		System.out.println();
		System.out.println("합계 : " + intPrimeSum);
		System.out.println("개수 : " + intPrimeCount);
	}

}
