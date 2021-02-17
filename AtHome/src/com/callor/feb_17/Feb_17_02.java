package com.callor.feb_17;

import java.util.Scanner;

public class Feb_17_02 {
	
	public void score() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어점수 입력 >> ");
		int intKor = scan.nextInt();
		System.out.print("영어점수 입력 >> ");
		int intEng = scan.nextInt();
		System.out.print("수학점수 입력 >> ");
		int intMath = scan.nextInt();
		
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		float fAvg = intSum /3f;
		
		System.out.println("수학\t영어\t수학\t총점\t평균");
		System.out.println();
		System.out.print(intKor);
		System.out.print("\t");
		System.out.print(intEng);
		System.out.print("\t");
		System.out.print(intMath);
		System.out.print("\t");
		System.out.print(intSum);
		System.out.print("\t");
		System.out.println(fAvg);		
		
	}

}
