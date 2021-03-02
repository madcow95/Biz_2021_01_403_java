package com.callor.practice;

import java.util.Scanner;

public class GuGuDan {
	Scanner scan = new Scanner(System.in);
	
	public void GuGu(int num) {
		
		while(true) {
			System.out.print("숫자입력(2 ~ 9 까지만) >> ");
			int dan = scan.nextInt();
			if(dan < 2 || dan > 9) {
				System.out.println("2 ~ 9가 아님");
				break;
			}
			
			for(int i = 0 ; i < 9 ; i++) {
				int i2 = i + 1;
				System.out.println(dan + " x " + i2 + " = " + (dan * i2));
			}
		}
		
	}

}
