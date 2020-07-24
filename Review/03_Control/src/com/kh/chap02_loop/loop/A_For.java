package com.kh.chap02_loop.loop;

import java.util.Scanner;

public class A_For {

	/*
	 * * for��
	 * [ǥ����]
	 * for(�ʱ��;���ǽ�;������){ // �ݺ�Ƚ���� �����ϱ� ���� �����ϴ� �͵�
	 * 			.. �ݺ������� �����Ű�����ϴ� ���౸�� ..
	 * }
	 * 
	 * for���� ������ ����
	 * �ʱ��  --> ���ǽ� �˻� --> true�� ��� ���౸�� ���� --> ������
	 * 		--> ���ǽ� �˻� --> true�� ��� ���౸�� ���� --> ������
	 * 		--> �ٽ� ���ǽ� --> true�� ��� ���౸�� ���� --> ������
	 * ---------------- �� ������ ��� �ݺ� ------------------
	 * 		--> �ٽ� ���ǽ� --> false�� ��� ���౸�� ���� X ---------> �ݺ� ��������
	 * 
	 * - �ʱ�� : �ݺ����� ����� �� "�� �ѹ��� ����Ǵ� ����"
	 * 			(�ַ� ���� ����� ���ÿ� �ʱ�ȭ ����)
	 * - ���ǽ� : "�ݺ����� ����� ����"�� �ۼ��ϴ� ����
	 * 			���ǽ��� true�� ��� �ش� ���౸���� ����
	 * 			���ǽ��� false�� �Ǵ� ���� �ݺ��� ���߰� ��������
	 * 			(�ַ� �ʱ�Ŀ��� ���� ������ ������ ���ǽ��� �ۼ�)
	 * 
	 * - ������ : �ݺ����� �����ϴ� �������� ������Ű�� �κ�
	 * 			(�ַ� �ʱ�Ŀ� ������ ������ ������ ����������(++, --)�� ���)
	 * 
	 */
	
	public void method1() {
		// "�ȳ��ϼ���"�� 5�� �ݺ��ؼ� ���
		/*
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		*/
		// 100���� ��� ��¹� 100�� ����? --> ����
		
		for(int i=1; i<=5; i++) {		// 1�������� 5���� 1�� �����ϴµ��� �ݺ� (5ȸ)
			System.out.println("�ȳ��ϼ���");
		}
		for(int i=0; i<=4; i++) {		// 0�������� 4���� 1�� �����ϴµ��� �ݺ� (5ȸ)
			System.out.println("�ݰ����ϴ�");
		}
		for(int i=1; i<6; i++) {		// 1�������� 5���� 1�� �����ϴµ��� �ݺ� (5ȸ)
			System.out.println("�ٽø�����");
		}
		for(int i=5; i>=1; i--) {		// 5�������� 1���� 1�� �����ϴµ��� �ݺ� (5ȸ)
			System.out.println("��ο�");
		}
		
		//10ȸ
		/*
		for(int i=1; i<=10; i++)		// 1�������� 10���� 1�� �����ϴµ��� �ݺ� (10ȸ)
		for(int i=11; i<=20; i++)		// �굵
		*/
	}
	
