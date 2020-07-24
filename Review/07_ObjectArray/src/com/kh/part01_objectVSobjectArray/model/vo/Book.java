package com.kh.part01_objectVSobjectArray.model.vo;

public class Book {

	private String title;			// 도서명
	private String author;			// 저자명
	private int price;				// 가격
	private String publisher;		// 출판사
	
	// 기본생성자
	public Book() {}
	
	// 매개변수생성자(모든필드 초기화할 수 있는)
	public Book(String title, String author, int price, String publisher) {
		this.title=title;
		this.author=author;
		this.price=price;
		this.publisher=publisher;
	}
	
	
	// setter 메소드
	
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
	
	
	
	// getter메소드
	
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
	
	// information메소드
	public String information() {
		return "제목 : " + title + ", 저자 : " + author + ", 가격 : " + price + ", 출판사 : " + publisher;
	}


	
}
