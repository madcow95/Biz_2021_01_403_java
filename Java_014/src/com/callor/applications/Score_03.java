package com.callor.applications;

import java.util.Scanner;

public class Score_03 {
	
	public static void main(String[] args) {
		
		String[] strName = new String[] {"홍길동", "이몽룡", "성춘향"};
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i < strName.length ; i++) {
			
			System.out.print(strName[i] + " 국어점수 입력 : ");
			intKor[i] = scan.nextInt();
			System.out.print(strName[i] + " 영어점수 입력 : ");
			intEng[i] = scan.nextInt();
			System.out.print(strName[i] + " 수학점수 입력 : ");
			intMath[i] = scan.nextInt();
			System.out.println();
		}
		
		System.out.println("===========================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("---------------------------");
		for(int i = 0 ; i < intKor.length ; i++) {
			
			System.out.printf("%s\t%d\t%d\t%d\n",strName[i],intKor[i],intEng[i],intMath[i]);
		}
		System.out.println("---------------------------");
	}
}
