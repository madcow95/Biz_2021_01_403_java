package com.callor.shop.service.impl;

/*
 * Impl 접미사 : 인터페이스를 implements하여 생성한 클래스다.
 */

import java.util.Scanner;

import com.callor.shop.service.MenuService;
import com.callor.shop.values.Values;

public class MenuServiceimplV1 implements MenuService {

	/*
	 * final 키워드는 변수, 객체를 혹시모를 어디선가 변경하는 행위를 못하도록 방지하는 조치 상수선언이라고도 한다. final로 선언된
	 * 변수나 객체는 읽기전용이다.
	 * 
	 * 값을 저장하려고 시도하면 오류가 난다. final int num = 0; num = 100; // 오류발생
	 */
	// 이렇게 작성해주는게 가장 좋다.
	private final Scanner scan;

	public MenuServiceimplV1() {
		scan = new Scanner(System.in);
	}

	@Override
	public Integer selectMenu() {

		while (true) {
			// static으로 선언된 애들은 약간 기울어져 있다
			// 이 애들은 따로 불러내지 않아도 그냥 쓸 수 있다.
			// 한 프로젝트에서 많이 쓸것 같은 것들만 만들고
			// 웬만하면 final을 붙여서 읽기 전용으로만 써라
			System.out.println(Values.dLine);
			System.out.println("빛나라 쇼핑몰 2021");
			System.out.println(Values.sLine);
			System.out.printf("%d. 장바구니 추가\n",Values.MENU_INPUT);
			System.out.printf("%d. 장바구니 전체보기\n",Values.MENU_ALL_LIST);
			System.out.printf("%d. 구매자별 장바구니 보기\n",Values.MENU_USER_LIST);
			System.out.printf("%d. 장바구니 파일 저장\n",Values.MENU_SAVE_CART_LIST);
			System.out.println("QUIT. 업무종료");
			System.out.println(Values.sLine);
			System.out.print("선택 >> ");
			String strMenu = scan.nextLine();
			if (strMenu.equals("QUIT")) {
				System.out.println("업무종료");
				return null;
			}
			/*
			 * try {
			 *  Integer intMenu = Integer.valueOf(strMenu);
			 *   if(intMenu >= 1 && intMenu <= 3) {
			 *   return intMenu; }
			 *   } catch (Exception e) {
			 *   // TODO: handle exception 
			 *   }
			 */
			// int가 아닌 Integer로 선언
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.printf("메뉴는 QUIT, %d ~ %d까지만 가능\n",Values.MENU_START,Values.MENU_LAST);
				continue;
			}
			// try와 if를 분리시키는게 더 최적화 된 코드이다.
			if (intMenu >= Values.MENU_START && intMenu <= Values.MENU_LAST) {
				return intMenu;
			} else {
				System.out.println("업무는 1 ~ 3 중 선택");
			}
		}
	}

}
