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
		
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		
		if(num>0) {
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			}
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�");
		}
	
	}

	
	public void practice4() {
		String[] arr = {"���", "��", "����", "������", "����"};
		System.out.println(arr[1]);
		
		
	}
	
	
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
			
			
		}
		
		
		int count = 0;
		System.out.print(str + "�� " + ch +"�� �����ϴ� ��ġ(�ε���) : "  );
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ch) {
			count++;
			System.out.print(i + " ");
			}
			
		}
		
		System.out.println();
		System.out.println(ch + "�� ���� : "+ count);
	}
	
	
	
	
	
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		String[] arr = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();
		if(num>=0 && num<7) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[num] + "����");
			break;
			}
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
	}
	
	
	
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
			System.out.print(Arrays.toString(arr));
			System.out.println("\n�� �� : " + sum);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}//
