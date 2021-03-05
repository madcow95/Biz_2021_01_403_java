package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV2 {

	// makeRNd()와 saveFileRnd() method가 공용으로 사용할 객체이므로 인스턴스 객체변수로 선언
	private List<Integer> intList;
	private String fileName;
	
	/*
	 * 매개변수가 없는 생성자와 파일이름을 매개변수로 전달받아야 하는 생성자를 선언했다.
	 * 
	 * 매개변수가 없는 생성자를 호출하여 객체를 생성하면 : (= new RndServiceImplV2라고 하면)
	 * 파일이름을 매개변수로 전달하면서 다시 매개변수가 있는 생성자를 호출한다.
	 */
	public RndServiceImplV2() {
		this("src/com/callor/shop/files/nums_Rnd");
	}
	/*
	 * 매개변수가 있는 생성자는 객체를 생성할때 반드시 파일이름을 전달받아야만 한다.
	 * = new RndServiceImplV2(파일이름);
	 */

	// 생성자에도 매개변수를 붙일 수있다.
	public RndServiceImplV2(String fileName) {
		intList = new ArrayList<Integer>();
		this.fileName = fileName;	//"src/com/callor/shop/files/nums_Rnd.txt";
	}

	public void makeRnd() {

		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			Integer num = rnd.nextInt(1000) + 1;
			intList.add(num);
		}

	}

	/*
	 * 객체지향의 (method) 다형성
	 * 
	 * 원칙은 한 클래스 파일내에서는 같은 이름의 method를 두 번 이상 정의 할 수 없다.
	 * 
	 * 하지만 객체지향 언어에서는 method의 매개변수가 있거나 없거나 또는 매개변수의 개수가 다르거나 매개변수의 type이 다르면 같은 이름의
	 * method를 중복하여 정의할 수 있다.
	 * 
	 * 이걸 다형성, Overloading이라고 한다.
	 */

	// 아래 같은이름의 method ()안에 String fileName있어서 중복으로 정의 가능하다~
	//public void saveRnd() {
		//String fileName = "src/com/callor/shop/files/nums_Rnd.txt";
		//this.saveRnd(fileName);
	//}
	
	public void saveRnd() {
		
		this.saveRnd("src/com/callor/shop/files/nums_Rnd.txt");
	}

	/*
	 * RndServiceImpV11 클래스를 처음 디자인할때는 파일의 이름을 코드에 직접 작성하였다. 이후 필요에 의해 파일의 이름을
	 * method 매개변수로 받아서 사용할 수 있도록 변경했다. 그랬더니 처음 V1 클래스를 호출하여 만들었던 코드들에서 오류가 나타나버렸다.
	 * 
	 * 이 오류를 객체지향의 다형성 원리를 이용하여 해결하였다.
	 * 
	 * 만약 saveRnd() 라고 method를 호출하면 코드에 포함된 파일이름을 적용하여 saveRnd(파일이름)를 호출하도록 만들었다.
	 * 
	 * 이제는 saveRnd(), saveRnd(파일이름) 두가지중 호출하여 사용해도 문제가 없어졌다.
	 */

	// 저장할 파일 이름을 코드에 포함하지 않고 saveRnd() method를 호출하는 곳에서 파일이름을 전달해 주도록 코드를 변경
	public void saveRnd(String fileName) {

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			int nCount = 0;
			for (Integer n : intList) {
				printer.print(n + ":");
				if (++nCount % 5 == 0) {
					printer.println();
				}
			}
			printer.close();
			fileWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	} // end saveRnd

	/*
	 * saveRnd() method의 코드를 실행하여 Random수들이 저장되어있는 파일에서 Random 수들을 다시 읽어들여 연산을 수행하는
	 * method
	 * 
	 * 저장할때 사용한 파일이름 == 읽을때 사용할 파일이름
	 * 
	 * 이 상황은 2개의 method가 1개의 공통된 파일이름을 사용한다는 것이다.
	 * 
	 * 결국 saveRnd() method만 사용하기 위해서 선언된 fileName변수는 인스턴스 영역에 선언되어야 코드가 간편해질 것이다.
	 */
	
	/*
	 * 
	 */
	public void loadFileRnd() {
		

	}

}
