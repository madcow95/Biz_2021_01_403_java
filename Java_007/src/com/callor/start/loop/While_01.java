package com.callor.start.loop;

public class While_01 {
	
	public static void main(String args[]) {
		
		int count = 0;
		
		System.out.println(3 + 4 * 3 - 3);
		System.out.println(3 - 4 * 3 + 3);
		// 변수뒤에 ++ or -- 붙으면 얘는 앞에 붙은 연산식들을 다 계산하고 
		// Console에 출력된 다음 마지막으로 계산된다.
		/*
		 * 단항연산자(++, --)가 변수의 뒤(끝)에 있을 경우 현재 명령어를 모두 실행하고
		 * 그 이후에 1을 증가(++) or 감소(--)한다.
		 */
		System.out.println(10 + 20 + 30 + count++); // count가 0인 상태
		// 풀어서 쓰면
		System.out.println(10 + 20 + 30 + count);
		count += 1;
		System.out.println("========================");
		count = 0;
		// 정말 무한반복
		// for( ;; ) {}
		// 조건에 따라 반복한다
		while(true) {
			// 위의 이유 때문에 0 으로 시작한다.
			System.out.println(count++ + " : 대한민국");
			// 어떤 조건을 검사하여 true
			if(count > 10) {
				// 반복문을 중단하기
				break;
			}
			
		}
		
	}

}
