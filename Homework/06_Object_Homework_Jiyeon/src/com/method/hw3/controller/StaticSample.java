package com.method.hw3.controller;

public class StaticSample {

	private static String value;
	
	
	
	public void setValue(String value) {
		this.value = value;
	}
	
	
	public String getValue() {
		return value;
	}
	
	

	
	public static void toUpper() {
		String toUpper = "";
		
		for(int i=0; i<value.length(); i++) {
			if(value.charAt(i)>=97 && value.charAt(i)<=122) {
				toUpper += (char)value.charAt(i)-32;
			}else {
				toUpper += (char)value.charAt(i);
			}
			
			value = toUpper;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void setChar(int index, char c) {
		
	}

	
	
}
