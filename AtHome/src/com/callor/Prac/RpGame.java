package com.callor.Prac;

import java.util.Random;
import java.util.Scanner;

public class RpGame {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		int rndNum = rnd.nextInt(100) + 1;
		
		while(true) {
			System.out.print("숫자 입력 >> ");
			int num = scan.nextInt();
			
			if(num > rndNum) {
				System.out.println("Down");
			}
			if(num < rndNum) {
				System.out.println("Up");
			}
			if(num % rndNum == 0) {
				System.out.println("정답");
				break;
			}
			
		}
		
	}

}
