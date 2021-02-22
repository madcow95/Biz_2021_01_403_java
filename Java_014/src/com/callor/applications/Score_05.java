package com.callor.applications;

import java.util.Random;

public class Score_05 {

	public static void main(String[] args) {

		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향" };
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];
		int[] intSum = new int[strName.length];
		float[] fAvg = new float[strName.length];
		Random rnd = new Random();

		for (int i = 0; i < strName.length; i++) {

			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}

		System.out.println("=================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------");

		// 학생별로 총점을 계산하는 코드
		for (int i = 0; i < strName.length; i++) {

			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
		}
		// 학생별로 평균을 계산하는 코드
		for (int i = 0; i < strName.length; i++) {
			
			fAvg[i] = intSum[i] / 3f;
		}
		
		for (int i = 0 ; i < strName.length ; i++) {
			// 글자형 %s , 정수형 %d , 소수점 나오면 %f
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n", strName[i], intKor[i], intEng[i], intMath[i], intSum[i],
					fAvg[i]);
		}
		System.out.println("=================================================");

	}

}
