package com.callor.applications;

import java.util.Scanner;

public class Score_01 {
	/*
	 * 학생 3명의 국어, 영어, 수학 점수를 (학생명의 과목점수를 저장할 배열을 선언)
	 * (intKor, intEng, intMath)
	 * 키보드로 입력받아서 Console에 리스트를 출력하기
	 * 
	 * 1. 학생3명의 3과목의 점수를 저장할 배열
	 * 2. 배열이 나오면 일단 for 반복문이 한번쯤은 나타난다.
	 * 3. 학생 3명의 3과목의 점수를 어떻게 입력받을 것인가?
	 * 4. 학생 3명의 과목 점수를 어떻게 출력할 것인가?
	 */

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		
		// [개수] : 필요한 개수만큼 배열을 만들어라
		String[] strSub = new String[] { "국어", "영어", "수학" };
		String[] strStu = new String[] {"학생1", "학생2", "학생3"};
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		// 3명 학생의 과목 성적 입력받기
		// 1. 국어과목의 3학생 점수를 입력받기
		// 2. 학생별로 국어, 영어, 수학 점수를 각각 입력받기
		
		// 1. 과목별로 학생 점수 입력받기

		for (int i = 0; i < strSub.length; i++) {

			System.out.print(strStu[i] + " " + strSub[0] + "점수입력 : ");
			intKor[i] = scan.nextInt();
			System.out.print(strStu[i] + " " + strSub[1] + "점수입력 : ");
			intEng[i] = scan.nextInt();
			System.out.print(strStu[i] + " " + strSub[2] + "점수입력 : ");
			intMath[i] = scan.nextInt();
		}
		
		System.out.println("===========================");
		System.out.println(strSub[0] + "\t" + strSub[1] + "\t" + strSub[2]);
		System.out.println("---------------------------");
		
		for (int i = 0; i < strSub.length; i++) {
			System.out.println(intKor[i] + "\t" + intEng[i] + "\t" + intMath[i]);
		}
		System.out.println("---------------------------");
		
	}

}
/* //
 * System.out.println("국어 점수입력");
 * System.out.println("1번 학생);
 * intKor[0] = scan.nextInt();
 * System.out.println("2번 학생);
 * intKor[1] = scan.nextInt();
 * System.out.println("3번 학생);
 * intKor[2] = scan.nextInt();
 * 
 * // for 반복문을 이용하여 반복되는(복사&붙이기) 코드를 단순하게 만든다.
 * System.out.println("영어점수입력");
 * for(int index = 0 ; index < intKor.length < index++) {
 * 		int num = index + 1;
 * 		System.out.println(num + "번 학생 >> ");
 * 		intEng[index] = scan.nextInt();
 * 	}
 * 
 * for(int index = 0 ; index < intKor.length < index++) {
 * 		int num = index + 1;
 * 		System.out.println(num + "번 학생 >> ");
 * 		intMath[index] = scan.nextInt();
 * 	}
 */