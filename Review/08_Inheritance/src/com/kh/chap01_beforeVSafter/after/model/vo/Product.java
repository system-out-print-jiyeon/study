package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {

	private String brand;		// 브랜드명
	private String pCode;		// 상품번호
	private String pName;		// 상품명
	private int price;			// 가격
	
	// 기초생성자
	public Product() {}
	
	
	// 매개변수 생성자
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		
	}
	
	
	// setter/getter
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	public String getBrand() {
		return brand;
	}
	public String getpCode() {
		return pCode;
	}
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	
	
	
	// information
	public String information() {
		return "브랜드명 : " + brand + ", 상품번호 : "+ pCode + ", 상품명 : "+ pName + ", 가격 : " + price + "원";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
