package com.kh.dimension;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DimensionalArray {

	// ������ �迭 : �������迭 �������� �ϳ��� �������� 2���� �迭
	
	public void method1() {
		
		// *****
		// *****
		// *****
		
		// �� 3�� �ݺ�			=> �ٱ��� for��
		// �� �ະ�� �� 5�� �ݺ� 	=> ���� for��
		
		for(int i=0; i<3; i++) {	// 0�������� 2���� 1�� �����ϴ� ���� �ݺ� (�� 3ȸ)
			
			for(int j=0; j<5; j++) {	// 0�������� 4���� 1�� �����ϴ� ���� �ݺ� (�� 5ȸ)
				System.out.print("*");	
			}
			System.out.println();
		}
		
		// int[] arr
		// int arr[]
		
		/*
		 * 1. ������ �迭 ����
		 * 	  �ڷ��� �迭��[][];
		 * 	  �ڷ���[] �迭��[];
		 * 	  �ڷ���[][] �迭��;
		 */
		
		int arr1[][];
		int[] arr2[];
		//int[][] arr;
		
		/*
		 * 2. �������迭 �Ҵ� (ũ�� ����)
		 * 
		 * �迭�� = new �ڷ���[��ũ��][��ũ��]; 
		 */
		
	
		// ������ �迭 ����� ���ÿ� ũ������
		
		/*
		int[][] arr;
				+
		arr = new int[3][5];
				||				���ٷ� ��ģ��	*/
		int[][] arr = new int[3][5];
		
		
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		
		// ���� ����
		System.out.println("���� ���� : " + arr.length);  
		
		// ���� ����
		System.out.println("0���� ���� ���� : " + arr[0].length);
		System.out.println("1���� ���� ���� : " + arr[1].length);
		System.out.println("2���� ���� ���� : " + arr[2].length);
		
		
		// �� : �ٱ��� for�� (0~2) (0~���Ǳ���-1)
		// �� : ���� for�� (0~4)  (0~���ະ���Ǳ���-1)
		
		// ���� �ε����� �����ϴ� �ٱ��� for�� (i)
		for(int i=0; i<arr.length; i++) {
			
			// ���� �ε����� �����ϴ� ���� for�� (j)
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			
			System.out.println();
			
		}
	
	}
	
	public void method2() {
		
		int[][] arr = new int[3][5];
		
		// 1  2  3  4  5 
		// 6  7  8  9  10
		// 11 12 13 14 15 
		
		/*
		 * arr[0][0] = 1;
		 * arr[0][1] = 2;
		 * arr[0][2] = 3;
		 * arr[0][3] = 4;
		 * ....
		 * arr[1][0] = 6;
		 * arr[1][1] = 7;
		 * arr[1][2] = 8;
		 * ....
		 * arr[2][2] = 13;
		 * arr[2][3] = 14;
		 * arr[2][4] = 15;
		 *          
		 */
		
		int value = 1;
		// ���� �ε����� �����ϴ� �ٱ��� for��
		for(int i=0; i<arr.length; i++) {
			
			// ���� �ε����� �����ϴ� �ٱ��� for��
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
			}
		
		}
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				//System.out.print(arr[i][j] + " ");
				System.out.printf("%-2d ", arr[i][j]);
			}
			System.out.println();
		}
	
	}
	
	
