package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO_02;

public class Product_01 {
	
	public static void main(String[] args) {
		
		ProductVO_02 거래 = new ProductVO_02();
		Scanner scan = new Scanner(System.in);
		// class를 만들면 자동으로 toString이라는 method를 만든다.
		// 거래 라는 instance는 model pacakage를
		// 컴퓨터 기억장치에 @3cda1055에 저장되어있다(여기 위치에서)
		
		System.out.println("===============================");
		System.out.println("상품정보 등록(입력) 시스템 V1");
		System.out.println("-------------------------------");
		System.out.println("상품정보를 입력하세요");
		System.out.println("-------------------------------");
		
		System.out.print("상품코드 입력 : ");
		거래.strPCode = scan.nextLine();
		
		System.out.print("상품명 입력 : ");
		거래.strPName = scan.nextLine();
		
		System.out.print("거래처 입력 : ");
		거래.strDName = scan.nextLine();
		
		System.out.print("품목 입력 : ");
		거래.strItem = scan.nextLine();
		
		System.out.print("매입단가 : ");
		거래.iPrice = scan.nextInt();
		
		System.out.print("매출단가 : ");
		거래.oPrice = scan.nextInt();
		
		거래.toString();

	}

}
