package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {

	/*
	 * * 배열의 복사
	 * - 얕은 복사 : 배열의 주소만을 복사
	 * - 깊은 복사 : 배열을 새로이 생성하고 실제 내부 값들을 복사
	 */
	
	public void method1() {
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("== 원본 배열 ==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		// 복사본 배열
		int[] copy = origin;
		
		System.out.println("\n== 복사본 배열 ==");
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i] + " ");
		}
		
		copy[2] = 99;		// 복사본 배열 가지고 수정
		
		
		System.out.println("\n----- 복사본 배열 수정 후 -----");
		
		System.out.println("== 원본 배열 ==");
		for(int i=0;i<copy.length;i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n== 복사본 배열 ==");
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
	
		// 주소값만을 복사(얕은 복사) 했을 때 같은 배열을 가지고 있음
		
		}
	
	
	
		// 깊은 복사
	public void method2() {
		// 1. for문 방법
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[origin.length];
		
		for(int i=0; i<origin.length; i++) {
			copy[i] = origin[i];
		}
		

		System.out.println("\n== 복사본 배열 ==");
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i] + " ");
		}
		
		copy[2] = 99;		
		
		
		System.out.println("\n----- 복사본 배열 수정 후 -----");
		
		System.out.println("== 원본 배열 ==");
		for(int i=0;i<copy.length;i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n== 복사본 배열 ==");
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
	
	
		
	}
		
	
	public void method3() {
		// 2. 새로운 배열 생성하고 System클래스에서의 arraycopy 메소드를 이용한 복사
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[10]; 	// 넉넉하게 크게 생성
		
		// System.arraycopy(원본 배열명, 복사를 시작할 인덱스, 복사본 배열명, 복사본배열의 복사가 시작될 인덱스, 복사할 갯수);
		System.arraycopy(origin, 0, copy, 2, 5);
		
		// 복사본 배열 출력
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		
		// 주소값 다름 => 배열 수정시 서로 영향을 받지 않음!
		
		
	}
		
		
	public void method4() {
		// 3. Arrays 클래스에서 제공하는 copyOf메소드 사용
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열 = Arrays.copyOf(원본 배열명, 복사할 갯수); => copy배열의 크기 == 복사할 갯수
		// int[] copy = Arrays.copyOf(origin, origin.length);
		
		// int[] copy = Arrays.copyOf(origin, 3);
		
		int[] copy = Arrays.copyOf(origin, 7);
		
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// Arrays 클래스에서의 copyOf메소드와 System클래스에서의 arraycopy와 차이점
		// 복사할시작인덱스, 복사될시작인덱스 제시는 불가!!
		// 복사할 갯수 넘어가도 오류뜨지 않음!!
		
		System.out.println();
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		
		
	}
	
	public void method5() {
		// 4. clone()메소드 이용한 복사 (시작인덱스, 복사할 갯수 일체 제시불가, origin 그대로 복사해오지만 주소값 달라 원본에 영향X)
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin.clone();
		
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		
		/*
		 for(int i=0; i<copy.length; i++){
		 		System.out.print(copy[i] + " ");
		 }
		 */
		
		System.out.print(Arrays.toString(copy));	// --> 출력문 한 번에 출력, 배열형태로 담김
		
	}
	
		
		
		
		
		
	}
	
	
	
	
	
	

