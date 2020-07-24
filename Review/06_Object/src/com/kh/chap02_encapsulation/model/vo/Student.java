package com.kh.chap02_encapsulation.model.vo;


public class Student {
	
	// 필드부
	/*
	 * 필드 == 멤버변수 == 인스턴스변수
	 * 
	 * <표현법>
	 * 접근제한자 [예약어] 자료형 변수명;
	 * 
	 * 필드부에 접근제한자는 private으로 해서 직접적으로 접근이 불가하게끔 "정보은닉"
	 * 객체지향설계원칙 중 하나
	 */
	private String name;
	private int age;
	private double height;
	
	
	// 생성자부
	
	// 메소드부
	/*
	 * 메소드 == 기능
	 * 
	 * < 표현법 >
	 * 접근제한자 반환형 메소드명([매개변수]) {
	 * 		// 기능 구현
	 * }
	 * 
	 * 매개변수 : 해당 메소드 호출 시 전달되는 값을 받아주기 위한 변수
	 * 
	 */
	
	// 간접적으로나마 접근해서 호출할 수 있는 메소드만들기!!
	// * 담고자하는 데이터를 전달받아서 해당 필드에 초기화 시켜주는 기능의 메소드
	//   == setter 메소드 
	//   주로 setter메소드명을 지어줄 때 setXXX으로 지어줌!!
	
	/*
	public void setName(String newName) { // String newName = "홍길동";
		
		name = newName;
	}
	*/
	
	// setter메소드명은 setXXX으로 낙타표기법을 지킨채로 지어주는 관례 (ex. setName, setAge, setHeight)
	// 매개변수명 또한 필드명과 일치시켜주는게 관례
	public void setName(String name) { // String name = "홍길동";
		
		// 매개변수 name = 매개변수 name;		--> 전혀 효과 없음!
		//name = name;
		
		// 필드 name = 매개변수 name;
		this.name = name;
	}
	
	
	// 전달받은 나이값을 age 필드에 대입시켜주는 기능의 setter메소드
	public void setAge(int age) { // int age = 20;
		this.age = age;
	}
	
	// 전달받은 키값을 height 필드에 대입시켜주는 기능의 setter메소드
	public void setHeight(double height) { // double height = 162.3;
		this.height = height;
	}
	
	
	// * 각 필드에 담긴값을 반환해주는 기능을 하는 메소드 (getter메소드)
	//   통상 getXXX() 메소드명으로 지어줌
	//   getter메소드는 단지 필드에 담겨있는 값을 반환만 시켜줄꺼기 때문에
	//   별도로 전달되는 값 없음(매개변수 제시해놓을 필요 없음)
	
	// name 필드에 담긴 값을 반환해줄 목적을 가진 getter메소드
	// void : 반환값이 없다.
	public String getName() {
		
		return name;
	}
	
	// age 필드에 담긴 값을 반환해줄 목적을 가진 getter메소드
	public int getAge() {
		return age;
	}
	
	// height 필드에 담긴 값을 반환할 getter메소드
	public double getHeight() {
		return height;
	}

}






