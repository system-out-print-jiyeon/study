package com.method.hw1.controller;

import java.util.Arrays;
import java.util.Scanner;

public class NonStaticSample {
	
	public void printLottoNumbers() {
		
		System.out.print("1. ���� �� : ");
		
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 45 + 1);
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
				
			}
		
		}
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
		System.out.println();
		
		
	}
	
	

	
	
	
	public void outputChar(int num, char c) {
		
		System.out.print("2. " + c + "���� " + num + "�� ��� : ");
	
		for(int i=0; i<num; i++) {
			System.out.print(c + " ");
			
			
		}
		
	}
	
	
	
	
	
	
	
	public char alphabette() {
		
		System.out.print("\n3. ���� ������ ��� : ");
		
		
		// A~z 65~122 , but 91~96�� ����
		int alpha=0;
			while(true) {
			alpha = (int)(Math.random()*58+65);
				if(alpha>=65 && alpha<=122) {
					if(alpha>=91 && alpha<= 96) continue;
						
					
				else {
					break;
				}
				
			}
			
		}
	char c = (char)alpha;
	return c;
		

	}

	
	
	public String mySubstring(String str, int index1, int index2) {
		
		String result = null;
		

		if(!str.equals("")) {
			
			// ���1. 
			/*
			for(int i=index1; i<index2; i++) {
				
				result += str.charAt(i); 
			}
			*/
			
			// ���2. ��� ���� ������ �Ʒ��� �� �������� ó���� �� �ִ�. (String Ŭ�������� �����ϴ� substring(�����ε���, ���ε���))
			//		��, �����ε��� <=  < ���ε���   ���� ������ ���ڿ����� �������ش�. 
			result = str.substring(index1, index2);
		}
		
		return result;	
		
		
	}

	
	
	
	
	
	
	
	
	
	

}//
