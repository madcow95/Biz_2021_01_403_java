package com.callor.applications.service;

import java.util.Scanner;

public class ClassServiceV3 {
	
	// java에서는 인스턴스 변수를 private으로 제한한다.
	private int intNum1 = 0;
	private int intNum2 = 0;
	private Scanner scan = new Scanner(System.in);
	
	/*
	 * scope(범위) method에서는 1개의 숫자를 키보드에서 입력받아
	 * 변수 intNum1에 저장한다.
	 * 하지만 여기에서 선언된 intNum1은 class영역에 선언된
	 * 인스턴스변수와는 이름만 같을뿐 완전히 다른 변수이다.
	 * 따라서 scope() method가 종료된 이후에는 변수값에 접근할 수 없다.
	 * scope() method에서 선언된 intNum1변수를 지역변수라고 한다. 
	 */
	public void scope() {
		System.out.print("숫자 입력 >> ");
		int intNum1 = scan.nextInt();
	}
	
	public void input() {
		System.out.print("첫번째 숫자입력 >> ");
		intNum1 = scan.nextInt();
		System.out.print("두번째 숫자입력 >> ");
		intNum2 = scan.nextInt();
	}
	
	public void algebra() {
		System.out.println(intNum1 + " + " + intNum2 + " = " + (intNum1 + intNum2));
		System.out.println(intNum1 + " - " + intNum2 + " = " + (intNum1 - intNum2));
		System.out.println(intNum1 + " x " + intNum2 + " = " + (intNum1 * intNum2));
		System.out.println(intNum1 + " / " + intNum2 + " = " + (intNum1 / intNum2));
		System.out.println();
		/*
		 * print formatting 명령문
		 * "" 안에 문자열을 작성하여 출력문을 만드는 명령문
		 * %d(Decimal(10진수)) 위치에 정수값을 대신 부착하여 문자열 출력문 생성
		 */
		// 첫번째 %d에 intNum1을 넣고 두번째 %d에 intNum2를 넣고 %d에 intNum3을 넣어라. 
		System.out.printf(" %d + %d = %d \n", intNum1, intNum2,	intNum1 + intNum2);
		System.out.printf(" %d - %d = %d \n", intNum1, intNum2,	intNum1 - intNum2);
		System.out.printf(" %d x %d = %d \n", intNum1, intNum2,	intNum1 * intNum2);
		System.out.printf(" %d / %d = %d \n", intNum1, intNum2,	intNum1 / intNum2);
		
	}

}
