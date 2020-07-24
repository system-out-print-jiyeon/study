package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {

	/*
	 * * �迭�� ����
	 * - ���� ���� : �迭�� �ּҸ��� ����
	 * - ���� ���� : �迭�� ������ �����ϰ� ���� ���� ������ ����
	 */
	
	public void method1() {
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("== ���� �迭 ==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		// ���纻 �迭
		int[] copy = origin;
		
		System.out.println("\n== ���纻 �迭 ==");
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i] + " ");
		}
		
		copy[2] = 99;		// ���纻 �迭 ������ ����
		
		
		System.out.println("\n----- ���纻 �迭 ���� �� -----");
		
		System.out.println("== ���� �迭 ==");
		for(int i=0;i<copy.length;i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n== ���纻 �迭 ==");
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("origin �ּҰ� : " + origin.hashCode());
		System.out.println("copy �ּҰ� : " + copy.hashCode());
	
		// �ּҰ����� ����(���� ����) ���� �� ���� �迭�� ������ ����
		
		}
	
	
	
		// ���� ����
	public void method2() {
		// 1. for�� ���
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[origin.length];
		
		for(int i=0; i<origin.length; i++) {
			copy[i] = origin[i];
		}
		

		System.out.println("\n== ���纻 �迭 ==");
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i] + " ");
		}
		
		copy[2] = 99;		
		
		
		System.out.println("\n----- ���纻 �迭 ���� �� -----");
		
		System.out.println("== ���� �迭 ==");
		for(int i=0;i<copy.length;i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n== ���纻 �迭 ==");
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("origin �ּҰ� : " + origin.hashCode());
		System.out.println("copy �ּҰ� : " + copy.hashCode());
	
	
		
	}
		
	
	public void method3() {
		// 2. ���ο� �迭 �����ϰ� SystemŬ���������� arraycopy �޼ҵ带 �̿��� ����
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[10]; 	// �˳��ϰ� ũ�� ����
		
		// System.arraycopy(���� �迭��, ���縦 ������ �ε���, ���纻 �迭��, ���纻�迭�� ���簡 ���۵� �ε���, ������ ����);
		System.arraycopy(origin, 0, copy, 2, 5);
		
		// ���纻 �迭 ���
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("origin �ּҰ� : " + origin.hashCode());
		System.out.println("copy �ּҰ� : " + copy.hashCode());
		
		// �ּҰ� �ٸ� => �迭 ������ ���� ������ ���� ����!
		
		
	}
		
		
	public void method4() {
		// 3. Arrays Ŭ�������� �����ϴ� copyOf�޼ҵ� ���
		int[] origin = {1, 2, 3, 4, 5};
		
		// ���纻 �迭 = Arrays.copyOf(���� �迭��, ������ ����); => copy�迭�� ũ�� == ������ ����
		// int[] copy = Arrays.copyOf(origin, origin.length);
		
		// int[] copy = Arrays.copyOf(origin, 3);
		
		int[] copy = Arrays.copyOf(origin, 7);
		
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// Arrays Ŭ���������� copyOf�޼ҵ�� SystemŬ���������� arraycopy�� ������
		// �����ҽ����ε���, ����ɽ����ε��� ���ô� �Ұ�!!
		// ������ ���� �Ѿ�� �������� ����!!
		
		System.out.println();
		System.out.println("origin �ּҰ� : " + origin.hashCode());
		System.out.println("copy �ּҰ� : " + copy.hashCode());
		
		
	}
	
	public void method5() {
		// 4. clone()�޼ҵ� �̿��� ���� (�����ε���, ������ ���� ��ü ���úҰ�, origin �״�� �����ؿ����� �ּҰ� �޶� ������ ����X)
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin.clone();
		
		System.out.println("origin �ּҰ� : " + origin.hashCode());
		System.out.println("copy �ּҰ� : " + copy.hashCode());
		
		/*
		 for(int i=0; i<copy.length; i++){
		 		System.out.print(copy[i] + " ");
		 }
		 */
		
		System.out.print(Arrays.toString(copy));	// --> ��¹� �� ���� ���, �迭���·� ���
		
	}
	
		
		
		
		
		
	}
	
	
	
	
	
	

