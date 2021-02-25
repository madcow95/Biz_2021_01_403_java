package com.callor.oop.model;

import java.util.Scanner;

public class Score_01 {
	
	public static void main(String[] args) {
		
		ScoreVO sVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);

		try {
			System.out.print("국어점수 입력 : ");
			String strKor = scan.nextLine();
			sVO.intKor = Integer.valueOf(strKor);
			if(sVO.intKor < 50 || sVO.intKor > 100 || strKor == null) {
				System.out.println(2/0);
			}
			System.out.print("영어점수 입력 : ");
			String strEng = scan.nextLine();
			sVO.intEng = Integer.valueOf(strEng);
			if(sVO.intEng < 50 || sVO.intEng > 100 || strEng == null) {
				System.out.println(2/0);
			}
			System.out.print("수학점수 입력 : ");
			String strMath = scan.nextLine();
			sVO.intMath = Integer.valueOf(strMath);
			if(sVO.intMath < 50 || sVO.intMath > 100 || strMath == null) {
				System.out.println(2/0);
			}
		} catch (ArithmeticException e) {
			System.out.println("50 ~ 100사이의 수만 입력하세요");
			return;
		} catch(NumberFormatException en) {
			System.out.println("숫자를 입력해주세요");
			return;
		}
		
		System.out.println("=====================");
		System.out.println("국어\t영어\t수학");
		System.out.println("---------------------");
		System.out.printf("%d\t%d\t%d\n",sVO.intKor,sVO.intEng,sVO.intMath);
		System.out.println("---------------------");
	}

}
