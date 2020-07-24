package com.kh.chap01_beforeVSafter.after.model.vo;

public class Desktop extends Product {

	private boolean allInOne;
	
	
	public Desktop() {}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
	}
	
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	
	// 재정의 == 오버라이딩
	// 부모클래스에도 있고 자식클래스에도 동일한 메소드 있을 시 자식클래스메소드가 우선권을 가짐!!
	public String information() {
		return super.information() + ", 일체여부 : " + allInOne;
	}
	
	
	
	
	
	
	
	
	
}
