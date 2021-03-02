package com.callor.homework;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartServiceV1 {

	private CartVO cVO = new CartVO();
	//private List<CartVO> cartList = new ArrayList<CartVO>();
	private Scanner scan = new Scanner(System.in);

	// 이름 품목 수량 가격
	public void inputCart() {
		
		System.out.print("이름 입력 : ");
		String strUserName = scan.nextLine();
		cVO.setCartUserName(strUserName);
		
		System.out.print("제품이름 입력 : ");
		String strPName = scan.nextLine();
		cVO.setCartPName(strPName);
		
		//int intQty = 0;
		while (true) {
			System.out.print("수량 입력 : ");
			String strQty = scan.nextLine();
			try {
				int intQty = Integer.valueOf(strQty);
				if (intQty >= 2) {
					cVO.setCartQty(intQty);
					break;
				} else {
					System.out.println("2이상의 수를 입력하세요");
					continue;
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요");
			}
		}// end while
		
		//int intPrice = 0;
		while (true) {
			System.out.print("가격 입력 : ");
			String strPrice = scan.nextLine();
			try {
				int intPrice = Integer.valueOf(strPrice);
				if (intPrice >= 1000) {
					cVO.setCartPrice(intPrice);
					break;
				} else {
					System.out.println("1000이상의 수를 입력하세요");
					continue;
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요");
			}
			
		}// end while
	}// end inputCart
	
	public void printCartList() {
		System.out.println("=====================================");
		System.out.println("입력정보 확인");
		System.out.println("=====================================");
		System.out.println("이름\t제품명\t수량\t가격");
		System.out.println("=====================================");
		System.out.printf("%s\t%s\t%d\t%d\n",
				cVO.getCartUserName(),
				cVO.getCartPName(),
				cVO.getCartQty(),
				cVO.getCartPrice());
		System.out.println("=====================================");
	}// end printCartList
}
