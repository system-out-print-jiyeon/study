package com.kh.chap01_abstraction.model.vo;

/*
 *  * 클래스의 구조 
 *  
 *  public class 클래스명 {
 *  	
 *  	// 필드부
 *  
 *  	// 생성자부
 *  
 *  	// 메소드부	
 *  
 *  }
 */

// 나만의 자료형 만들기 (String, int, double 보관가능한 배열같은)
public class Student {
	
	// 필드부
	// 접근제한자 [예약어] 자료형 변수명;		<-- []은 생략 가능하다는 뜻
	
	// * 접근제한자 : 여기에 접근할 수 있는 범위를  제한할 수 있다. 
	//  (public(제일 개방적) > protected > default > private)
	public String name; 
	public int age;
	public double height;
	
	
	// 생성자부
	
	// 메소드부
	public void method1() {
		
	}
	
}








