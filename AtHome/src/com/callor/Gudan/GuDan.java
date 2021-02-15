package com.callor.Gudan;

import java.util.Scanner;

public class GuDan {
	
	public void gu() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("2~9 중 입력 >> ");
		int num = scan.nextInt();
	}
	
	public void print(int num) {
		
		if(num >= 2 && num <= 9) {
			System.out.println(num + "단");
		}
		
		for(int i = 0 ; i < 9 ; i++) {
			int i2 = i + 1;
			
			if(num >= 2 && num <= 9) {
				System.out.println(num + " x " + i2 + " = " + (num * i2));
			}
			else {
				System.out.println("2 ~ 9");
			}
		}
		
	}

}
