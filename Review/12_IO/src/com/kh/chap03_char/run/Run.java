package com.kh.chap03_char.run;

import com.kh.chap03_char.model.dao.FileCharTest;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * "���� ��� ��Ʈ��" : �ܺθ�ü ���� �� �ش� �ܺθ�ü�� ���������� ����� ��ο� 2byte������ ������ ���۰���
		 * 
		 * "���� ��Ʈ��" : 2byte ������ ������ ���� ������ ��Ʈ��
		 * "��� ��Ʈ��" : �ܺθ�ü�� ���������� �����ϴ� ���
		 * 
		 * XXXReader : XXX��ü�κ��� �����͸� �Է¹޴� ���
		 * XXXWriter : XXX��ü�� �����͸� ����ϴ� ���
		 * 
		 */
		
		FileCharTest fc = new FileCharTest();
		//fc.fileSave();
		fc.fileRead();
		
		
		

	}

}
