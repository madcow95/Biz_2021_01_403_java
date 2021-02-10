package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;

public class App_07 {
	
	public static void main(String[] args) {
		
		MyGuGuDan myGu = new MyGuGuDan();
		/*
		 * MyGuGuDan 클래스에 정의된 print() method 호출
		 * 
		 * MyGuGuDan 클래스의 print() method 호출
		 * 
		 * myGU.print()에서 ()안의 숫자를 기입하지 않았을 때 생기는 오류내용
		 * print(int) ... arguments () 
		 * => ()안에 정수형 값을 넣어라.
		 */
		
		// ()안에 값을 주입한다. 라고 한다.
		// 4를 arguments or 매개변수 라고 한다.
		// 4를 myGu에 전달? 주입?
		myGu.print(555);
		
		Random rnd = new Random();
		// Random 클래스의 enxtInt() method를 호출해라
		rnd.nextInt(10); // 호출하면서 정수 10을 주입해라
		rnd.nextInt(); // 그냥 호출만 해라
		
		Scanner scan = new Scanner(System.in);
		// Scanner 클래스의 nextInt() method를 호출해라
		scan.nextInt();
		
		Random rd = new Random();
		// random클래스의 nextInt값을 호출해라.
		rd.nextInt(100);
		
				
	}

}
