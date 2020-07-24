package com.hw2.model.vo;

public class Book {
	
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	
	public Book() {}
	
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
		
	}
	
	
	// setter
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	// getter 
	
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	
	public String getAuthor() {
		return author;
	}
	
	
	
	// information
	
	public String information() {
		return title + "     " + price + "     " + discountRate + "     " + author ;
	}
	
	
	
	
	

}
