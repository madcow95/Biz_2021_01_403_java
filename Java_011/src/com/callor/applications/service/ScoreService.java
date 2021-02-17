package com.callor.applications.service;

import java.util.Scanner;

/*
 * java의 class와 method() 호출
 * ScoreService 클래스에는 "main() method가 없어서" 여기에 있는 코드는
 * 직접 Run(Ctrl + F11)하여 실행할 수 없다.
 * 누군가가 ScoreService를 객체, 인스턴스로 만들고 
 * score() method를 호출해주어야만 코드를 실행할 수 있다.
 * 
 * 다른 언어에서는 module 등의 이름으로 사용한다.
 * 
 */

public class ScoreService {
	
	/*
	 * class 와 method의 명명법
	 * class : 첫글자 영문 대문자, 이후 영문 대소문자, 숫자
	 * method : 첫글자 영문 소문자, 이후 영문 대소문자, 숫자
	 * 
	 * class 명명법 (Upper) Camel Case 라고 한다.
	 * method 명명법 (Lower) Camel Case 라고 한다.
	 */

	public void score() {
		
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("국어점수 >> ");
			int kor = scan.nextInt();
			if (kor > 100 || kor < 0) {
				System.out.println("0 ~ 100 까지만 입력하세요");
				break;
			}

			System.out.print("영어점수 >> ");
			int eng = scan.nextInt();
			if (eng > 100 || eng < 0) {
				System.out.println("0 ~ 100 까지만 입력하세요");
				break;
			}

			System.out.print("수학점수 >> ");
			int math = scan.nextInt();
			if (math > 100 || math < 0) {
				System.out.println("0 ~ 100 까지만 입력하세요");
				break;
			}

			int sum = (kor + eng + math);
			double dAvg = sum / 3d;

			System.out.println("========================================");
			System.out.println("국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균");
			System.out.println("----------------------------------------");
			System.out.println(kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + dAvg);
			System.out.println("========================================");
			break;
		}
	}
}

