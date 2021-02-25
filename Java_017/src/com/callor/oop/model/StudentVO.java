package com.callor.oop.model;

public class StudentVO {
	// 앞으로 만들 VO들은 이런 모양으로 만들게 될거
	// Alt + shift + s
	// VO변수는 모두 private인스턴스로 선언한다
	// 이걸 변수의 은닉? 이라고한다.
	// 은닉,은폐 된 변수를 저장,읽기 위해 get, set 이용
	/*
	 * 정보의 은닉과 캡슐화
	 *  class의 인스턴스 변수에 직접 접근하지 못하도록 하고
	 *  getter, setter method를 통하여 접근하도록 만드는 class 설계이론
	 */
	private String strNum;
	private String strName;
	private String strDept;
	private String strTel;
	private String strAddr;
	
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrDept() {
		return strDept;
	}
	public void setStrDept(String strDept) {
		this.strDept = strDept;
	}
	public String getStrTel() {
		return strTel;
	}
	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}
	public String getStrAddr() {
		return strAddr;
	}
	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	
	
}
