package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {
	
	private String brand;		// �귣���
	private String pCode;		// ��ǰ��ȣ
	private String pName;		// ��ǰ��
	private int price;			// ����
	private boolean allInOne;	// ��ü���� (��ü���̸� true, ��ü���̾ƴϸ� false)
	
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
		return "�귣��� : " + brand + ", ��ǰ��ȣ : " + pCode + 
			 ", ��ǰ�� : " + pName + ", ���� : " + price + "��, ��ü���� : " + allInOne;
	}
	

}
