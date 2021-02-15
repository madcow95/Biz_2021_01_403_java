package com.callor.Prac;

import java.util.Scanner;

import com.callor.Gudan.GuDan;

public class Gudan_test {

	public static void main(String args[]) {

		GuDan gu = new GuDan();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("2~9 , (-1 = end) >> ");
			int num = scan.nextInt();
			
			if(num == -1) {
				System.out.println("end");
				break;
			}
			if (num >= 2 && num <= 9) {
				gu.print(num);
				System.out.println("굳");
			} else {
				System.out.println("하..");
			}
		}

	}

}
