package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class Run {

	public static void main(String[] args) {

		Desktop d = new Desktop("�Ｚ", "d-01", "¯¯����ũž", 1500000, true);
		
		SmartPhone s = new SmartPhone("����", "s-01", "������11pro", 1500000, "KT");
		
		Tv t = new Tv("LG", "t-01", "�̳�����Ƽ��", 3500000, 60);
		
		
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		/*
		 * * ����� ����
		 * - ���� ���� ���� �ڵ�� ���ο� Ŭ���� �ۼ� ����
		 * - �ڵ带 ���������� �����ϱ� ������ �ڵ��� �߰��� ���濡 ����
		 * --> �ڵ��� �ߺ��� �����Ͽ� ���α׷��� ���꼺�̳� ���������� ũ�� �⿩
		 * 
		 * * ����� Ư¡
		 * - Ŭ�������� ����� ���߻���� �Ұ���! (���� ��Ӹ� ����)
		 * - �θ��� private ���������ڷ� ����Ǿ��ִ� ��� �ƹ��� ��ӱ������ �ؼ� ���� ���� �Ұ�
		 * 	(��, protected�� �ϰ� �Ǹ� �ڽĿ��� ���� ���� ����!)
		 * - ��õǾ����� ������ ��� Ŭ������ Object Ŭ������ �ļ��̴�!
		 * 	--> ObjectŬ�������� �����ϴ� �޼ҵ�� �󸶵��� ���� �� �� �ִ�.
		 * 	--> ���� �ȵ�� �� �Ը���� ������(�������̵�) �����ϴ�.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
