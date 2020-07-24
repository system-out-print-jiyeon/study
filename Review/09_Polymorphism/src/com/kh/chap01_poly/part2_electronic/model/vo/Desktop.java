package com.kh.chap01_poly.part2_electronic.model.vo;

public class Desktop extends Electronic {

	public static final String CPU = "intel";		// 상수필드
	private String graphic;
	
	
	public Desktop() {}
	
	public Desktop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}
	
	
	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
	
	
	public String graphic() {
		return graphic;
	}
	
	
	public String toString() {
		return super.toString() + ", CPU : " + CPU + ", 그래픽 : "+ graphic;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
