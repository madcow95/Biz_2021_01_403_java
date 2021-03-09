package com.callor.ioList;

import com.callor.ioList.impl.ioListServiceImplV1;

public class IoListEx_01 {
	
	public static void main(String[] args) {
		
		ioListServiceImplV1 ioV1 = new ioListServiceImplV1();
		
		ioV1.loadDataFromFile();
		ioV1.ioListSum();
		ioV1.printIoList();
		
	}

}
