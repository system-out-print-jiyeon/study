package com.kh.first;

public class B_ValuePrinter { // com.kh.first.B_ValurPrinter
	/*
	 *  **��Ģ**
	 *  1. Ŭ������ --> �빮�ڷ� ����
	 *  2. ��Ű���� --> �ҹ��ڷ� ����
	 *  3. �޼ҵ�� --> �ҹ��ڷ� ����
	 *  4. ������    --> �ҹ��ڷ� ����
	 *  
	 *  ��, �������� �ܾ ���� ���� �ܾ� ���ڸ����� �빮�ڷ�!! == ��Ÿǥ��� CamelCase (�����ڰ��� ����)
	 *  ����������
	 *  
	 *  ex) Ŭ������ Methodprinter	=> MethodPrinter
	 *  	�޼ҵ�� printvalue		=> printValue
	 *  
	 *  �׸��� �׻� �ǹ��ְ� �̸�����!
	 */

	
	// �پ��� ������ ������ ����ϴ� ����� �޼ҵ�
	public void printValue() {
		
		// 1. ������� --> ����ǥ ����
		System.out.println(7591); // ������ ���
		System.out.println(7.591); // �Ǽ��� ���
		
		// 2. ����(�ѱ���) --> Ȭ����ǥ �̿�
		System.out.println('a');
		System.out.println('b');
		
		// 3. ���ڿ�(��������) --> �ֵ���ǥ �̿�
		System.out.println("�ȳ�\n�ϼ���");	// �ٹٲٱ� ���๮�� \n 
		System.out.println("�ݰ����ϴ�");
		
		// 4. ������ ������� ��°���
		System.out.println(123 + 456);
		System.out.println(1.23 - 0.12); // ��ǻ�Ϳ����� �Ǽ��������� �ҿ����ؼ� ������ ���� �� �ִ�.
		
		// 5. ���ڿ� ���ڴ� ���� ���� (Ư�����̽�)
		System.out.println('a' + 1); // �� ���ڸ��� ��ǻ�Ͱ� �ν��ϴ� ������ ���ڰ��� ������ ���� ( a == 97, b == 98)

		// 6. ���ڿ�("")
		System.out.println("����" + 'a');
		System.out.println('a' + "����");
		System.out.println("�ȳ��ϼ���" + 123);
		System.out.println("�ݰ���" + "������");
	}
	
	// ���ڿ��� ���ڰ��� ���� ���� ��ɿ� �޼ҵ�
	public void sumStringNumber() {
		
		System.out.println(9 + 9);		// 18
		System.out.println(9 + "9");	// "99"
		System.out.println("9" + 9);	// "99"
		
		
		System.out.println(9 + 9 + "9");	// 18 + "9" = "189"
		System.out.println(9 + "9" + 9);	// "99" + 9 = "999"
		System.out.println("9" + 9 + 9);	// "99" + 9 = "999"
		System.out.println("9" + (9 + 9));	// "9" + 18 = "918"
		
		// ���꿡�� ������ �ִ�!	=>	������ ���� �Ǵ� ������� �����ϸ� ����.
		
	}
	
	
}
