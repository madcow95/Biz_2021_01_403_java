package com.callor.Prac;

import java.util.Random;
import java.util.Scanner;

public class RCP {

	public static void main(String args[]) {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		int comNum = rnd.nextInt(2) + 1;
		
		while (true) {
			System.out.print("R = 1, S = 2, P = 3 >> ");
			int num = scan.nextInt();
			
			if(num == comNum) {
				System.out.println("draw");
			}
			if(num - comNum == 1 || num - comNum == -2) {
				System.out.println("win");
				break;
			}
			else {
				System.out.println("lose");
			}
				

		}

	}

}
