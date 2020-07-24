package com.kh.chap02_loop.loop;

import java.util.Scanner;

public class A_For {

	/*
	 * * for문
	 * [표현법]
	 * for(초기식;조건식;증감식){ // 반복횟수를 지정하기 위해 제시하는 것들
	 * 			.. 반복적으로 실행시키고자하는 실행구문 ..
	 * }
	 * 
	 * for문을 만나는 순간
	 * 초기식  --> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * 		--> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * 		--> 다시 조건식 --> true일 경우 실행구문 실행 --> 증감식
	 * ---------------- 이 내용이 계속 반복 ------------------
	 * 		--> 다시 조건식 --> false일 경우 실행구문 실행 X ---------> 반복 빠져나옴
	 * 
	 * - 초기식 : 반복문이 수행될 때 "단 한번만 실행되는 구문"
	 * 			(주로 변수 선언과 동시에 초기화 구문)
	 * - 조건식 : "반복문이 수행될 조건"을 작성하는 구문
	 * 			조건식이 true일 경우 해당 실행구문을 실행
	 * 			조건식이 false가 되는 순간 반복을 멈추고 빠져나옴
	 * 			(주로 초기식에서 사용된 변수를 가지고 조건식을 작성)
	 * 
	 * - 증감식 : 반복문을 제어하는 변수값을 증감시키는 부분
	 * 			(주로 초기식에 제시한 변수를 가지고 증감연산자(++, --)를 사용)
	 * 
	 */
	
	public void method1() {
		// "안녕하세요"를 5번 반복해서 출력
		/*
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		*/
		// 100번일 경우 출력문 100번 복붙? --> 지지
		
		for(int i=1; i<=5; i++) {		// 1에서부터 5까지 1씩 증가하는동안 반복 (5회)
			System.out.println("안녕하세요");
		}
		for(int i=0; i<=4; i++) {		// 0에서부터 4까지 1씩 증가하는동안 반복 (5회)
			System.out.println("반갑습니다");
		}
		for(int i=1; i<6; i++) {		// 1에서부터 5까지 1씩 증가하는동안 반복 (5회)
			System.out.println("다시만나요");
		}
		for(int i=5; i>=1; i--) {		// 5에서부터 1까지 1씩 감소하는동안 반복 (5회)
			System.out.println("헬로우");
		}
		
		//10회
		/*
		for(int i=1; i<=10; i++)		// 1에서부터 10까지 1씩 증가하는동안 반복 (10회)
		for(int i=11; i<=20; i++)		// 얘도
		*/
	}
	
