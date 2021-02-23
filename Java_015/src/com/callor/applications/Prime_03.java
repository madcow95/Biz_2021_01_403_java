package com.callor.applications;

import java.util.Scanner;

public class Prime_03 {

	public static void main(String[] args) {

		PrimeServiceV2 psV2 = new PrimeServiceV2();
		Scanner scan = new Scanner(System.in);
		System.out.print("2 이상의 정수 입력 : ");
		int keyNum = scan.nextInt();
		// 키보드로부터 입력한 값인 keyNum이 PrimeServiceV2 class prime method의 (num)에 입력돼
		// prime () method를 실행시킨다.
		// 그리고 그 실행시킨 결과의 값을 num이라는 변수에 다시 저장한다
		// 실행시킨 결과의 값은 keyNum에서 입력한 수가 소수일 때는 입력한 keyNum값 그대로
		// 소수가 아닐때는 -1이라는 값이 되어 num에 저장된다
		int num = psV2.prime(keyNum);
		
		// 그렇게 num에 저장된 값이 -1이면 아래의 if문에 따라
		// 0보다 작으면 "소수x"가 출력이되고
		if(num < 0) {
			System.out.println("소수x");
		}
		// 그 밖에 다른 값이 나오면 소수가 맞다는 뜻이므로
		// "소수o"가 출력이된다.
		else {
			System.out.println("소수o");
		}
	}
}
