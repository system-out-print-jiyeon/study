package com.kh.hard;

import java.util.Scanner;

public class CompExample {
	
	// 파란색 설명보고 풀어본 후 답 비교해보기
	
	/**
	 * 사용자에게 한개의 정수 입력받은 후 
	 * 1부터 입력받은 수까지 홀수면 박,짝수면 수 출력
	 * 
	 * 단, 입력받은 수가 양수가 아니면 "양수가 아닙니다" 출력
	 * ex) 4 입력 시 => "박수박수"
	 *     5 입력 시 => "박수박수박"
	 */
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) { // 입력받은 수가 양수일 경우 (잘 입력하였을 경우)
			
			for(int i = 1; i <= num; i++) { // 1부터 사용자가 입력한 수까지 반복실행
				
				if(i % 2 == 1) {	// 홀수일 경우
					System.out.print("박");
					
				} else {			// 짝수일 경우
					System.out.print("수");
					
					
				}
			}
			
		} else {	// 입력 받은 수가 양수가 아닐 경우 (잘 못 입력하였을 경우)
			
			System.out.println("양수가 아닙니다.");
		}
	}
	
	
	/**
	 * 위의 내용에 이어진 내용으로 
	 * 만일 양수가 아닐 경우 다시 입력받도록 반복적으로 수행
	 */
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 우선 무한 반복으로 수행하고
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num > 0) { // 입력받은 수가 양수일 경우 (잘 입력하였을 경우)
				
				for(int i = 1; i <= num; i++) { // 1부터 사용자가 입력한 수까지 반복실행
					
					if(i % 2 == 1) {	// 홀수일 경우
						System.out.print("박");
						
					} else {			// 짝수일 경우
						System.out.print("수");
						
					}
				}
				
				// 양수일 경우 제대로 출력되고 무한반복문을 빠져나가자
				break;
				
			} else {	// 입력 받은 수가 양수가 아닐 경우 (잘못 입력하였을 경우)
				
				System.out.println("양수가 아닙니다.");
				
				// 양수가 아닐 경우 다시 반복문의 처음으로 돌아가 정수를 입력받게 될거다.
			}
			
		}
	}
	
	/**
	 * 사용자에게 문자열과 해당 문자열로 부터 검색하고 싶은 문자 입력받은 후
	 * 문자열에 그 문자가 몇개 있는지 갯수 세서 출력하기
	 * ex) "banana" 입력, 'a' 입력 시	=> 3출력
	 * 	   "pineapple" 입력, 'p' 입력 시 => 3출력
	 * 
	 * 1) 사용자에게 문자열을 입력받는다. (str:String)
	 * 2) 검색하고 싶은 문자를 입력받는다. (ch:char)
	 * 3) 해당 문자열에 일치하는 문자를 찾을 때마다 갯수를 보관할 변수를 셋팅해둔다. (count:int)
	 * 4) 반복문을 통해 해당 문자열의 0번 인덱스 부터 마지막인덱스까지의 문자들과 ch와 일치하는지 비교
	 *    일치하면 count수 1 증가
	 * 5) 반복문 끝나면 count 출력
	 *
	 */
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("찾고자 하는 문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;		// 검색된 문자의 갯수를 담을 변수
		
		for(int i=0; i<str.length(); i++) { // 0부터 문자열의 길이-1 만큼 1씩 증가하는 동안 반복
			
			if(ch == str.charAt(i)) { // 입력받은 문자와 문자열의 각 인덱스 값이 같을 경우
				count++; // 동일한 문자라고 판단하여 count 1 증가
			}
		}
		
		System.out.println("포함된 갯수 : " + count);
		
	}
	
	
	

}
