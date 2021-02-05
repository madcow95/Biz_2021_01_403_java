package com.callor.start.loop;

public class Loop_02 {
	
	public static void main(String args[]) {
		
		// i(index) : for 반복문이 끝나면 사라지는 변수 = 임시변수
		for(int i = 0 ; i < 10 ; i += 1) {
		}
		
		int num = 0;
		num = num + 1;
		num += 1;
		num =+ 1; //이 코드는 사용하지 말 것.
		num++; // num이라는 변수를 1 증가시켜라.
		++num; // num이라는 변수를 1 증가시켜라. 위랑 쓰는 방법에 따라 위 쓸 수도 있고 아래 쓸 수도 있고
			   // 반항연산자

		num = num - 1;
		num -= 1;
		num--;// num변수를 1 감소시켜
		--num;
		//보편적으로 사용하는 for()반복문의 표준방식
		
		for(int i = 0 ; i < 10 ; i++) {
			
		}
		// i 값이 100부터 시작하여 i < 0 까지
		// 1씩 감소하면서 반복한다.
		for (int i = 100 ; i > 0 ; i--) {
			
			System.out.println(i);
		}
	}
	
}
