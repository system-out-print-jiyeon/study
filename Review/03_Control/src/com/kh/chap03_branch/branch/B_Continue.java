package com.kh.chap03_branch.branch;

public class B_Continue {

	/*
	 * continue : continue;를 만나게 되면 그 뒤에 구문들은 실행하지 않고
	 * 			 가장 가까운 반복문 위로 올라가라는 의미
	 * 
	 * 
	 *  if(~일 경우){
	 * 	continue;		뒷결과 수행X,위로 올라가 위에것 수행
	 *  }
	 * 
	 */
	
	public void method1() {
		// 1부터 10까지의 홀수 출력
		// 1 3 5 7 9
		
	
		for(int i=1; i<=10; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");	
				}
			}
		
		System.out.println();	
		
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {		// false임  // 즉, 짝수일 경우 => 뒤의 내용 수행하지 말고 다시 반복문 위로 올라가라!(초기식부터X, 증감식부터)
			continue;
			}
			System.out.print(i + " ");	
		}

	}
	
	public void method2() {
		// 1부터 100까지 정수들의 합계
		// 단, 6의 배수값은 빼고 덧셈연산 하라
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i % 6 ==0) {	// 6의 배수일 경우
				continue;
				}
				sum += i;
		}
		System.out.print("총 합계 : " + sum);	
		
	}
	
	public void method3() {
		// 2~9단 까지의 구구단 출력
		// 단, 4의 배수단은 빼고 출력 (4단, 8단 제외)
		
		// 단 : 2~9 1씩 증가			=> 바깥 for문
		// 수 : 매 단마다 1~9 1씩 증가		=> 안쪽 for문
		
		for(int dan=2; dan<=9; dan++) {	
			
			if(dan % 4 ==0) {	// 4의 배수단 제외
				continue;		// for문의 증감식으로 올라감
			}
			System.out.println("=== " + dan + "단 ===");
			
			for(int su=1; su<10; su++) {
				if(su % 4 ==0) {	// 4의 배수 제외
					continue;	
				}
				System.out.println(dan +" X " + su + " = " + dan*su);	
			}
			System.out.println();
		}
		
		
		
		
	}
	
	
}
