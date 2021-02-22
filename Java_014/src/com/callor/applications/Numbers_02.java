package com.callor.applications;

public class Numbers_02 {
	
	public static void main(String[] args) {
		
		/*
		 * 정수형 변수 intNum1, intNum2를 선언하여 각각 33, 77을 저장
		 * 두 정수형 변수 값을 교환
		 * intNum1 = 33 , intNum2 = 77
		 * intNum1 = 77 , intNum2 = 33
		 */
		int intNum1 = 33;
		int intNum2 = 77;
		System.out.println("intNum1 = " + intNum1 + " intNum2 = " + intNum2);
		
		// 1. 임시로 사용할 intTemp를 만들고
		// 2. intNum1 변수값을 복사해 둔다.(백업)
		//		33을 intTemp에 복사
		//		intTemp == 33
		int intTemp = intNum1;
		
		// 3. intNum1변수에 intNum2의 값을 복사
		// intNum1 == intNum2 상태가 된다.
		//		77을 intNum1에 복사
		// 		intNum1은 77로 변경
		intNum1 = intNum2;
		
		// 4. 임시로 (intTemp == 33)에 백업해둔 intNum1의 값을
		// 		intNum1 == 77
		// 		intTemp == 33
		//	num2에 복사
		//		intNum2 = 33
		intNum2 = intTemp;
		
		// 5. intNum1과 intNum2의 값이 서로 바뀐다.
		// 	변수값의 swap 코드
		
		
		
		System.out.println("intNum1 = " + intNum1 + " intNum2 = " + intNum2);
		
	}

}
