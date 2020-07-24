package com.method.hw1.controller;

import java.util.Arrays;
import java.util.Scanner;

public class NonStaticSample {
	
	public void printLottoNumbers() {
		
		System.out.print("1. 랜덤 값 : ");
		
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
		
		System.out.print("2. " + c + "문자 " + num + "개 출력 : ");
	
		for(int i=0; i<num; i++) {
			System.out.print(c + " ");
			
			
		}
		
	}
	
	
	
	
	
	
	
	public char alphabette() {
		
		System.out.print("\n3. 랜덤 영문자 출력 : ");
		
		
		// A~z 65~122 , but 91~96은 제외
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
			
			// 방법1. 
			/*
			for(int i=index1; i<index2; i++) {
				
				result += str.charAt(i); 
			}
			*/
			
			// 방법2. 사실 위의 과정을 아래의 한 문장으로 처리할 수 있다. (String 클래스에서 제공하는 substring(시작인덱스, 끝인덱스))
			//		단, 시작인덱스 <=  < 끝인덱스   사이 범위의 문자열만을 추출해준다. 
			result = str.substring(index1, index2);
		}
		
		return result;	
		
		
	}

	
	
	
	
	
	
	
	
	
	

}//
