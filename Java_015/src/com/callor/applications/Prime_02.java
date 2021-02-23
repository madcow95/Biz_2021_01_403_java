package com.callor.applications;

import java.util.Scanner;

public class Prime_02 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		PrimeServiceV1 psV1 = new PrimeServiceV1();

		System.out.print("2 이상 정수 입력 >> ");
		int keyNum = scan.nextInt();
		psV1.prime(keyNum);
	}

}
