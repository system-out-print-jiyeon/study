package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Run {
	
	/*
	 * 7. ĸ��ȭ ���� => �Ϻ��� Ŭ������ ���¿ϼ�!!
	 * 
	 *    1) �������� : private
	 *       �� �ʵ忡 ���������� ������ �Ұ��ϰԲ� ó��
	 *       
	 *    2) setter/getter �޼ҵ� : public
	 *       ���������� ������ �Ұ������� ������ ���������� �����ؼ� ���� �ʱ�ȭ�ϰų� �Ǵ� ���� ��ȸ�� �� �ִ� �޼ҵ�
	 *       
	 *       setter�޼ҵ� ���� : ���ް� �޾Ƽ� �ش� �ʵ忡 �ʱ�ȭ(���� ����)
	 *       getter�޼ҵ� ���� : �ش� �ʵ忡 ��� �� ��ȯ(���� ��ȸ)
	 */
	
	
	public static void main(String[] args) {
		
		// ȫ�浿 ��ü
		Student hong = new Student();
		
		/*
		hong.name = "ȫ�浿";
		hong.age = 20;
		hong.height = 162.3;
		*/
		// private�� ���� ���� �Ұ�.. ��� ����..?
		// �������� ���Ҵٸ� ���������γ��� ������ �� �ֵ���!!
		
		// ���������� ������ �� �ִ� setter�޼ҵ� �̿��ؼ� �� �ʱ�ȭ
		hong.setName("ȫ�浿");
		hong.setAge(20);
		hong.setHeight(162.3);
		
		
		// xxx���� ���̴� xx���̰�, Ű�� xxxcm�Դϴ�. 
		//System.out.println(hong.name + "���� ���̴� " + hong.age + "���̰�, Ű��" + hong.height + "cm�Դϴ�.");
		
		// ���������γ��� ���� ��ȯ���ִ� getter�޼ҵ带 �̿��ؼ� �� �˾Ƴ���
		System.out.println(hong.getName() + "���� ���̴� " + hong.getAge() + "���̰�, Ű��" + hong.getHeight() + "cm�Դϴ�.");
		
		
		
		
	}

}
