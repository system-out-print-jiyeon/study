package com.kh.chap01_condition.run;

import com.kh.chap01_condition.condition.A_If;
import com.kh.chap01_condition.condition.B_Else;
import com.kh.chap01_condition.condition.C_Switch;

public class Run {

	public static void main (String[] args) {
		
		/*
		 * ���α׷� �⺻������ ���������� �Ʒ��� ���������� ����(����)
		 * ��, �������� �帧�� �ٲ� �� ����̶�°� ���ؼ� ���� ������ �� ����!!
		 * 
		 * ���������� �����ϴ� ���ù�		--> ���ǹ�
		 * �ݺ������� �����ϴ� ���๮ 	--> �ݺ���
		 * �� ���� �帧�� ����			--> �б⹮
		 * 
		 * * ���ǹ�
		 * - ���ǽ��� ���� ���̳� �����̳ĸ� �Ǵ��ؼ� �ش� ������ ���ϰ�� �׿� �ش��ϴ� ���๮ ����
		 * - ���� ������ ���� ���ǹ�
		 * 
		 * ���ǹ��� ũ�� if���� switch������ ����
		 *
		 * �� �߿���  if�������� ũ�� 3������ ����
		 * 1. �ܵ� if��
		 * 2. if-else��
		 * 3. if-else if��
		 * 
		 */
		
		A_If a = new A_If();
		//a.method1();
		//a.method2();
		//a.method3();
		//a.method4();
		
		B_Else b = new B_Else();
		//b.method5();
		//b.method6();
		//b.method7();
		
		C_Switch c = new C_Switch();
		//c.method1();
		//c.method2();
		//c.method3();
		c.method4();
		
		
		
		
		
		
		
		
		
	}
	
	
}
