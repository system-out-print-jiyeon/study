package com.kh.chap02_abstractAndinterface.part02_interface.run;

import com.kh.chap02_abstractAndinterface.part02_interface.model.vo.Baby;
import com.kh.chap02_abstractAndinterface.part02_interface.model.vo.Basic;
import com.kh.chap02_abstractAndinterface.part02_interface.model.vo.Mother;
import com.kh.chap02_abstractAndinterface.part02_interface.model.vo.Person;

public class Run {
	
	public static void main(String[] args) {
		
		/*
		
		Person m = new Mother("������", 50, 70, "���");
		Person b = new Baby("��Ʊ�", 3.5, 70);
		
		System.out.println(m);
		System.out.println(b);
		
		// ������ �ƱⰡ ���� �Դ´�.
		m.eat();		// ���� : ������ +10, �ǰ��� -10
		b.eat();		// �Ʊ� : ������ +3, �ǰ��� +1
		
		
		// ������ �ƱⰡ ���� �ܴ�.
		m.sleep();		// ���� : �ǰ��� +10
		b.sleep();		// �Ʊ� : �ǰ��� +3
		
		
		System.out.println("\n========================== ������ ==========================\n");
		System.out.println(m);
		System.out.println(b);
		*/
		
		// �������̽� ���� ���������� �̿ϼ��� �����̱� ������ ��ü���� �Ұ�
		// Basic b = new Basic();
		
		Basic b1 = new Mother("������", 50, 70, "�Ծ�");
		Basic b2 = new Baby("��Ʊ�", 3.2, 70);
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.eat();
		b2.eat();
		
		b1.sleep();
		b2.sleep();
		
		System.out.println("============ ������ ============");
		System.out.println(b1);
		System.out.println(b2);
		
		

		// 			|			�Ϲ�Ŭ����			|			�߻�Ŭ����			 |			�������̽�			
		//================================================================================================
		//	����		|  		 �Ϲ��ʵ� + �Ϲݸ޼ҵ� 	    | �Ϲ��ʵ� + �Ϲݸ޼ҵ� + [�߻�޼ҵ�] |		����ʵ� + �߻�޼ҵ�
		//------------------------------------------------------------------------------------------------
		//	���		|						���ϻ��(extends)					 |	    ���߻�� ���� (implements)
		//------------------------------------------------------------------------------------------------
		// �������̵�     |			���������� 			|		�Ϲݸ޼ҵ�� ����������,	 | 		������ ������ �������̵�
		//			|							|		�߻�޼ҵ�� ������		 |
		//------------------------------------------------------------------------------------------------
		//				==============================================================>>>
		// 			���������� �� ���� �������� �� £���� (�Ծ��� �� ����), ������ �������̵� �ؾߵǴ°� �� �������ٴ� ��
		
		
		// Ŭ������ Ŭ���� �� 	  : Ŭ������ extends Ŭ������
		// Ŭ������ �������̽� �� : Ŭ������ implements �������̽�, �������̽�, ....
		
		// ��Ư�����̽�)
		// �������̽��� �������̽� �� : �������̽�  extends  �������̽�, �������̽�, ... (�������̽��� ������ ���߻�Ӱ���)
		
		
		
		
		
		
		
		
		
	}

}
