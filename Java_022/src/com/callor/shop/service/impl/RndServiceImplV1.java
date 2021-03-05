package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class RndServiceImplV1 {
	
	// Random 수를 생성하여 List에 담을 method
	
	// List에 담긴 숫자들을 파일에 저장하는 method
	
	private String strRndNum;
	private int[] intRndNum;
	
	// 생성자 method에서 사용할 인스턴스변수를 생성
	public RndServiceImplV1() {
		// " "위치에 num.txt 파일을 생성하겠다.
		strRndNum = "src/com/callor/shop/files/num.txt";
		// 1 ~ 1000중 임의의 수 100개 저장할 배열 생성
		intRndNum = new int[100];
	}

	// 임의의 수 100개 저장할 배열 생성 method
	public void write() {
		// Random 클래스를 사용할 객체 rnd 선언
		Random rnd = new Random();

		// 1 ~ 1000 중 임의의 수 100개 생성
		for (int i = 0; i < intRndNum.length; i++) {
			intRndNum[i] = rnd.nextInt(1000) + 1;
		}
	}// end write()

	// 임의의 수 100개가 입력된 파일을 생성하는 method
	public void save() {
		// 파일을 생성할 준비를 하는 FileWriter 클래스 사용하기 위한 선언
		FileWriter fileWrite = null;
		// 파일에 내용을 저장하는 PrintWriter 클래스 사용하기 위한 선언
		PrintWriter printer = null;
		
		try {
			// strRndNum에 입력해둔 위치가 지정된 파일을 생성
			fileWrite = new FileWriter(strRndNum);
			// 그 파일에 내용을 입력하고 저장
			printer = new PrintWriter(fileWrite);
			
			// intRndNum 배열에 저장된 1 ~ 1000 중 임의의 수 100개를 txt파일에 입력하고 저장
			for (int i = 0; i < intRndNum.length; i++) {
				printer.print(intRndNum[i] + ":");
				if ((i + 1) % 5 == 0) {
					printer.println();
				}
			}
			// PrintWriter 클래스 사용 종료
			printer.close();
			// FileWriter 클래스 사용 종료
			fileWrite.close();
			System.out.println("파일 저장 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		for (int i = 0; i < intRndNum.length; i++) {
//			System.out.print(intRndNum[i] + ":");
//			if ((i + 1) % 5 == 0) {
//				System.out.println();
//			}
//		}
	} // end print()

}
