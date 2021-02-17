package com.callor.feb_17;

import java.util.Scanner;

public class Feb_17_08 {

	public int print(String subject) {
		Scanner scan = new Scanner(System.in);
		
		int intNum = 0;
		while (true) {

			int intKor = scan.nextInt();
			System.out.print(subject + "점수 >> ");
			if (intKor > 100) {
				System.out.println("100 초과입니다. 100이하의 값을 입력해주세요.");
			} else if (intKor < 0) {
				System.out.println("0 미만입니다. 0이상의 값을 입력해주세요.");
			} else {
			}

			int intEng = scan.nextInt();
			System.out.print(subject + "점수 >> ");
			if (intEng > 100) {
				System.out.println("100 초과입니다. 100이하의 값을 입력해주세요.");
			} else if (intEng < 0) {
				System.out.println("0 미만입니다. 0이상의 값을 입력해주세요.");
			} else {
			}

			int intMath = scan.nextInt();
			System.out.print(subject + "점수 >> ");
			if (intMath > 100) {
				System.out.println("100 초과입니다. 100이하의 값을 입력해주세요.");
			} else if (intMath < 0) {
				System.out.println("0 미만입니다. 0이상의 값을 입력해주세요.");
			} else {
			}
			int intSum = intKor;
			intSum += intEng;
			intSum += intMath;
			
			float fAvg = intSum / 3f;
			
			System.out.println("국어\t영어\t수학\t총점\t평균");
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
			break;
		}
		return intNum;
		

	}

}
