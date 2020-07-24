package com.method.hw2.run;

import com.method.hw2.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {

		NonStaticSample n = new NonStaticSample();
		n.intArrayAllocation(5);
		int[] arr = n.intArrayAllocation(5);
		
		System.out.printf("- 크기가 %d인 배열의 랜덤값 : ",5);
		n.display(arr);
		System.out.print("- 내림차순 출력 : ");
	//	n.sortDescending(arr);
		System.out.print("- 오름차순 출력 : ");
	//	n.sortAscending(arr);
	}

}
