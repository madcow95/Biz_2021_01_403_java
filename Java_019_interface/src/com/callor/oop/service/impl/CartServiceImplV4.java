package com.callor.oop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;
import com.callor.oop.service.CartService;

public class CartServiceImplV4 implements CartService {

	private List<CartVO> cartList;
	private Scanner scan;
	
	// 생성자 method는 class와 이름이 같고,
	// return type(void, String 등)이 없다
	public CartServiceImplV4() {
		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void inputCart() {

		System.out.println("====================================");
		System.out.println("빛나라 카트 시스템 V3");
		System.out.println("------------------------------------");

		// while() 반복문을 사용하여 코드를 작성할때는
		// 사용자가 반복문을 중단(종료)할 수 있는
		// 탈출구를 만들어 주어야 한다.
		System.out.print("구매자 : ");
		String strUserName = scan.nextLine();
//		if(strUserName == null) {
//			CartVO cVO = new CartVO();
//			cVO.setUserName("null");
//		}
		System.out.print("상품명 : ");
		String strProName = scan.nextLine();

		int intQty = 0;
		while (true) {
			System.out.print("수량 : ");
			String strQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(strQty);
				if (intQty < 1) {
					System.out.println("수량은 1개 이상입력");
					continue;
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("수량은 숫자로만 입력");
			}
		}

		int intPrice = 0;
		while (true) {
			System.out.print("단가 : ");
			String strPrice = scan.nextLine();
			try {
				intPrice = Integer.valueOf(strPrice);
				if (intPrice < 1000) {
					System.out.println("단가는 1000원 이상입력");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("단가는 숫자로만 입력");
			}

		} // end while

		// 카트에 저장
		CartVO cartVO = new CartVO();
		cartVO.setUserName(strUserName);
		cartVO.setProductName(strProName);
		cartVO.setQty(intQty);
		cartVO.setPrice(intPrice);
		cartVO.setTotal(intPrice * intQty);
		cartList.add(cartVO);
//			System.out.println("=================================================");
//			System.out.println("구매자\t상품명\t수량\t단가\t총합");
//			System.out.println("=================================================");
//			System.out.printf("%s\t%s\t%d\t%d\t%d\n",
//					cartVO.getUserName(),
//					cartVO.getProductName(),
//					cartVO.getQty(),
//					cartVO.getPrice(),
//					cartVO.getTotal());
	} // end while

	@Override
	public void printCart() {

		int nSize = cartList.size();
		System.out.println("===============================");
		System.out.println("구매자\t상품명\t수량\t단가\t금액");
		System.out.println("===============================");
		for (int i = 0; i < nSize; i++) {
			System.out.print(cartList.get(i).getUserName() + "\t");
			System.out.print(cartList.get(i).getProductName() + "\t");
			System.out.print(cartList.get(i).getQty() + "\t");
			System.out.print(cartList.get(i).getPrice() + "\t");
			System.out.print(cartList.get(i).getTotal() + "\t");
		}
	}

}
