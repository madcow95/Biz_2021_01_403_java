package com.hello.callor;

import java.util.Scanner;

public class gogodan {
	
	public void gogo() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력(2 ~ 9) >> ");
		int num = scan.nextInt();
	}	
		
	public void print(int num) {
		
		System.out.println("======================");
		System.out.println("구구단" + num + "단");
		System.out.println("======================");
		
		for(int i = 0 ; i < 8 ; i++) {
			int i2 = i + 1;
			boolean bYes = num >= 2;
			boolean bYes1 = num <= 9;
			
			if(bYes && bYes1) {
				System.out.println(num + " x " + i2 + " = " + (num * i2));
			}
			else {
				System.out.println("2 ~ 9에 포함되지 않은 수입니다.");
			}
			
		}
		
	}
				
		
}

