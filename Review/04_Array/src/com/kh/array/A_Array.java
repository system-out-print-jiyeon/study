package com.kh.array;

import java.util.Scanner;

public class A_Array {

	/*
	 * * 배열 : 여러개의 값을 보관할 수 있는 공간 (단, 같은 자료형에 해당하는 값들만 보관)
	 * 		  같은 자료형의 변수를 하나의 묶음으로 다루는 것
	 * 		  각 인덱스의 자리에 값을 기록!	(인덱스는 항상 0부터 시작)
	 * 
	 */
	
	public void method1() {
		// * 배열을 왜 쓰는지 (배열 안쓰는 경우 어떤 번거로움이 있는지...)
		
		// - 다량의 데이터를 기록해두고자 할 때 일일히 변수만들고 담아서 관리하면 되긴 함..
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// 반복문 사용 불가하고 일일히 출력해야됨
		/*
		 System.out.peintln(num1); 
		 System.out.peintln(num2); 
		 System.out.peintln(num3); 
		 System.out.peintln(num4); 
		 System.out.peintln(num5); 
		 */
		
		/*
		for(int i=1; i<=5; i++) {
			System.out.peintln(num + i); 
		}
		*/
		
		// - 반복문 사용불가
		int sum = num1 + num2 + num3 + num4 + num5;
		
		// * 배열사용법
		/*
		 * 1. 배열 선언
		 * 		자료형 배열명[];
		 * 		자료형[] 배열명;
		 */
		// int arr[];
		// int[] arr;
		
		/*
		 * 2. 배열 할당 (배열의 크기를 지정!!)
		 * 	  배열명 = new int[배열크기];
		 */
		// arr = new int[5];
		
		// => 위의 과정을 사실상 동시에 진행 (선언과 동시에 할당)
		int[] arr = new int[5];		// 배열의 크기 5로 지정되는 순간 (5개의 방이 생김.. 0번방 ~ 4번방)
		
		/*
		 * 3. 값 대입 (초기화)
		 * 		배열명 [인덱스] = 값;
		 */
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		 */
		// arr[5] = 5;
		
		// 마지막 인덱스 == 배열의 크기 -1
		// for(int i=0; i<=arr.length -1; i++)
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
	
		// 배열의 장점 =  배열 사용시 일정한 규칙이 있을 경우  "반복문" 통해 편리하게 사용 가능
		
		for(int i=0; 1<arr.length; i++) {
			System.out.println(arr[i]);
		}
	
		
		int sum2 = 0;
		
		// * 누적해서 더해주기
		// sum2 += arr[0]; 
		// sum2 += arr[1]; 
		// ....
		// sum2 += arr[4]; 
		for (int i=0; i<arr.length; i++) {
				sum2 += arr[i];
		}
		System.out.println("총 합계 : " + sum2);
		
		System.out.println(arr);
		
	}
	
	public void method2() {
		
		int a = 10;
		double d = 2.3;
		
		int[] iArr = new int[5];
		double[] dArr = new double[7];
		
		System.out.println(a);
		System.out.println(d);
		
		/*
		 * 기본자료형(8개)으로 선언한 변수
		 * => 진짜 값(리터럴)을 담는 변수를 => 일반변수 라고 한다
		 * 
		 * 그 외 자료형(String, int[], char[], ...)
		 * => 주소값을 담는 변수 => 레퍼런스(참조) 변수
		 * 
		 */
		
		System.out.println(iArr);		//	[I@15db9742		--> 주소값
		System.out.println(dArr);		//	[D@6d06d69c		--> 주소값
										
		System.out.println(iArr[0]);	//					--> 주소값에 찾아간 후 [0]방 찾아가기
											
	}
	
