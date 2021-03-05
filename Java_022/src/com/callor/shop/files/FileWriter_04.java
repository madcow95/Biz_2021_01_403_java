package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileWriter_04 {

	/*
	 * 클래스 영역에 변수를 선언하는 것은 현재 클래스가 포함하고 있는 모든 method들이 변수를 공유하여 코드를 수행하게 하려는 의도이다.
	 * 
	 * 보통 생성자를 통해 객체를 생성하여 사용하는 클래스에 선언된 클래스 영역 변수를 "인스턴스 변수" 라고 한다.
	 * 인스턴스 변수는 GC(Garbage Collection)에 의해 메모리 관리가 자동으로 이루어진다.
	 * 
	 * static method에서 필요한 변수들은 변수를 선언할때 static 키워드를 추가하여 static 변수로 만든다.
	 * 
	 * static 변수는 GC가 접근하지 못한다. 프로젝트가 시작될때 만들어지고, 계속 존재하는 상태다.
	 * 프로젝트가 시작될때 클래스가 자동으로 만들어지고 이때 static 변수들도 자동으로 생성된다. ==> class 변수 , 내가 만들고 싶지 않아도 만들어지는 변수?
	 * 클래스가 생성될때 같이 만들어진다는 의미로 static 키워드가 부착된 변수를 "클래스 변수"라고 한다.
	 * 
	 * static 변수는 선언과 생성을 동시에 하도록 코드를 작성한다.
	 * 
	 * 다만 static 생성자를 만들어 별도로 생성을 하는 경우도 있다.
	 *  ==> static { }
	 */
	private static String strRanNum = "src/com/callor/shop/files/nums.txt";
	private static List<Integer> intList = new ArrayList<Integer>();
	// 특별한 경우를 아니고서는 잘 사용하지 않는다.
	static {
		strRanNum = "src/com/callor/shop/files/nums.txt";
		intList = new ArrayList<Integer>();
	}
	// 클래스 변수와 인스턴스변수 차이 : 1. static이 붙어있냐(class) 안붙어있냐(intstance)
	// 생성자에 의해서 객체가 생성될 때 instance변수가 생성된다. , 내가 필요할때만 만들어지는
	/*
	 * main() method와 같은 클래스 내에 있는 다른 method를 호출하여 코드를 수행할 경우 main() method의 호출을 받는 method들은 모두 static으로 선언되어야 한다.
	 * main() method와 static으로 선언된 method들이 클래스 영역에 선언된 변수를 공유하려면 클래스 영역에 선언된 변수들도 모두 static으로 선언되어야 한다.
	 * 
	 * 인스턴스변수 : 필요할때 쓰고 버리는건데 static이 붙으면 버릴수가 업슴
	 */
	public static void main(String[] args) {
		
		/*
		 * 1. static으로 선언된 method 내에서는 같은 클래스의 다른 method를 this.method(); 형식으로 호출하지 못한다.
		 * 
		 */
		
		makeNums();
		saveFileNums();

	} // end main

	private static void makeNums() {

		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {
			Integer num = rnd.nextInt(1000) + 1;
			intList.add(num);

			intList.add(rnd.nextInt(1000) + 1);
		}

	}

	private static  void saveFileNums() {

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(strRanNum);
			printer = new PrintWriter(fileWriter);

			for (int n : intList) {
				printer.println(n);
			}

			int nSize = intList.size();
			for (int i = 0; i < nSize; i++) {
				Integer n = intList.get(i);
				printer.println(n);
			}

			printer.close();
			fileWriter.close();
			System.out.println("저장완료");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
