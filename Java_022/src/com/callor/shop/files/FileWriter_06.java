package com.callor.shop.files;

import com.callor.shop.service.impl.RndServiceImplV2;

public class FileWriter_06 {
	
	public static void main(String[] args) {
		
		String fileName = "src/com/callor/shop/files/nums_Rnd";
		
		RndServiceImplV2 rsV2 = new RndServiceImplV2(fileName);
		
		rsV2.makeRnd();
		//rsV2.saveRnd(fileName);
		
	}

}
