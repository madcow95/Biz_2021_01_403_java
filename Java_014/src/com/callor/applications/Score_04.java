package com.callor.applications;

import java.util.Random;

public class Score_04 {
	
	public static void main(String[] args) {
		
		String[] strName = new String[] {"홍길동", "이몽룡", "성춘향"};
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];
		Random rnd = new Random();
		
		System.out.println("=====================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("-------------------------------------");
		
		for(int i = 0 ; i < strName.length ; i++) {
			
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
			System.out.printf("%s\t%d\t%d\t%d\n",strName[i],intKor[i],intEng[i],intMath[i]);
		}
		
		System.out.println("-------------------------------------");
	}

}
