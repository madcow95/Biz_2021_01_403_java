package com.hello.callor;

import java.util.Random;
import java.util.Scanner;

public class PracticeLopinGame {
	
	public static void main(String args[]) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int intNum = rnd.nextInt(100) + 1;	
			while(true) {
				
			System.out.print("숫자를 입력하세요 (-1 = Game Over) >> ");
			int keyNum = scan.nextInt();
				
				if(keyNum < 0) {
					break;
				}
				if(intNum == keyNum) {
					System.out.println("You Win");
					break;
				}
				if(keyNum > intNum){
					System.out.println("Big");
					System.out.println("Try Again");
				}
				if(keyNum < intNum) {
					System.out.println("Small");
					System.out.println("Try Again");
				}
			
		}
		System.out.println("Game Over");
	}

}
