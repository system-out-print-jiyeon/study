package com.kh.chap03_wrapper.controller;

public class WrapperTest {

	/*
	 * * Wrapper Ŭ����
	 *   --> �⺻�ڷ����� ��ü�� �������ִ� Ŭ������ ����Ŭ����(WrapperŬ����)�̴�.
	 * 
	 * 		�⺻�ڷ���			WrapperŬ����
	 * 		 boolean  <--> 	Boolean
	 * 		  char    <-->  Character		*
	 * 		  byte    <-->  Byte
	 * 		 short    <-->  Short
	 * 		  int     <-->  Integer		 	*
	 * 		 long     <-->  Long
	 * 	     float    <-->  Float
 	 * 		double    <-->  Double
	 * 
	 * 
	 *  - �⺻�ڷ������� ����� �ص� ������ ���α׷��� ���� �ش� �⺻�ڷ����� ��ü�� ����ؾ� �Ǵ� ��� ����
	 *  ex) �޼ҵ� ȣ���ؾߵɶ�
	 * 		�޼ҵ��� �Ű������� �⺻�ڷ����� �ƴ� ��ü Ÿ�Ը��� �䱸�� ��
	 * 		�������� �����Ű�� ���� ��
	 * 
	 */


	public void method1() {
		
		// Boxing : �⺻�ڷ��� --> WrapperŬ���� �ڷ���
		int num1 = 10;
		int num2 = 15;
		
		// 1. ��ü ������ ���� ���
		Integer i1 = new Integer(num1);		// num1 --> i1
		Integer i2 = new Integer(num2);		// num2 --> i2
		
		System.out.println(i1);
		System.out.println(i2);	// (�⺻�ڷ����ƴ� Ŭ�����̱⶧����)�����δ� �ּҰ� ��������� ���������� toString���� �������̵��Ǿ�����
		
		System.out.println(i1 == i2); 	// false 
		
		// ��ü�� �ٲٰ� �Ǹ� (.equals����) �޼ҵ带 �̿밡��
		System.out.println(i1.equals(i2));		// false
		System.out.println(i1.compareTo(i2));	// �� ���� ���ؼ� ������ ũ�� 1��ȯ, ������ ũ�� -1��ȯ, ������ 0��ȯ
		
		
		// 2. ��ü�������� ���� �ʰ� �ٷ� �����ϴ� ��� (AutoBoxing)		--> ���� Ÿ�����θ� ����, ���ڿ��� ���� �Ұ�
		// �ξ� ������
		Integer i3 = num2;	// num2 --> i3
		
		System.out.println(i3);
		
		
		// �ٵ� ���� ��ü������ ���ؼ� ��ȯ�ϳ�?		--> ���ڿ��� Integer Ÿ������ ��ȯ�ϰ��� �� ��
		// Integer i4 = "123";		--> �ȵ�, ����Ÿ���� ��츸 ����
		Integer i4 = new Integer("123");	// "123" --> 123
		System.out.println(i4);
		
		
		// UnBoxing : Wrapper Ŭ���� �ڷ��� --> �⺻�ڷ���
		
		// 1. �ش� Wrapper Ŭ�������� �����ϴ� xxxValue() �޼ҵ带 ����
		
		// i1 --> num3
		int num3 = i1.intValue();		// 10
		int num4 = i2.intValue();		// 15
		
		System.out.println(num3);
		System.out.println(num4);
		
		
		// 2. �޼ҵ���� ������� �ʰ� �ٷ� �����ϴ� ��� (AutoUnBoxing)
		int num5 = i1;	// 10
		
		
	}
	
	
	
	public void method2() {
		
		// �⺻�ڷ��� <--> String
		
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2);	// ���ڿ��� �۾���!!
		
		// 1. String   -->  �⺻�ڷ��� 		: ���ڿ��� �⺻�ڷ�ȭ ��Ű�� �� "�Ľ��Ѵ�" ��� ��
		//		"10"   -->  10
		//		"15.3" -->  15.3
		
		// �ش� WrapperŬ����.parseXXX()���  
		// �������ϴ� Ŭ����.parseŬ�����⺻�ڷ���(��ȯ�ϰ����ϴ� ���ڿ�);		


		int i = Integer.parseInt(str1);			//10
		double d = Double.parseDouble(str2);	//15.3
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(i+d); 		// 25.3
		
		
	
		// 2. �⺻�ڷ���   -->   String
		//		10 	   -->    "10"
		//		15.3   -->    "15.3"
		
		// �⺻�ڷ��� --> Wrapper ��ü  --> String
		//String strI = Integer.valueOf(i).toString();		// "10"
		//String strD = Double.valueOf(d).toString();		// "15.3"
		
		
		// �������� �� ������ ���
		String strI = String.valueOf(i);		// "10"
		String strD = String.valueOf(d);		// "15.3"
		
	
		
		
	}
	
	
	
	
}

