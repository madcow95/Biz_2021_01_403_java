package com.callor.applications;

import com.callor.applications.myclass.MyGuGuDan;

public class App_04 {
	
	public static void main(String args[]) {
		// myGu라는 객체를 초기화해라
		
		// 내가 프로젝트에 선언(정의, 만든다)한
		// myGuGuDan 클래스에 있는 어떤 기능들을 사용하기 위하여
		// 클래스를 객체로 선언하고, 초기화하여 준비를 하는 절차
		
		// 이후에는 myGu 객체를 사용하여 method들을 실행하는 코드를 사용할 수 있다.
		MyGuGuDan myGu = new MyGuGuDan();
		
		// MyGuGuDan 클래스에 선언(정의, 만들기)된
		// gugu() method를 실행해라
		// myGu 객체(Object, instance, 인스턴스)
		// gugu() method를 실행(호출)한다.
		myGu.gugu();
	}
	

}
