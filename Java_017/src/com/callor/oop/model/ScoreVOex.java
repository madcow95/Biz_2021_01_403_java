package com.callor.oop.model;

public class ScoreVOex {
	
	public String strName;
	private int intKor = -1;
	private int intEng = -1;
	public int intMath;
	
	public int intSum;
	public float fAvg;
	

	public void setIntKorea(String strKor) {
		// setInt 변수 값을 입력하면 intKor에 값 입력
		try {
			int intKor = Integer.valueOf(strKor);
			if(intKor >= 50 && intKor <= 100) {
				this.intKor = intKor;
			}
		} catch (Exception e) {

		}
	} // setIntKore end
	
	public int getIntKor() {
		return this.intKor;
	}
	
	
	public void setIntEng(String strEng) {
		
		try {
			int intEng = Integer.valueOf(strEng);
			if(intEng >= 50 && intEng <= 100) {
				this.intEng = intEng;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public int getIntEng() {
		return this.intEng;
	}
}





