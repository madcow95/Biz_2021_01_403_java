package com.callor.book;

public class Page_123_4 {

	public static void main(String args[]) {

		String num = "*";
		int num2 = 0;

		for (int i = 0; i < 4; i++) {

			System.out.println(num);
			num += "**";
			
		}
		for(int i = 0; i < 4; i++) {
			System.out.println(num);
			num = num + "**";
			// 아니 더하기는 되는데 빼기가 안되는건 무슨경우?
		}
	}

}
