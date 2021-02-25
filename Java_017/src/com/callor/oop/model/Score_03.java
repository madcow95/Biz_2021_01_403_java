package com.callor.oop.model;

import java.util.Scanner;

public class Score_03 {

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
				scoreVO.setIntKorea(strKor);

				// intKor에 -1이 담겨있으면 다시 입력을 하도록 해야한다.
				if (scoreVO.getIntKor() < 0) {
					System.out.println("국어점수 유효성 검사 실패");
					continue;
				}
				break;
			}

			while (true) {
				System.out.println("영어점수 입력");
				System.out.print(">> ");
				String strEng = scan.nextLine();
				scoreVO.setIntEng(strEng);
				if(scoreVO.getIntEng() < 0) {
					System.out.println("영어점수 유효성검사 실패");
					continue;
				}
				break;
			}
			
				System.out.println("수학점수 입력");
				System.out.print(">> ");
				String strMath = scan.nextLine();
		}
	}
}