package com.callor.score;

import java.util.Scanner;

public class ScoreMenu {
	
	public void scoreMenu() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(Values.dLine);
		System.out.println("빛나라 고교 성적처리 시스템");
		System.out.println(Values.sLine);
		System.out.println("1. 학생성적 점수 생성");
		System.out.println("2. 학생성적 점수 파일에 저장");
		System.out.println("3. 성적결과 확인");
		System.out.println("QUIT. 끝내기");
		System.out.println(Values.dLine);
		System.out.print("선택 >> ");
		String strMenuSelect = scan.nextLine();
		
		
		
		
		
	}

}
