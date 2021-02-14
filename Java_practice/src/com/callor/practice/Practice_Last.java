package com.callor.practice;

import java.util.Scanner;

import com.callor.test.YourGuGuDan;

public class Practice_Last {
	
	public static void main(String[] args) {
		
		YourGuGuDan yourGu = new YourGuGuDan();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력(2~9만) (-1 = GAME OVER) >> ");
			int num = scan.nextInt();
			
			if(num == -1) {
				System.out.println("GAME OVER");
				break;
			}
			if(num >= 2 && num <= 9) {
				yourGu.print(num);
				System.out.println("------------------");
			}
			else {
				System.out.println("좀 2 ~ 9만 넣어라");
				System.out.println("다시입력해");
				System.out.println("------------------");
			}
		}
		
	}

}
