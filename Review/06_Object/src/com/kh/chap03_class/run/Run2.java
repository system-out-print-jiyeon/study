package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Product;

public class Run2 {

	public static void main(String[] args) {
		
		// ��ü ����
		Product p1 = new Product();
		
		System.out.println(p1.hashCode());
		System.out.println(p1.information());
		
		p1.setpName("���Ͻ�");
		p1.setPrice(10000000);
		p1.setBrand("����");
		
		System.out.println(p1.information());
		
		
		
		Product p2 = new Product();
		
		p2.setpName("������");
		p2.setPrice(13000000);
		p2.setBrand("�ֻ�");
		
		System.out.println(p2.information());

		
		
		Product p3 = new Product("����", 1500000, "����");
		
		System.out.println(p3.information());
		
		
		
		

	}

}
