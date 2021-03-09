package com.callor.ioList.service;

/*
 * 파일을 읽어서 ioList에 담기
 * ioList에 담긴 데이터를 "구분" 값을 기준으로 매입금액과 판매금액을 계산하자
 * ioList에 담긴 데이터를 출력하기
 */

public interface IoListService {
	
	public void loadDataFromFile();
	public void ioListSum();
	public void printIoList();

}
