package com.kh.variable;

public class E_Overflow {
		
	
	public void overflow() {
		// byte �ڷ����� ���� ������ ���� : -128 ~ 127
	
		
		//byte bNum = 128; // ��������� ������ ����� ���� ���ý� ������ ��!
	
	byte bNum = 127; // byte �ִ밪
	
	bNum++; // bNum�� ��� �� 1������Ű�ڴ�!!
	bNum++; 
	
	// 1 ..... 126 127 -128 -127 -126 ...
	
	System.out.println("bNum : " + bNum);
	
	// ����� ���� ������ ���� ������ ����� �� �����÷ο��� ��!!
	// ������ ���� ����!! �� ���� �Ұ��� ���� ��� �� �ִ�!!
	
	}
	
	
}
