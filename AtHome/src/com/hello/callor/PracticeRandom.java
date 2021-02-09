package com.hello.callor;

import java.util.Random;
import java.util.Scanner;

public class PracticeRandom {
	
	public static void main(String args[]) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int intNum = rnd.nextInt(100) + 1;
		
		System.out.print("숫자 입력 >> ");
		int keyNum = scan.nextInt();
		
		boolean bYes1 = keyNum > intNum;
		boolean bYes2 = keyNum == intNum;
		boolean bYes3 = keyNum < intNum;
		
		if(bYes1) {
			System.out.println(keyNum + "(이)가 " + intNum + "보다 더 크다.");
		} 
		if(bYes2) {
			System.out.println(keyNum + "은(는) " + intNum + "(와)과 같다.");
		}
		if(bYes3) {
			System.out.println(keyNum + "(이)가 " + intNum + "보다 더 작다.");
		}
	}

}
