package com.callor.start.loop;

public class While_02 {
	
	public static void main(String args[]) {
		
		int count = 0;
		// count++ 일때
		// count 0으로 시작 -> while()에 진입 -> 일단 count만 봤을 때 0 -> 0은 10보다 작다
		// 내려가 -> println을 만나는 순간 1로 승격
		// 다시 올라가서 10과 비교를 하고 내려가서 다시 println만나는 순간 1 승격해서 2
		// 반복하다가 9를 찍고 println에서 10이 되고 올라가는순간 false가 되기 때문에 끝

		// ++count 일때
		// 얘는 1먼저 오르고 10과 비교를 해보기 때문에 9까지만 가도 1이 더해져 false
		while(++count < 10) {
			
			System.out.println(count);
		}
		
		count = 0;
		while(count < 10) {
			
			System.out.println(++count);
		}
		
		// 1
		System.out.println(count++);
		
		// 풀어쓰면
		System.out.println(count);
		count += 1;
		
		// 2
		System.out.println(++count);
		
		// 풀어쓰면
		count++;
		System.out.println(count);
		
		
	}

}
