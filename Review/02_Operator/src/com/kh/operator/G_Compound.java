package com.kh.operator;

public class G_Compound {

	/*
	 * * ���� ��� ���� ������ : ��������� (+-/*%)�� ���Կ����ڸ� �Բ� ����ϴ� ������
	 * 					 ����ó�� �ӵ��� �ξ� �����Ƿ� ����� ����
	 * 
	 * += -= *= /= %=
	 * 
	 * a = a + 3;		=>		a += 3;
	 * a = a - 3;		=>		a -= 3;
	 * a = a * 3;		=>		a *= 3;
	 * a = a / 3;		=> 		a /= 3;
	 * a = a % 3;		=> 		a %= 3;
	 * 
	 */
	
	public void method() {
		
		int num = 12;
		
		System.out.println("������ num : " + num);		//12
		
		// num�� ������Ű��
		num = num + 3;
		System.out.println("3������Ų num : " + num);
		
		// num�� �� 3 ������Ű��
		/*
		num++;
		num++;
		num++;
		*/		// --> 1���ۿ� �� ������Ŵ
		
		num += 3;
		//num =+ 3;		<--  num�� ���(+)3�� �����ϴ� ����
		System.out.println("�� 3 ������Ų num : " + num);
		
		// num�� 5���ҽ�Ű��
		num -= 5;	//num = num - 5
		System.out.println("5���ҽ�Ų num : " + num);
		
		// num�� 6�� ������Ű��
		num *= 6;	//num = num * 5
		System.out.println("6�� ������Ų num : " + num);
		
		// num�� 2�� ���ҽ�Ű��
		num /= 2;	//num = num / 2
		System.out.println("2�� ���ҽ�Ų num : " + num);
		
		// num�� 4�� ������ ���� ������
		num %= 4;	//num = num % 4
		System.out.println("���� num : " + num);
		
		String str = "Hello";
		System.out.println("str : " + str);
		
		str += "World";	// str = str + "World";
		System.out.println("str : " + str);
		
		str += 'A';	//str = str + A
		System.out.println(str);
		
		str += 1;		// str = str + 1;
		System.out.println(str);
	}
	
	
	
}
