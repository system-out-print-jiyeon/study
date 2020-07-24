package mvc.view;

import java.util.Scanner;

import mvc.controller.LibraryManager;
import mvc.model.vo.Book;
import mvc.model.vo.Member;

public class LibraryMenu {
	
	private LibraryManager lm = new LibraryManager();
	
	private Scanner sc = new Scanner(System.in);
	
	
	public void mainMenu() {
		
		
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� (��/��): ");
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lm.insertMember(mem);
		
		
		while(true) {
			System.out.println("\n==== �޴� ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("0. ���α׷� �����ϱ�");
			
			System.out.print("�޴� ���� : \n");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1: System.out.println(lm.myInfo()); break;
			case 2: selectAll(); break;
			case 3: searchBook(); break;
			case 4: rentBook(); break;
			case 0: System.out.println("���α׷��� �����մϴ�."); return;
			
			}	
		}	
	}
	
	
	
	
	
	/**
	 * 2. ���� ��ü ��ȸ
	 */
	
	public void selectAll() {
		Book[] bList = lm.selectAll();
		System.out.println("\n==== ���� ��ü ��ȸ ====");
		for(int i=0; i<bList.length; i++) {
			System.out.println(i + "��° ���� : " + bList[i]);
		}	
	}
	
	
	/**
	 * 3. ���� �˻�
	 */
	
	public void searchBook() {
		System.out.println("\n==== ���� �˻� ====");
		System.out.println("�˻��� ���� Ű���� : ");
		String keyword = sc.nextLine();
		
		Book[] searchList = lm.searchBook(keyword);
		
		
		/*
		for(Book b : searchList) {
			System.out.println(b);
		}
		*/
		
		for(int i=0; i<searchList.length; i++) {
			
		if(searchList[i] != null) {
			System.out.println(searchList[i]);
		}
		
		}
	}
	
	
	/**
	 * 4. ���� �뿩�ϱ�
	 */
	
	public void rentBook() {
		System.out.println("==== ���� �뿩�ϱ� ====");
		
		Book[] bList = lm.selectAll();
		for(int i=0; i<bList.length; i++) {
			System.out.println(i + "��° ���� : " + bList[i]);
		}	
		
		System.out.println("�뿩�� ���� ��ȣ ���� : ");
		int num = sc.nextInt();
		
		int result = lm.rentBook(num);
		
		switch(result) {
		case 0 : System.out.println("���������� �뿩�Ǿ����ϴ�."); break;
		case 1 : System.out.println("������������ �뿩 �Ұ����Դϴ�."); break;
		case 2 : System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����ϴ�. \n������������ Ȯ���ϼ���"); break;
		}
			
	}
	

}//
