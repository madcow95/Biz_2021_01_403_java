package com.callor.applications;

import com.callor.applications.service.ScoreServiceExtendsV1;

public class Score_06 {

	public static void main(String[] args) {

		ScoreServiceExtendsV1 scExV1 = new ScoreServiceExtendsV1();

		// 	int intKor = 99;
		// int intEng = 87;
		// int intMath = 66;
		// scExV1.print(intKor, intEng, intMath);
		
		System.out.println("=======================");
		System.out.println("빛고을 고교 성적처리 V1");
		System.out.println("-----------------------");
		
		/*
		 * Random class의 nextInt() method에게 정수 100을 Parameter로 저장하고
		 * 결과 값을 num에 저장해라
		 * int num = random.nextInt(100);
		 */
		
		/*
		 * Score...Ext...V1 class의 input() method 에게 국어 문자열을 Parameter로 전달하고,
		 * 연산(??)을 수행한 후 return된 값을 intKor 변수에 저장해라
		 */
		int intKor = scExV1.input("국어");
		int intEng = scExV1.input("영어");
		int intMath = scExV1.input("수학");
		
	}

}
