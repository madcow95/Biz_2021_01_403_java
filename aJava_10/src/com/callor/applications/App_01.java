package com.callor.applications;

import java.util.Scanner;

public class App_01 {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력 >> ");
		
		int num = scan.nextInt();
		
		System.out.println("=========================");
		System.out.println("구구단 " + num + "단");
		System.out.println("-------------------------");
		
		for(int i = 0 ; i < 8 ; i++) {
			int i2 = i + 2;
			int mul = num * i2;
			
				System.out.println(num + " x " + i2 + " = " + mul);
			
		}
		System.out.println("=========================");
	}

}
