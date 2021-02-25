package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO_02;

public class Product_022 {
	
	public static void main(String[] args) {
		
		// VO class 배열로 선언하고
		// 사용 (데이터저장, 읽기) 하려면
		// 선언된 객체배열 요소요소를 모두
		// 다시 초기화(생성) 하는 과정이 필요하다
		// 이 과정이 생략되면
		// 이후 코드에서 NullpointerException이 발생한다.
		ProductVO_02[] pVOs = new ProductVO_02[5];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < pVOs.length; i++) {
			pVOs[i] = new ProductVO_02();
		}
		System.out.println("=======================================");
		System.out.println("나라쇼핑몰 상품관리 V1");
		System.out.println("=======================================");
		
		String strN = 3 + ""; // "3" 이라는 문자열로 저장
		int intN = Integer.valueOf(strN);
		
		// 연속된 값으로 상품코드 생성
		for(int i = 0; i < pVOs.length; i++) {
			String pCode = (i + 1) + "";
			pVOs[i].strPCode = pCode;
			
			System.out.println(pCode + "번 상품정보 입력");
			System.out.print("상품이름 : ");
			pVOs[i].strPName = scan.nextLine();
			
			System.out.print("거래처 : ");
			pVOs[i].strPName = scan.nextLine();
			
			System.out.print("품목 : ");
			pVOs[i].strPName = scan.nextLine();
			
			System.out.print("매입단가 : ");
			String iPrice = scan.nextLine();
			pVOs[i].iPrice = Integer.valueOf(iPrice);
			
			System.out.print("매출단가 : ");
			String oPrice = scan.nextLine();
			pVOs[i].oPrice = Integer.valueOf(oPrice);
			
			pVOs[i].toString();
		}
		
		
		
	}

}
