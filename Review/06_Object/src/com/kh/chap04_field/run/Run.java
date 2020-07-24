package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class Run {

	public static void main(String[] args) {
		
		// ------------- 1. FieldTest1 ----------------
		/*
		FieldTest1 f1 = new FieldTest1();	// ��ü����
		f1.test(5); 	// �޼ҵ� ����
		*/
		
		
		
		
		// ------------- 2. FieldTest2 ----------------
		
		FieldTest2 f2 = new FieldTest2();
		
		// �� �ʵ忡 ���� ���� �غ�����
		
		// public --> ��𼭵� ���� ����
		System.out.println(f2.pub);
		
		// protected --> ���� ��Ű�� �� + �ٸ� ��Ű���� ��� ��ӱ���
		// System.out.println(f2.pro);
		
		// default --> ���� ��Ű�� ��
		// System.out.println(f2.def);
		
		// private --> only �� Ŭ����������
		// System.out.println(f2.pri);
		
		
		
		
		// ------------- 3. FieldTest3 ----------------
		System.out.println(FieldTest3.sta);
		System.out.println(FieldTest2.sta);

		
		System.out.println(Math.random());
		System.out.println(FieldTest3.NUM);
		System.out.println(Math.PI);
		

	}

}
