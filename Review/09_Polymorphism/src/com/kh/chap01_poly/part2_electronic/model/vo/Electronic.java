package com.kh.chap01_poly.part2_electronic.model.vo;

public class Electronic {

	private String brand;
	private String name;
	private int price;
	
	
	public Electronic() {}
	
	public Electronic(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	
	
	public String toString() {
		return "브랜드 : " + brand + ", 상품명 : " + name +", 가격 : " + price + "원";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
