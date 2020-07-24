package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
	
	public void practice1() {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(i+1  + " "); 
		}
		
	}

	
	
	public void practice2() {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = 10-i;
			System.out.print(arr[i]  + " "); 
		}
			
	}

	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		if(num>0) {
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			}
		}else {
			System.out.println("잘못입력하셨습니다");
		}
	
	}

	
	public void practice4() {
		String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(arr[1]);
		
		
	}
	
	
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
			
			
		}
		
		
		int count = 0;
		System.out.print(str + "에 " + ch +"가 존재하는 위치(인덱스) : "  );
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ch) {
			count++;
			System.out.print(i + " ");
			}
			
		}
		
		System.out.println();
		System.out.println(ch + "의 개수 : "+ count);
	}
	
	
	
	
	
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		String[] arr = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		if(num>=0 && num<7) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[num] + "요일");
			break;
			}
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
	}
	
	
	
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
			System.out.print(Arrays.toString(arr));
			System.out.println("\n총 합 : " + sum);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}//
