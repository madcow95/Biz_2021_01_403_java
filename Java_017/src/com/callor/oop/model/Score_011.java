package com.callor.oop.model;

import java.util.Scanner;

public class Score_011 {

	public static void main(String[] args) {

		ScoreVO scoreVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);

		System.out.println("===========================");
		System.out.println("성적입력 시스템 v1");
		System.out.println("---------------------------");

		while (true) {
			System.out.println("학생 이름을 입력하세요");
			System.out.print(">> ");
			String strName = scan.nextLine();

			while (true) {
				System.out.println("국어점수 입력");
				System.out.print(">> ");
				String strKor = scan.nextLine();
				
				try {
					int intKor = Integer.valueOf(strKor);
					// scoreVO.intKor = intKor;
					scoreVO.setIntKorea(strKor);
				} catch (Exception e) {
					System.out.println("국어점수는 숫자로만 입력");
					continue;
				} // try end

				System.out.println("영어점수 입력");
				System.out.print(">> ");
				String strEng = scan.nextLine();
				
				try {
					
				} catch (Exception e) {
					// TODO: handle exception
				}

				System.out.println("수학점수 입력");
				System.out.print(">> ");
				String strMath = scan.nextLine();
			}
			
		}
	}

}
