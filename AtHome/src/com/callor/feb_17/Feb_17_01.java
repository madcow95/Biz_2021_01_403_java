package com.callor.feb_17;

import java.util.Scanner;

public class Feb_17_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 >> ");
		int intKor = scan.nextInt();
		
		System.out.print("영어 점수 입력 >> ");
		int intEng = scan.nextInt();
		
		System.out.print("수학 점수 입력 >> ");
		int intMath = scan.nextInt();
		
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		float fAvg = intSum / 3f;
		
		System.out.println("===================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------");
		System.out.println(intKor + "\t" + intEng + "\t" + intMath + "\t" + intSum + "\t" + fAvg);
		System.out.println("===================================");
	}

}
