package com.kh.chap05_constructor.model.vo;

public class User {

	// 아이디, 비밀번호, 이름 ,나이 , 성별
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	// 생성자부
	/*
	 *  * 표현법
	 *  public 클래스명([매개변수, 매개변수, ...]){
	 *  
	 *  }
	 * 
	 *  * 생성자를 작성하는 목적
	 *  1. 객체를 생성해주기 위한 목적
	 *  2. 매개변수로 전달받은 값들을 필드에 바로 초기화할 목적
	 *  
	 *  * 생성자 작성시 주의사항
	 *  1. 반드시 생성자명은 클래스명과 동일해야됨!
	 *  2. 반환형이 존재하지 않음!! (메소드와 유사해서 헷갈릴 수 있음)
	 *  3. 매개변수를 명시적으로 작성하게 되면 JVM이 기본생성자 자동으로 부여 안함!
	 *  	★ 즉, 기본생성자는 항상 작성하는 습관을 들이자!
	 *  
	 *  
	 */
	public User() {
		// 기본생성자 (매개변수 없는 생성자)
		// 단지 객체 생성만을 목적으로 할 때 기술
		// 기본 생성자를 작성 안해놓으면 생성X ??
		// => ㄴㄴ 생성 된다! => 개발자가 직접 작성 안해놓으면 JVM이 자동으로 내부적으로 작성해줌
		
	}
	
	// 매개변수 생성자
	public User(String userId, String userPwd, String userName) {
		// 객체 생성과 동시에 전달된 값을 매개변수로 담아서 해당 필드에 초기화할 목적
		// String userId = "user02", String userPwd = "pass02", String userName = "김말똥"
		// ★ 중괄호에 값 넣는거 잊지말기
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		// 초기화가 안된 필드부분은 JVM의 초기값으로 담겨있을 것!!
		
	}
	
	// 모든 필드값 초기화시켜주는 매개변수 생성자
	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/
		this(userId, userPwd, userName);	
		// this() 생성자: 같은 클래스 내에서 다른 생성자 호출 가능!  단, 반드시 첫줄에 작성해야됨!! 
		// 코드 줄이고 위의 것 재사용하기
		this.age = age;
		this.gender = gender;	
		
	}
	
	
	
	// 메소드부
	// setter 메소드 : 전달값을 각 필드에 대입시키는 역할 (값 변경)
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public void setUserName(String userName) {
		this.userName= userName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	
	// getter 메소드 :  각 필드에 담긴 값을 반환시켜주는 역할 (값 조회)
	
	public String getUserId() {
		return userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	
	
	// information 메소드 :  모든 필드값들을 하나의 문자열로 합쳐서 반환시켜주는 역할
	public String information() {
		return "Id : " + userId + ", Pwd : " + userPwd + ", Name : " + userName + ", age : " + age + ", gender : " + gender;
	}
	
	
	
	
	
	
}
