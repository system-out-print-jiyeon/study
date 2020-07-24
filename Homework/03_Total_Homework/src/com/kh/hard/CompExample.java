package com.kh.hard;

import java.util.Scanner;

public class CompExample {
	
	// �Ķ��� ������ Ǯ� �� �� ���غ���
	
	/**
	 * ����ڿ��� �Ѱ��� ���� �Է¹��� �� 
	 * 1���� �Է¹��� ������ Ȧ���� ��,¦���� �� ���
	 * 
	 * ��, �Է¹��� ���� ����� �ƴϸ� "����� �ƴմϴ�" ���
	 * ex) 4 �Է� �� => "�ڼ��ڼ�"
	 *     5 �Է� �� => "�ڼ��ڼ���"
	 */
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num > 0) { // �Է¹��� ���� ����� ��� (�� �Է��Ͽ��� ���)
			
			for(int i = 1; i <= num; i++) { // 1���� ����ڰ� �Է��� ������ �ݺ�����
				
				if(i % 2 == 1) {	// Ȧ���� ���
					System.out.print("��");
					
				} else {			// ¦���� ���
					System.out.print("��");
					
					
				}
			}
			
		} else {	// �Է� ���� ���� ����� �ƴ� ��� (�� �� �Է��Ͽ��� ���)
			
			System.out.println("����� �ƴմϴ�.");
		}
	}
	
	
	/**
	 * ���� ���뿡 �̾��� �������� 
	 * ���� ����� �ƴ� ��� �ٽ� �Է¹޵��� �ݺ������� ����
	 */
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { // �켱 ���� �ݺ����� �����ϰ�
			
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if(num > 0) { // �Է¹��� ���� ����� ��� (�� �Է��Ͽ��� ���)
				
				for(int i = 1; i <= num; i++) { // 1���� ����ڰ� �Է��� ������ �ݺ�����
					
					if(i % 2 == 1) {	// Ȧ���� ���
						System.out.print("��");
						
					} else {			// ¦���� ���
						System.out.print("��");
						
					}
				}
				
				// ����� ��� ����� ��µǰ� ���ѹݺ����� ����������
				break;
				
			} else {	// �Է� ���� ���� ����� �ƴ� ��� (�߸� �Է��Ͽ��� ���)
				
				System.out.println("����� �ƴմϴ�.");
				
				// ����� �ƴ� ��� �ٽ� �ݺ����� ó������ ���ư� ������ �Է¹ް� �ɰŴ�.
			}
			
		}
	}
	
	/**
	 * ����ڿ��� ���ڿ��� �ش� ���ڿ��� ���� �˻��ϰ� ���� ���� �Է¹��� ��
	 * ���ڿ��� �� ���ڰ� � �ִ��� ���� ���� ����ϱ�
	 * ex) "banana" �Է�, 'a' �Է� ��	=> 3���
	 * 	   "pineapple" �Է�, 'p' �Է� �� => 3���
	 * 
	 * 1) ����ڿ��� ���ڿ��� �Է¹޴´�. (str:String)
	 * 2) �˻��ϰ� ���� ���ڸ� �Է¹޴´�. (ch:char)
	 * 3) �ش� ���ڿ��� ��ġ�ϴ� ���ڸ� ã�� ������ ������ ������ ������ �����صд�. (count:int)
	 * 4) �ݺ����� ���� �ش� ���ڿ��� 0�� �ε��� ���� �������ε��������� ���ڵ�� ch�� ��ġ�ϴ��� ��
	 *    ��ġ�ϸ� count�� 1 ����
	 * 5) �ݺ��� ������ count ���
	 *
	 */
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		System.out.print("ã���� �ϴ� ���� : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;		// �˻��� ������ ������ ���� ����
		
		for(int i=0; i<str.length(); i++) { // 0���� ���ڿ��� ����-1 ��ŭ 1�� �����ϴ� ���� �ݺ�
			
			if(ch == str.charAt(i)) { // �Է¹��� ���ڿ� ���ڿ��� �� �ε��� ���� ���� ���
				count++; // ������ ���ڶ�� �Ǵ��Ͽ� count 1 ����
			}
		}
		
		System.out.println("���Ե� ���� : " + count);
		
	}
	
	
	

}
