package com.kh.chap01_condition.condition;

import java.util.Scanner;

public class C_Switch {

	/*
	 * switch���� if���� ������
	 * 
	 * if���� ���ǽĿ��� �������� ��������!!	(��Һ񱳿�����) + ����񱳿����� + && || (��������)
	 * switch���� Ȯ���� ���� ����		only �����
	 * 
	 * [ǥ����]
	 * switch(������� �����) { // ������� ����ڴ� �ݵ�� int���̳�, char���̳�, String�� ����
	 * case ��1 : �����ڵ�1; break;
	 * case ��2 : �����ڵ�2; break;
	 * case ��3 : �����ڵ�3; break;
	 * ...
	 * [default : ���� ���ǿ� �� �������� ���� ��� �ݵ�� ������ �ڵ�;]
	 * }
	 *  
	 *  ���� ����� == ��1�� ������ true�� ��� �����ڵ�1�� �����ϰ� break���� ��������
	 *  ��, false�� ��� ��2�� �ٽ� ����� ���� ...
	 *  
	 *  case ������ ��� ����� ��ġ���� ���� ��� default�� ���õǾ��ִ� ������ �ݵ�� ����!! (else������ ���� ����)
	 *  
	 *  
	 *  * ������ ��
	 *  if-else if���� �޸� �����ڵ� �����ϰ� �ڵ����� ���������� ���� .. break �ɾ���ߵ�!!
	 *  
	 */
	
	public void method1() {
		// ����ڿ��� 1~3������ ������ �Է¹޾�
		// 1�� ��� "�������Դϴ�." ���
		// 2�� ��� "�Ķ����Դϴ�." ���
		// 3�� ��� "�ʷϻ��Դϴ�." ���
		// �߸� �Է����� ��� "�߸��Է��Ͽ����ϴ�." ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����(1~3) �Է� : ");
		int num = sc.nextInt();
		
		/*
		if(num == 1) {
			System.out.print("�������Դϴ�.");
		}else if(num == 2) {
			System.out.print("�Ķ����Դϴ�.");
		}else if(num == 3) {
			System.out.print("�ʷϻ��Դϴ�.");
		}else {
			System.out.print("�߸��Է��Ͽ����ϴ�.");
		}
		*/
		
		switch(num) {
		case 1 : System.out.print("�������Դϴ�.");break;
		case 2 : System.out.print("�Ķ����Դϴ�.");break;
		case 3 : System.out.print("�ʷϻ��Դϴ�.");break;
		default :System.out.print("�߸��Է��Ͽ����ϴ�.");
		}

	}

	public void method2() {
	
		// ����ڿ��� �����̸�(���, �ٳ���, ������, Ű��)�� �Է¹޾�
		// ����� ��� => 1000
		// �ٳ����� ��� => 2000
		// �������� ��� => 5000
		// Ű���� ��� => 4000
		// �߸��Է����� ��� => �߸��Է��Ͽ����ϴ�. ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����̸�(���, �ٳ���, ������, Ű��) �Է� : ");
		String fruit = sc.nextLine();
		
		/*
		if(fruit.equals("���")) {
			System.out.print("1000");
		}else if(fruit.equals("�ٳ���")) {
			System.out.print("2000");
		}else if(fruit.equals("������")) {
			System.out.print("5000");
		}else if(fruit.equals("Ű��")) {
			System.out.print("4000");
		}else {
			System.out.print("�߸��Է��Ͽ����ϴ�");
		}
		*/
		
		int price = 0;
		switch(fruit) {
		case "���" : price = 1000;break;
		case "�ٳ���" : price = 2000;break;
		case "������" : price = 5000;break;
		case "Ű��" : price = 4000;break;
		default : System.out.println("�߸��Է��Ͽ����ϴ�.");return;
		}
		
		// "������ ������ �������� �Դϴ�."
		System.out.println(fruit + "�� ������ " + price + "�� �Դϴ�.");

	}
	
	public void method3() {
		// break�� ���� switch�� ���
		
		// ����ڿ��� ��� (1, 2, 3)�� �Է¹��� ��
		// 3����� ��� => ��������, �۾������, �б����
		// 2����� ��� => �۾������, �б����
		// 1����� ��� => �б����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���(1, 2, 3) �Է� : ");
		int level = sc.nextInt();
		
		switch(level) {
		case 3 : System.out.println("�� �������� �־�");
		case 2 : System.out.println("�� �۾������ �־� ");
		case 1 : System.out.println("�� �б���� �־�");break;
		default : System.out.println("�߸��Է��Ͽ����ϴ�");
		}
	
	}

	public void method4() {
		// 1�� ~12������ �Է¹޾� �ش��ϴ� ���� ������ ��¥�� ����ϼ���
		
		// 1,3,5,7,8,10,12		=> "�Է��Ͻ� ���� 31�ϱ����Դϴ�."
		// 4,6,9,11				=> "�Է��Ͻ� ���� 30�ϱ����Դϴ�."
		// 2					=> "�Է��Ͻ� ���� 28�� �Ǵ� 29�ϱ����Դϴ�."
		// �߸��Է����� ���			=> "�ݵ�� 1~12�������� �Է��ؾ��մϴ�."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1��~12������ �� �ϳ��� �Է��ϼ��� : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 : System.out.println("�Է��Ͻ� ���� 31�ϱ����Դϴ�.");break;
		case 4 :
		case 6 :
		case 9 :
		case 11 : System.out.println("�Է��Ͻ� ���� 30�ϱ����Դϴ�.");break;
		case 2 : System.out.println("�Է��Ͻ� ���� 28�� �Ǵ� 29�ϱ����Դϴ�.");break;
		default : System.out.println("�ݵ�� 1~12�������� �Է��ؾ��մϴ�.");
		}
		
		
		
	}
	
	
	
	
	
}
