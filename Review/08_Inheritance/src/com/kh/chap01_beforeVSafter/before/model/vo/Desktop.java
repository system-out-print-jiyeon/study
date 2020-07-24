package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {
	
	private String brand;		// 브랜드명
	private String pCode;		// 상품번호
	private String pName;		// 상품명
	private int price;			// 가격
	private boolean allInOne;	// 일체여부 (일체형이면 true, 일체형이아니면 false)
	
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	
	public String getpCode() {
		return pCode;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public String getpName() {
		return pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	public String information() {
		return "브랜드명 : " + brand + ", 상품번호 : " + pCode + 
			 ", 상품명 : " + pName + ", 가격 : " + price + "원, 일체여부 : " + allInOne;
	}
	

}
