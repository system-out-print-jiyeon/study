package com.kh.first;	//��Ű�� ����� : �ش� Ŭ������ � ��Ű���� ���� �ִ���

public class A_MethodPrinter {//Ŭ�������� �빮�ڷ� ����!!
	
	// ��ɴ��� == �޼ҵ�
	// Ŭ�������� ������ ���� �޼ҵ带 ������ �ʿ� ����!
	
	// �Ϲݸ޼ҵ� : public void methodA()
	public void methodA() {// �޼ҵ���� �ҹ��ڷ� ����!
		System.out.println("��ع����ѽ�");
		methodB(); // ���� Ŭ���� �� �޼ҵ� ȣ��� �ٷ� �׳� �޼ҵ��();
	}

	public void methodB() {
		System.out.println("��������");
		methodC();
	}
	
	public void methodC() {
		System.out.println("���� �߰���");
		//methodA(); <-- �ּ� Ǯ�� A,B,C ���ѹݺ����
	}



}
