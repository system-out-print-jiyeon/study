package com.kh.part01_objectVSobjectArray.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.part01_objectVSobjectArray.model.vo.Book;

public class ObjectArrayTest2 {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		/*
		Book[] bk = new Book[3];
		
		bk[0] = new Book();
		bk[1] = new Book("�ڹ��� ����", "������", 10000, "KH");
		bk[2] = new Book();
		*/
		
		ArrayList<Book> list = new ArrayList<>(3);
		
		list.add(new Book());
		list.add(new Book("�ڹ��� ����", "������", 10000, "KH"));
		list.add(new Book());
		
		
		
		
		/*
		System.out.println(bk[0].information());
		System.out.println(bk[1].information());
		System.out.println(bk[2].information());
		*/
		// = ���� ���� �ݺ������� ���̱�
		/*
		for(int i=0; i<bk.length; i++) {
			System.out.println(bk[i].information());
		}
		*/
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).information());
		}
		
		
		
		list.clear();
		
		// ����ڿ��� �� �Է¹ޱ�
		
		Scanner sc = new Scanner(System.in);
		
		
		// 1. ��ü ���� ���� �Է¹ޱ�
		
		for(int i=0; i<3; i++) {
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
			
			// ����ó�� �ʿ���� �ش� �ε����� ���� ��ü �����ǵ���
			//bk[i] = new Book(title, author, price, publisher);
			list.add(new Book(title, author, price, publisher));
				
		}
		
		// 2. ��ü ���� ���� ����ϱ�
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).information());
		}
		
		
		// 3. ���� ���� �˻��ϱ�
		
		System.out.print("�˻��� å ���� : ");
		String search = sc.nextLine();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(search)) {
				System.out.println(list.get(i).information());
			}
		}
		
		
		
		
	} 
	
}
