package com.callor.score.model;

/*		  값   객체
 * VO : Value Object 
 */
public class ScoreVO {
	// 선언만 된 변수를 사용할 준비
	/*
	 * class, 인스턴스 변수, method 에는
	 * public 또는 private, protected의 키워드로
	 * 선언문을 시작할 수 있다.
	 * 
	 * 이 3개의 키워드를 scope 한정자라고 한다.
	 * public : 누구나 읽고 쓰기, 호출이 가능하다. // 아무나 접근이 된다 // 다른 class에서 접근해 값을 바꿔버릴 수도 있다.
	 * private : 아무나 읽고 쓰기, 호출이 불가능하다. ==> 그 class에서만 사용 가능? // 아무나 접근이 안된다.
	 * 
	 * class를 인스턴스로 선언하고,
	 * 인스턴스.method(), 인스턴스.변수 형식의 명령문을
	 * 사용하려면 
	 * method()나 인스턴스변수에 public 한정자를 붙여야한다.
	 */
	private String strNum;
	
	public String strName;
	public int intKor;
	public int intEng;
	public int intMath;
	public int intMusic;
	public int intHistory;
	
	public int intSum;
	public float floatAvg;
	
	
	

}
