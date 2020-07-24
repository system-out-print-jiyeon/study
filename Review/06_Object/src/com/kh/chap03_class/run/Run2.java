package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Product;

public class Run2 {

	public static void main(String[] args) {
		
		// °´Ã¼ »ý¼º
		Product p1 = new Product();
		
		System.out.println(p1.hashCode());
		System.out.println(p1.information());
		
		p1.setpName("°¶·Ï½Ã");
		p1.setPrice(10000000);
		p1.setBrand("»ù¼Û");
		
		System.out.println(p1.information());
		
		
		
		Product p2 = new Product();
		
		p2.setpName("¾ÆÀÌÆþ");
		p2.setPrice(13000000);
		p2.setBrand("¾Ö»Ü");
		
		System.out.println(p2.information());

		
		
		Product p3 = new Product("º§ºª", 1500000, "ÇïÁö");
		
		System.out.println(p3.information());
		
		
		
		

	}

}
