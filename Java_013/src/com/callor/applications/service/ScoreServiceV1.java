package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	
	// class에 선언된 변수들 : 인스턴스 변수
	// class 영역 : 멤버 영역
	// ScoreServiceV1 ssV1 : 클래스를 객체로 선언
	// = new ssV1() : 객체의 초기화
	// 인스턴스 객체가 초기화 되면 자동으로 사용할 준비가 되는 변수들
	
	private Scanner scan = new Scanner(System.in);
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intSum = 0;
	private float floatAvg = 0;
	
	public static void main(String[] args) {
		
		ScoreServiceV1 scV1 = new ScoreServiceV1();
		scV1.input();
		scV1.sum();
		scV1.avg();
		scV1.print();
	}
	
	public void input() {
		
		System.out.print("국어점수 입력 >> ");
		intKor = scan.nextInt();
		System.out.print("영어점수 입력 >> ");
		intEng = scan.nextInt();
		System.out.print("수학점수 입력 >> ");
		intMath = scan.nextInt();
	}

	public void sum() {
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
	}

	public void avg() {
		
		floatAvg = intSum / 3f;
	}
	
	public void print() {
		// %3.2f : 소수점 세번째 자리에서 반올림하여 두번째 자리까지만 나타내라
		// f", 뒤의 수의 실수값을 출력해라.
		System.out.println("국어점수 : " + intKor + "점");
		System.out.println("영어점수 : " + intEng + "점");
		System.out.println("수학점수 : " + intMath + "점");
		System.out.println("점수의 총점 : " + intSum + "점");
		System.out.printf("점수의 평균 : %3.2f점",floatAvg);
	}
	
}
