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
		
		System.out.print("양의 정수 : ");
		int num1 = sc.nextInt();
		
		int arr[] = new int[num1];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = i + 1 ;
			System.out.print(arr[i] + " ");
		}

	}
	
	public void practice4() {
		
		String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.print(arr[1]);
		
	}
	
	
	//★★★
	public void practice5() {
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()];
		
		
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = str.charAt(i);
		}
			int count =0;
			
			System.out.print(str + "에  " + ch + "가 존재하는 위치(인덱스) : " );
			
			for(int i=0; i<arr.length; i++) {
				
				if(arr[i] ==ch) {
					System.out.print(i+ " ");
					
					count++;
				}
			}
			System.out.println();
			System.out.println(ch+ "갯수 : " + count );
			
			*/
		
		
		// 어려우니까 한 번 더 해봄
		// 1. 사용자에게 문자열 입력받기
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();	// "apple"
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0); 
		
		// 2. 사용자가 입력한 문자열 중에 각각의 문자들을 char배열에 담기
		
		// 2-1. char[] 생성 (크기는 문자열의 길이와 동일하게)
		char[] arr = new char[str.length()];
		
		// 2-2. 반복문을 이용해서 옮겨담기
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		// ['a', 'p', 'p', 'l', 'e']
		//			동등비교
		// 	 ch   ch   ch   ch   ch
		
		// 3. 검색할 문자가 몇개 들어있는지, 몇번째 인덱스에 있는지 파악하기
		
		int count =0;	// 일치하는 문자를 찾을 때 마다 카운팅 할 변수 (갯수를 세어줄 변수 == 1씩 증가시킬 변수)
		
		// "xxxxxxx에  x가 존재하는 위치(인덱스) : "
		System.out.print(str + "에 " + ch + "가 존재하는 위치 : ");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ch) {	// 사용자가 입력한 검색할 문자와 해당배열의 인덱스값이 일치할 경우
				count++;
				System.out.print(i + " ");
				
			}
			
		}
		
		System.out.println();
		// X 개수 : X
		System.out.println(ch + " 개수 : " + count);
	
		}
		
	
	
	public void practice6() {
		
		/**
		int[] arr = new int[7];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6사이 숫자 입력 : ");
		int num = sc.nextInt();
		String day = ""; 
		
		
		if(num>=0 && num<7) {
			for(int i=num; i<arr.length; i++) {
				switch(num) {
				case 0 : day = "월요일"; break;
				case 1 : day = "화요일"; break;
				case 2 : day = "수요일"; break;
				case 3 : day = "목요일"; break;
				case 4 : day = "금요일"; break;
				case 5 : day = "토요일"; break;
				case 6 : day = "일요일"; break;
				
					}
				System.out.print(day); break;
				}	
		}else {
		System.out.print("잘못 입력하셨습니다.");
		}
			**/
		String[] arr = {"월", "화", "수", "목", "금", "토", "일"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num>=0 && num<7) {
		System.out.print(arr[num] + "요일");
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		
		

		
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		int sum =0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열" + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총합 : " + sum);
		
	}
	
	// ★★★★★ 규칙찾기 어려움
	public void practice8() {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			// 1. 사용자에게 3이상의 홀수에 해당하는 정수값을 입력받자 (반복)
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			// 2. 제대로 입력했는지 안했는지 판별
			if(num>=3 && num%2==1) { // 제대로 입력했을 경우 (배열에 값 담은 후 출력하고 빠져나가기)
				
				// 사용자가 입력한 정수크기만큼의 int배열 만들기
				int[] arr = new int[num];
				
				// 배열의 중간까지는 1씩 증가하는 값, 그 이후부터는 1씩 감소하는 값 담기
				// 3	=> [1 "2" 1]		=> 가운데 인덱스 1	=> 3 / 2	=> 1
				// 5	=> [1 2 "3" 2 1]	=> 가운데 인덱스 2	=> 5 / 2	=> 2
				// 7	=> [1 2 3 "4" 3 2 1]=> 가운데 인덱스 3	=> 7 / 2	=> 3 
				// 								가운데 인덱스 : 배열의 크기 / 2
				
				
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
				
				// 잘 담겼는지 출력하기
				for(int i=0; i<arr.length; i++) {
					if(i == arr.length-1) {
				System.out.print(arr[i]);
					}else {
						System.out.print(arr[i] + ", ");
					}
				}
				// 반복문 빠져나가기
				break;
				
			}else {	// 제대로 입력하지 않았을 경우 ("다시입력하세요." 출력 후 반복이 수행)
				System.out.println("다시 입력하세요.");
			}			
		}
		
		
	}
	
	
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		String[] chicken = {"양념" , "후라이드" , "뿌링클" , "볼케이노" , "갈비"};
		
		for(int i=0; i<chicken.length;i++) {
			if(name.equals(chicken[i])) {
				System.out.println(chicken[i] + "치킨 배달 가능");
				break;
			}else {
				System.out.println(name + "치킨은 없는 메뉴입니다.");break;
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
	
	
	
	// ★★★
	public void practice11() {
		
	
		// 1. 크기 10짜리 int[]배열 생성하기
		int[] arr = new int[10];
		
		// 2. 해당 배열의 각 인덱스에 1~10 사이의 랜덤값 담기
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
		}
		// 3. 배열 전체 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// 4. 최대값, 최소값 판별 후 출력
		// 오름차순 정렬 후 
		Arrays.sort(arr);
		
		// 0번 인덱스값 : 최소값
		// 9번 인덱스값 : 최대값
		System.out.println("\n최대값 : " + arr[9]);
		System.out.println("최소값 : " + arr[0]);

		
		
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
		
		System.out.print("주민등록번호(-포함) : ");
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
	
	
	
	
	
	

