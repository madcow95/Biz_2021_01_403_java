package com.callor.start.bool;

public class BoolAlge_02 {
	
	public static void main(String args[]) {
		
		boolean bYes1 = 3 > 3;
		boolean bYes2 = 3 == 3;
		
		// false && true == false
		boolean bYes3 = bYes1 && bYes2;
		
		// false || true == true
		boolean bYes4 = bYes1 || bYes2;
		
		int num1 = 100;
		int num2 = 200;
		// 이미 앞의 num1이 true 이기 때문에 굳이 뒤의 false값을 계산하지 않는다.
		// (num1 > 50)의 결과가 true 이므로 java는 효율적인 코드 실행을 위하여
		// || 이후의 코드를 무시한다.
		boolean bYes5 = (num1 > 50) || (num2 += 20) > 0;
			// 위 코드 = 아래코드		
		if(num1 > 50) {
			num2 += 20;
		}
		// num1 < 50이 false이므로 && 이후의 코드는 무시된다.
		bYes5 = (num1 < 50) && (num2 += 20) < 300;
		
		if(num1 < 50) {
			num2 += 20;
		}
		
	}

}
