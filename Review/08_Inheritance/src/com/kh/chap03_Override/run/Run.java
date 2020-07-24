package com.kh.chap03_Override.run;

import com.kh.chap03_Override.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book bk1 = new Book("������ ����", "������", 10000);
		Book bk2 = new Book("Ī���� ���� ���߰� �Ѵ�", "��", 20000);
		
		//System.out.println(bk1.information());
		//System.out.println(bk2.information());

		
		
		// * toString()
		// �������̵� �� : Object Ŭ������ toString() ����  --> ǮŬ������ + @ + �ּҰ��� 16������ ��ȯ
		// �������̵� �� : BookŬ������ toString() ���� --> ��� �ʵ尪 �ϳ��� ���ڿ��� ���ļ� ��ȯ
		System.out.println(bk1/*.toString()*/);
		System.out.println(bk2.toString());
		// ��¹����� � ���۷����� ����ϰ��� �� �� JVM�� �ڵ����� �ش� ���۷��� .toString() �޼ҵ� ȣ���������!!
		
		
		// equals(), hashCode() �� ������ �۾��غ� ��!!
		
		Book bk3 = new Book("������ ����", "������", 10000);	// bk1�� ������ �ʵ尪�� ���� bk3��ü ����
		
		System.out.println("bk1�� bk3�� ���� ���Դϱ�? : " + (bk1 == bk3));
		
		// ���۷������� �������� ���� �� equals() �޼ҵ� ��� ����
		
		// �������̵� �� : ObjectŬ������ equals�޼ҵ� --> �� �ּҰ��� ������ ��
		// �������̵� �� : BookŬ������ equals�޼ҵ� --> �� ��ü�� �ʵ尪�� ������ ��	�ڡ� equals ���ڿ����� �� �ƴ�!! ��ü�� �ʵ尪�� ��
		System.out.println("bk1�� bk3�� ���� ���Դϱ�? : " + bk1.equals(bk3));
		
		
		// ���ϰ�ü : �����ʵ尪�鵵 ���� �ؽ��ڵ尪�� ��ġ�� ���
		
		// �������̵� �� : ObjectŬ������ hashCod�޼ҵ� --> "���� �ּҰ��� ���̽�"�� 10������ ����� ��� ��ȯ
		// �������̵� �� : BookŬ������ hashCode�޼ҵ� --> "�� ��ü�� �ʵ尪�� ���̽�"�� �ؽ��ڵ尪 ��ȯ
		System.out.println(bk1.hashCode());
		System.out.println(bk2.hashCode());
		System.out.println(bk3.hashCode());
		
		
		//-----------------------------------------------
		
		//StringŬ����
		//String�� �Ϲ��ڷ��� �ƴ�
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2);		// �ܼ��� �ּҰ� ��
		System.out.println(str1.equals(str2));	// ���������� ������ ���ϰԲ� StringŬ�������� �̹� equals ������ ��
		
		System.out.println(str1/*toString()*/);	// toString�� �̹� ������ ������ ��
		System.out.println(str2/*toString()*/);
		
		System.out.println(str1.hashCode());	// hashCode�� ������ �Ǿ�����
		System.out.println(str2.hashCode());
		
		
		
		
	}

}
