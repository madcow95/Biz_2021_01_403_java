package com.callor.start.jdk.keyinput;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_031 {
	
	public static void main(String args[]) {
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num1 = rnd.nextInt(100) + 1;
		System.out.print("숫자 입력 >> ");
		int num = scan.nextInt();
		
		boolean bYes1 = num >= num1;
		boolean bYes2 = num == num1;
		
		if(bYes1) {
			System.out.println(num + "은(는) " + num1 + "보다 크다.");
		}
		else {
			System.out.println(num + "은(는) " + num1 + "보다 작다.");
		}
		if(bYes2) {
			System.out.println(num + "은(는) " + num1 + "와(과) 같다.");
		}
	}

}
