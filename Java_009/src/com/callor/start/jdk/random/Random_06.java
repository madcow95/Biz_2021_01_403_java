package com.callor.start.jdk.random;
/*
 * 1 ~ 100 임의의 숫자 100개 만들고
 * 생성된 숫자 중 34보다 큰값이 나오면 몇번째인지 보여주고 멈추기
 */

/*
 * Copy & Understand , Paste
 * 복사 붙이기 ( ^C , ^V )
 */

import java.util.Random;

public class Random_06 {
	
	public static void main(String args[]) {
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < 100 ; i++) {
			int num = rnd.nextInt(100) + 1;
			
			boolean bYes1 = num > 34;
			
			if(bYes1) {
				System.out.println((i + 1) + ". " + num + "은(는) 34이상");
				break;// 하면 for()반복문 밖으로 나간다.
			}
			else {
				System.out.println((i + 1) + ". " + num + "은(는) 34미만");
			}
		}
		System.out.println("=========================");
		System.out.println("위에 꺼는 수업중 과제");
		System.out.println("=========================");
		
		int intEnd = 100;
		int count = 0;
		for(count = 0 ; count < intEnd ; count++) {
			
			int num = rnd.nextInt(100) + 1;
			if(num > 50) {
				break;
			}
		}
		System.out.println(count);
		// count 변수값을 읽을 수 있다.
		// 만약 for() 반복문이 중단 되지 않고 모두 정상적으로
		// 수행되고나면 count와 intEnd는 count == intEnd가 된다.
		// if()문 중간 값과 같다.
		// =이 들어가면 값에 + 1 값이 출력
		
		if(intEnd <= count) {
			// for()가 정상 종료 되었다.
			System.out.println("for 중단");
			System.out.println((count + 1) + "번째에서 값 발견");
		}
		if(intEnd > count) {
			// for()가 어떤 이유로 중간에 break 되었다.
			System.out.println("for 모두 반복 수행 완료");
			System.out.println("값을 찾을 수 없음");
		}
	
	
	
	
	}
	
	
	

}
