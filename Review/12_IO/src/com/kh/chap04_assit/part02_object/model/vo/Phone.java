package com.kh.chap04_assit.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable {	// 직렬화 선언
	// 객체자체를 통째로 파일 입출력 하고자 한다면 반드시 직렬화 과정이 필수!! (implements Serializable)

	// 필드
	private String name;
	private String brand;
	private int price;
	
	
	// 기본생성자
	public Phone() {}

	// 매개변수생성자
	public Phone(String name, String brand, int price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}


	
	// setter / getter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	// toString
	@Override
	public String toString() {
		return "Phone [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}



	

	
}
