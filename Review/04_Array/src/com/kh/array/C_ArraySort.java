package com.kh.array;

import java.util.Arrays;

// 배열 정렬
public class C_ArraySort {

	public void method1() {
		
		// 변수를 가지고 값 변경
		int num1 = 20;
		int num2 = 10;
		
		System.out.println("==== 변경전 ====");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		/*
		num1 = num2;	// num1=10;
		num2 = num1;	// num2=10;
		*/
		
		// 기존의 값을 보관할 임시 변수 만든 후 하나의 값을 기록해둠
		
		int temp = num1;	// temp = 20;
		 num1 = num2;	// num1 = 10;
		 num2 = temp;	// num2 = 20;
		
	    System.out.println("==== 변경후 ====");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
	
	}
	
	public void method2() {
		
		int[] arr = {2,1,3};	// 오름차순 : 앞에 제시된 값이 뒤에 제시된 값보다 더 클 경우 "변경"
		
		// arr[0] <--> arr[1]
		
		int temp = arr[0];	// temp = 2;
		arr[0] = arr[1];	// arr[0] = 1;
		arr[1] = temp;		// arr[1] = 2;
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	
	
	
	public void method3() {
		
		int[] arr = {2, 5, 4, 1, 3};
		
		/*  비교주체(i)	비교대상(j)
		 * i=0 일때		j=x
		 * i=1 일때		j=0
		 * i=2 일때		j=01
		 * i=3 일때		j=012
		 * i=4 일때		j=0123
		 * 
		 * i=0 ~ 마지막인덱스	j=0~i -1
		 *  바깥for문		안쪽for문
		 */
		
		// 오름차순 정렬 : 앞의것이 뒤의것보다 클 경우 => 변경!!
		
		// 1. 비교주체를 선정하는 for문
		for(int i=0; i<arr.length; i++) {
			// 2. 비교대상을 선정하는 for문
			for(int j=0; j<arr.length; j++) {
				// 비교대상(앞) > 비교주체(뒤)				=> 변경
				if(arr[j] > arr[i]) {			// => 대소비교하는 꺽새(>,<)만 바꿔주면 내림차순도 가능!
					System.out.println("변경!!");
					
					// arr[j] <--> arr[i]
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	
		
	}
	
	
	public void method4() {
		int[] arr = {2, 5, 4, 1, 3};
		
		// 내부적으로 오름차순 정렬..ㅎ
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	
	
	
	
	
}
