package com.kh.variable;

public class D_Casting {
	
	// ����ȯ : ���� �ڷ����� �ٲٴ� ��!
	/*
	 *  * ��ǻ�Ϳ����� �� ó�� ��Ģ (��, ����ȯ�� �ʿ��� ��Ȳ!)
	 *  1. ���� �ڷ����� ������ ���Ե�!
	 *  	--> ��, �ٸ� �ڷ����� ���� �����ϰ��� �Ѵٸ� ����ȯ�� �ʼ�!
	 *  		�ڷ��� ������ = (�ٲ��ڷ���)��;
	 *  
	 *  2. ���� �ڷ��������� ���� (�Ӹ� �ƴ϶� �� ����� ���� �ڷ�������!)
	 *  	��+��
	 *  
	 *  * ����ȯ ����
	 *  1. �ڵ� ����ȯ : �ڵ����� ����ȯ�� �Ǳ� ������ ��������� ����ȯ ������ �ʿ����!!
	 *  2. ���� ����ȯ : ���� ����ȯ�ؾߵ�! (����� ����ȯ)
	 *  	[ǥ����]	(�ٲ��ڷ���)��;
	 *  
	 *  *���ǻ���
	 *  boolean�� ����ȯ�� �Ұ�!! ������ true / false�� ������ ���� �� ����
	 *  
	 */
	
	// 1. �ڵ�����ȯ (���� �ڷ����� ū �ڷ������� �ڵ� ����ȯ ��)

	public void casting1() {
		
		// ���� �ڷ��� --> ū �ڷ���
		
		// 1. int(4byte) --> double(8byte)
		int i1 = 12;
		
		// > ���Կ���
		double d1 = /*(double)*/ i1;	// 12 --> 12.0
		System.out.println("d1 : " + d1);
		
		// > ��� (�������)
		int i2 = 12;
		double d2 = 3.3;
		
		double result2 = /*(double)*/i2 + d2 ;	// 12 + 3.3 => 12.0 + 3.3 => 15.3
		System.out.println("result2 : " + result2);
		
		
		System.out.println("=====================");
		
		// 2. float(4byte) --> double(8byte)
		float f3 = 1.0f;
		double d3 = /*(double)*/ f3;
		
		System.out.println("f3 : " + f3);
		System.out.println("d3 : " + d3);
		
		// 3. int(4byte) --> long(8byte)
		int i4 = 3333;
		long l4 = /*(long)*/i4;
				
		System.out.println(/*(long)*/i4 + l4);
		
		
		// 4. long(8byte) --> float(4byte) 			*Ư�����̽�*
		//		������			�Ǽ���
		// **�Ǽ����� ��� �������ٵ� �ξ� �� ū ������ ���� ������ �� ����!!
		long l5 = 1000000000L; // ���� int(4byte)�� �ν��ϱ� ������ L�������� 	��-->ū (�ڵ�����ȯ)
		float f5 = /*(float)*/l5;
		
		System.out.println("f5 : " + f5);
		
		// byte(1) --> short(2) --> int(4) --> long(8) --> float(4) --> double(8)
		
		
		
		
		
		// *Ư�����̽�*
	
		// 1. char(2byte) <--> int(4byte)  �ֹ�
		//	����				����
		
		// 'a' '!' '��' 'A' '~' => ��� ���ڸ��� ������ ���ڰ��� �ִ�!!
		char ch = /*(char)*/65;	// 65 == 'A'	66 =='B'	67=='C'
		System.out.println("ch : " + ch);
		
		int num = /*(int)*/'A';
		System.out.println("num : " + num);
				
		
		// 2. byte, short�� ���� 		==> ���̼� �����ϸ� int�� ��޵�
		byte b1 = 1;
		byte b2 = 10;
		
		byte result = (byte)(b1 + b2);	// �����߻�
		System.out.println("result : " + result);
				
	}

	public void casting2() {
		// ��������ȯ : ū ũ���� �ڷ����� ���� ũ���� �ڷ������� �ٲٴ� ��
		
		//double(8byte) --> float(4byte)
		double d = 4.0;
		float f = (float)d;
		
		// double(8byte)  --> int(4byte)
		double d2 = 162.3;
		int i2 = (int)d2;	// ������ �ս� �߻�!
				
		System.out.println("i2 : " + i2);
		
		int iNum = 10;
		double dNum = 5.89;
		
		
		//int iSum = iNum + dNum;	// (double)10 + 5.89 => 10.0 + 5.89 => 15.89 (�����: double��)
									// ������(int)�� ū��(double)�� �����༭ ���������� �ߵǳ� double�� ������� int�ڽ��� ������ �ؼ� ����!
		
		// �ذ���1. ���������� int������ ��������ȯ���� �� ���
		int iSum = (int) (iNum + dNum);	// ��������ȯ �ϰ� �Ǹ� �Ҽ��� �Ʒ��κ��� �������� (������ �ս� �߻�!)
		System.out.println("iSum : " + iSum);
		
		// �ذ���2. double���� int������ ��������ȯ �� �� ��������ǰ�
		int iSum2 = iNum + (int)dNum;	// 10 + (int)5.89 => 10 + 5 => 15	�ᱹ ������ �ս��� �߻�!!
		System.out.println("iSum : " + iSum);
		
		// �ذ���3. �������� double�� ������ ����ϱ�!
		double dSum = iNum + dNum;
		System.out.println("dsum : " + dSum);
		
	}
	
	
	
	
}
