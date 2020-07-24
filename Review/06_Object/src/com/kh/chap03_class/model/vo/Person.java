package com.kh.chap03_class.model.vo;

public class Person {

	// 필드부
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;		// <-- private은 정보은닉 작업

	// 생성자부
	
	// 메소드부
	// 접근제한자[예약어] 반환형 메소드명([매개변수, 매개변수,,,,]){ 실행내용 }
	
	// * setter 메소드 (값 변경)
	// 전달 되는 값을 받아서 해당 필드에 초기화(대입) 해줄 목적을 가진 메소드
	
	// 반환형 : void (반환값이 없기떄문!)
	// 메소드명 : setXXX (필드명을 참고해서 메소드명 지어줌)
	// 매개변수명 : 필드명과 일치시켜줌
	public void setId(String id) {	// String id = "user01";
		this.id = id;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
		// return;		<-- 원래있으나 생략된거임
	}
	
	// * getter 메소드 : 각 필드에 담긴 값을 반환해주는 역할
	// 메소드명 : getXXX
	// 매개변수 : 필요없음
	// 반환형    : 각 필드값의 자료형
	
	public String getId() {
		return id;		// return : 결과값을 호출한곳으로 반환하겠다
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	// 모든 필드에 담긴 값을 하나의 문자열로 합쳐서
	// 반환해주는 메소드
	
	public String information() {
		return "id : " + id + ", pwd : " + pwd + ", name : " + name + ", age : " + age + 
				", gender : " + gender + ", phone : " + phone + ", email : " + email;
	}
	
	
	
	
	
	
	
	
	
}
