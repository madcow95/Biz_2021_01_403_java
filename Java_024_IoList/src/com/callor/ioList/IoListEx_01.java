package com.callor.ioList;

import com.callor.ioList.impl.ServiceImplV1;

public class IoListEx_01 {
	
	public static void main(String[] args) {
		
		ServiceImplV1 siV1 = new ServiceImplV1();
		
		siV1.loadFile();
		siV1.division();
		siV1.print();
	}

}
