package com.kh.chap04_field.model.vo;

// �ʵ���� ���������ڸ� �׽�Ʈ �غ��� ���� Ŭ����
public class FieldTest2 {

	/*
	 * * �ʵ�ο� ��밡���� ���������� (4���� �� �� �� ����)
	 * 
	 * (+) public			=> ��𼭵�(���� ��Ű��, �ٸ� ��Ű��) ���� ����
	 * (#) protected		=> ���� ��Ű�� ���� ���� + �ٸ� ��Ű���� ��� ��ӱ����������� ���� ����
	 * (~) default			=> ���� ��Ű�� ���� ����
	 * (-) private			=> only �ش� Ŭ���������� ���� ����
	 * 
	 * ���������� �Ʒ��� ���������� ���� ������ ������
	 * 
	 */
	
	public String pub ="public";
	protected String pro = "protected";
	/*default*/ String def = "default";
	private String pri = "private";
	
	
	public static String sta = "FieldTest2";
	
	
	
}
