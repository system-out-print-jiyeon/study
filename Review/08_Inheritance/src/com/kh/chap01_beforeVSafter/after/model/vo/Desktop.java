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
	
	
	// ������ == �������̵�
	// �θ�Ŭ�������� �ְ� �ڽ�Ŭ�������� ������ �޼ҵ� ���� �� �ڽ�Ŭ�����޼ҵ尡 �켱���� ����!!
	public String information() {
		return super.information() + ", ��ü���� : " + allInOne;
	}
	
	
	
	
	
	
	
	
	
}
