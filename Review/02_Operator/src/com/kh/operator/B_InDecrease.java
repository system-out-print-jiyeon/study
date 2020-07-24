package com.kh.operator;

public class B_InDecrease {

	
	/*
	 * * ���������� (���׿�����)
	 * 
	 * ++ : ���� 1������Ű�� ������
	 * -- : ���� 1���ҽ�Ű�� ������
	 * 
	 * (����������)�� : ���� ������		--> ������ ��ó��
	 * ��(����������) : ���� ������ 		--> ��ó�� ������
	 */
	
	public void method1() {
		
		// ���� ���� �׽�Ʈ
		int num1 = 10;
		
		System.out.println("�������� ���� �� num1�� �� : " + num1); // num1 = 10 ���
		System.out.println("1ȸ ���� �� ��� : " + ++num1); // num1 = 11 ���
		System.out.println("2ȸ ���� �� ��� : " + ++num1); // num1 = 12 ���
		System.out.println("�������� ���� �� num1�� �� : " + ++num1); // num1 = 12 ���
		
		System.out.println("==============================");
		
		int num2 = 10;
		
		System.out.println("�������� ���� �� num2�� �� : " + num2);	// num2 = 10 ���
		System.out.println("1ȸ ���� �� ��� : " + num2++);	// num2 = 10 ��� �� --> 11�� ����
		System.out.println("2ȸ ���� �� ��� : " + num2++);	// num2 = 11 ��� �� --> 12�� ����
		System.out.println("�������� ���� �� num2�� �� : " + num2);	// num2 = 12 ���

	}

	public void method2() {
		
		// ��������
		int a = 10;
		int b = ++a; // a = 11,	b =	11	
		System.out.println("a : " + a + ", b : " + b);
		
		// ��������
		int c = 10;
		int d = c++;	// c=10(11) d=10
		
		System.out.println("c : " + c + "d : " + d);
		
		int num1 =20;
		int result1 = num1++ * 3; // num1=20(21) result=20*3=60
		System.out.println("num : " + num1);
		System.out.println("result : " + result1);
		
		int num2 = 20;
		int result2 = ++num2 * 3; // num2=21	result=21*3=63
		System.out.println("num2 : " + num2);
		System.out.println("result2 : " + num2);
		
	}
	
	public void method3() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++);	// a=10(11)		--> 10���
		
		System.out.println((++a) + (b++)); // a=12 b=20(21)		--> 32���
		
		System.out.println((a++) + (--b) + (--c)); // a=12(13) b=20 c=29	--> 61���
		
		
		System.out.println("a : " + a);		// a=13
		System.out.println("b : " + b);		// b=20
		System.out.println("c : " + c);		// c=29

	}
	
	public void method4() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++);
		
		System.out.println((++a) + (b++));
		
		System.out.println((a++) + (--b) + (--c));
		
		
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);

	}
	
	public void method5() {
		
		int a = 10;
		int b = 10;
		int c = 20;
		
		System.out.println(++a - --b);	// a=11 b=9 --> 2
		
		System.out.println(--b + c++);	// b=8 c=20(21) -->28
		
		System.out.println(a++ + b-- * c++);	// a=11(12) b=8(7) c=21(22)
												// 11 + 168 --> 179
		
		
		System.out.println("a : " + a);	// a=12
		System.out.println("b : " + b);	// b=7
		System.out.println("c : " + c);	// c=22
		
		
		
		
	}
	
	
	
}
