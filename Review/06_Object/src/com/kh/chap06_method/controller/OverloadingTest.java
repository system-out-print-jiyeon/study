package com.kh.chap06_method.controller;

public class OverloadingTest {
	
	// �����ε�  : �� Ŭ���� ���� ���� �޼ҵ������ ������ �� �ִ� ���
	
	public void test() {		// x.test();
		
	}
	
	
	public void test(int a) {		// x.test(10);
		
	}
	
	
	public void test(int a, String s) {		// x.test(10 , "");
		
	}
	
	public void test(int a , int b) {		// x.test(10, 20);
		
	}
	
	/*
	public void test(int c, int d) {		
		
	}
	*/
	// �����߻� --> �Ű��������̶��� ������� �ڷ����� ������ ������ �ٸ��� �ۼ��Ǿ�� ��!!
	
	
	/*
	public void test(int a , int b, String str) {		// x.test(10, 20, "");
		
	}
	
	public int test(int a , int b, String str) {
		return 0;
	}
	*/
	// �����߻� --> "��ȯ��"�� �ٸ��ٰ� �����ε� ������� ����!! (�ڸŰ������� ������ �޶�߸���!!)
	
	/*
	private void test(int a , int b, String str) {
		
	}
	*/ // �����߻� --> "����������" �ٸ��ٰ� �����ε� ������� ����!!
	
	/*
	 * * ��� 
	 * �����ε� : ������ �޼ҵ���� �ۼ��ϴ� ��
	 * 			��, ���������ڵ� ��ȯ���̵� �� ������ (���� �Ƶ簣��)
	 * 			"�Ű������� �ڷ����� ����, ������ �ٸ��� �ۼ��Ǿ�� ��!!"
	 * 
	 */
	
	
	
	
	

}
