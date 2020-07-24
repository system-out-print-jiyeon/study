package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		
		p1.setProductId("ssgnote9");
		p1.setProductName("�����ó�Ʈ9");
		p1.setProductArea("��⵵ ����");
		p1.setPrice(960000);
		p1.setTax(10.0);
		
		System.out.println(p1.information());

		
		Product p2 = new Product();
		
		p2.setProductId("lgxnote5");
		p2.setProductName("LG����Ʈ��5");
		p2.setProductArea("��⵵ ����");
		p2.setPrice(780000);
		p2.setTax(0.7);
		
		System.out.println(p2.information());
		
		
		Product p3 = new Product();
		
		p3.setProductId("ktsnote3");
		p3.setProductName("KT����Ʈ��3");
		p3.setProductArea("����� ����");
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
		
		// �������� = ����  + (����*�ΰ�����)
		
		
		p1.setPrice (p1.getPrice() + (int)(p1.getPrice()*p1.getTax()) );
		p2.setPrice (p2.getPrice() + (int)(p2.getPrice()*p2.getTax()) );
		p3.setPrice (p3.getPrice() + (int)(p3.getPrice()*p3.getTax()) );
		
		
		System.out.println("��ǰ�� = " + p1.getProductName());
		System.out.println("�ΰ��� ���� ���� = " + p1.getPrice());
		
		System.out.println("��ǰ�� = " + p2.getProductName());
		System.out.println("�ΰ��� ���� ���� = " + p2.getPrice());
		
		System.out.println("��ǰ�� = " + p3.getProductName());
		System.out.println("�ΰ��� ���� ���� = " + p3.getPrice());
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
