package com.callor.varriable;

public class Loop_05 {
	
	public static void main(String args[]) {
		
		int intDan = 7;
		// num이라는 변수가 1부터 1씩 증가하여 10보다 작은 동안에 9번 코드가 반복되는 명령문
		for(int num = 1 ; num < 10 ; num += 1) {
			
		}// 여기서 끝나기 때문에 for 반복문을 또 쓸 수 있다
		for(int num = 1 ; num < 10 ; num += 1) {
			
		}
		for(int num = 20 ; num < 42 ; num += 1) {
			System.out.println("안녕");
		}//	 시작하는값	  비교하는값   증가하는값
		for(int num = 12 ; num <= 20 ; num += 1) {
			System.out.println("반가워");
		}
		for(int num = 12 ; num <= 20 ; num += 2) {
			System.out.println(num);
		}

	}
	

}
