package com.kh.variable;

// �ٸ� ��Ű����� ���� Ŭ���������� ���� �� ����!! (com.kh.variable.A_Variable)
public class A_Variable {
	
	/*
	 * 	* �н���ǥ
	 * 	1. ������°� ����
	 * 	2. ������ �� ����ϴ���
	 *  3. ������ ��� ���� �Ǵ���
	 *  4. �������� ��� ������ �Ǵ���(����Ģ)
	 */

	public void printValue() {
		
		System.out.println("=== ���� ��� �� ===");
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		System.out.println(((100 + 10) *10) - 10);
		// ������� �� ��µ����� ���� �ǵ���, ���� �ǹ����� �ľ��� �� ����
		
		// 1. ������? --> � ���� �޸𸮿� ����ϱ� ���� �����̴�. (�ڽ�����)
		int point = 100;		// ����Ʈ
		int bonus = 10;			// ���ʽ�
		int personCount = 10;	// �����
		int fees = 10;			// ������
		
		System.out.println("=== ���� ��� �� ===");
		System.out.println(point + bonus);
		System.out.println((point + bonus) * personCount);
		System.out.println(((point + bonus) * personCount) - fees);
		
		/*
		 * 2. ������ ����ϴ� ����
		 * 
		 * - ������ �켱������ ���� �ǹ̸� �ο��ϱ� ���� �������� ���! (�������� ������)
		 * - ������ �� �� ���� ������ �ΰ� ��� ����� �������� ���!
		 * - ���������� ������ �������� ���!
		 */
		
		
	} 
	
	
	public void declareVariable() {
		
		// 3. ������ ��� ���� �Ǵ��� (������ ��� �����, ��� ���� �����)
		
		
	/*
	 * 3_1. ������ ���� (������ ���� ����ϱ� ���� ������ �޸𸮰����� Ȯ���س��� ����) == ����(�ڽ�)
	 * 
	 * [ǥ����] �ڷ��� ������;
	 * 
	 * �ڷ��� : � ���� ��Ƴ���, � ũ���� ���� ��Ƴ����� ���� ����(�ڽ�)�� ũ�� �� ������ ���ϴ� �κ�
	 * ������ : ������ �̸��� ���ϴ� �κ� (�ǹ̺ο�)
	 * 
	 * * ��������
	 * - �������� �ݵ�� ù ���ڰ� �ҹ��ڿ��ߵȴ�.
	 * - ���� �ܾ�� ���ս� ��Ÿǥ��� ��Ű��
	 * - ������ ���������� ���� �Ұ� (�ߺ��Ұ�)
	 * - �ش� ����({})�� ������ ������ �ش� ���������� ���� �� �� �ִ�!! (�ٸ� �޼ҵ忡���� ��� �Ұ�)
	 * => �������� ����
	 * 
	 */
		
		// ----- �ڷ���(8��) -----
		
		// 1. ����
		boolean isTrue;		//1byte
		
		// 2. ������
		
		// 2_1. ������ (4��)
		byte bNum;			//1byte (-128 ~ 127)
		short sNum;			// 2byte
		int iNum;			// 4byte --> ������ �߿� ���� ��ǥ���� �ڷ���(�⺻��) -21��xxx ~ 21��xxx
		long lNum;			// 8byte
		
		// 2_2. �Ǽ��� (2��)
		float fNum;			// 4byte
		double dNum;		// 8byte --> �Ǽ��� �߿� ���� ��ǥ���� �ڷ���(�⺻��) �� ��Ȯ�� ���� ���� �� �ֱ� ����
		
		// 3. ����('�ѱ���')��
		char ch;			// 2byte
		
		// ------- �����ڷ��� -------
		// 4. ���ڿ�("��������") --> ��Ư
		String str;			// byte���� ����
		
		
		/*
		 * 3_2. ������ �� ����(�ʱ�ȭ)
		 * 
		 * [ǥ����] �ڷ��� ������ = ��;
		 */
		
		isTrue = true;	// ������������ true, false ���� ���� ����
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8;	// long�� �������� ���ڰ� ���� �� l �Ǵ� "L"�� ������ long�ڷ����̶�� ���� ǥ���ϴ� ���� ����!
		
		fNum = 4.0f; // float�� �����ִ� �Ǽ��� ���� �� �ݵ�� f�� �ٿ��ߵ�!
		dNum = 8.0;
		
		ch = 'A';	// Ȭ����ǥ�� �̿��Ͽ� �� ����
		ch = '��';
		
		str = "ABC"; // �ֵ���ǥ�� �̿��Ͽ� �� ����
		
		// ������ �� �� ������ ���
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);

	}
	
	public void initVariable() {
		
		// ��������, �� ���� ���ε��� �����ϴ� ��� �幰��!
		
		// ���� ����� ���ÿ� �ʱ�ȭ(�� ����)
		// [ǥ����] �ڷ��� ������ = ��;
		
		// 1. ����
		boolean isTrue = true;		// 1byte
		// 2_1. ������
		byte bNum = 1;				// 1byte
		short sNum = 2;				// 2byte
		int iNum = 4;				// 4byte (������ �⺻��)
		long lNum = 8L;				// 8byte
		// 2_2. �Ǽ���
		float fNum = 4.0f;			// 4byte
		double dNum = 8.0;			// 8byte (�Ǽ��� �⺻��)
		// 3. ������
		char ch = '��';				// 2byte
		
		
		// 4. ���ڿ�(�����ڷ���)
		String str = "I���Ĺ�";
		
		// ������ ����� �� ���
		System.out.println("isTrue : " + isTrue); // "isTrue : true"
		System.out.println("bNum : " + bNum); // "bNum : 1"
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("str : " + str);
		
		int result = iNum * 2;
		
		System.out.println("resurlt : " + result);
		
		// ���� ('_'�� �̿��Ͽ� ����ڰ� ���� ���� �� ���� ����! ��, ���ڰ��� ����Ǳ� ��!)
		int etc = 99_999_999;
		System.out.println("etc : " + etc);
	
	}
	
	
	public void namingRule() {
		// 4. ��������Ģ
		
		int number;
		// 1) �������� �ߺ��� �� ����!!
		//double number;
		
		
		// 2) ��ҹ��ڴ� ����
		int numBer;
		
		
		// 3) �����(�̹� �ڹٿ��� ���ǰ� �ִ� Ű�����)	��� �Ұ�
		/*
		 * int true;
		 * int public;
		 * int class;
		 * int void;
		 * int abstract;
		 */
		
		// 4) ���� ���� (��, ���ڷ� ���۵Ǵ� �� �ȵ�!)
		int age1;
		//int 1age;
		
		// 5) Ư������ ���� (��, _ $ �̿��� Ư������ ��� �Ұ�!)
		int number_1;
		int number$1;
		//int number!1;
		//int number#1;
		
		
		// ------ ���Ѿ��� ��Ģ�� �ƴ����� ������� ------
		// 1) ��Ÿǥ��� ��Ű�� + �ҹ��ڷ� �����ϱ�
		String username;
		String userName; // ���ʻ� �´� ǥ��
		
		// 2) �ѱ� ��� �����ϱ� ������ �ѱ��� ������� �ʴ� ȯ�濡���� ������ �߻���ų �� ����!!
		String �̸� = "������";
		
		
		/*
		 *  ** ���� **
		 *  - ���� : ��(���ͷ�)�� ����ϱ� ���� ���� (�޸𸮻� ���� ���)
		 *  - ���� ������
		 *  	> �ǹ� �ο�
		 *  	> �� �� �� ���� �� ������ ����
		 *  	> �������� ����
		 *  
		 *   - ���� ����
		 *   	> ���� ���� :	�ڷ�� ������;
		 *   	> �� ����	:	������ = ��;
		 *   	> ���� ����� ���ÿ� �� ���� :	 �ڷ��� ������ = ��;
		 *   
		 *   - ���� ��� ��Ģ
		 */
		
	}
}
