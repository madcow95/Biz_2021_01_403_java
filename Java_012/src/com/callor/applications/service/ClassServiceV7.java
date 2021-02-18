package com.callor.applications.service;

import java.util.Scanner;

public class ClassServiceV7 {

	public void gugu(int dan) {

		Scanner scan = new Scanner(System.in);
		
//		while (true) {
//			System.out.println("구구단" + dan + "단");
//			System.out.println("========================");
			
			for (int i = 0; i < 9; i++) {
				int i2 = i + 1;

//				if (dan < 2) {
//					System.out.println("2보다 작습니다");
//					break;
//				} else if (dan > 9) {
//					System.out.println("9보다 큽니다");
//					break;
//				} else {
					System.out.println(dan + " x " + i2 + " = " + (dan * i2));
//				}
			}
//			System.out.print("다시 입력 >> ");
//			dan = scan.nextInt();
//		}
	}
}