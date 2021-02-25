package com.callor.oop.model;

import java.util.Scanner;

import com.callor.oop.service.ScoreServiceV1;

public class Score_02 {

	public static void main(String[] args) {

		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		ScoreVO scoreVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);

		System.out.println("===========================");
		System.out.println("성적입력 시스템 v1");
		System.out.println("---------------------------");

		System.out.println("학생 이름을 입력하세요");
		System.out.print(">> ");
		String strName = scan.nextLine();

		scoreVO.setIntKorea(ssV1.inputScore("국어") + "");
		scoreVO.setIntKorea(ssV1.inputScore("영어") + "");
		//scoreVO.intKor = ssV1.inputScore("국어");
		//scoreVO.intEng = ssV1.inputScore("영어");
		scoreVO.intMath = ssV1.inputScore("수학");
	}
}
