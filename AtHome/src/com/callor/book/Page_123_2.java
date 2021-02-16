package com.callor.book;

public class Page_123_2 {

	public static void main(String args[]) {

		int i = 0;
		int dan = 0;

		for (dan = 0; dan < 9; dan++) {
			int dan2 = dan + 1;

			if (dan2 % 2 == 0) {
				for (i = 0; i < 9; i++) {
					int i2 = i + 1;

					System.out.println(dan2 + " x " + i2 + " = " + (dan2 * i2));
				}
				System.out.println("---------------------");
			}

		}

	}
}
