package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteTest;

public class Run {

	public static void main(String[] args) {

		// "����Ʈ ��� ��Ʈ��" ������ ������ ����� �� ��!!
		
		// "����Ʈ ��Ʈ��" : �����͸� 1����Ʈ ������ �ۿ� ������ �Ұ��� ��� (���� ���.. 1����Ʈ�� �ѱ� ����)
		// "��� ��Ʈ��" : �ܺθ�ü�� ���������� ����Ǵ� ��δ�!!
		
		// "����Ʈ ��� ��Ʈ��" --> �ܺθ�ü�� �����ϰ� �� �ܺθ�ü�� ���������� ����� ��ο� �����͸� 1����Ʈ������ �����ϰڴ�!
		
		// XXXInpuStream	: XXX��ü�κ��� �����͸� �Է¹޴� ��� (�ܺθ�ü�κ��� ������ �о���ڴ�.)
		// XXXOutputStream  : XXX��ü�� �����͸� ����ϴ� ��� (�ܺθ�ü�� �����͸� �������ڴ�. ����ϰڴ�)
		
		// File InputStream / OutputStream		--> �ܺθ�ü�� ����!!
		// Audio InputStream / OutputStream		--> �ܺθ�ü�� �������ġ!!
		// Piped InputStream / OutputStream		--> �ܺθ�ü�� �� �ٸ� ���α׷�!!
		
		
		FileByteTest f = new FileByteTest();
		//f.fileSave();
		//f.fileread();
		
		// System.out.println((int)'��');  �ѱ�ũ�� ��û ũ��!
		
	
	}

}
