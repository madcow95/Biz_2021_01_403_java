package com.callor.blog;

public class GuGuDan_02 {
	
	public static void main(String args[]) {
		// 2 ~ 9단을 Ctrl + F11키를 눌렀을 때 한 번에 출력되도록
		
		for(int dan = 2 ; dan < 10 ; dan++) {
			System.out.println("구구단" + dan + "단");
			System.out.println();
			
			for(int i = 1 ; i < 10 ; i++) {
				System.out.println(dan + " x " + i + " = " + (dan * i));
			}
			System.out.println();
		}
		
	}

}
