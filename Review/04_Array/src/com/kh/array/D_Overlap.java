package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {

	public void method1() {
		
		int[] arr = new int[5];
		// 0�� ~ �������ε��� ������(1~10) ���
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);	// ���ο� ������ �켱 i��° �ε����� ���
			
			// �񱳴�� for�� (������ ������ִ� �����̶� ������ ���ϰڴ�.)
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) { // ������ �ߺ��� ���� ������ ���
					System.out.println("�ߺ��߻�!");
					i--;	// 1���� --> ���ڸ��������� ���ư� --> �� ������ �߻�
							// �ߺ��� �߻��Ǵ� ���� ������ i���� �ٽ� �������� ���� �� �ְԲ� (���ڸ� ���� �� �� �ְԲ�)
					break;
				}
			}
			
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+1 +"��° ������ : ");
			arr[i] = sc.nextInt();
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("�ߺ����� �����մϴ�. �ٽ� �Է����ּ���.");
					i--;			
					break;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
}
