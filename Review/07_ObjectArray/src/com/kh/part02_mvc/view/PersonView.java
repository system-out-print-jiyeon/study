package com.kh.part02_mvc.view;

import java.util.Scanner;

import com.kh.part02_mvc.controller.PersonController;
import com.kh.part02_mvc.model.vo.Person;

// View  : Ŭ���̾�Ʈ(�����)�� �ð����� ��� ���(ȭ��)
//		       �Է� �� ���
//		       ���⼭ �������� ȭ��(�޴�)�� ���ؼ� ��û�̶�� ���� ��
//		       ��û�� �Ѵٴ°� ControllerŬ������ �޼ҵ带 ȣ���Ѵٴ� ���� �ǹ�
public class PersonView {
	// ����ڿ��� �Է¹ޱ� ���� Scanner��ü ����
	Scanner sc = new Scanner(System.in);
	// ������� ��û�� ó���� Controller��ü ����
	private PersonController pc = new PersonController();
	
	/**
	 * ���α׷� ����� ���ÿ� ����ڿ��� �������� ����ȭ��(�޴�)
	 */
	public void mainMenu() {
		
		// ���θ޴��� ���ѹݺ������� �����(���α׷��� ��� ����ǰԲ�)
		while(true) {
			
			System.out.println("\n===== �޴� =====");
			System.out.println("1. �ű� ȸ�� �߰�");
			System.out.println("2. ȸ�� ��ü ��ȸ");
			System.out.println("3. ȸ�� �̸� �˻�");
			System.out.println("4. ȸ�� ��� ��� ��ȸ");
			System.out.println("0. ���α׷� ����");
			
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertPerson(); break;
			case 2 : selectList();  break;
			case 3 : searchPerson(); break;
			case 4 : selectAvgWealth(); break;
			case 0 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ��Է����ּ���");
				
				
			}
		}
		
	}
	
	/**
	 * ����ȭ�� 1. �ű�ȸ���� �߰��ϴ� ȭ��
	 */
	public void insertPerson() {
		
		System.out.println("\n== �ű� ȸ�� �߰� ==");
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("��� : ");
		int wealth = sc.nextInt();
		
		// "ȸ�� �߰�����!" ��û!! (Controller �޼ҵ� ȣ��)
		int result = pc.insertPerson(name, age, wealth);
		
		if(result == 1) {
			System.out.println("���������� �߰��Ǿ����ϴ�!");
		}else {
			System.out.println("���� �ο��� �� �� ����� �߰��� �Ұ��մϴ�.");
		}
			
	}
	
	
	/**
	 * ����ȭ��2. ȸ�� ��ü ��ȸ ȭ��
	 */
	public void selectList() {
		
		System.out.println("\n== ��ü ȸ�� ��ȸ ==");
		
		// ���� �߰��� ����� ��û!! (Controller �޼ҵ� ȣ��)
		int count = pc.getCount();
		
		if(count == 0) {	// ���� �߰��� ȸ���� ����!
			
			System.out.println("���� �߰��� ȸ���� �����ϴ�.");
			
		}else {	// �� ���̶� �ִ�!!
			
			// ��ü ȸ�� ��ȸ��û!! (Controller �޼ҵ� ȣ��)
			Person[] p = pc.selectList();
			for(int i=0; i<count; i++) {
				System.out.println(p[i].information());
			}
		}
		
	}
	
	
	/**
	 * ����ȭ�� 3. ȸ�� �̸����� �˻��ϴ� ȭ��
	 */
	
	public void searchPerson() {
		
		System.out.println("\n== ȸ�� ���� �˻� ==");
		
		System.out.println("�˻��� �̸� : ");
		String name = sc.nextLine();
		
		// �˻���û�ϱ�!! (Controller �޼ҵ� ȣ��)
		Person searchPerson = pc.searchPerson(name);
		
		if(searchPerson == null) {	// �˻��� ����� ����
			System.out.println("�˻��� ȸ���� �����ϴ�.");
		}else {	// �˻���!
			System.out.println(searchPerson.information());
		}	
		
	}
	
	
	
	/**
	 * ����ȭ�� 4. ȸ������ ��� ��� ��ȸ ȭ��
	 */
	public void selectAvgWealth() {
		
		System.out.println("\n== ȸ�� ��� ��� ��ȸ ==");
		
		
		
		if(pc.getCount() == 0) {	
			
			System.out.println("���� �߰��� ȸ���� �����ϴ�.");
			
		}else {
		double average = pc.selectAvgWealth();
		
		//System.out.println(average);
		System.out.printf("%.2f��\n", average);
		}
		
	}
	
	
	
	
	
	
	
}//
