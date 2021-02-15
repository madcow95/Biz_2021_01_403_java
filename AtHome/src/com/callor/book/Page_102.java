package com.callor.book;

public class Page_102 {

	public static void main(String args[]) {

		int ranking = 2;
		char medalColor = 0;

		switch (ranking) {
		case 1:
			medalColor = 'G';
			break;
		case 2:
			medalColor = 'S';
			break;
		case 3:
			medalColor = 'B';
			break;
		default:
			medalColor = 'A';

		}
		System.out.println(ranking + "등은 " + medalColor + "메달");
	}

}
