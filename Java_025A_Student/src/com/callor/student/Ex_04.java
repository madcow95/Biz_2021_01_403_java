package com.callor.student;

import com.callor.student.model.StudentVO;

public class Ex_04 {
	
	public static void main(String args[]) {
		
		// 배열 10개 선언
		StudentVO[] stdArray = new StudentVO[10];
		
		int index = 2;
		stdArray[index].setStName("홍길동");
		stdArray[index].setStNum("0001");
		
		// 1번
		stdArray[index] = new StudentVO(); // 초기화를 하고 setter를 해라
		// 2번
		//for(int i = 0; i < stdArray.length; i++) {
		//	stdArray[i] = new StudentVO();
		//}
		
		System.out.println("이름 : " + stdArray[index].getStName());
		System.out.println("학번 : " + stdArray[index].getStNum());
		// 초기화를 안시켰다.
	}

}
