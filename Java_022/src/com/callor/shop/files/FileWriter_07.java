package com.callor.shop.files;

import com.callor.shop.service.impl.RndServiceImplV11;

public class FileWriter_07 {

	public static void main(String args[]) {

		String fileName = "src/com/callor/shop/files/score.txt";

		RndServiceImplV11 rV1 = new RndServiceImplV11();
		rV1.makeRnd();
		rV1.saveRnd(fileName);

	}

}
