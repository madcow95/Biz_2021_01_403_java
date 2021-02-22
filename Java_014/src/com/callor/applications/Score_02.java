package com.callor.applications;

import java.util.Scanner;

public class Score_02 {

	public static void main(String[] args) {

		String[] strName = new String[3];
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < strName.length; i++) {

			System.out.print("학생이름입력 : ");
			strName[i] = scan.nextLine();
			
			System.out.println("과목점수입력");
			
			System.out.print(strName[i] + " " + "국어 : ");
			// 문자열형으로 입력받고
			String strSub = scan.nextLine();
			// 문자열형숫자를 정수로 변경하여 저장
			intKor[i] = Integer.valueOf(strSub);
			
			System.out.print(strName[i] + " " + "영어 : ");
			strSub = scan.nextLine();
			intEng[i] = Integer.valueOf(strSub);
			
			System.out.print(strName[i] + " " + "수학 : ");
			strSub = scan.nextLine();
			intMath[i] = Integer.valueOf(strSub);
		}
		
		System.out.println("=========================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("-------------------------");
		for (int i = 0; i < strName.length; i++) {

			System.out.println(strName[i] + "\t" + intKor[i] + "\t" + intEng[i] + "\t" + intMath[i]);
		}
		System.out.println("-------------------------");
	}

}
