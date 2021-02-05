package com.callor.start.loop;

public class Loop_01 {
	
	public static void main(String args[]) {
		
		int num1 = 0;
		// 이렇게는 잘 안쓴대
		for(num1 = 100 ; num1 <= 1000 ; num1 += 100 ) {
			
			System.out.println(num1);
		}
		
		
		for(num1 = 1 ; num1 <= 10 ; num1 += 1 ) {
		
			System.out.println(num1 + ".홍길동");
		}
		System.out.println("=====================");
		// 이렇게 쓰는게 낫대 for () 안의 수 양쪽에는 0이나 1로 하고 {}안에서 한번 더 계산? 정의? 를 하도록
		/*
		 * 보편적으로 for()반복문을 사용하여 코딩을 할 때, 
		 * int num = 0; : 시작값은 보통 0으로 초기화를 한다.
		 * num < 10 : 종료를 위한 비교연산 등호를 가급적 사용하지 않는다. 이상이나 이하 말고 초과나 미만을 쓰도록하자
		 * num += 1 : 증가값(변화값) 가급적 1씩 증가, 감소 하도록 코딩한다.
		 * 규칙은 아닌데 이렇게 많이 한다.
		 */
		for(int num = 0 ; num < 10 ; num += 1) {
			
			int num2 = (num + 1) * 100;
			
			System.out.println(num2);
			
		}
		System.out.println("=====================");
		
		for(int num = 0 ; num < 10 ; num += 1) {
			
			System.out.println((num + 1) + ".홍길동");
		}
		System.out.println("=====================");
		//요 방법으로 하는걸 추천
		for(int num = 0 ; num < 10 ; num += 1) {
			int num3 = num + 1;
			System.out.println(num3 + ".홍길동");
		}
	}

}
