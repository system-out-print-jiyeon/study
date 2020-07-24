package com.kh.chap03_Override.model.vo;

public class Book /*extends Object*/ {
	
	private String title;
	private String author;
	private int price;
	
	public Book() {}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	
	
	public String information() {
		return "제목 : " + title + ", 저자 : " + author + ", 가격 : " + price + "원";
	}
	
	
	/*
	 * * 오버라이딩
	 * - 자식클래스가 상속받고있는 부모 클래스의 메소들를 재정의(재작성) 하는 것
	 * - 부모가 제공하는 ㅁ메소드를 자식이 일부 고쳐서 사용하겠다는 의미
	 * 	  자식 객체를 통해 해당 메소드 호출시 자식메소드가 우선권을 가짐!!
	 * 
	 * * 오버라이딩 성립 조건
	 * - 부모클래스의 메소드명과 일치해야됨
	 * - 매개변수가 일치해야됨
	 * - 반환형 일치해야됨(jdk버전업되면서 부모메소드 반환형의 자식자료형들까지 허용가능)
	 * - 부모메소드의 접근제한자보다 범위가 같거나 커야됨
	 * 	 ex) 부모메소드의 접근제한자가 protected일 경우 오버라이딩 하느느 메소드의 접근제한자는 protected, public 이여야됨
	 * 
	 * --> 규약의 개념이 들어가있음!!
	 * 
	 * * @Override  어노테이션
	 * - 명시 안해도 크게 상관은 없음!
	 * - 하지만 어노테이션을 붙이는 이유
	 * 	--> 부모 메소드명이나 매개변수를 다르게 기술했을 경우 오류 발생
	 * 	--> 단지 이 메소드가 오버라이딩 된 메소드야 라는 걸 알리기 위해서
	 * 
	 */
	
	
	// object클래스에 있는 toString 메소드 오버라이딩(재정의)
	@Override
	public String toString() {
		return "제목 : " + title + ", 저자 : " + author + ", 가격 : " + price + "원";
	}
	
	
	
	// Object 클래스에 있는 equals 메소드 오버라이딩(재정의)
	// 주소값 비교가 아닌 실제 필드값들이 모두 같을 경우 true 리턴
	// 하나라도 일치하지 않으면 false 리턴
	@Override
	public boolean equals(Object obj) {
		
		//			bk1.equals(bk3)
		//		this(현객체)  vs  obj(전달받은 비교할 대상 객체)
		
		// 자료형		Book		Object
		Book other = (Book)obj;
		
		// 		this(현객체)  vs  other(비교할 대상객체)
		
		//  this.title.equals(other.title)
		//  this.author.equals(other.author)
		//  this.price == other.price
		if(this.title.equals(other.title) && this.author.equals(other.author) && this.price==other.price) {
			return true;
		}else {
			return false;
		}	
		
	}
	
	
	// Object클래스에 있는  hashCode 메소드를 재정의 (오버라이딩)
	// 주소값을 가지고 10진수의 형태로 만들어내는게 아닌
	// 실제 필드값을 가지고 해시코드를 만들어내게끔
	@Override
	public int hashCode() {
		
		// bk1.hashCOde()	--> "수학의 정석나수학10000"
		// bk3.hashCode()	--> "수학의 정석나수학10000"
		
		// 해당객체의 필드값들을 하나의 문자열로 합쳐서 해당 문자열의 해시코드를 리턴하자!
		// title + author + price 			--> 문자열(String)
		
		return (title + author + price).hashCode();
		
	}
	
	
	
	
	

}