	public void method3() {
		
		double[] dArr = new double[3];
		
		for(int i=0; i<dArr.length; i++) {
			System.out.println(dArr[i]);	
		}
		
		// 아직 값을 안 대입했는데 오류없이 잘 출력이 될 수 있었던 이유가
		// 배열의 각 인덱스에 별도로 대입하지 않으면 JVM이 지정한 기본값이 담기게 됨!
		// 왜? Heap영역에는 절대 빈 공간이 있어서는 안됨!! => JVM이 자동으로 초기값 부여
		
		int[] iArr = new int[5];
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);	
		}
	}
	
	
	public void method4() {
		
		int[] arr = new int[5];
		
		/* 배열에 초기화
		 * arr[0] = 1;
		 * arr[1] = 2;
		 * arr[2] = 3;
		 * arr[3] = 4;
		 * arr[4] = 5;
		 */
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
		}
		
		// arr[0] : 1
		// arr[1] : 2
		// arr[2] : 3
		// arr[3] : 4
		// arr[4] : 5
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i +"] : " + arr[i]);
		}
		
		System.out.println("arr : " + arr);
		System.out.println("arr의 해시코드 값 : " + arr.hashCode());		// 주소값의 10진수 형태
		System.out.println("배열의 길이 : " + arr.length);
		
		
	}
	
	public void method5() {
		
		// 사용자가 입력한 정수값만큼의 배열 크기 지정
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("새로 할당할 배열의 길이 : ");
		int size = sc.nextInt();
		
		char[] arr = new char[size];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// int = 기본값 0
		// double = 기본값 0.0
		// char = '  '
		
		
	}

	
	public void method6() {
		
		int[] arr = new int[5];
		/*
		 *  arr[0] = 2;
		 *  arr[1] = 4;
		 *  arr[2] = 6;
		 *  arr[3] = 8;
		 *  arr[4] = 10;
		 */
		int value = 2;
		for(int i=0; i<arr.length; i++) {
				arr[i] = value;
				value += 2;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("arr의 길이 : " + arr.length);
		System.out.println("arr의 주소값 : " + arr.hashCode());
		
		// 추가로 값을 더 넣어주게 되면 오류 발생!!
		//arr[5] = 12;
		
		
		// * 배열의 가장 큰 단점!!
		// - 한 번 지정된 크기는 더이상 변경이 불가!
		
		// 만일 크기를 변경해야만 한다면 다시 배열을 할당
		// (배열의 크기를 다시 지정한 새로운 배열 만들어야 됨)
		arr = new int[10];
		
		System.out.println("===== 변경 후 =====");
		System.out.println("arr의 길이 : " + arr.length);
		System.out.println("arr의 주소값 : " + arr.hashCode());
		
		// 주소값 변경됨!! (기존에 참조하고 있던 곳과 연결 끊긴 후 새로운 곳을 참조하고있음!)
		
		// 끊어진 기존것은 Heap 영역에 둥둥 떠다니는 상태 (어느 곳에도 참조되지 않고)
		// => 일정시간이 지나면 가비지 컬렉터(GC)가 지워줌 (자바의 특징 중 하나 : 자동메모리 관리)
		
		// 지금 할당된 배열을 지우고자 할 때 어떻게 해야되나요?
		arr = null; 	// 주소값이 없다 라는것을 의미
		
		System.out.println("===== 삭제 후 arr =====");
		System.out.println("길이 : " + arr.length);
		System.out.println("주소값 : " + arr.hashCode());
		
		// NullPointerException : 아무것도 참조하지 않는 null이라는 특수한 값을 참조하고 있을 때 발생
		// null.XXX
		
	
	}
	
	public void method7() {
		// 배열 선언 및 크기지정 => 값 초기화
		
		// 배열 선언 및 크기지정 및 값 초기화
		// 자료형[] 배열명 = {값, 값, 값};
		// 자료형 배열명[] = new 자료형[] {값, 값, 값};
		
		int[] arr = {1, 2, 3, 4};
		int arr2[] = new int[] {1, 2, 3, 4};
		
		System.out.println(arr == arr2);		// 값은 같지만 주소는 달라서 false(주소값 비교)
	
	}
	
	
	
	
	// ---------------------------------------------	
	
	
	
	public void method8() {
		
		// 문자열 보관할 수 있는 String[] 크기 5로 지정한 후
		// 반복적으로 사용자에게 좋아하는 과일 명 입력받은 후 해당 배열에 차곡차곡 담기
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("좋아하는 과일 명 : ");
			arr[i] = sc.nextLine();
		}
		
		// 인덱스에 담긴 값 출력
		for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
		}
		
	}
	
	public void method9() {
		
		// 크기 10짜리 정수형 배열 만들고
		int[] arr = new int[10]; 
		
		// 0번 인덱스 ~ 마지막인덱스까지
		// 매번 새로이 만들어지는 랜덤값 (1~100)을 담을거임
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
			
		}

		// 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
	public void method10() {
		// 사용자에게 3명의 키 정보를 입력받아서 차곡차곡 담기
		// 반복문을 이용해서 3명의 키의 총합, 평균값 구하기
		
		Scanner sc = new Scanner(System.in);
		
		double[] height = new double[3];
		
		for(int i=0; i<height.length; i++) {
			System.out.print("키 입력 : ");
			height [i] = sc.nextDouble();	
		}
		
		double sum = 0;
		
		for(int i=0; i<height.length; i++) {
			sum += height[i];
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 값 : " + sum / height.length);
		

	}
	
	
	public void method11() {
		
		// 사용자가 입력한 수 만큼의 int 배열 만들기
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("배열 크기 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		// 0번 인덱스 ~ 마지막인덱스까지 값 담기 (랜덤값(1~100))
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		
		
		
		// 담겨져 있는 값들 출력, 짝수들의 총합 계산
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			if(arr[i] %2 ==0) {
				sum+=arr[i];
			}
		}
		
		System.out.println("\n짝수의 총합 : " + sum);
		
	}
	
	
	public void method12() {
		
		// 사용자에게 문자열 입력받은 후
		// 각 인덱스별 문자를 char[] 배열에 옮겨담기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<str.length();i++) {
			arr[i] =str.charAt(i);
		}
		for(int i=0; i<str.length(); i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
