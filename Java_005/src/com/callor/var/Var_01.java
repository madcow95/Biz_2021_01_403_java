package com.callor.var;

// 가
public class Var_01 {
	
	//1
	public static void main(String args[]) {
		
		// Top(위쪽) 부분에 선언된 변수는
		// Down(아래쪽)에서 또 선언되서는 안된다.
		// 한 번 선언된 변수이름으로 또 다시 선언할 수 없다.
		int num1 = 30;
		int num2 = 40;
		int num3 = 50;
		
		/*
		 * 변수 이름 짓기
		 * 첫글자는 영문소문자
		 * 이후에는 숫자, 영문대소문자, _사용할 수 있다.
		 * 두 개 이상의 단어를 조합하여 사용하는 것을 권장한다.
		 * 두 번째 단어부터는 첫글자를 대문자로 사용
		 * (lower) Camel Case
		 */
		int korScore = 90;
		int engScore = 100;
		int mathScore = 95;
		
		System.out.println((korScore + engScore + mathScore) / 3);
		
		// 2개 이상의 단어로 조합이 다소 불편할때
		// 변수명 접두사로 변수의 형(type)을 붙인다.
		// 헝가리언 표기법
		int intNum1 = 20;
		int intNum2 = 30;
		int intNum3 = 40;
		
		float floatNum1 = 20.0F;
		float fNum2 = 30.0F;
		
		System.out.println(floatNum1);
		
		double doNum1 = 20.0;
		double doNum2 = 30.0;
		
		System.out.println(doNum1);
		
		String strName = "홍길동";
		String strNation = "대한민국";
		String strTel = "010-1111-1111";
		String strAddr = "서울특별시";
		
		/*
		 * 변수명 단어와 단어사이에 UnderScore(_) 넣는 것을
		 * snake case 라고 한다. 
		 * 
		 * 데이터베이스와 연동하는 프로젝트를 만들때 주로 사용하는  명명 표기법
		 */
		String str_name = "이몽룡";
		
		String st_name = "성춘향"; // st_name = student_name
		String st_num = "202101001"; // st_num = student_num
		
		String dept_name = "컴퓨터공학";
		
	}//2
	// 1 ~ 2의 구역을
	//main() method의 local area, 
	//			또는local scope라고 하며
	// 줄여서 그냥 local 이라고 한다.

}// 나
// 가 ~ 나의 구역을
// 클래스 Var_01의 private 영역이라고한다.
// 또는 그냥 Var_01의 local 영역 이라고도 한다.