package com.kh.chap01_beforeVSafter.before.model.vo;

public class Tv {
	
	private String brand;		// 브랜드명
	private String pCode;		// 상품번호
	private String pName;		// 상품명
	private int price;			// 가격
	private int inch;			// 인치
	
	public Tv() {
		
	}
	
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.inch = inch;
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
	
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public int getInch() {
		return inch;
	}
	
	public String information() {
		return "브랜드명 : " + brand + ", 상품번호 : " + pCode + 
			 ", 상품명 : " + pName + ", 가격 : " + price + "원, 인치 : " + inch;
	}
	
	
	
}
