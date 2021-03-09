package com.callor.ioList.vo;

public class IoListVO {
	
	private String date;
	private String productName;
	private String departName;
	private String chefName;
	private int division;
	private int buyPrice;
	private int sellPrice;
	private int qty;
	private int buyTotal;
	private int sellTotal;
	
	public IoListVO() {
	}
	public IoListVO(String date, String productName, String departName, String chefName, int division, int buyPrice,
			int sellPrice, int qty, int buyTotal, int sellTotal) {
		super();
		this.date = date;
		this.productName = productName;
		this.departName = departName;
		this.chefName = chefName;
		this.division = division;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
		this.qty = qty;
		this.buyTotal = buyTotal;
		this.sellTotal = sellTotal;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	public String getChefName() {
		return chefName;
	}
	public void setChefName(String chefName) {
		this.chefName = chefName;
	}
	public int getDivision() {
		return division;
	}
	public void setDivision(int division) {
		this.division = division;
	}
	public int getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}
	public int getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getBuyTotal() {
		return buyTotal;
	}
	public void setBuyTotal(int buyTotal) {
		this.buyTotal = buyTotal;
	}
	public int getSellTotal() {
		return sellTotal;
	}
	public void setSellTotal(int sellTotal) {
		this.sellTotal = sellTotal;
	}
	@Override
	public String toString() {
		return "ioListVO [date=" + date + ", productName=" + productName + ", departName=" + departName + ", chefName="
				+ chefName + ", division=" + division + ", buyPrice=" + buyPrice + ", sellPrice=" + sellPrice + ", qty="
				+ qty + ", buyTotal=" + buyTotal + ", sellTotal=" + sellTotal + "]";
	}
	
		
	

}
