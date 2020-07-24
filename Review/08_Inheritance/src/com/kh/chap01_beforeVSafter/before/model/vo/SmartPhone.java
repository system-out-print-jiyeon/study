package com.kh.chap01_beforeVSafter.before.model.vo;

public class SmartPhone {
	
	private String brand;		// �귣���
	private String pCode;		// ��ǰ��ȣ
	private String pName;		// ��ǰ��
	private int price;			// ����
	private String mobileAgency;// ��Ż�
	
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
		return "�귣��� : " + brand + ", ��ǰ��ȣ : " + pCode + 
				 ", ��ǰ�� : " + pName + ", ���� : " + price + "��, ��Ż� : " + mobileAgency;
	}

}
