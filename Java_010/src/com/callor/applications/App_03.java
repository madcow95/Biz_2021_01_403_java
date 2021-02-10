package com.callor.applications;

import java.util.Scanner;

public class App_03 {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력 >> ");
		
		while(true) {
			
			int num = scan.nextInt();
			boolean bYes = num >= 2;
			boolean bYes1 = num <= 9;
			
			if(bYes && bYes1) {
				System.out.println("==============================");
				System.out.println("구구단 " + num + "단");
				System.out.println("------------------------------");
			}

			for(int i = 0 ; i < 8 ; i++) {
			
				int i2 = i + 2;
			
					if(bYes && bYes1) {
						System.out.println(num + " x " + i2 + " = " + (num * i2));
					}
					else {
						System.out.println("2 ~ 9에 포함되지 않은 숫자");
						break;
					}
			}
			System.out.println("==============================");
			System.out.print("다시입력 >> ");
		
		
	}
	
}
}

