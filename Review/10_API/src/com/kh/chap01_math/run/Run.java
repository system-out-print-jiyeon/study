package com.kh.chap01_math.run;

//import java.lang.*;		�̹� import�Ǿ������� �����Ǿ�����, java.lang�̿��ϴ� ���� �ٷ� �� �� ���� ex) String, Object ... 

public class Run {

	public static void main(String[] args) {
		
		
		
		// ����ʵ�
		System.out.println("���� : " + Math.PI);
		
		
		// ���밪�� �˰��� �� �� : abs
		int num1 = -10;
		System.out.println("���밪 : " + Math.abs(num1));
		
		
		// �ø� : ceil
		double num2 = 4.349;
		System.out.println("�ø� : " + /*(int)*/Math.ceil(num2));		// ���������ϸ� int������ ��������ȯ���൵ ��
		
		
		// �ݿø� : round
		System.out.println("�ݿø� : " + Math.round(num2));
		
		
		// ���� : floor
		System.out.println("���� : " + Math.floor(num2));
		
		
		// ���� ����� ������ : rint
		System.out.println("���� ����� ���� : " + Math.rint(num2));
		
		
		// ������(��Ʈ) : sqrt
		System.out.println("4�� ������ : " + Math.sqrt(4));
		
		
		// ���� : pow
		System.out.println("2�� 10���� : " + Math.pow(2, 10));
		
		
		// Math Ư¡
		// ��� �ʵ� ����ʵ�, ��� �޼ҵ� static �޼ҵ�!!
		// ���� static
		// ������ �ƽθ� private ==> ���� �Ұ��ϰ�
		
		//static --> ���α׷� ������ �� �� �ѹ� static �޸𸮿����� �ø�!!
		//			Math ��ü ������ �ʿ� ���� Ŭ������. ���� ���� ����
		
		// �ѹ��� �޸𸮿����� �÷����� �����ϴ� ���� ==> �̱�������
		
		
		
		
		
	}

}
