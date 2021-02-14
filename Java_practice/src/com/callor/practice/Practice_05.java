package com.callor.practice;

import java.util.Scanner;

import com.callor.test.YourGuGuDan;

public class Practice_05 {
	
	public static void main(String[] args) {
		
		YourGuGuDan yourGu = new YourGuGuDan();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("2~9수 입력 > ");
		
		int num = scan.nextInt();
		
		if(num >= 2 && num <= 9) {
			yourGu.print(num);
		}
		else {
			System.out.println("2~9가 아니잖아");
		}
	}

}
