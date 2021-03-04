package com.callor.shop;
//			java의 모든 클래스는 안보여도 Object라는 클래스를 extends시킨다.
/*
 * 아무것도(변수, method 등)이 없는 비어있는 클래스는 java 클래스의 원조 조상인 Object를 자동으로 extends 한다.
 */
public class Class_01 extends Object{
	
	/*
	 * 선천적으로 모든 클래스는 Object클래스에 만들어져(정의되어)있는 toString() method를 가지고 있다.
	 * toString() method는 Object 클래스로부터 상속받은 것이다.
	 * java에서는 상속받은 method를 필요에따라 마음대로 요리해서 변형할 수 있다.
	 * 이러한 것을 "method의 재정의" 라고 한다.
	 * 
	 * @... : Annotation(주석)
	 * 
	 * @Override : Override Annotation
	 * 이 method는 부모 클래스에서 상속받았지만 여기에서 재정의 하겠다. 라는 의미
	 */
	@Override
	public String toString() {
		return "나는 Object를 상속받은 Class_01 입니다";
	}
}
