package com.hello.callor;

import java.util.Random;
import java.util.Scanner;

public class PracticeBaseball {
	
	public static void main(String args[]) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int baseBall = rnd.nextInt(8) + 1;
		int baseBall1 = rnd.nextInt(8) + 1;
		int baseBall2 = rnd.nextInt(8) + 1;
		int baseBall3 = rnd.nextInt(8) + 1;
		
		System.out.print(baseBall);
		System.out.print(baseBall1);
		System.out.print(baseBall2);
		System.out.println(baseBall3);
		System.out.print("숫자입력 >> ");
		int num = scan.nextInt();
		
		if(baseBall % num == 0) {
			System.out.println("strike");
		}
		System.out.print("숫자입력 >> ");
		num = scan.nextInt();
		
		if(baseBall1 % num == 0) {
			System.out.println("strike");
		}
		System.out.print("숫자입력 >> ");
		num = scan.nextInt();
		if(baseBall2 % num == 0) {
			System.out.println("strike");
		}
		System.out.print("숫자입력 >> ");
		num = scan.nextInt();
		if(baseBall3 % num == 0) {
			System.out.println("strike");
		}
		
	}

}
