package com.kh.variable;

public class F_Printf {

	public void printfMethod(){
		
		// println(����ϰ����ϴ� ��); --> ��� �� ����
		// print(����ϰ����ϴ� ��);	--> ���
		
		
		// System.out.printf("����ϰ���� ����", ����ϰ����ϴ� ��, ��, ��,,,,);
		// ����ϰ��� �ϴ� ������ ���� ������ ����(����)�� ���缭 ��¸� ���� --> ���ٶ��� ������!
		
		/*
		 * %d : ������ �� �ڸ���
		 * %f : �Ǽ��� �� �ڸ���
		 * %c : ���ڰ� �� �ڸ���
		 * %s : ���ڿ� �� �ڸ��� (���ڵ� ����)
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// 10
		System.out.println(iNum1);
		System.out.print(iNum1 + "\n");
		
		System.out.printf("%d\n" , iNum1, iNum2); // Ȯ���� �ڸ����� ���� ���̵� �ڿ� ���� ���õ�!
		// System.out.printf("%d", );  // �����߻� --> ���˿� �� ���� ���
		
		//"10 + 20 = 30"
		// xx + xx = xx
		System.out.println(iNum1 + "+" + iNum2 + "=" + (iNum1+iNum2) );
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1+iNum2 );
		
		// "iNum1 : 10, iNum2 : 20"
		System.out.println("iNum1 : " + iNum1 + ", iNum2 : " + iNum2);
		System.out.printf("iNum1 : %d, iNum2 : %d\n", iNum1, iNum2);
		
		
		System.out.printf("%5d\n", iNum1); // 5: 5ĭ ����Ȯ�� ��  / ��� : ������ ���� / ���� : �������� 
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f %f\n", dNum1, dNum2); // %f - �Ǽ����� ������ �Ҽ��� �Ʒ� 6°�ڸ����� ������ 
													//	 	���� �Ѿ�� �ݿø�, ���ڶ�� 0���� ä����
		
		System.out.printf("%.1f\t %.1f\n", dNum1, dNum2);	// \t <-- 1tab���� ����!!
		
	
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s\n", ch, str);
		System.out.printf("%C %S\n", ch, str);	// �빮�ڷε� ��� ����!!

		
	}
	
}
