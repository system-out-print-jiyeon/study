package com.kh.chap02_abstractAndinterface.part02_interface.model.vo;

public interface Basic {
	
	// �߻�Ŭ���� --> �Ϲ��ʵ� + �Ϲݸ޼ҵ� + [�߻�޼ҵ�]
	// �������̽� --> only ���(public static final)�ʵ� + �߻�޼ҵ�
	//		  --> �Ϻ��� �̿ϼ�!! �׻� �̿ϼ��̿�����
	
	
	// �������̽������� �ʵ�� ������ ����ʵ��̱� ������ ��������
	// �������̽���� ����߱� ������ �����ص� �˾Ƽ� ����� �������
	/*public static final*/ int NUM = 10;
	
	// �������̽������� �޼ҵ�� ������ �߻�޼ҵ��̱� ������
	// �������̽���� ����߱� ������ �˾Ƽ� �߻�޼ҵ�� �ν�, public abstract ��������, �׷��� ��ȯ���� ������ �־����!!
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
	

}
