package com.callor.var;

/*
 * 실수, 배정도실수를 표현하기
 * 
 * int : 2의 32승 범위의 숫자 표현
 * double : 2의 64승 범위의 숫자 표현
 * 		소수점 자릿수 감안
 * 		소수점 이하 16자리 까지 표현
 * 
 * 컴퓨터에서 큰수를 저장(표현)하는 방법
 * 323.0000
 * = 3.23000 * 10의 2승 --> 수학적으로 표현
 * = 3.23E+2 --> 컴퓨터에서 표현
 * 		E = 10
 *   
 */
public class VarDouble {
	
	public static void main(String args[]) {
		
		double num1 = 30.0;
		double num2 = 40.0;
		double num3 = 50;
		double num4 = 50.11111111111111111111111;
		double num5 = 50.00000000000000000000000;
		double num6 = 50.22222222222222222222222;
		double num7 = 50.55555555555555555555555;
// double형 num1을 선언하고 실수 30.0을 저장해라
// double형 num2를 선언하고 실수 40.0을 저장해라
// double형은 정수형을 저장해도 괜찮다. 단, 저장 될 때 50.0으로 변환되어 저장된다.
// 무리수 같은 실수를 표현할 때 예상치 못한 버그가 나올 때가 있으니 주의(실행하고 Console 참고)
		
		System.out.println(num1 + num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
	}

}