	public void method2() {
		// 1���� 5���� ���
		// 1
		// 2
		// 3
		// 4
		// 5
		/*
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
	    */
		
		// �ݺ����� ���õ� �������� �̿��� ���� ����
		for(int i=1; i<=5; i++) {	// 1�������� 5���� 1�� �����ϴµ��� �ݺ� (5ȸ)
			System.out.println(i);
		}
		
		// 1 2 3 4 5 
		for (int i=1; i<6; i++) {
			System.out.print(i + " ");
		}

	}
	
	
	public void method3() {
		// 5 4 3 2 1 
		for(int i=5; i>=1; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void method4() {
		// 0 1 2 3 4 5 6 7 8 9 
		// 1 2 3 4 ..... 8 9 10
		
		for(int i=0; i<=9; i++) {
			System.out.print(i + " ");
		}
		for(int i=1; i<=10; i++) {
			System.out.print(i +" ");
		}
	}
	
	
	public void method5() {
		// 1���� 10������ Ȧ������ ���
		// 1 3 5 7 9 
		
		/*
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				System.out.print(i + " ");	// i���� Ȧ���� ��츸 ��� 
			}
		}
		*/
		
		for(int i=1; i<=10; i+=2) {	// 1�������� 10���� 2�� �����ϴµ��� �ݺ� (5ȸ)
			System.out.print(i + " ");
		}
		
	}
	
	public void method6() {
		
		// 1�������� 10������ ���������� �հ�
		// int sum = 1+2+3+4+5+6+7+8+9+10;
		
		// sum += 1;
		// sum += 2;
		// sum += 3;
		// ....
		// sum += 9;
		// sum += 10;
		
		// ��Ģ�� ã��!!
		// // sum += 	10�� �ݺ�!
		// �ٸ� �������� ���� 1�������� 10���� 1�� �����ϴ� ���̱���!
		
		int sum = 0;
		
		for(int i=1; i<=10; i++) { // 1�������� 10���� 1�� �����ϴµ��� �ݺ� (10ȸ)
			sum += i;
		}
		System.out.println("�� �հ� : " + sum);
	
	}
	
	public void method7() {
		// 1���� ���� ����ڰ� �Է��� �������� �� �հ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� : ");
		int num = sc.nextInt();
		
		// ����ڰ� �Է��� �������� ������� �ƴ��� (��ȿ�� �� ����� �Է��ߴ��� ��ȿ���˻�)
		if(num>0) { // ����� ��� => �� �Է�
			// sum += 1;
			// sum += 2;
			// ....
			// sum += num;
		
			int sum = 0;
			
			for(int i=1; i<=num; i++) {	// 1�������� num���� 1�� �����ϴ� ���� �ݺ� (numȸ)
				sum +=i;
			}
			
			// 1���� ���� ����ڰ� �Է��� �������� �� �հ�
			System.out.println("1�������� " + num+ "������ �� �հ� : " +sum);
		}else {	// �װ� �ƴ� ��� => �߸� �Է�
			System.out.print("����� �Է����ּ���.");
		}

	}
	
	public void method8() {
		
		// 1�������� � ������ (1~10������ ������ ����)������ �հ�
		
		// MathŬ�������� �����ϴ� random()�޼ҵ� ȣ��� => �������߻�!
		// java.lang.Math �� �ִ� �޼ҵ� ȣ��� ������ ���� ����!! => Ŭ������.�޼ҵ�();
		// 0.0 ~ 0.99999999 ������ �������� �߻�!
		// 0.0 <= �����Ǽ��� < 1.0
		
		//int random = Math.random();	//double���� int�� ���������ؼ� �߻��� ����
		//			0.0 <=		< 1.0		--> 0.0 ~ 0.9999999999
		
		// int random = Math.random() * 10;
		//			0.0 <=		< 10.0		--> 0.0 ~ 9.999999999
							
		// int random = Math.random() * 10 + 1;
		//			1.0 <=		< 11.0		--> 1.0 ~ 10.999999999
		
		int random = (int)(Math.random() * 10 + 1);
		//			1 <=		< 11		--> 1 ~ 10		<--- int������ �ٲ�鼭 �����ͼս� �߻�, �ڿ� �� ������
		
		System.out.println("������ : " + random);
		
		
		int sum=0;
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		
		//"1�������� xx������ �� �հ� : xxx"
		System.out.println("1�������� " + random + "������ �� �հ� : " +sum);
		
	}
	// ��
	public void method9() {
	
		// ����ڿ��� ���ڿ� �Է¹��� ��
		// �� �ε����� ���ڸ� ���� �� �Է�
		
		// ���� ��� apple�� �Է�		--> str�� ���
		// a	--> ��¹�(str.charAt(0));
		// p	--> ��¹�(str.charAt(1));
		// p	--> ��¹�(str.charAt(2));
		// l	--> ��¹�(str.charAt(3));
		// e	--> ��¹�(str.charAt(4));
		
		// ����	5		 4			10
		//	 apple   	kiwi	strawberry
		//	 01234		0123	0123456789
		
		// �������ε����� �׻� (���ڿ��� ���� -1)�̱���!
		
		// �����ϰ��� �ϴ� �ε������� 0~�������ε���(���ڿ��� ���� -1)���� 1�� ������!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		System.out.println("���ڿ��� ���� : " + str.length());
		
		//for(int i = 0; i<= (str.length()-1); i++) {
		for(int i=0; i<(str.length()); i++) {
			System.out.println(str.charAt(i));
		}
	
	}
	
	public void method10() {
		// ������ 2�� ����ϱ�
		
		for(int i=1; i<10; i++ ) {
			System.out.println("2 X " + i + " = " + 2*i);
		}

	}
	
	public void method11() {
		// ����ڰ� �Է��� ���� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ��(2~9)�� �Է��ϼ��� : ");
		int dan = sc.nextInt();
		
		if(dan>1 && dan<10) {
			for(int i=1; i<10; i++) {
				System.out.println(dan + " X " + i +" = "+ dan*i );
			}
			
		}else {
			System.out.println("2���� 9������ ����� �Է��ϼ���.");
		}

	}
	
	public void method111() {	//method11�� ����
		// 2~9������ ������ ���� ���
		int dan = (int)(Math.random() * 8 + 2);	// 2 3 4 5 6 7 8 9
												// *(����) + (���ۼ�)
		
		if(dan>1 && dan<10) {
			for(int i=1; i<10; i++) {
				System.out.println(dan + " X " + i +" = "+ dan*i );
			}
			
		}else {
			System.out.println("2���� 9������ ����� �Է��ϼ���.");
		}	
	}
	
	
	public void method12() {
		// ����ڿ��� �� ���� ������ �Է¹޾�
		// �� ���� �������� ���������� ū�������� ���� ��� , �� �հ����
		
		// 2, 4 �Է����� �� --> 2 3 4	�� �հ� : 9
		// 4, 2 �Է����� �� --> 2 3 4 	�� �հ� : 9
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		/*
		int min = 0;	// �� �� �� ���� ���� ������ ����
		int max = 0;	// �� �� �� ū ���� ������ ����
		
		if(num1>num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		*/
		
		int min = Math.min(num1, num2);	//2
		int max = Math.max(num1, num2);	//4
		
		int sum = 0;
		// min�������� max���� 1�� �����ϴ� ���� �Ź� ���!
		for(int i=1; i<=max; i++) {	// min�������� max���� 1�� �����ϴµ��� �ݺ�
			sum += i;
		}
		
		System.out.println();
		System.out.println("���հ� : " + sum);

	}
	
	/*
	 * ��ø for��
	 * 
	 * for(�ʱ��1; ���ǽ�1; ������1) {
	 * 
	 * 	������ ����1;
	 * 
	 * 	for(�ʱ��2; ���ǽ�2; ������2){
	 *		������ ����2;
	 * 	}
	 * 
	 * 	������ ����3;
	 * 
	 * }
	 * 
	 */
	
	public void method13() {
		
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5 
		
		// ù��° ������ ������ ��	1 2 3 4 5 
		// �ι�° ������ ������ ��	1 2 3 4 5 
		// ����° ������ ������ ��	1 2 3 4 5 
		
		// �ٱ��� for������ ���� ����
		// ���� for������ ���� ����
		for(int i=1; i<=3; i++) {		// --> ���
			
			for(int j=1; j<=5; j++) {	// --> ����
				System.out.print(j + " ");
			
			}
			
		System.out.println();			// --> ����ִ� �������� ����
		}
		
		/*
		 * i=1	true
		 * 		j=1	true 1��� j++
		 *  	j=2	true 2��� j++
		 *  	j=3	true 3��� j++
		 *   	....
		 *    	j=5	true 5��� j++
		 *    	j=6 false	--> ���� �ݺ��� ��������
		 *    	���� ��� i++
		 *    
		 * i=2	true
		 * 		j=1	true 1��� j++
		 *  	j=2	true 2��� j++
		 *  	j=3	true 3��� j++
		 *   	....
		 *    	j=5	true 5��� j++
		 *    	j=6 false	--> ���� �ݺ��� ��������
		 *    	���� ��� i++
		 * 
		 * i=3	true
		 * 		j=1	true 1��� j++
		 *  	j=2	true 2��� j++
		 *  	j=3	true 3��� j++
		 *   	....
		 *    	j=5	true 5��� j++
		 *    	j=6 false	--> ���� �ݺ��� ��������
		 *    	���� ��� i++
		 * 
		 * 
		 * i=4 false	----> �ٱ��� �ݺ��� ��������
		 */

	}
	
	public void method14() {
		// 0�� 0�� ~ 23�� 59��
		// �ð��� 0~23�ñ��� 1�� ������
		// �� �ð� �ϳ� ������ 0~59�б��� 1�� ������
		
		// �� --> 0���� 23���� 1�� ����			--> �ٱ��� for������ �ذ�
		// �� --> �� �ø��� 0���� 59���� 1�� ����	--> ���� for������ �ذ�
		
		for(int hour=0; hour<24; hour++) {
			
			System.out.println("======= "+ hour + "�� =======");
			
			for(int min=0; min<60; min++ ){
			
				System.out.println( hour + "��" + min + "��");
			
			}
		
			System.out.println();	
		}	
	
	}
	
	public void method15() {
		// 2�ܿ��� 9�ܱ���
		
		// �� --> 2�������� 9���� 1�� ����		=> �ٱ��� for��
		// �� --> �� �ܸ��� 1���� 9���� 1�� ����	=> ���� for��
		
		for(int dan=2; dan<10; dan++){
			if(dan % 2 == 0) {	// <-- ���ǹ����� ¦���ܸ� ����ϱ�
				System.out.println("=== " + dan + "�� ===");
				
				for(int su=1; su<10; su++) {
					//System.out.println(su + " X " + dan + " = " + dan*su);
					System.out.printf("%d X %d = %d\n", dan, su, dan*su);
				}
				System.out.println();
			}
		
		}
	}
		
	public void method16() {
		
		//	*****
		//	*****
		//	*****
		
		// ���� 1~3���� �ݺ� (3ȸ)				=> �ٱ��� for��
		// ���� �� �ึ�� 1~5���� �ݺ� (5ȸ)		=> ���� for��
		
		for(int i=1; i<4; i++) {
			for(int j=1; j<6; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}
		
		
		public void method17() {
			//   1234
			// 1 1***	i=1	j=1
			// 2 *2**	i=2 j=2
			// 3 **3*	i=3 j=3
			// 4 ***4	i=4 j=4
			
			//			i=j	��ġ�� ���=> ���� ���
			//				�װ� �ƴ� ���=> "*" ���
			
			for(int i=1; i<5; i++) {	// ���� ����
				
				for(int j=1; j<5; j++) {
					if(i==j) {
					System.out.print(i);
					}else {
					System.out.print("*");
					}
				}System.out.println();
			}
			
			
		}
		
		
		
		
	
	
	
	
	
	
	
}
