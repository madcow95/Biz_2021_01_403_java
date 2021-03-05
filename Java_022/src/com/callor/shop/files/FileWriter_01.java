package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_01 {
	
	/*
	 * main() method : Java의 진입점 method
	 * 프로젝트를 가상머신에 의해 최초로 실행할 때 가상머신이 자동으로 호출하도록 만드는 method
	 * FileWriter_01.main("..."); 형식으로 호출이 된다.
	 */
	public static void main(String[] args) {
		// Random 클래스를 사용하기 위한 준비
		Random rnd = new Random();
		// " "의 위치에 nums.txt란 파일을 저장하겠다.
		String strRanNum = "src/com/callor/shop/files/nums.txt";
		// 임의의 수 100개가 들어갈 배열 생성
		int[] intNum = new int[100];
		// int rndNum = 0;
		// 1 ~ 1000 중 임의의 수 100개 생성
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(1000) + 1;
		}
		
		//for (int i = 0; i < 100; i++) {
		//	rndNum = rnd.nextInt(1000) + 1;
		//}
		
		// 파일에 데이터를 저장하기 위해 2개의 클래스를 객체로 선언
		// 변수를 지금 바로 생성 하지 않을 경우 clear를 해준다.
		// 숫자형일 경우는 0으로 int num = 0; 같이
		// 클래스의 경우 null값으로
		// String str = ""; (x)
		// String str = null;
		// 데이터를 저장할 파일을 만들기 위해 FileWriter 클래스를 사용하여 객체 선언
		// Text 파일을 생성, 저장 하기 위해서 FileWriter 클래스와 PrintWriter 클래스를 사용한다.
		// 클래스를 사용한 객체 선언과 객체 생성부분을 분리해야한다. 왜냐하면 객체를 생성(사용)할때, try - catch가 의무 적용되어야 하기 때문에 코드 작성 편의상 분리하는 것이 좋다.
		FileWriter fileWriter = null;
		// FileWriter에 데이터를 전송하기 위하여 PrintWriter 클래스를 사용하여 객체 선언
		PrintWriter printWriter = null;

		try {
			// strRanNum에 입력한 내용을 파일로 만들 준비를 해달라
			// fileWriter 객체 생성
			// jvm은 운영체제와 통신을 연결 시도한다.
			// 이 과정에서 아무리 코드를 견고하게 만들어도 어쩔수 없이 exception이 발생하는 상황이 많다.
			// java 코딩에서는 이러한 경우 강제 의무적으로 예외(상황)처리(try - catch)를 하도록 한다.
			fileWriter = new FileWriter(strRanNum);
			// fileWriter는 java와 운영체제를 연결시키는 통로형성
			// fileWriter를 PrintWriter와 연결
			// fileWriter만으로 파일 저장을 할 수 있지만 좀 더 복잡한 과정을 실행해야 한다. fileWriter를 직접 사용하여 파일 저장을 하는 방식을 저수준(low level)방식이라고 한다.
			// 하지만 저수준방식은 새로운 방식을 익혀야 할 경우도 있기 때문에 다소 부담스럽다.
			// fileWriter와 PrintWriter를 연결하면 평소에 많이 사용하던 System.out.println(); method와 비슷한 방식으로 코드를 작성할 수 있다.
			// 이러한 방식을 고수준(high level)방식이라고 한다.
			// 저수준보다 다소 느리게 작동될 수 있지만, 코드작성의 부담이 훨씬 줄어든다.
			// 또한 최근의 컴퓨터는 성능이 많이 좋아져서 큰 차이가 나지 않는다.
			printWriter = new PrintWriter(fileWriter);
			// fileWriter가 생성한 파일에 내용을 입력할 준비

			// fileWriter가 생성한 파일에 1 ~ 1000의 임의의 정수 100개를 입력하고 저장
			for (int i = 0; i < intNum.length; i++) {
				printWriter.println(intNum[i]);
				//printWriter.println(rndNum);
			}
			
			// FileWriter, PrintWriter 등을 사용하여 파일에 내용을 기록한 후에는 "반드시" 객체들을 close 해주어야한다.
			// close를 수행하기 전까지는 기록된 데이터들을 운영체제가 임싯 보관하고 있다. 운영체제는 close 명령이 수행되되는 시도를 받으면 비로소 데이터를 파일에 기록한다.
			// PrintWriter 사용 종료
			printWriter.close();
			// FileWriter 사용 종료
			fileWriter.close();
			System.out.println("저장완료");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
