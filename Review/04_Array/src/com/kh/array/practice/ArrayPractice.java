package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}

	}

	public void practice2() {
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr.length-i;
			System.out.print(arr[i] + " ");
		
		}
		
		
	}
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int num1 = sc.nextInt();
		
		int arr[] = new int[num1];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = i + 1 ;
			System.out.print(arr[i] + " ");
		}

	}
	
	public void practice4() {
		
		String[] arr = {"���", "��", "����", "������", "����"};
		System.out.print(arr[1]);
		
	}
	
	
	//�ڡڡ�
	public void practice5() {
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()];
		
		
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = str.charAt(i);
		}
			int count =0;
			
			System.out.print(str + "��  " + ch + "�� �����ϴ� ��ġ(�ε���) : " );
			
			for(int i=0; i<arr.length; i++) {
				
				if(arr[i] ==ch) {
					System.out.print(i+ " ");
					
					count++;
				}
			}
			System.out.println();
			System.out.println(ch+ "���� : " + count );
			
			*/
		
		
		// �����ϱ� �� �� �� �غ�
		// 1. ����ڿ��� ���ڿ� �Է¹ޱ�
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();	// "apple"
		
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0); 
		
		// 2. ����ڰ� �Է��� ���ڿ� �߿� ������ ���ڵ��� char�迭�� ���
		
		// 2-1. char[] ���� (ũ��� ���ڿ��� ���̿� �����ϰ�)
		char[] arr = new char[str.length()];
		
		// 2-2. �ݺ����� �̿��ؼ� �Űܴ��
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		// ['a', 'p', 'p', 'l', 'e']
		//			�����
		// 	 ch   ch   ch   ch   ch
		
		// 3. �˻��� ���ڰ� � ����ִ���, ���° �ε����� �ִ��� �ľ��ϱ�
		
		int count =0;	// ��ġ�ϴ� ���ڸ� ã�� �� ���� ī���� �� ���� (������ ������ ���� == 1�� ������ų ����)
		
		// "xxxxxxx��  x�� �����ϴ� ��ġ(�ε���) : "
		System.out.print(str + "�� " + ch + "�� �����ϴ� ��ġ : ");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ch) {	// ����ڰ� �Է��� �˻��� ���ڿ� �ش�迭�� �ε������� ��ġ�� ���
				count++;
				System.out.print(i + " ");
				
			}
			
		}
		
		System.out.println();
		// X ���� : X
		System.out.println(ch + " ���� : " + count);
	
		}
		
	
	
	public void practice6() {
		
		/**
		int[] arr = new int[7];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6���� ���� �Է� : ");
		int num = sc.nextInt();
		String day = ""; 
		
		
		if(num>=0 && num<7) {
			for(int i=num; i<arr.length; i++) {
				switch(num) {
				case 0 : day = "������"; break;
				case 1 : day = "ȭ����"; break;
				case 2 : day = "������"; break;
				case 3 : day = "�����"; break;
				case 4 : day = "�ݿ���"; break;
				case 5 : day = "�����"; break;
				case 6 : day = "�Ͽ���"; break;
				
					}
				System.out.print(day); break;
				}	
		}else {
		System.out.print("�߸� �Է��ϼ̽��ϴ�.");
		}
			**/
		String[] arr = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6���� ���� �Է� : ");
		int num = sc.nextInt();
		
		if(num>=0 && num<7) {
		System.out.print(arr[num] + "����");
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		
		
		

		
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		int sum =0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("�迭" + i + "��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("���� : " + sum);
		
	}
	
	// �ڡڡڡڡ� ��Ģã�� �����
	public void practice8() {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			// 1. ����ڿ��� 3�̻��� Ȧ���� �ش��ϴ� �������� �Է¹��� (�ݺ�)
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			// 2. ����� �Է��ߴ��� ���ߴ��� �Ǻ�
			if(num>=3 && num%2==1) { // ����� �Է����� ��� (�迭�� �� ���� �� ����ϰ� ����������)
				
				// ����ڰ� �Է��� ����ũ�⸸ŭ�� int�迭 �����
				int[] arr = new int[num];
				
				// �迭�� �߰������� 1�� �����ϴ� ��, �� ���ĺ��ʹ� 1�� �����ϴ� �� ���
				// 3	=> [1 "2" 1]		=> ��� �ε��� 1	=> 3 / 2	=> 1
				// 5	=> [1 2 "3" 2 1]	=> ��� �ε��� 2	=> 5 / 2	=> 2
				// 7	=> [1 2 3 "4" 3 2 1]=> ��� �ε��� 3	=> 7 / 2	=> 3 
				// 								��� �ε��� : �迭�� ũ�� / 2
				
				
				int value = 1;
				for(int i=0; i<arr.length; i++) {
					arr[i] = value;
					if(i < arr.length / 2 ) {
					value++;
					}else {
					value--;
					}
					
				}
				//		i<3
				// i=0  true	arr[0] = 1;	value++ => 2	i++
				// i=1	true	arr[1] = 2; value-- => 1	i++
				// i=2	true	arr[2] = 1; value-- => 0	i++
				// i=3  false
				
				// �� ������ ����ϱ�
				for(int i=0; i<arr.length; i++) {
					if(i == arr.length-1) {
				System.out.print(arr[i]);
					}else {
						System.out.print(arr[i] + ", ");
					}
				}
				// �ݺ��� ����������
				break;
				
			}else {	// ����� �Է����� �ʾ��� ��� ("�ٽ��Է��ϼ���." ��� �� �ݺ��� ����)
				System.out.println("�ٽ� �Է��ϼ���.");
			}			
		}
		
		
	}
	
	
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		String[] chicken = {"���" , "�Ķ��̵�" , "�Ѹ�Ŭ" , "�����̳�" , "����"};
		
		for(int i=0; i<chicken.length;i++) {
			if(name.equals(chicken[i])) {
				System.out.println(chicken[i] + "ġŲ ��� ����");
				break;
			}else {
				System.out.println(name + "ġŲ�� ���� �޴��Դϴ�.");break;
			}
			
			
		}
		
	
	}
	
	
	public void practice10() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
		}
		System.out.print(Arrays.toString(arr));
		
	}
	
	
	
	// �ڡڡ�
	public void practice11() {
		
	
		// 1. ũ�� 10¥�� int[]�迭 �����ϱ�
		int[] arr = new int[10];
		
		// 2. �ش� �迭�� �� �ε����� 1~10 ������ ������ ���
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
		}
		// 3. �迭 ��ü ���
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// 4. �ִ밪, �ּҰ� �Ǻ� �� ���
		// �������� ���� �� 
		Arrays.sort(arr);
		
		// 0�� �ε����� : �ּҰ�
		// 9�� �ε����� : �ִ밪
		System.out.println("\n�ִ밪 : " + arr[9]);
		System.out.println("�ּҰ� : " + arr[0]);

		
		
	}
	
	
	public void practice12() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) { 
					i--;
					break;
				}
		
			}
		}
		System.out.print(Arrays.toString(arr));
	
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String num = sc.nextLine();
		
		char[] ch = new char[num.length()];
		for(int i=0; i<num.length(); i++) {
			ch[i] = num.charAt(i);
			
			if(i>7) {
				System.out.print("*");
			}else {
				System.out.print(ch[i]);
			}
		}
		
	}
	
	public void practice14() {
		
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 45 +1);
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) { 
					i--;
					break;
				}
			}
			
			
		}
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	

