package com.kh.chap02_encapsulation.model.vo;


public class Student {
	
	// �ʵ��
	/*
	 * �ʵ� == ������� == �ν��Ͻ�����
	 * 
	 * <ǥ����>
	 * ���������� [�����] �ڷ��� ������;
	 * 
	 * �ʵ�ο� ���������ڴ� private���� �ؼ� ���������� ������ �Ұ��ϰԲ� "��������"
	 * ��ü���⼳���Ģ �� �ϳ�
	 */
	private String name;
	private int age;
	private double height;
	
	
	// �����ں�
	
	// �޼ҵ��
	/*
	 * �޼ҵ� == ���
	 * 
	 * < ǥ���� >
	 * ���������� ��ȯ�� �޼ҵ��([�Ű�����]) {
	 * 		// ��� ����
	 * }
	 * 
	 * �Ű����� : �ش� �޼ҵ� ȣ�� �� ���޵Ǵ� ���� �޾��ֱ� ���� ����
	 * 
	 */
	
	// ���������γ��� �����ؼ� ȣ���� �� �ִ� �޼ҵ常���!!
	// * ������ϴ� �����͸� ���޹޾Ƽ� �ش� �ʵ忡 �ʱ�ȭ �����ִ� ����� �޼ҵ�
	//   == setter �޼ҵ� 
	//   �ַ� setter�޼ҵ���� ������ �� setXXX���� ������!!
	
	/*
	public void setName(String newName) { // String newName = "ȫ�浿";
		
		name = newName;
	}
	*/
	
	// setter�޼ҵ���� setXXX���� ��Ÿǥ����� ��Ųä�� �����ִ� ���� (ex. setName, setAge, setHeight)
	// �Ű������� ���� �ʵ��� ��ġ�����ִ°� ����
	public void setName(String name) { // String name = "ȫ�浿";
		
		// �Ű����� name = �Ű����� name;		--> ���� ȿ�� ����!
		//name = name;
		
		// �ʵ� name = �Ű����� name;
		this.name = name;
	}
	
	
	// ���޹��� ���̰��� age �ʵ忡 ���Խ����ִ� ����� setter�޼ҵ�
	public void setAge(int age) { // int age = 20;
		this.age = age;
	}
	
	// ���޹��� Ű���� height �ʵ忡 ���Խ����ִ� ����� setter�޼ҵ�
	public void setHeight(double height) { // double height = 162.3;
		this.height = height;
	}
	
	
	// * �� �ʵ忡 ��䰪�� ��ȯ���ִ� ����� �ϴ� �޼ҵ� (getter�޼ҵ�)
	//   ��� getXXX() �޼ҵ������ ������
	//   getter�޼ҵ�� ���� �ʵ忡 ����ִ� ���� ��ȯ�� �����ٲ��� ������
	//   ������ ���޵Ǵ� �� ����(�Ű����� �����س��� �ʿ� ����)
	
	// name �ʵ忡 ��� ���� ��ȯ���� ������ ���� getter�޼ҵ�
	// void : ��ȯ���� ����.
	public String getName() {
		
		return name;
	}
	
	// age �ʵ忡 ��� ���� ��ȯ���� ������ ���� getter�޼ҵ�
	public int getAge() {
		return age;
	}
	
	// height �ʵ忡 ��� ���� ��ȯ�� getter�޼ҵ�
	public double getHeight() {
		return height;
	}

}






