package com.callor.applications;

public class PrimeServiceV1 {

	// 정수 1개를 매개변수로 갖는 prime() method
	public void prime(int num) {

		int i = 0;
		for (i = 2; i < num; i++) {
			// for 구문의 범위는 키보드로부터 입력받는 값인 num에 따라 결정된다.
			// num값이 5 일 경우 범위는 i는 2이니까
			// 2 ~ num - 1 인 2 ~ 4가 된다.
			if (num % i == 0) {
				// num 값을 i로 나누었을 때 0이 되는경우
				// 즉, i가 num 값의 약수 일 때 for 반복문을 멈추고 for 밖으로 나간다.
				break;
			}
			// 만약 num 의 값만큼 다 반복이 끝나도 for 반복문 밖으로 나간다.
		}
		// 이 부분은 i가 num 값의 약수 일때 나오는 곳으로
		// 약수가 있으면 소수가 아니기 때문에 "소수가 아닙니다." 라는 구문을 출력
		if (i < num) {
			
			System.out.println("소수가 아닙니다.");
		}
		// 이 부분은 for 반복문의 반복이 모두 끝난 상태에서 오는 곳으로
		// i = num 이기 때문에 i가 num - 1까지 약수가 없다는 뜻이므로
		// "소수입니다." 라는 구문 출력
		else {
			
			System.out.println("소수입니다.");
		}
		
	}

}
