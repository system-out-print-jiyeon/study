package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	/** �Ķ����� ���� §�� **/
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("9. ����");
		
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menu = sc.nextInt();
		
		// if-else if��  �̿�
		
		/*if(menu == 1) {
			System.out.println("�Է� �޴��Դϴ�.");
		} else if(menu == 2) {
			System.out.println("���� �޴��Դϴ�.");
		}else if(menu == 3) {
			System.out.println("��ȸ �޴��Դϴ�.");
		}else if(menu == 4) {
			System.out.println("���� �޴��Դϴ�.");
		}else if(menu == 9) {
			System.out.println("���α׷��� ����˴ϴ�.");
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		*/
		
		
		// 2. switch�� �̿�
		/*
		switch(menu) {
		case 1 : System.out.println("�Է� �޴��Դϴ�.");break;
		case 2 : System.out.println("���� �޴��Դϴ�.");break;
		case 3 : System.out.println("��ȸ �޴��Դϴ�.");break;
		case 4 : System.out.println("���� �޴��Դϴ�.");break;
		case 9 : System.out.println("���α׷��� ����˴ϴ�.");break;
		default : System.out.println("�߸��Է��ϼ̽��ϴ�.");break;
		}
		*/
		
		
		// 3. switch�� �̿��� �� String ���� �̿��ϴ� ���
		String str = "";
		
		switch(menu) {
		case 1 : str = "�Է�";break;
		case 2 : str = "����";break;
		case 3 : str = "��ȸ";break;
		case 4 : str = "����";break;
		case 9 : System.out.println("���α׷��� ����˴ϴ�.");return;
		default : System.out.println("�߸��Է��ϼ̽��ϴ�.");return;
		}
		
		System.out.println(str + " �޴��Դϴ�.");
		
		/**
		System.out.println("1. �Է�");
		String a = "�Է�";
		
		System.out.println("2. ����");
		String b = "����";
		
		System.out.println("3. ��ȸ");
		String c = "��ȸ";
		
		System.out.println("4. ����");
		String d = "����";
		
		System.out.println("9. ����");
		String e = "����";
		
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if (num == 1) {
		System.out.print(a + " �޴��Դϴ�.");
		}else if (num == 2) {
		System.out.print(b + " �޴��Դϴ�.");
		}else if (num == 3) {
		System.out.print(c + " �޴��Դϴ�.");
		}else if (num == 4) {
		System.out.print(d + " �޴��Դϴ�.");
		}else if (num == 9) {
		System.out.println("���α׷��� ����˴ϴ�.");
		}		
		**/
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		
		
		/** 
		 if(num > 0 && (num % 2 == 0)) {
			System.out.print("¦����");
		} else if (num > 0 && num % 2 == 1) {
			System.out.print("Ȧ����");
		} else if (num <= 0) {
			System.out.print("����� �Է����ּ���.");
		}
		**/
		
		// ��ø if������ �������� ������ ���� �˻��ϰ�!
		if(num > 0) {
			if(num%2==0) {
				System.out.print("¦����");
			}else {
				System.out.print("Ȧ����");
			}
		}else {
			System.out.print("����� �Է����ּ���");
		}
		
		
	}
	
	
	public void practice3() {
		
		/** ����§�� , ���ö� ����**/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int eng = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int math = sc.nextInt();
		
		
		int sum = kor+eng+math;
		double avg = (sum / 3.0) ;
		
		if(kor >= 40 && eng>= 40 && math >= 40 && avg >= 60) {
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);	
		System.out.println("���� : " + math);
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println("�����մϴ�, �հ��Դϴ�!");
		}else {
			System.out.println("���հ��Դϴ�.");
		}
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
	
		/**
		switch(month) {
		case 1 : 
		case 2 : 
		case 12 : System.out.println(month + "���� �ܿ��Դϴ�."); break;
		case 3 :
		case 4 : 
		case 5 : System.out.println(month + "���� ���Դϴ�."); break;
		case 6 :
		case 7 : 
		case 8 : System.out.println(month + "���� �����Դϴ�."); break;
		case 9 :
		case 10 : 
		case 11 : System.out.println(month + "���� �����Դϴ�."); break;
		default : System.out.println("���� �߸� �Էµ� ���Դϴ�.");break;
	}
		 **/
		
		
		// String ���� �̿��� ��¹� �ѹ���
		String season = "";
		
		switch(month) {
		case 1 : 
		case 2 : 
		case 12 : 
					season = "�ܿ�";
					break;
		case 3 :
		case 4 : 
		case 5 : 
					season = "��";
					break;
		case 6 : 
		case 7 :
		case 8 : 
					season = "����";
					break;
		case 9 : 
		case 10 : 
		case 11 :
					season = "����";
					break;
					
		default :	season = "�߸��Էµ� ��";
					break;
		}
		
		System.out.println ( month+ "���� " + season + "�Դϴ�.");
		
		
		
	}
	
	
	
	// �ڡڡ�
	public void practice5() {
		
		String userid = "boram";
		String userpw = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		String pw = sc.nextLine();
		
		if(userid.equals(id) && userpw.equals(pw)) {
			System.out.println("�α��� ����");
		}else if (userid.equals(id)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}else if(userpw.equals(pw)) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�. ");
		}
		
		
		
		
		/** �����Ѱ�, �ȵ� �� �� 
		String result1 = "�α��� ����";
		String result2 = "��й�ȣ�� Ʋ�Ƚ��ϴ�.";
		String result3 = "���̵� Ʋ�Ƚ��ϴ�.";

		
		
		if(id == "boram" && pw == "1234") {
			System.out.println(result1);
		}else if(id == "boram" && pw != "1234") {
			System.out.println(result2);
		}else if(id != "boram" && pw == "1234") {
			System.out.println(result3);
		}
		 **/
		
	}
	
	
	
	
	public void practice6() {
		
	Scanner sc = new Scanner(System.in);	
	
	System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
	String level = sc.nextLine();
	
	/**
	switch(level) {
	case "������" : System.out.println("ȸ������, �Խñ� ����");
	case "ȸ��" : System.out.println("�Խñ� �ۼ� , ��� �ۼ�");
	case "��ȸ��" : System.out.println("�Խñ� ��ȸ"); break;
	default : System.out.println("�߸� �Է��߽��ϴ�");
	}
	**/
	
	switch(sc.nextLine()) {	//	<-- �� �̷��� �ٷ� �Է��ؼ� ���� ����..
	case "������" : System.out.println("ȸ������, �Խñ� ����");
	case "ȸ��" : System.out.println("�Խñ� �ۼ� , ��� �ۼ�");
	case "��ȸ��" : System.out.println("�Խñ� ��ȸ"); break; // ���⼭ break�ؾ� default������ �Ѿ�� �ʴ´�.
	default : System.out.println("�߸� �Է��߽��ϴ�"); break;
	
	}
	
	
	}
	

	
	public void practice7() {
		
		/** �����Ѱ�, ���ö����� **/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է����ּ��� : ");
		double height = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է����ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("BMI ���� : " + bmi);
		
		if (bmi < 18.5) {
			System.out.print("��ü��");
		}else if(bmi < 23) {
			System.out.print("����ü��");
		}else if(bmi < 25) {
			System.out.print("��ü��");
		}else if(bmi < 30) {
			System.out.print("��");
		}else {
			System.out.print("�� ��");
		}

		
	}
	

	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		//��
		char ch = sc.nextLine().charAt(0);
		
		//-------------------------------------------------
		
		// if-else if�� �̿��ؼ�
		/*
		if(num1>0 && num2>0 && ch=='+') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1+num2));
		}else if(num1>0 && num2>0 && ch=='-') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1-num2));
		}else if(num1>0 && num2>0 && ch=='*') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1*num2));
		}else if(num1>0 && num2>0 && ch=='/') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1/num2));
		}else if(num1>0 && num2>0 && ch=='%') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1%num2));
		}else {
			System.out.print("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}
		*/
		
		//-----------------------------------------------------
		
		// **���� ������ ���׷��̵� (��ø if�� ��� : ����� ������ ���� �˻��ϰ� �����Ѵ�!)
		
		/*
		if(num1>0 && num2>0) {	//1_1. �ΰ��� ���� ��� ����� ��� => �� �����ڵ��� �� �Է����� ���
			
		// 2. �����ȣ�� ���Ŀ� ���� ��������� ��� ���
		if(ch == '+') {
				System.out.printf("%d %c %d = %d", num1, ch, num2, (num1+num2));
				}else if(ch=='-') {
				System.out.printf("%d %c %d = %d", num1, ch, num2, (num1-num2));
				}else if(ch=='*') {
				System.out.printf("%d %c %d = %d", num1, ch, num2, (num1*num2));
				}else if(ch=='/') {
				System.out.printf("%d %c %d = %d", num1, ch, num2, (num1/num2));
				}else if(ch=='%') {
				System.out.printf("%d %c %d = %d", num1, ch, num2, (num1%num2));
				}else {
				System.out.print("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
				}
		}else {		// 1_2. ����� �ƴ� ���� �Է��� ���(num1�� ����� �ƴϰų�, num2�� ����� �ƴϰų�, �� �� ����� �ƴϰų�)
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}
		*/
		
		//-----------------------------------------------------------
		
		// ** ���� ���뿡�� �� ���׷��̵�
		
		int result=0;		// �����ȣ�� ���缭 ��� ������ ����� ����� ���� ����!
		
		if(num1>0 && num2>0) {
			// �����ȣ�� ������ ������ϴ� �� switch������ �ٲ� ����
			switch(ch) {
			case '+' : result = num1 + num2;break;
			case '-' : result = num1 - num2;break;
			case '*' : result = num1 * num2;break;
			case '/' : result = num1 / num2;break;
			case '%' : result = num1 % num2;break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�."); return;
			}
		}else {
			 System.out.println("����� �ƴ� ���� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�."); return;
		}
		
		// ��¹��� ���⿡ �� �ѹ��� ����Ұ���
		System.out.printf("%d %s %d = %d" , num1, ch, num2, result);
		

		
		/** �ȵ� �� ��
		int result = 0;
		
		if(num1>0 && num2>0 && sign == "+" ) {
			result = num1 + num2 ;
		}else if(num1>0 && num2>0 && sign == "-" ) {
			result = num1 - num2 ;
		}else if(num1>0 && num2>0 && sign == "*" ) {
			result = num1 * num2 ;
		}else if(num1>0 && num2>0 && sign == "/" ) {
			result = num1 / num2 ;
		}else if(num1>0 && num2>0 && sign == "%" ) {
			result = num1 % num2 ;
		}else {
			System.out.print("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");	return;
		}
		
		System.out.printf("%d %s %d = %d", num1, sign, num2, result);
		**/
	
	}

	
	// �ڡڡ� �����!!!!!!
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ���� : ");
		int midTest = sc.nextInt();
		
		System.out.print("�⸻ ��� ���� : ");
		int finTest = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int homework = sc.nextInt();
		
		System.out.print("�⼮ ȸ�� : ");
		int attendance = sc.nextInt();
		
		double mid = midTest * 0.2;
		double fin = finTest * 0.3;
		double hw = homework * 0.3;
		double at = attendance;
		
		double sum = mid + fin + hw + at ;

		System.out.println("========== ��� ==========");

		if(sum>=70 && at>=20 * 0.7) {	// 1_1. ������ 70�� �̻��̸鼭 �⼮Ƚ���� 20�� ���� �������� 70%�̻��� ���
			System.out.println("�߰� ��� ����(20) : " + mid);
			System.out.println("�⸻ ��� ����(30) : " +fin);
			System.out.println("���� ���� 	  (30) : " + hw);
			System.out.println("�⼮ ����	  (20) : " + at);
			
			System.out.println("���� : " + sum);
			System.out.println("PASS");
			
		}else{ // 1_2. �װ� �ƴ� ��� (������ ������ ���� �ְ�, �⼮ Ƚ���� ������ ���� �ְ�, �ƴϸ� �� �� ������ ���� ���� ���)
			
			if(at<20*0.7){	// 2. �ٵ� �� �߿����� �⼮Ƚ���� ������ ���
				System.out.println("FAIL [�⼮ Ƚ�� ����] (" + attendance +"/20)" );	
			}
			// �� ���Ʒ� �ΰ��� ���ǹ� ���� ���� --> ���� �Ѵ� ������ ��� �� �� ����� ��!!
			
			if(sum < 70) {	// 3. �ٵ� �� �߿����� ������ ������ ���
				System.out.println("FAIL [���� �̴�] (���� " + sum +")");
				}
			}
		
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ����� �����ϼ���.");
			
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦�� / Ȧ��");	
		System.out.println("3. �հ� / ���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");	
		System.out.println("8. ����");
		System.out.println("9. Pass / Fail");
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
		case 5 : practice5(); break;
		case 6 : practice6(); break;
		case 7 : practice7(); break;
		case 8 : practice8(); break;
		case 9 : practice9(); break;
		default : System.out.println("�߸��Է��ϼ̽��ϴ�.");return;
		}
		
		
	}
	
	
	
	
	
	

}
