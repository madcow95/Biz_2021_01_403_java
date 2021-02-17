package com.callor.applications.service;

import java.util.Scanner;

/*
 * 클래스의 extends(확장, 상속)
 * 
 * ScoreServiceV4 : Parents(부모) class
 * ScoreServiceExtendsV1 : child(자식) class
 * 
 * 단순한 extends : 부모 class에 정의된 모든 method() 를 코드한 줄 추가나 수정 없이
 * 		그대로 사용할 수 있다.
 * 
 * 추가 extends : 부모 class에 정의된 method ()와 새롭게 추가된 method()가 있는
 * 		확장된 클래스의 생성
 * 
 * ScoreServiceExtendsV1 에 ScoreServiceV4의 내용을 복사해서 붙여넣기 같은 느낌
 * class 공유 느낌?
 */

public class ScoreServiceExtendsV1 extends ScoreServiceV4 {
	
	/*
	 * 문자열형변수 1개를 매개변수로 갖는 input() method
	 */
	// 문자형으로 하려면 void 대신에 int가 되어야한다고?
	public int input(String subject) {
		
		// Scanner를 여기서 사용하기 위해 JRE에서 가져와 scan이라는 이름으로 선언
		Scanner scan = new Scanner(System.in);
		
		// intScore라는 이름의 변수를 생성하고 값 0을 넣어 intScore를 초기화
		int intScore = 0;
		// while문은 {}안의 내용들이 true인 동안 계속 반복
		// {에서 시작해 위에서 아래로 내려가다가 }전에 다시 while{} 제일 위로 이동하여 반복 
		while(true) {
			// "점수 입력 >> " 이라는 내용을 Console에 출력하기 위한 명령문
			System.out.print(subject + " 점수 입력 >> ");
			
			// 선언한 scan문을 사용하는 곳인데
			// 이 명령문을 작성하고 실행시키면 Console 창에 어떤 내용을 입력시키기 전까지 대기하고 있음
			// 코드는 항상 위에서 아래로 내려오기 때문에 여기서 실행 시키면
			// Console 창에는 "점수입력 >> " 만 뜨고 멈춰 있음
			// 그리고 Console창에 숫자를 입력하면 그 값이 intScore에 저장됨
			intScore = scan.nextInt();
			
			// if문은 조건문 ()안의 내용이 true일 때 {}안의 내용을 출력
			// 여기서는 위의 Console창에 기입했던 숫자의 값 (= intScore에 저장된)값이 0보다 작을 때
			// Console에 {} 안에 있는 "점수는 0점 이상 입력"이라는 구문이 출력 해라 라는 명령문
			if(intScore < 0) {
				System.out.println(subject + " 점수는 0점 이상 입력");
			}
			// else if는 위의 if 내용을 포함하고 조건을 하나 추가하는 것으로
			// 여기서는 intScore 값이 "0미만 또는 100 초과"의 조건으로 설정됨
			// 그리고 intScore 값이 100을 초과하면 {}안의 내용인 "점수는 100점 이하 입력" 이라는 구문이 출력하도록 하는 출력문
			else if(intScore > 100) {
				System.out.println(subject + " 점수는 100점 이하 입력");
			}
			// else는 위의 if와 else if문에 있는 조건에 반대되는 내용으로
			// 여기서는 intScore에 저장된 값이 0이상 100이하의 수일때 true이므로 그 때 {}안의 내용이 출력
			// break;는 반복구문인 while문을 멈추고 while{}을 나와 아래의 System.out.println()의 내용을 출력
			else {
				break;
			}
		}
		// Console 에 내용을 출력하는 명령문 System.out.println() 안에서 ""는 "" 안의 내용을 그냥 출력시켜라 라는 의미 +
		// 위의 while문에 저장되있던 값을 출력해라
		// System.out.println("입력한 점수 : " + intScore);
		return intScore;
		// intScore에 담겨있는 값을 int intKor에 담아라
		// 호출한 곳으로 되돌아가서 그 값에 저장돼라.
		
		/*
		 * 호출한 코드에서 
		 * return 30; ==> int intKor에 30을 담아라
		 * return 100; ==> int intKor에 100을 담아라
		 */
		
		
		
		
	}
	
}
/*
 * input() method 가 하는일?
 * 
 * 이 class를 Ctrl + F11을 눌러 실행시키면 나오는 출력문인 "점수 입력 >> "에 0 ~ 100 범위 안의 수를 입력하고 Enter를 누르면
 * 그 입력한 수가 0 ~ 100 안의 수 일 때, 제일 마지막 구문인 System.out.println("입력한 점수 :)에 의해
 * '입력한 점수 : 입력한 수' 가 출력되도록 하는 일을 한다.
 * 0미만의 수를 입력 했을 때는 if() 조건문에 의해 '점수는 0점 이상 입력'이라는 구문이 나오고 다시 while 반복문의 처음으로 돌아가'점수 입력 >> '이 나오고
 * 100초과의 수를 입력 했을 때는 else if() 추가 조건문에 의해 '점수는 100점 이하 입력'이라는 구문이 나오고 위와 같은 이유로 '점수 입력 >>'이 나온다.
 * 또 0 이상 100 이하의 수를 입력했을 때(else 조건문 일 때)는 break;(종료)가 되기 때문에 while 반복문이 멈추고 원하는 값이 출력된다.  
 */