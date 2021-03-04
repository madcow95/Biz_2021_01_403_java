package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartServiceV2;

/*
 * CartServiceImplV1을 extends(확장), 상속 받아 V2를 생성
 * 상속되면 그 클래스에 있는 기능을 그대로 사용가능
 */
public class CartServiceImplV2 extends CartServiceImplV1 implements CartServiceV2{
	
	/*
	 * CartServiceImplV2는 인스턴스 객체와 생성자만 있는 상태
	 */
	
	private final Scanner scan;
	private List<CartVO> cartList;
	private String cartFileName;
	
	public CartServiceImplV2() {
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
		cartFileName = "src/com/callor/shop/cartlist.csv";
	}

	/*
	 * cartList에 저장된 상품리스트를 ".../cartlist.txt" 파일에 저장하겠다.
	 * persistance(영속성) : 프로젝트가 중단이 되거나 컴퓨터가 꺼지면 저장된 내용이 사라지지만 전원을 꺼도 내용이 어딘가에 저장되어 사라지지 않도록 하는
	 * 
	 * 어떤 데이터를 파일에 저장하기
	 * 1. 파일이름(경로포함)을 결정
	 * 2. 파일 생성
	 * 3. 모든 데이터를 문자열로 만든다.
	 * 4. 파일에 기록한다.
	 * 5. 파일 연결을 정상적으로 종료한다.
	 */
	
	@Override
	public void saveCartToFile() {
		// TODO Auto-generated method stub
		
		// 1. 데이터를 저장할 파일 생성하기 위하여
		// 		FileWriter 클래스를 사용하여 객체 선언
		FileWriter fileWriter = null;
		// 2. FileWriter에 데이터를 전송하기 위하여
		// PrintWriter 클래스를 사용하여 객체 선언
		PrintWriter printer = null;
		
		/*
		 * 3. fileWriter 객체를 생성하면서 데이터를 저장할 파일 정보를 전달
		 * 		==> 운영체제와 통신을 하여 파일에 저장할 준비를 한다.
		 * 			이때, 운영체제와 통신을 시작하는 아주 짧은 시간동안 생성하고자하는 파일의 각종 정보들에 문제가 발생하여 exception이 발생할 수 있다.
		 * 
		 * 아무리 코드를 견고하게 작성하여도 이 exception은 완전하게 피할 수 없다.
		 * 
		 * Java에서는 이처럼 도저히 완전하게 exception을 피할수 없는 경우는 코드를 "반드시 try 예외처리"를 하도록 강제한다.
		 * 따라서 FileWriter 객체를 사용할때는 반드시 try...catch로 묶어야 한다.
		 */
		try { // try catch로 묶어야 정상적으로 실행이 된다.
			fileWriter = new FileWriter(cartFileName);// cartFileName 변수에 저장된 내용을 파일로 만들 준비를 해줘라 라는 코드
			// 여기까지 코드가 정상 수행되면 fileWriter는 System.in처럼 파일과 java 코드간에 연결하는 통로를 형성한다.
			// 4. fileWriter  객체를 전달하면서 PrintWriter 객체를 생성한다.
			printer = new PrintWriter(fileWriter);
			printer.println("대한민국");
			printer.println("우리나라");
			printer.println("Republic Of Korea");
			
			printer.close();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	@Override
	public void loadCartFromFile() {
		// TODO Auto-generated method stub
		
	}
	
}
