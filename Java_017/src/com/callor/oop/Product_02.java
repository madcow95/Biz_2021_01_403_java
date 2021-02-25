package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_02 {
	
	public static void main(String[] args) {
		
		ProductVO proVO = new ProductVO();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===============================");
		System.out.println("상품정보 등록(입력) 시스템 V1");
		System.out.println("-------------------------------");
		System.out.println("상품정보를 입력하세요");
		System.out.println("-------------------------------");
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번 상품코드입력 : ");
			proVO.strPCode[i] = scan.nextLine();
		}
		System.out.println("-------------------------------");
		for(int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번 상품명입력 : ");
			proVO.strItem[i] = scan.nextLine();
		}
		System.out.println("-------------------------------");
		for(int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번 거래처입력: ");
			proVO.strDName[i] = scan.nextLine();
		}
		System.out.println("-------------------------------");
		for(int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번 품목입력 : ");
			proVO.strPName[i] = scan.nextLine();
		}
		System.out.println("-------------------------------");
		for(int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번 매입단가입력 : ");
			proVO.iPrice[i] = scan.nextInt();
		}
		System.out.println("-------------------------------");
		for(int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번 매출단가입력 : ");
			proVO.oPrice[i] = scan.nextInt();
		}
		System.out.println("-------------------------------");
			proVO.toString();	
	}
}
