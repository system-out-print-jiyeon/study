package com.kh.part01_objectVSobjectArray.model.vo;

public class Book {

	private String title;			// ������
	private String author;			// ���ڸ�
	private int price;				// ����
	private String publisher;		// ���ǻ�
	
	// �⺻������
	public Book() {}
	
	// �Ű�����������(����ʵ� �ʱ�ȭ�� �� �ִ�)
	public Book(String title, String author, int price, String publisher) {
		this.title=title;
		this.author=author;
		this.price=price;
		this.publisher=publisher;
	}
	
	
	// setter �޼ҵ�
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	
	// getter�޼ҵ�
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public String getPublisher() {
		return publisher;
	}
	
	// information�޼ҵ�
	public String information() {
		return "���� : " + title + ", ���� : " + author + ", ���� : " + price + ", ���ǻ� : " + publisher;
	}


	
}
