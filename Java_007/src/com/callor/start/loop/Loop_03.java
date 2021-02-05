package com.callor.start.loop;

public class Loop_03 {
	
	public static void main(String args[]) {
		
		// main() method (local) scope 변수
		int intSum = 0;
		// for반복문 밖에서 선언된 변수는 for문 안에서 값을 읽거나 쓸 수 있다.
		for(int i = 0 ; i < 10 ; i++) {
			// main() method scope 변수인 intSum은 for()반복문 내에서
			// 자유롭게 읽기, 저장이 가능하다
			intSum += 10;
			// 코드를 보고 해석하는 능력을 길러라.
			System.out.println(i + " , " + intSum);
		}
		// for() 반복문이 종료된 후
		// 여기에서 여기에서 읽을 수 있는 변수 ?
		// 변수 i는 이미 소멸 되었다. 변수 intSum은 값을 읽을 수 있다.
		System.out.println("====================");
		System.out.println("    intSum = " + intSum);
		System.out.println("====================");
		
		// 이미 선언 되어 사용중인 변수를 clear
		// 클리어 하는 이유는 이 변수를 다른 용도로 사용하기 위해
		intSum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			
			int num1 = i + 1;
			intSum += num1;
			// 이해해보자 집에서든 점심시간에서든
		
		}
		System.out.println("1 ~ 10까지 덧셈 결과 : " + intSum);
	}

}
