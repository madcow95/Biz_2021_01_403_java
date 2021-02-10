package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;

public class App_11 {
	
	public static void main(String[] args) {
		
		MyGuGuDan myDan = new MyGuGuDan();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("숫자 (2 ~ 9, -1 : Quit) >> ");
			int num = scan.nextInt();
			if(num == -1) {
				System.out.println("Game Over");
				break;
			}
			if(num < 2 || num > 9) {
				System.out.println("2 ~ 9 안에서만 입력해라 좀");
				System.out.println("재입력");
			}
			else {
				myDan.print(num);
			}
			
		}
				
	}

}
