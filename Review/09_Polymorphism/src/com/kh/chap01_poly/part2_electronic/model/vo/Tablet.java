package com.kh.chap01_poly.part2_electronic.model.vo;

public class Tablet extends Electronic {

	private boolean penFlag;
	
	public Tablet() {}
	
	public Tablet(String brand, String name, int price, boolean penFlag) {
		super(brand, name, price);
		this.penFlag = penFlag;
	}
	
	public void setPenflag(boolean penFlag) {
		this.penFlag = penFlag;
	}
	
	public boolean isPenFlag() {
		return penFlag;
	}
	
	public String toString() {
		return super.toString()+ ", pen유무 : " + (penFlag ? "있음" : "없음");	// ★삼항연산자
	}
	
}
