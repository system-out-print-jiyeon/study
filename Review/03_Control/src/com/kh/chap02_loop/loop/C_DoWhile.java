package com.kh.chap02_loop.loop;

public class C_DoWhile {

	/*
	 * * do-while문 
	 * 
	 * 초기식;
	 * 
	 * 	do{
	 * 		반복적으로 실행할 코드;
	 * 		증감식;
	 * 
	 *		 }while(조건식);
	 * 
	 *  초기식 --> "무조건 한 번은 실행" --> 증감식
	 *  조건식 --> true면 실행		--> 증감식
	 *  조건식 --> false면  ----------> 빠져나감
	 *  
	 */
	
	public void method1() {
		
		int num = 1;
		
		/*
		while(num == 0) {
			System.out.println(num);
		}
		*/								// <--- false여서 아무것도 출력안됨
		
		do {
			System.out.println(num);
			
		}while(num == 0);				
										// <--- 똑같은데 do-while문이라 한번은 꼭 출력됨
	
	}
	
	public void method2() {
		// 1 2 3 4 5
		
		int i=1; 
		
		do {
			//System.out.print(i + " ");
			//i++;
			System.out.print(i++ + " ");	// <-- 후위연산자 이용해서 한줄로 줄이기
		}while(i<6);
	}
	
	
	
	public void method3() {
		// 1부터 랜덤값(11~20)까지의 합계
		
		int random = (int)(Math.random()*10+11);
		int i=1;
		int sum = 0;
		
		do {
			sum += i++;
		}while(i<=random);
		
		System.out.println("1에서부터 " + random + "까지의 총 합계 : " +sum);
		
	}
	
	
	
	
}