	public void method2() {
		// 1부터 5까지 출력
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
		
		// 반복문에 제시된 변수값을 이용할 수도 있음
		for(int i=1; i<=5; i++) {	// 1에서부터 5까지 1씩 증가하는동안 반복 (5회)
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
		// 1부터 10까지의 홀수만을 출력
		// 1 3 5 7 9 
		
		/*
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				System.out.print(i + " ");	// i값이 홀수일 경우만 출력 
			}
		}
		*/
		
		for(int i=1; i<=10; i+=2) {	// 1에서부터 10까지 2씩 증가하는동안 반복 (5회)
			System.out.print(i + " ");
		}
		
	}
	
	public void method6() {
		
		// 1에서부터 10까지의 정수값들의 합계
		// int sum = 1+2+3+4+5+6+7+8+9+10;
		
		// sum += 1;
		// sum += 2;
		// sum += 3;
		// ....
		// sum += 9;
		// sum += 10;
		
		// 규칙을 찾자!!
		// // sum += 	10번 반복!
		// 다만 더해지는 수가 1에서부터 10까지 1씩 증가하는 값이구나!
		
		int sum = 0;
		
		for(int i=1; i<=10; i++) { // 1에서부터 10까지 1씩 증가하는동안 반복 (10회)
			sum += i;
		}
		System.out.println("총 합계 : " + sum);
	
	}
	
	public void method7() {
		// 1에서 부터 사용자가 입력한 수까지의 총 합계
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수 : ");
		int num = sc.nextInt();
		
		// 사용자가 입력한 정수값이 양수인지 아닌지 (유효한 값 제대로 입력했는지 유효성검사)
		if(num>0) { // 양수일 경우 => 잘 입력
			// sum += 1;
			// sum += 2;
			// ....
			// sum += num;
		
			int sum = 0;
			
			for(int i=1; i<=num; i++) {	// 1에서부터 num까지 1씩 증가하는 동안 반복 (num회)
				sum +=i;
			}
			
			// 1에서 부터 사용자가 입력한 수까지의 총 합계
			System.out.println("1에서부터 " + num+ "까지의 총 합계 : " +sum);
		}else {	// 그게 아닐 경우 => 잘못 입력
			System.out.print("양수만 입력해주세요.");
		}

	}
	
	public void method8() {
		
		// 1에서부터 어떤 랜덤값 (1~10사이의 랜덤한 숫자)까지의 합계
		
		// Math클래스에서 제공하는 random()메소드 호출시 => 랜덤값발생!
		// java.lang.Math 에 있는 메소드 호출시 생성할 핃요 없음!! => 클래스명.메소드();
		// 0.0 ~ 0.99999999 사이의 랜덤값이 발생!
		// 0.0 <= 랜덤실수값 < 1.0
		
		//int random = Math.random();	//double값을 int에 담으려고해서 발생한 문제
		//			0.0 <=		< 1.0		--> 0.0 ~ 0.9999999999
		
		// int random = Math.random() * 10;
		//			0.0 <=		< 10.0		--> 0.0 ~ 9.999999999
							
		// int random = Math.random() * 10 + 1;
		//			1.0 <=		< 11.0		--> 1.0 ~ 10.999999999
		
		int random = (int)(Math.random() * 10 + 1);
		//			1 <=		< 11		--> 1 ~ 10		<--- int형으로 바뀌면서 데이터손실 발생, 뒤에 값 버려짐
		
		System.out.println("랜덤값 : " + random);
		
		
		int sum=0;
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		
		//"1에서부터 xx까지의 총 합계 : xxx"
		System.out.println("1에서부터 " + random + "까지의 총 합계 : " +sum);
		
	}
	// ★
	public void method9() {
	
		// 사용자에게 문자열 입력받은 후
		// 각 인덱스별 문자를 추출 후 입력
		
		// 예를 들어 apple로 입력		--> str에 기록
		// a	--> 출력문(str.charAt(0));
		// p	--> 출력문(str.charAt(1));
		// p	--> 출력문(str.charAt(2));
		// l	--> 출력문(str.charAt(3));
		// e	--> 출력문(str.charAt(4));
		
		// 길이	5		 4			10
		//	 apple   	kiwi	strawberry
		//	 01234		0123	0123456789
		
		// 마지막인덱스는 항상 (문자열의 길이 -1)이구나!
		
		// 추출하고자 하는 인덱스값이 0~마지막인덱스(문자열의 길이 -1)까지 1씩 증가함!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("문자열의 길이 : " + str.length());
		
		//for(int i = 0; i<= (str.length()-1); i++) {
		for(int i=0; i<(str.length()); i++) {
			System.out.println(str.charAt(i));
		}
	
	}
	
	public void method10() {
		// 구구단 2단 출력하기
		
		for(int i=1; i<10; i++ ) {
			System.out.println("2 X " + i + " = " + 2*i);
		}

	}
	
	public void method11() {
		// 사용자가 입력한 단을 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 수(2~9)를 입력하세요 : ");
		int dan = sc.nextInt();
		
		if(dan>1 && dan<10) {
			for(int i=1; i<10; i++) {
				System.out.println(dan + " X " + i +" = "+ dan*i );
			}
			
		}else {
			System.out.println("2에서 9사이의 양수를 입력하세요.");
		}

	}
	
	public void method111() {	//method11의 번외
		// 2~9사이의 랜덤한 단을 출력
		int dan = (int)(Math.random() * 8 + 2);	// 2 3 4 5 6 7 8 9
												// *(갯수) + (시작수)
		
		if(dan>1 && dan<10) {
			for(int i=1; i<10; i++) {
				System.out.println(dan + " X " + i +" = "+ dan*i );
			}
			
		}else {
			System.out.println("2에서 9사이의 양수를 입력하세요.");
		}	
	}
	
	
	public void method12() {
		// 사용자에게 두 개의 정수값 입력받아
		// 두 개의 정수값중 작은값부터 큰값까지의 정수 출력 , 총 합계까지
		
		// 2, 4 입력했을 때 --> 2 3 4	총 합계 : 9
		// 4, 2 입력했을 때 --> 2 3 4 	총 합계 : 9
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		/*
		int min = 0;	// 두 수 중 작은 값을 저장할 변수
		int max = 0;	// 두 수 중 큰 값을 저장할 변수
		
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
		// min에서부터 max까지 1씩 증가하는 값을 매번 출력!
		for(int i=1; i<=max; i++) {	// min에서부터 max까지 1씩 증가하는동안 반복
			sum += i;
		}
		
		System.out.println();
		System.out.println("총합계 : " + sum);

	}
	
	/*
	 * 중첩 for문
	 * 
	 * for(초기식1; 조건식1; 증감식1) {
	 * 
	 * 	수행할 문장1;
	 * 
	 * 	for(초기식2; 조건식2; 증감식2){
	 *		수행할 문장2;
	 * 	}
	 * 
	 * 	수행할 문장3;
	 * 
	 * }
	 * 
	 */
	
	public void method13() {
		
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5 
		
		// 첫번째 행으로 고정일 때	1 2 3 4 5 
		// 두번째 행으로 고정일 때	1 2 3 4 5 
		// 세번째 행으로 고정일 때	1 2 3 4 5 
		
		// 바깥쪽 for문으로 행을 지정
		// 안쪽 for문으로 열을 지정
		for(int i=1; i<=3; i++) {		// --> 행수
			
			for(int j=1; j<=5; j++) {	// --> 열수
				System.out.print(j + " ");
			
			}
			
		System.out.println();			// --> 비어있는 문장으로 개행
		}
		
		/*
		 * i=1	true
		 * 		j=1	true 1출력 j++
		 *  	j=2	true 2출력 j++
		 *  	j=3	true 3출력 j++
		 *   	....
		 *    	j=5	true 5출력 j++
		 *    	j=6 false	--> 안쪽 반복문 빠져나옴
		 *    	개행 출력 i++
		 *    
		 * i=2	true
		 * 		j=1	true 1출력 j++
		 *  	j=2	true 2출력 j++
		 *  	j=3	true 3출력 j++
		 *   	....
		 *    	j=5	true 5출력 j++
		 *    	j=6 false	--> 안쪽 반복문 빠져나옴
		 *    	개행 출력 i++
		 * 
		 * i=3	true
		 * 		j=1	true 1출력 j++
		 *  	j=2	true 2출력 j++
		 *  	j=3	true 3출력 j++
		 *   	....
		 *    	j=5	true 5출력 j++
		 *    	j=6 false	--> 안쪽 반복문 빠져나옴
		 *    	개행 출력 i++
		 * 
		 * 
		 * i=4 false	----> 바깥쪽 반복문 빠져나옴
		 */

	}
	
	public void method14() {
		// 0시 0분 ~ 23시 59분
		// 시간은 0~23시까지 1씩 증가함
		// 매 시간 하나 고정에 0~59분까지 1씩 증가함
		
		// 시 --> 0부터 23까지 1씩 증가			--> 바깥쪽 for문으로 해결
		// 분 --> 매 시마다 0부터 59까지 1씩 증가	--> 안쪽 for문으로 해결
		
		for(int hour=0; hour<24; hour++) {
			
			System.out.println("======= "+ hour + "시 =======");
			
			for(int min=0; min<60; min++ ){
			
				System.out.println( hour + "시" + min + "분");
			
			}
		
			System.out.println();	
		}	
	
	}
	
	public void method15() {
		// 2단에서 9단까지
		
		// 단 --> 2에서부터 9까지 1씩 증가		=> 바깥쪽 for문
		// 수 --> 매 단마다 1부터 9까지 1씩 증가	=> 안쪽 for문
		
		for(int dan=2; dan<10; dan++){
			if(dan % 2 == 0) {	// <-- 조건문으로 짝수단만 출력하기
				System.out.println("=== " + dan + "단 ===");
				
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
		
		// 행은 1~3까지 반복 (3회)				=> 바깥쪽 for문
		// 열은 매 행마다 1~5까지 반복 (5회)		=> 안쪽 for문
		
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
			
			//			i=j	일치할 경우=> 숫자 출력
			//				그게 아닐 경우=> "*" 출력
			
			for(int i=1; i<5; i++) {	// 행을 지정
				
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
