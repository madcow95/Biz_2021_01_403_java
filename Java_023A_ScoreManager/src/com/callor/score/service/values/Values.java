package com.callor.score.service.values;

public class Values {
	// final로 선언하면 초기화 말고 바로 그 값을 입력해 줘야한다.
	public static final String dLine;
	public static final String sLine;
	
	// static final 변수 생성하기
	static {
		//		0을 50줄을 만들어라         0을 "="로 대체해라
		dLine = String.format("%050d", 0).replace("0", "=");
		sLine = String.format("%050d", 0).replace("0", "-");
		
	}

}
