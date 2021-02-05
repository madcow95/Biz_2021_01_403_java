package com.callor.start.logic;

public class Logic_04 {
	
	public static void main(String args[]) {
		
		for(int i = 0 ; i < 10 ; i++) {
			
			boolean bYes = i % 2 == 0;
			// bYes의 값이 true이면 이라는 뜻 즉, i 값이 짝수이면
			if(bYes) { 
				
				System.out.println(i + "은(는) 짝수");				
				
			}
			
		}
		
		int num = 0;
		
		/*
		 * num값이 어떤 연산결과를 저장하는 코드
		 */
		
		// main method()안에 boolean이 두 번인데 첫 번째는 for()반복문 안에 있다.
		// for()반복문은 끝나면 사라지기 때문에 main method()에서 다시 사용 가능하다.
		boolean bYes = num % 2 == 0;
		if(bYes) {
			System.out.println(num + "은(는) 짝수");
		}
	}

}
