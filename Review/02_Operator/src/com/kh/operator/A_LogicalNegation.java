package com.kh.operator;

// �� ���� ������ (���׿����� == �Ѱ��� ���� ������ ����)
//	! : ���� �����ϴ� ������ (��, ������ �ݴ�� ����� ������)
public class A_LogicalNegation {

	public void method() {
		
		System.out.println("true�� ���� : " + !true);
		System.out.println("false�� ����  : " + !false);
		
		boolean b1 = true;
		boolean b2 = !b1;	// b2 = false
		
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
		
		
	}
	
}
