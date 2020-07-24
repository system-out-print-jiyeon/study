package com.kh.chap01_beforeVSafter.before.model.vo;

public class SmartPhone {
	
	private String brand;		// 브랜드명
	private String pCode;		// 상품번호
	private String pName;		// 상품명
	private int price;			// 가격
	private String mobileAgency;// 통신사
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgency = mobileAgency;
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
	
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public String information() {
		return "브랜드명 : " + brand + ", 상품번호 : " + pCode + 
				 ", 상품명 : " + pName + ", 가격 : " + price + "원, 통신사 : " + mobileAgency;
	}

}
