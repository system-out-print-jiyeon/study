package com.kh.part01_objectVSobjectArray.run;

import java.util.Scanner;

import com.kh.part01_objectVSobjectArray.model.vo.Book;

public class ObjectTest {

	public static void main(String[] args) {
		
		Book bk1 = new Book();									// �⺻������
		Book bk2 = new Book("�ڹ��� ����", "������", 10000, "KH");	// �Ű�����������
		Book bk3 = new Book();
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		
		// ����ڿ��� �� �Է¹ޱ� (���� ���� 3���� ���س��´ٴ� ������)
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {	// ��3��
			System.out.println(i+1 + "��° ����");
			
			System.out.print("������ : ");
			String title = sc.nextLine();
			
			System.out.print("���� : ");
			String author = sc.nextLine();
			
			System.out.print("���� : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("���ǻ� : ");
			String publisher = sc.nextLine();
			
			// ����ó�� ������ ����ߵ�..(100���� 100�� ��ߵ�)
			if(i == 0) {
			bk1 = new Book(title, author, price, publisher);		// �Ű����������� �̿�
			}else if(i == 1) {
			bk2 = new Book(title, author, price, publisher);	
			}else {
			bk3 = new Book(title, author, price, publisher);	
			}												
		
		}
		
		// 2. ��ü���� ���� ����ϱ�
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		// �ݺ������� ���� ����..
		
		
		// 3. ���� ���� �˻��ϱ�
		
		System.out.print("�˻��� å ���� : ");
		String search = sc.nextLine();
		
		// ���ڿ�.equals(���ڿ�)
		if(bk1.getTitle().equals(search)) {
			System.out.println(bk1.information());
		}
		if(bk2.getTitle().equals(search)) {
			System.out.println(bk2.information());
		}
		if(bk3.getTitle().equals(search)) {
			System.out.println(bk3.information());
		}
		
		// �ݺ����ȵǰ� ������ ���ؾߵ�..
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
