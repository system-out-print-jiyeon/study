package com.kh.chap02_string.controller;

public class D_BuilderBufferTest {
	

	/*
	 * * String Ŭ���� == �Һ�Ŭ���� (���ڸ����� �ٷ� ���� ����Ǵ°� �ƴ� ����)
	 * 	 --> ����ϰ� ���� ������ ��� �������÷���(GC)�� ��� ������ ������ ������ߵǴ� ����
	 * 	 --> ������ ���� �б⸸ �� ��� String Ŭ������ ����
	 * 
	 *  * StringBuilder, StringBuffer == ����Ŭ���� (���ڸ����� ���� ����Ǵ� ����)
	 *   - StringBuilder, StringBuffer ��� �����ڳ� �����ϰ��ִ� �޼ҵ� ������!!
	 *   - ������ �������� ����ȭ�� �ǳ� �ȵǳ��� ���� --> ��, �ӵ�����
	 *   
	 *   > StringBuilder = ����ȭ ���� X
	 *   > StringBuffer  = ����ȭ ���� O
	 * 
	 * 	* ������ : �ϳ��� ���� ����
	 *   ��Ƽ ������ ȯ�� (�������� ��ó���� �����ؼ� ���ôٹ������� �����ϴ� ȯ��) -> ����ȭ ó���� �Ǵ� �ɷ� �����ؾ� ���� --> StringBuffer ����
	 *   ���� ������ ȯ�� -> ������ ����ȭ �۾��� �ϰ� �Ǹ� �ӵ� ���ϰ� �߻��� �� ���� --> StringBuilder�� ����
	 * 
	 */
	
	
	
	public void method1() {
		
		// StringBuilder, StringBuffer ��ü ������ ó���� 16���� ���ڵ��� ������ �� �ִ� ���۰� ���������� ����
		
		// 1. �⺻�����ڷ� ����
		StringBuilder sb1 = new StringBuilder();
		
		System.out.println("sb1�� ���뷮 : " + sb1.capacity());
		System.out.println("sb1�� ���ڿ��� ���� : " + sb1.length());
		
		System.out.println("========================");
		
		
		// 2. ������ ���ް����� �Ű����������ڷ� ����		--> ������ ������ ũ�⸸ŭ�� ���뷮�� ������
		StringBuilder sb2 = new StringBuilder(30);
		
		System.out.println("sb2�� ���뷮 : " + sb2.capacity());
		System.out.println("sb2�� ���ڿ��� ���� : " + sb2.length());
		
		System.out.println("========================");
		
		
		// 3. ���ڿ� ���ް����� �Ű����� �����ڷ� ����
		StringBuilder sb3 = new StringBuilder("�ݰ���!!");
		
		System.out.println("sb3�� ���뷮 : " + sb3.capacity());		// (�⺻�� : 16��) + (������ ���ڿ��� ���� : 5) => 21
		System.out.println("sb3�� ���ڿ��� ���� : " + sb3.length());
	
	
	}
	
	
	public void method2() {
		// �Һ����� �������� �ּҰ� ����
		
		// String Ŭ���� ������ �Һ��ΰ�
		String str = "�ݰ���!";		// ���ͷ����̶� Heap���� ���� StringPool������ �� 
		System.out.println(System.identityHashCode(str));
		
		str += "�� String�̾�"; // str = str + "�� String�̾�";
						      // str = "�ݰ���!�� String�̾�";  --> �� �ٸ� ���ͷ����̱� ������
						      // ������ ���� �������� ���ο� �ּҰ� ���
		System.out.println(System.identityHashCode(str));
		
		System.out.println("========================");
		
		
		// StringBuilder �����ΰ�
		StringBuilder sb = new StringBuilder("�ݰ���!");
		
		System.out.println("sb : " + sb);
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		System.out.println("���뷮 : " + sb.capacity());	// 16 + 4 = 20
		System.out.println("���ڿ��� ���� : " + sb.length());
		
		System.out.println("========================");
		
		
		// StringBuilder ��� ���ڿ��� �����ϰ��� �� ���� �޼ҵ带 ���ؼ� �۾��ؾߵ�
		
		// 1. append(String str) : (��ȯ���� )StringBuilder		--> ������ ���ڿ��� ���ο� ���ڿ� �߰��ϰ� ���� ��
		sb.append("�ȳ�!");
		
		System.out.println("������ sb : " + sb);
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		System.out.println("���뷮 : " + sb.capacity());	
		System.out.println("���ڿ��� ���� : " + sb.length());
		// �ּҰ� ���� ���� == ���ڸ����� ���ڿ� ���� == ����
		
		
		System.out.println("========================");
		
		sb.append("�ٵ� ���ݸ� ��������!!!");	// 14����
		System.out.println("������ sb : " + sb);
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		System.out.println("���뷮 : " + sb.capacity());	// ������ ���뷮 * 2 + 2 �Ѹ�ŭ �˾Ƽ� �þ
		System.out.println("���ڿ��� ���� : " + sb.length());
		
		
		System.out.println("========================");
		
		// 2. delete(int start, int end) : StringBuilder		--> ���ڿ� �����ϱ� (start <=   <end)
		sb.delete(2, 5);	// ��   ��
		
		System.out.println("������ sb : " + sb);
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));	 // ���ڿ� �����ص� �ּҰ� ����
		System.out.println("���뷮 : " + sb.capacity());  // ���ڿ� �����ص� ���뷮 �پ���� ����!!
		System.out.println("���ڿ��� ���� : " + sb.length());
		
		
		System.out.println("========================");
		
		// 3. insert(int offset, String str) : StringBuilder      offset�� �ε������ ���� ��      --> ������ ���ڿ� ���̿� �Ǵٸ� ���ڿ� �߰��ϱ�
		sb.insert(1, "������");
		
		System.out.println("������ sb : " + sb);
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));		// �ּҰ���
		System.out.println("���뷮 : " + sb.capacity());					// ���뷮�� ���� ����
		System.out.println("���ڿ��� ���� : " + sb.length());
		
		
		System.out.println("========================");
		
		// 4. reverse() : StringBuilder		--> ������ ���ڿ��� ������ �ٲٰ��� �� ��
		sb.reverse();
		
		System.out.println("������ sb : " + sb);
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));		// �ּҰ���
		System.out.println("���뷮 : " + sb.capacity());					// ���뷮�� ���� ����
		System.out.println("���ڿ��� ���� : " + sb.length());
		
		System.out.println("========================");
		
		
		
		// �޼ҵ�ü�̴��ϱ�  		--> �����ؼ� �ѹ��� ���
		sb.append("������").delete(0, 4).reverse().insert(2, "������");
		
		System.out.println("������ sb : " + sb);
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		System.out.println("���뷮 : " + sb.capacity());	
		System.out.println("���ڿ��� ���� : " + sb.length());
		
	}
	
	public void method3() {
		StringBuilder sb = new StringBuilder("javaProgram");
		
		sb.append("API").delete(4, 11).reverse();
		// javaProgramAPI
		//				javaAPI
		//								IPAavaj
		
		System.out.println(sb);
		
	}
	
	
	
	
	
	
	
	
	
}
