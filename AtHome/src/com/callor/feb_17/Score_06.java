package com.callor.feb_17;


public class Score_06 {

	public static void main(String[] args) {

		ScoreServiceExtendsV1 scExV1 = new ScoreServiceExtendsV1();

		System.out.println("=======================");
		System.out.println("빛고을 고교 성적처리 V1");
		System.out.println("-----------------------");

		int intKor = scExV1.input("국어");
		int intEng = scExV1.input("영어");
		int intMath = scExV1.input("수학");
		
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		float fAvg = intSum / 3f;

		System.out.println("==========================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------");
		System.out.println(intKor + "\t" + intEng + "\t" + intMath + "\t" + intSum + "\t" + fAvg);
		System.out.println("==========================================");
		
	}

}