public void method3() {
		
		//int[] arr = {1, 2, 3, 4, 5};		--> ������ �迭 �Ҵ�
		
		// ������ �迭 �Ҵ�� ���ÿ� �� ����
		int[][] arr = {{1, 2, 3, 4, 5}, 
					   {6, 7, 8, 9, 10}, 
					   {11, 12, 13, 14, 15}};
		
		// ���� �ε����� �����ϴ� �ٱ��� for��
		for(int i=0; i<arr.length; i++) {
			
			// ���� �ε����� �����ϴ� ���� for��
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%-2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void method4() {
		// ���� �迭
		// ���� ���������� �� �ະ ���� ������ �������� ���� ����
		
		int[][] arr = new int[3][];	// �����迭 �Ҵ� (���� �� �־���ϰ� ���� �ٷ� �������ص���)
		
		// 0���� 2��
		arr[0] = new int[2];
		// 1���� 1��		
		arr[1] = new int[1];				
		// 2���� 3��		
		arr[2] = new int[3];
		
		// 1 2 
		// 3
		// 4 5 6 
		
		/*
		 * arr[0][0] = 1;
		 * arr[0][1] = 2;
		 * 
		 * arr[1][0] = 3;
		 * 
		 * arr[2][0] = 4;
		 * arr[2][1] = 5;
		 * arr[2][2] = 6;
		 * 
		 */
		
		int value=1;
		// ���� �ε�����  �����ϴ� �ٱ��� for�� (0~2)
		for(int i=0; i<arr.length; i++) {
		
		// ���� �ε����� �����ϴ� ���� for�� (0~1|0|2)
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=value++;
			}	
		}
		
		
		for(int i=0; i<arr.length; i++) {
			
			// ���� �ε����� �����ϴ� ���� for�� (0~1|0|2)
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				
					}
				System.out.println();
				}	
				
		}


	
	public void method5() {
		// �����迭�� �Ҵ�� ���ÿ� �� ����
		int[][] arr = {{1,2}, {3}, {4,5,6,}}; 
		
		for(int i=0; i<arr.length; i++) {
	
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
					}
				System.out.println();
				}
		
		}

	
	
	public void method6() {
		
		Scanner sc = new Scanner(System.in); 
		
		double[][] arr = new double[2][4];
		
		// ���� �����ϴ� for�� (i==0 : �������� , i==1 : ��������)
		for(int i=0; i<arr.length; i++) {
			// ���� �����ϴ� for��
			for(int j=0; j<arr[i].length-1; j++) {
				if(i==0) {
				System.out.print("�������� : ");
				}else {
				System.out.print("�������� : ");
				}
				arr[i][j] = sc.nextDouble();
				arr[i][3] += arr[i][j];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}


	public void method7() {
		// 3�� 3�� int�������迭 ������ ��
		// �� ������ 1~10������ ������ �߻� �� ���
		
		int[][] arr = new int[3][3];
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				arr[i][j] = (int)(Math.random()*10+1);
				
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	
	}

	public void method8() {
		
		// 3�� 3���� 1~10������ ������ ��� (��, �ߺ�����)
		
		
		// ũ�� 9¥���� ������ �迭 ���� �� �ߺ������� ���� ��
		int[] temp = new int[9];
		
		for(int i=0; i<temp.length; i++) {
			temp[i] = (int)(Math.random()*10+1);
		// ������ ����ִ� �����̶� ���ϴ� for��
			for(int j=0; j<i; j++) {
				if(temp[i] == temp[j]) {	// �ߺ����� ������ ���
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(temp));
		// ex) [1, 9, 10, 6, 4, 2, 3, 8, 5]	<-- temp��
		
		
		// ������ �迭�� �Űܴ��
		int[][] arr = new int[3][3];
		
		/*			  temp��
		 * arr[0][0]= temp[0]
		 * arr[0][1]= temp[1]
		 * arr[0][2]= temp[2]
		 * 
		 * ...
		 * 
		 * arr[2][0]= temp[6]
		 * arr[2][1]= temp[7]
		 * arr[2][2]= temp[8]
		 */
		
		int index =0;
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = temp[index++];
				System.out.print(arr[i][j] + " ");
				}
			System.out.println();
		}
	}

	
	public void bingo() {
		
		Scanner sc = new Scanner(System.in);
		
		// 5�� 5�� ¥�� ������ �����
		// 5�� 5��¥���� 1~25������ ������ �ߺ��� ���� ��Ƴ���
	
		int[] bingo = new int[25];
		
		for(int i=0; i<bingo.length; i++) {
			bingo[i] = (int)(Math.random()*25+1);
			for(int j=0; j<i;j++) {
				
				if(bingo[i] == bingo[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(bingo));
		
		int[][] arr= new int[5][5];
		
		int value = 0;
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<5;j++) {
				arr[i][j] = bingo[value++];
				
			}
			
		}
		//------------- ������ ������ �ϼ� ------------
		// ������ ���
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<5;j++) {
				
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
		//--------------- ������� �ϱ� --------------
		
		int count = 0;
		
		while(true) {
			
			System.out.print("������ �Է� : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			for(int i=0; i<5; i++) {
				
				for(int j=0; j<5;j++) {
					
					if(arr[i][j] == num) {
						arr[i][j] =0;
						}
					System.out.printf("%4d ", arr[i][j]);
					}
				System.out.println();
				}
			System.out.println("������ �����ðڽ��ϱ�? (y/n) : ");	
			char ch = sc.nextLine().charAt(0);
			
			if(ch == 'Y' || ch == 'y') {
				break;
			}
		}
		
		
		
		System.out.println(count + "�� �Է��߽��ϴ�.");
		
		
		
	}

	
}//
