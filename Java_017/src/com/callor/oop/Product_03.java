package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO_02;

public class Product_03 {

	public static void main(String[] args) {

		ProductVO_02[] pVO = new ProductVO_02[5];
		Scanner scan = new Scanner(System.in);

		// ProductVO_02 class 배열 생성 후 class를 배열로 선언
		for (int i = 0; i < pVO.length; i++) {
			pVO[i] = new ProductVO_02();
		}
		System.out.println("=======================================");
		System.out.println("나라쇼핑몰 상품관리 V1");
		System.out.println("=======================================");

		for (int i = 0; i < pVO.length; i++) {

			System.out.println((i + 1) + "번 상품 정보 입력");
			System.out.print("상품코드 입력 : ");
			pVO[i].strPCode = scan.nextLine();

			System.out.print("상품명 입력 : ");
			pVO[i].strPName = scan.nextLine();

			System.out.print("거래처 입력 : ");
			pVO[i].strDName = scan.nextLine();

			System.out.print("품목 입력 : ");
			pVO[i].strItem = scan.nextLine();

			while (true) {
				System.out.print("매입단가 입력 : ");
				String iPrice = scan.nextLine();
				int intIPrice = Integer.valueOf(iPrice);

				if (intIPrice < 0) {
					System.out.println("0 이상의 수를 입력하세요");
				} else {
					pVO[i].iPrice = intIPrice;
					break;
				}
			} // while end

			while (true) {
				System.out.print("매출단가 입력 : ");
				String oPrice = scan.nextLine();
				int intOPrice = Integer.valueOf(oPrice);

				if (intOPrice < 0) {
					System.out.println("0 이상의 수를 입력하세요");
				} else {
					// 정상처리되었으면
					// 단가가 0이상 입력되었으면
					// VO에 값을 저장하고
					// 다음단계로 진행
					// 현 시점에 while()을 중단해라
					pVO[i].oPrice = intOPrice;
					break;
				}
			} // while end
			pVO[i].toString();
		} // for end
	}

}
