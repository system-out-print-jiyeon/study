package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {

	public void method() {
		
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		// �����ڸ� �̿��Ͽ� �ش� ���ڿ� �и���Ű�� ���
		
		// ��� 1. �и��� ���ڿ����� �迭�� �������� ��Ƽ� ó���ϰ� ���� �� 
		//		  String Ŭ�������� �����ϴ� split �޼ҵ� �̿�
		//		   ���ڿ�.split(String ������) : String[]
		
		String[] arr = str.split(",");
		System.out.println("�и� �� ���ڿ��� ���� : " + arr.length);
		
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		*/
		
		// ���� for��
		for(String s : arr) {
			System.out.println(s);
		}
		
		
		
		
		// ��� 2. �и��� ������ ���ڿ����� ��ü�� ����ϰ� ���� ��
		//		  java.util.StringTokenizer �� ��������
		//				StringTokenizer Ŭ������ �̿��ϴ� ���
		//		  StringTokenizer stn = new StringTokenizer(�и���Ű�����ϴ� ���ڿ�, ������);
		
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("�и� �� ���ڿ��� ���� : " + stn.countTokens()); // 6��
		
		/*
		System.out.println(stn.nextToken());	// Java
		System.out.println(stn.nextToken());	// Oracle
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		//										 ��ū �� �̾ƿ���
		System.out.println("���ڿ��� ���� : " + stn.countTokens());	// �׷��� ������ 0��
		*/
		
		
		/*
		for(int i=0; i<stn.countTokens(); i++) {
			System.out.println(stn.nextToken());
		}
		*/
		// i=0  i<6  true	System.out.println("Java");  i++
		// i=1  i<5  true	System.out.println("Oracle"); i++
		// i=2  i<4  true	System.out.println("JDBC"); i++
		// i=3  i<3  false  --> �ݺ��� ��������
		
		/*
		 �ذ��� 1.
		int count = stn.countTokens(); // 6 // ������ ������ �ѹ� �޾Ƶα�
		
		for(int i=0; i<count; i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// �ذ��� 2.
		while(stn.hasMoreTokens()) { // �ش� ��ū�� �����ֽ��ϱ�? -> ����������� true
			System.out.println(stn.nextToken());
		}
		
	}
	
	
	
	public void method2() {
		String colors = "red/yellow#green blue,orange";
		
		// split ���
		String[] arr = colors.split("[/#, ]");	// ���ȣ�� ������ ������ ������ ���� 
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		// StringTokenizer ���
		StringTokenizer stn = new StringTokenizer(colors, "/# ,");
		
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
