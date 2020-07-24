package com.method.hw2.controller;

import java.util.Scanner;

public class NonStaticSample {
	
	public int[] intArrayAllocation(int length) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[length];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100 + 1);
		}
		return arr;
	}

	public void display(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}//
