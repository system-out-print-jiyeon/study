package com.kh.operator;

import java.util.Scanner;

public class F_Triple {

	/*
	 * * ���� ������ : �׸��� 3���� ������
	 * 
	 * [ǥ����]
	 * ���ǽ� ? ���ǽ��� true�� ����� �����1 : ���ǽ��� false�� ����� �����2
	 * 
	 * ���ǽ��� �ݵ�� true �Ǵ� false�� �����Բ� �ۼ��ؾߵ�!
	 * �ַ� ���ǽĿ� ��/�� �����ڰ� ����!
	 * 
	 */
	
	public void method1() {
		
		// ����ڰ� �Է��� �������� ������� �ƴ��� �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		
		// ���ǽ� ? ���� ����� �� : ������ ����� ��
		
		// System.out.println( num > 0 ? "���" : "����� �ƴ�");
		String result = (num > 0 ? "���" : "����� �ƴ�");
		System.out.println(num + "��(��) " + result);
		
	}
	
	public void method2() {
		/*
		 * ����ڿ��� �ΰ��� ������ �Է¹޾Ƽ�
		 * �� �������� ���� ����� 100���� ū ��� "����� 100�̻��Դϴ�."
		 * 						�ƴ� ��� "����� 100���� �۽��ϴ�."
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		String result = (num1 * num2 >= 100 ? "����� 100�̻� �Դϴ�." : "����� 100���� �۽��ϴ�.");
		System.out.print(num1 * num2 + "��(��)" + result);
		
	}
	
	public void method3() {
		
		// ����ڰ� �Է��� �������� ¦������ Ȧ������ �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0 ? "¦���̴�" : "Ȧ���̴�");
		//String result = (num % 2 == 1 ? "Ȧ���̴�" : "¦���̴�");
		//String result = (num % 2 != 1 ? "¦���̴�" : "Ȧ���̴�");
		
		
		System.out.print(num + "��(��) " + result);	
	}
	
	public void method4() {
		
		// ����ڰ� �Է��� ������ ���� �빮������ �ƴ��� �Ǻ� �� �� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch >= 'A' && ch <= 'Z')? "�빮���̴�" : "�빮�ڰ� �ƴϴ�";
		System.out.println(ch + "��(��) " + result);
		
		
	}
	
	// ���׿����ڸ� ��ø�ؼ�!!
	public void method5() {
		
		// ����ڰ� �Է��� �������� �������, ��������, 0���� ��Ȯ�� �Ǻ��� �� ��� 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		
		//String result = (num > 0 ? "����̴�" : (num == 0 ? "0�̴�" : "�����̴�"));
		String result = (num > 0 ? "����̴�" : (num < 0 ? "�����̴�" : "0�̴�"));
		
		
		System.out.println(num + "��(��) " + result);

		
		
	}

	
	public void method6() {
		
		// �� ���� �������� �Է¹ް�
		// + �Ǵ� - �� �Է¹޾� �׿� �ش��ϴ� ���� ��� ���
		
		// +�� �Է����� ��� �������� ��� ���
		// -�� �Է����� ��� �������� ��� ���
		// �� ���� ���ڸ� �Է����� ��� "�߸� �Է��ϼ̽��ϴ�" ���
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("������(+ �Ǵ� -) �Է� : ");
		char op = sc.nextLine().charAt(0);
		
		String result = (op == '+' ? num1 + num2 + "" : (op == '-' ? num1 - num2 + "" : "�߸� �Է��ϼ̽��ϴ�"));
		System.out.println("��� : " + result);
		
		
	}
	
	
}
