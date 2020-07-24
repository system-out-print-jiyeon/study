package com.kh.variable;

import java.util.Scanner;

public class C_KeyboardInput {
	
	// ����ڰ� Ű����� �Է��� ���� ������ ����ϴ� ���
	
	public void inputScanner1() {
		
		// ����ڿ��� ������ ��������(�̸�, ����, Ű) �Է¹��� �� ������
		
		// java.util.Scanner Ŭ������ �޼ҵ带 ������ ����ڰ� �Է��� ���� ������ �� �� ����!!
		// Ŭ���� ���� --> �޼ҵ� ȣ��!
		
		Scanner sc = new Scanner(System.in);
		
		// �Է¹ް��� �ϴ� ������ ���� ����ؼ� �Է��� �����������!!
		System.out.print("����� �̸��� �����Դϱ� : ");
		
		// ����ڰ� �Է��� ���ڿ��� �̾ƿ��� �޼ҵ� (next(), nextLine())
		// String name = sc.next(); // <-- �� ���� �̶�� ġ�� "��" �� ����
		// next() : ����ڰ� �Է��� �� �� ������ ���� ��� ���� ���������� ���� �о���Ե�!!
		
		String name = sc.nextLine();
		// nextLine() : ����ڰ� �Է��� �� ��� �� �о��!!
		
		
		System.out.print("����� ���̴� ����Դϱ� : ");
		// ����ڰ� �Է��� �������� �̾ƿ��� �޼ҵ�(nextInt())
		int age = sc.nextInt();
		
		System.out.print("����� Ű�� �� cm�Դϱ� : ");
		// ����ڰ� �Է��� �Ǽ����� �̾ƿ��� �޼ҵ�(nextDouble())
		double height = sc.nextDouble();
		
		// �� ������ Ȯ���غ���!!
		// "xxx���� xx�� �̸�,Ű�� xxxcm�Դϴ�."
		System.out.println(name + "���� " + age + "�� �̸�, Ű�� " + height + "cm�Դϴ�.");
		
		
	}
	
	public void inputScanner2() {
		
		// �̸�, ����, �ּ�, Ű
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		/*
		 * sc.nextLine() : ���ۿ��� "����"���� �� �о���� �޼ҵ� ("����" �����!)
		 * sc.nextLine() �̿��� �޼ҵ� : ���ۿ��� "����"�� �о���� ����!! (����ڰ� �Է��� ������ �о�� == "����" ��������)
		 */
		
		// ���� �� ������ ���ۿ� ���Ͱ� ���������Ƿ�
		// ���ۿ� �����ִ� ���͸� ����ִ� ������ �߰��ϸ� ��!!
		
		sc.nextLine();
		
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		
		System.out.print("Ű(cm����) : ");
		double height = sc.nextDouble();
		
		
		sc.nextLine();
		
		System.out.print("���� : ");
		String gender = sc.nextLine();
		
		// ���
		// "xxx���� xx���̸�, ��� ���� xxx�̰�, Ű�� xxxcm�Դϴ�."
		
		System.out.println(name + "���� " + age + "���̸�, ��� ���� " 
						+ address + "�̰�, Ű�� " + height + "cm �Դϴ�.");
		
		System.out.printf("%s���� %d���̸�, ��� ���� %s�̰�, Ű�� %.2fcm �Դϴ�", name, age, address, height);
		
		//System.out.println("���� : " + gender);
		
		
	}
	
	
	public void inputScanner3() {
		
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ��� �Է¹��� �� --> sc.nextLine()
		// �������� �Է¹��� �� --> sc.nextInt()
		// �Ǽ����� �Է¹��� �� --> sc.nextDouble()
		
		// ���ڸ� �Է¹��� �� --> sc.nextChar() 	???
		
		// �̸�, ����(M/F), ����, Ű
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("����(M/F) : ");		// Male Female
		// char gender = sc.nextChar();	<-- nextChar �� ����!!!
		char gender = sc.nextLine().charAt(0);
		//				"Male".charAt(0);
		
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.println("Ű(cm����) : ");
		double height = sc.nextDouble();
		
		// ����� ���ؼ� Ȯ��!!
		// ���������� ��������
		// ���� : ��
		// ���� : ����
		//Ű : ������.��
		
		System.out.println(name + "���� ��������");
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("Ű : " + height);
		
		System.out.println("=== ȯ���մϴ�^.^ ===");
		
	}

	public void inputScanner4() {
		
		// ����ڿ��� �� ���� ������ �Է¹��� ��
		// ���� ������ ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		/*
		 * int result = num1 + num2 ;
		System.out.print("������� : " + result);
		*/
		
		System.out.print("������� : " + (num1 + num2));	// "������� : 10" + num2 => "������� : 105"
		// + - * / %
	}
	
	
	/*
	 * ** ���� **
	 * 
	 * 1. �ܼ�â(�����)�� ����ϱ� ���ؼ� : System.out.println() �޼ҵ� �̿�
	 * 2. �ܼ�â(Ű����)���� �Է¹ޱ� ���ؼ� : Scanner sc = new Scanner(System.in);
	 * 								sc.nextLine(), sc.next(), sc.nextInt(), sc.nextDouble()
	 * 
	 * - ������ ��
	 *  > sc.nextXXX() �ڿ�  sc.nextLine() �޼ҵ尡 �;ߵǴ� ���
	 *  	���ۿ� ���� ���͸� ���ִ� ���� �ʼ�!! => sc.nextLine(); �� �� �� ���ָ� ��!!
	 *  
	 *  > '����' ���� �Է¹ޱ� ���ؼ��� sc.nextLine() �޼ҵ带 ���� ���ڿ��� ���� �޾��ְ�
	 *  	�� �ڿ� .charAt(0) �޼ҵ带 ���� ���ڸ� �����ϴ� ����!
	 * 
	 */
	
	
}
