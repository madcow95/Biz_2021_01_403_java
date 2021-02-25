package com.callor.oop;

public class ProductVO_01 {
	
	public static String strPCode;
	public int intProductCode;
	public String strProductName;
	public String strItemName;
	public String strTradeName;
	public int intImport;
	public int intExport;
	public int intAmount;
	public int intImpSale = intImport * intAmount;
	public int intExpSale = intExport * intAmount;
}
