package com.kh.operator;

public class D_Comparison {
	/*
	 *  * �񱳿����� (���迬����) (���׿�����)
	 *  
	 *  - �� ���� ���ϴ� ������
	 *  - ���� ���� ���̸� true, �����̸� false
	 *  ��, �񱳿����� ������ ������� ����
	 *  
	 *  a < b : a�� b���� �۳�?
	 *  a > b : a�� b���� ũ��?
	 *  a <= b : a�� b���� �۰ų� ũ��?
	 *  a >= b : a�� b���� ũ�ų� �۳�?
	 *  
	 *  a == b : a�� b�� ����?
	 *  a != b : a�� b�� �����ʳ�? => !(a == b)
	 * 
	 */
	
	public void method1() {
		
		int a = 10;
		int b = 25;
		//int a =10, b = 25; // �� �ٿ� �����ĵ� ������ �ǳ�, ������� X
		
		System.out.println("a == b : " + ( a == b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a > b : " + (a > b));
		
		System.out.println("a != b : " + (a != b));
		
		boolean result = (a >= b);
		System.out.println("result : " + result);
		
		// �������  + �񱳿���
		
		// a�� ¦���Դϱ�?
		System.out.println("a�� ¦���ΰ� : " + (a % 2 == 0));
		System.out.println("b�� ¦���ΰ� : " + (b % 2 == 0));
		
		System.out.println("a�� Ȧ���ΰ� : " + (a % 2 == 1));
		System.out.println("b�� Ȧ���ΰ� : " + (b % 2 == 1));
		
		System.out.println(a + b > 30);
		
		// ��  % 2 == 0 == ¦��
		// ��  % 2 == 1 == Ȧ��

	}
	
	
	
	
	
}
