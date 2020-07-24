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
		return "���� : " + title + ", ���� : " + author + ", ���� : " + price + "��";
	}
	
	
	/*
	 * * �������̵�
	 * - �ڽ�Ŭ������ ��ӹް��ִ� �θ� Ŭ������ �޼ҵ鸦 ������(���ۼ�) �ϴ� ��
	 * - �θ� �����ϴ� ���޼ҵ带 �ڽ��� �Ϻ� ���ļ� ����ϰڴٴ� �ǹ�
	 * 	  �ڽ� ��ü�� ���� �ش� �޼ҵ� ȣ��� �ڽĸ޼ҵ尡 �켱���� ����!!
	 * 
	 * * �������̵� ���� ����
	 * - �θ�Ŭ������ �޼ҵ��� ��ġ�ؾߵ�
	 * - �Ű������� ��ġ�ؾߵ�
	 * - ��ȯ�� ��ġ�ؾߵ�(jdk�������Ǹ鼭 �θ�޼ҵ� ��ȯ���� �ڽ��ڷ�������� ��밡��)
	 * - �θ�޼ҵ��� ���������ں��� ������ ���ų� Ŀ�ߵ�
	 * 	 ex) �θ�޼ҵ��� ���������ڰ� protected�� ��� �������̵� �ϴ��� �޼ҵ��� ���������ڴ� protected, public �̿��ߵ�
	 * 
	 * --> �Ծ��� ������ ������!!
	 * 
	 * * @Override  ������̼�
	 * - ��� ���ص� ũ�� ����� ����!
	 * - ������ ������̼��� ���̴� ����
	 * 	--> �θ� �޼ҵ���̳� �Ű������� �ٸ��� ������� ��� ���� �߻�
	 * 	--> ���� �� �޼ҵ尡 �������̵� �� �޼ҵ�� ��� �� �˸��� ���ؼ�
	 * 
	 */
	
	
	// objectŬ������ �ִ� toString �޼ҵ� �������̵�(������)
	@Override
	public String toString() {
		return "���� : " + title + ", ���� : " + author + ", ���� : " + price + "��";
	}
	
	
	
	// Object Ŭ������ �ִ� equals �޼ҵ� �������̵�(������)
	// �ּҰ� �񱳰� �ƴ� ���� �ʵ尪���� ��� ���� ��� true ����
	// �ϳ��� ��ġ���� ������ false ����
	@Override
	public boolean equals(Object obj) {
		
		//			bk1.equals(bk3)
		//		this(����ü)  vs  obj(���޹��� ���� ��� ��ü)
		
		// �ڷ���		Book		Object
		Book other = (Book)obj;
		
		// 		this(����ü)  vs  other(���� ���ü)
		
		//  this.title.equals(other.title)
		//  this.author.equals(other.author)
		//  this.price == other.price
		if(this.title.equals(other.title) && this.author.equals(other.author) && this.price==other.price) {
			return true;
		}else {
			return false;
		}	
		
	}
	
	
	// ObjectŬ������ �ִ�  hashCode �޼ҵ带 ������ (�������̵�)
	// �ּҰ��� ������ 10������ ���·� �����°� �ƴ�
	// ���� �ʵ尪�� ������ �ؽ��ڵ带 �����Բ�
	@Override
	public int hashCode() {
		
		// bk1.hashCOde()	--> "������ ����������10000"
		// bk3.hashCode()	--> "������ ����������10000"
		
		// �ش簴ü�� �ʵ尪���� �ϳ��� ���ڿ��� ���ļ� �ش� ���ڿ��� �ؽ��ڵ带 ��������!
		// title + author + price 			--> ���ڿ�(String)
		
		return (title + author + price).hashCode();
		
	}
	
	
	
	
	

}
