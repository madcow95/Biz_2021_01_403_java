package com.callor.applications;

import java.util.Scanner;

public class App_02_A {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력(2 ~ 9) >> ");
		
		int num = scan.nextInt();
		
		boolean bYes = num <= 9;
		boolean bYes1 = num >= 2;
		
		if(bYes && bYes1) {
			System.out.println("==============================");
			System.out.println("구구단 " + num + "단");
			System.out.println("------------------------------");
			
				for(int i = 0 ; i < 8 ; i++) {
						int i2 = i + 2;
						int mul = num * i2;
			
					System.out.println(num + " x " + i2 + " = " + mul);
				}
		}
		else {
			System.out.println("입력한 숫자 : " + num);
			System.out.println("값은 2 ~ 9까지만");
		}
		System.out.println("==============================");
	}
}
