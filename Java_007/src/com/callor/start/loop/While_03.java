package com.callor.start.loop;

public class While_03 {
	
	public static void main(String[] args) {
			
		int index = 0;
		// 매우 불편한 코드
		while(true) {
			if(index % 3 > 0) {
				System.out.println("3의 배수가 아님");
			}
			
			// 정상적인 코드
			if(++index % 3 == 0) {
				
				System.out.println(index + "는 3의 배수");
				
			}
			
			else {
				
				System.out.println(index + "는 3의 배수 아님");
			}
			// ==은 위험하다 이 값이 항상 나올까? 우연히 지나쳐서 while문 같은데에 걸려 무한으로 갈 수도 있으니
			// <>이런거를 위주로 사용하자
			if(index > 1000) {
				
				break;
				
			}
			
		}
			
		}
}
