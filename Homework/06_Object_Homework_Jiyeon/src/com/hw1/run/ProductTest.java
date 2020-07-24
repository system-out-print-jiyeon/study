package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		
		p1.setProductId("ssgnote9");
		p1.setProductName("갤럭시노트9");
		p1.setProductArea("경기도 수원");
		p1.setPrice(960000);
		p1.setTax(10.0);
		
		System.out.println(p1.information());

		
		Product p2 = new Product();
		
		p2.setProductId("lgxnote5");
		p2.setProductName("LG스마트폰5");
		p2.setProductArea("경기도 평택");
		p2.setPrice(780000);
		p2.setTax(0.7);
		
		System.out.println(p2.information());
		
		
		Product p3 = new Product();
		
		p3.setProductId("ktsnote3");
		p3.setProductName("KT스마트폰3");
		p3.setProductArea("서울시 강남");
		p3.setPrice(250000);
		p3.setTax(0.3);
		
		System.out.println(p3.information());
		
		
		System.out.println("====================================================");
		
		p1.setPrice(1200000);
		p2.setPrice(1200000);
		p3.setPrice(1200000);
		
		p1.setTax(0.05);
		p2.setTax(0.05);
		p3.setTax(0.05);
		
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		
		System.out.println("====================================================");
		
		// 실제가격 = 가격  + (가격*부가세율)
		
		
		p1.setPrice (p1.getPrice() + (int)(p1.getPrice()*p1.getTax()) );
		p2.setPrice (p2.getPrice() + (int)(p2.getPrice()*p2.getTax()) );
		p3.setPrice (p3.getPrice() + (int)(p3.getPrice()*p3.getTax()) );
		
		
		System.out.println("상품명 = " + p1.getProductName());
		System.out.println("부가세 포함 가격 = " + p1.getPrice());
		
		System.out.println("상품명 = " + p2.getProductName());
		System.out.println("부가세 포함 가격 = " + p2.getPrice());
		
		System.out.println("상품명 = " + p3.getProductName());
		System.out.println("부가세 포함 가격 = " + p3.getPrice());
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
