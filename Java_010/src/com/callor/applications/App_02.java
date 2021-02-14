package com.callor.applications;

import java.util.Scanner;

public class App_02 {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력(2 ~ 9) >> ");
		int num = scan.nextInt();
		
		boolean bYes = num > 9;
		boolean bYes1 = num < 2;
		
		if(bYes) {
			System.out.println("==============================");
			System.out.println("9초과 (2 ~ 9)의 숫자만 입력");
		}
		if(bYes1) {
			System.out.println("==============================");
			System.out.println("2미만 (2 ~ 9의 숫자만 입력");
		}
		if(!bYes && !bYes1) {
			System.out.println("==============================");
			System.out.println("구구단 " + num + "단");
			System.out.println("------------------------------");
			
				for(int i = 0 ; i < 8 ; i++) {
						int i2 = i + 2;
						int mul = num * i2;
			
					System.out.println(num + " x " + i2 + " = " + mul);
			}
		}System.out.println("==============================");
	}
}
