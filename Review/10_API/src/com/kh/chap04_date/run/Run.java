package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * * Date (java.util)
		 * - Date�� �ڹ� ������ ��� ��â�⿡ ���ϰ� ���� �ϼ����� ���� ���� Ŭ����. �ٱ������� ���� �������� X
		 * 
		 * 
		 * 
		 */

		// �⺻�����ڸ� ���� Date ��ü ����	--> �ý��� ��¥(���糯¥)�� �������
		Date today  = new Date();
		System.out.println("�⺻������ (���� ��¥)  : " + today);
		
		// ���� ���ϴ� ��¥(2020�� 06�� 19��)�� ���� ����
		// 1) �Ű����� �����ڸ� ���ؼ� ����	
		Date date = new Date(2020 - 1900, 6 - 1, 19, 15, 30 ,21);	// Deprecated : �������� �ʴ´�. (�ٸ� ������ ����)
			// ���������� ���� ������ �⵵ + 1900
			// 			���� ������ �� + 1  �� ������ �����ؾ���
		
		
		System.out.println("�Ű����� ������	 : " + date);
		
		
		
		// 2) �⺻�����ڷ� ������ �� setter�޼ҵ�� �� ����
		Date date2 = new Date();
		
		date2.setYear(120);	// 2020 - 1900
		date2.setMonth(5);	// 6 - 1
		date2.setDate(19);
		
		System.out.println("set�޼ҵ�       	 : " + date2);
		
		
		
		// �� �Ը������ ������ ������ä�� ����ϰ��� �� ��
		// java.text.SimpleDateFormat Ŭ����
		
		// 2020�� 07�� 22�� 19�� 36�� 22��
		// ���� ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		
		// today --> ���� ������ ä�� --> String
		String formatDate = sdf.format(today);
		System.out.println(formatDate);
		
		
		System.out.println(sdf.format(date));
		
		
		
		//�ڡڡ� �˾Ƶ־� �� ��
		// String���� �����ϴ� �޼ҵ��
		// Parsing �Ľ��ϴ°�
		// SimpleDateFormat ��������
		
		
		
		
	}

}
