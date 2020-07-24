package com.kh.chap03_branch.branch;

public class B_Continue {

	/*
	 * continue : continue;�� ������ �Ǹ� �� �ڿ� �������� �������� �ʰ�
	 * 			 ���� ����� �ݺ��� ���� �ö󰡶�� �ǹ�
	 * 
	 * 
	 *  if(~�� ���){
	 * 	continue;		�ް�� ����X,���� �ö� ������ ����
	 *  }
	 * 
	 */
	
	public void method1() {
		// 1���� 10������ Ȧ�� ���
		// 1 3 5 7 9
		
	
		for(int i=1; i<=10; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");	
				}
			}
		
		System.out.println();	
		
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {		// false��  // ��, ¦���� ��� => ���� ���� �������� ���� �ٽ� �ݺ��� ���� �ö󰡶�!(�ʱ�ĺ���X, �����ĺ���)
			continue;
			}
			System.out.print(i + " ");	
		}

	}
	
	public void method2() {
		// 1���� 100���� �������� �հ�
		// ��, 6�� ������� ���� �������� �϶�
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i % 6 ==0) {	// 6�� ����� ���
				continue;
				}
				sum += i;
		}
		System.out.print("�� �հ� : " + sum);	
		
	}
	
	public void method3() {
		// 2~9�� ������ ������ ���
		// ��, 4�� ������� ���� ��� (4��, 8�� ����)
		
		// �� : 2~9 1�� ����			=> �ٱ� for��
		// �� : �� �ܸ��� 1~9 1�� ����		=> ���� for��
		
		for(int dan=2; dan<=9; dan++) {	
			
			if(dan % 4 ==0) {	// 4�� ����� ����
				continue;		// for���� ���������� �ö�
			}
			System.out.println("=== " + dan + "�� ===");
			
			for(int su=1; su<10; su++) {
				if(su % 4 ==0) {	// 4�� ��� ����
					continue;	
				}
				System.out.println(dan +" X " + su + " = " + dan*su);	
			}
			System.out.println();
		}
		
		
		
		
	}
	
	
}
