package com.hello.callor;

import java.util.Random;
import java.util.Scanner;

// 60퍼 강화확률 확인
public class test {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("하려면 1 >> ");
			int rkd = scan.nextInt();
			
			for (int i = 0; i < 10000; i++) {
				int i2 = i + 1;
				int num = rnd.nextInt(100) + 1;

				if (rkd == 1) {
					if (num > 99) {
						System.out.println(i2 + "번 째 강화성공");
						break;
					} else {
						System.out.println("강화실패");
					}
				}
			}
		}
	}

}
