package com.callor.score.values;

public class ValLine {
	
	public static String dLine(int count) {
		
		return String.format("%0" + count + "d", 0).replace("0", "=");
	}
	
public static String sLine(int count) {
		
		return String.format("%0" + count + "d", 0).replace("0", "-");
	}

}
