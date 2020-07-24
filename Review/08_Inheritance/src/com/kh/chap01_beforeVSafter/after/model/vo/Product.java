package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {

	private String brand;		// �귣���
	private String pCode;		// ��ǰ��ȣ
	private String pName;		// ��ǰ��
	private int price;			// ����
	
	// ���ʻ�����
	public Product() {}
	
	
	// �Ű����� ������
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
		return "�귣��� : " + brand + ", ��ǰ��ȣ : "+ pCode + ", ��ǰ�� : "+ pName + ", ���� : " + price + "��";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
