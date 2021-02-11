package com.hello.callor.history;

import java.util.Scanner;

public class history_10 {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력 >> ");
		int num = scan.nextInt();
		boolean bYes = num % 2 == 0;
		
		if(bYes) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
	}

}
