package com.kh.chap03_class.model.vo;

public class Person {

	// �ʵ��
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;		// <-- private�� �������� �۾�

	// �����ں�
	
	// �޼ҵ��
	// ����������[�����] ��ȯ�� �޼ҵ��([�Ű�����, �Ű�����,,,,]){ ���೻�� }
	
	// * setter �޼ҵ� (�� ����)
	// ���� �Ǵ� ���� �޾Ƽ� �ش� �ʵ忡 �ʱ�ȭ(����) ���� ������ ���� �޼ҵ�
	
	// ��ȯ�� : void (��ȯ���� ���⋚��!)
	// �޼ҵ�� : setXXX (�ʵ���� �����ؼ� �޼ҵ�� ������)
	// �Ű������� : �ʵ��� ��ġ������
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
		// return;		<-- ���������� �����Ȱ���
	}
	
	// * getter �޼ҵ� : �� �ʵ忡 ��� ���� ��ȯ���ִ� ����
	// �޼ҵ�� : getXXX
	// �Ű����� : �ʿ����
	// ��ȯ��    : �� �ʵ尪�� �ڷ���
	
	public String getId() {
		return id;		// return : ������� ȣ���Ѱ����� ��ȯ�ϰڴ�
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
	
	
	// ��� �ʵ忡 ��� ���� �ϳ��� ���ڿ��� ���ļ�
	// ��ȯ���ִ� �޼ҵ�
	
	public String information() {
		return "id : " + id + ", pwd : " + pwd + ", name : " + name + ", age : " + age + 
				", gender : " + gender + ", phone : " + phone + ", email : " + email;
	}
	
	
	
	
	
	
	
	
	
}
