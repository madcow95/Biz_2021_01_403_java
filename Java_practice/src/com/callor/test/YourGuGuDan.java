package com.callor.test;

import java.util.Scanner;

public class YourGuGuDan {
	
	public void kwoo() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력해라(2 ~ 9 만) >> ");
		int num = scan.nextInt();
	}
	
	public void print(int num) {
		
		if(num >= 2 && num <= 9) {
		System.out.println("--------------------");
		System.out.println("9 x 9단 " + num + "단");
		System.out.println("--------------------");
		}
		
		for(int i = 0 ; i < 9 ; i++) {
			int i2 = i + 1;
			
			if(num >= 2 && num <= 9) {
				System.out.println(num + " x " + i2 + " = " + (num * i2));
			}
			else {
				System.out.println("2 ~ 9 아니다");
				System.out.println("다시입력");
				break;
			}
		}
	}

}
