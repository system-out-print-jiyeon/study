package com.method.hw2.run;

import com.method.hw2.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {

		NonStaticSample n = new NonStaticSample();
		n.intArrayAllocation(5);
		int[] arr = n.intArrayAllocation(5);
		
		System.out.printf("- ũ�Ⱑ %d�� �迭�� ������ : ",5);
		n.display(arr);
		System.out.print("- �������� ��� : ");
	//	n.sortDescending(arr);
		System.out.print("- �������� ��� : ");
	//	n.sortAscending(arr);
	}

}
