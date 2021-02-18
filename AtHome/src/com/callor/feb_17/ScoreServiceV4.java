package com.callor.feb_17;

public class ScoreServiceV4 {

	public void print(int intKor, int intEng, int intMath) {

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
