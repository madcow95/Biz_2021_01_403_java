package com.hello.callor.history;

import java.util.Random;
import java.util.Scanner;

public class history_11 {
	
	public static void main(String args[]) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력 >> ");
		int i = rnd.nextInt(100) + 1;
		int num = scan.nextInt();
		boolean bYes = i % num == 0;
		
		if(bYes) {
			System.out.println("정답입니다.");
		}
		else {
			System.out.println("다시 시도하세요");
			System.out.println("정답 : " + i);
		}
	}

}
