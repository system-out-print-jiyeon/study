package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	/** 파란색은 내가 짠거 **/
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		// if-else if문  이용
		
		/*if(menu == 1) {
			System.out.println("입력 메뉴입니다.");
		} else if(menu == 2) {
			System.out.println("수정 메뉴입니다.");
		}else if(menu == 3) {
			System.out.println("조회 메뉴입니다.");
		}else if(menu == 4) {
			System.out.println("삭제 메뉴입니다.");
		}else if(menu == 9) {
			System.out.println("프로그램이 종료됩니다.");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		*/
		
		
		// 2. switch문 이용
		/*
		switch(menu) {
		case 1 : System.out.println("입력 메뉴입니다.");break;
		case 2 : System.out.println("수정 메뉴입니다.");break;
		case 3 : System.out.println("조회 메뉴입니다.");break;
		case 4 : System.out.println("삭제 메뉴입니다.");break;
		case 9 : System.out.println("프로그램이 종료됩니다.");break;
		default : System.out.println("잘못입력하셨습니다.");break;
		}
		*/
		
		
		// 3. switch문 이용할 때 String 변수 이용하는 방법
		String str = "";
		
		switch(menu) {
		case 1 : str = "입력";break;
		case 2 : str = "수정";break;
		case 3 : str = "조회";break;
		case 4 : str = "삭제";break;
		case 9 : System.out.println("프로그램이 종료됩니다.");return;
		default : System.out.println("잘못입력하셨습니다.");return;
		}
		
		System.out.println(str + " 메뉴입니다.");
		
		/**
		System.out.println("1. 입력");
		String a = "입력";
		
		System.out.println("2. 수정");
		String b = "수정";
		
		System.out.println("3. 조회");
		String c = "조회";
		
		System.out.println("4. 삭제");
		String d = "삭제";
		
		System.out.println("9. 종료");
		String e = "종료";
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num == 1) {
		System.out.print(a + " 메뉴입니다.");
		}else if (num == 2) {
		System.out.print(b + " 메뉴입니다.");
		}else if (num == 3) {
		System.out.print(c + " 메뉴입니다.");
		}else if (num == 4) {
		System.out.print(d + " 메뉴입니다.");
		}else if (num == 9) {
		System.out.println("프로그램이 종료됩니다.");
		}		
		**/
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		
		
		/** 
		 if(num > 0 && (num % 2 == 0)) {
			System.out.print("짝수다");
		} else if (num > 0 && num % 2 == 1) {
			System.out.print("홀수다");
		} else if (num <= 0) {
			System.out.print("양수만 입력해주세요.");
		}
		**/
		
		// 중첩 if문으로 공통적인 조건을 먼저 검사하고!
		if(num > 0) {
			if(num%2==0) {
				System.out.print("짝수다");
			}else {
				System.out.print("홀수다");
			}
		}else {
			System.out.print("양수만 입력해주세요");
		}
		
		
	}
	
	
	public void practice3() {
		
		/** 내가짠거 , 예시랑 같음**/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		
		int sum = kor+eng+math;
		double avg = (sum / 3.0) ;
		
		if(kor >= 40 && eng>= 40 && math >= 40 && avg >= 60) {
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);	
		System.out.println("수학 : " + math);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
	
		/**
		switch(month) {
		case 1 : 
		case 2 : 
		case 12 : System.out.println(month + "월은 겨울입니다."); break;
		case 3 :
		case 4 : 
		case 5 : System.out.println(month + "월은 봄입니다."); break;
		case 6 :
		case 7 : 
		case 8 : System.out.println(month + "월은 여름입니다."); break;
		case 9 :
		case 10 : 
		case 11 : System.out.println(month + "월은 가을입니다."); break;
		default : System.out.println("월은 잘못 입력된 달입니다.");break;
	}
		 **/
		
		
		// String 변수 이용해 출력문 한번만
		String season = "";
		
		switch(month) {
		case 1 : 
		case 2 : 
		case 12 : 
					season = "겨울";
					break;
		case 3 :
		case 4 : 
		case 5 : 
					season = "봄";
					break;
		case 6 : 
		case 7 :
		case 8 : 
					season = "여름";
					break;
		case 9 : 
		case 10 : 
		case 11 :
					season = "가을";
					break;
					
		default :	season = "잘못입력된 달";
					break;
		}
		
		System.out.println ( month+ "월은 " + season + "입니다.");
		
		
		
	}
	
	
	
	// ★★★
	public void practice5() {
		
		String userid = "boram";
		String userpw = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		if(userid.equals(id) && userpw.equals(pw)) {
			System.out.println("로그인 성공");
		}else if (userid.equals(id)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else if(userpw.equals(pw)) {
			System.out.println("아이디가 틀렸습니다. ");
		}
		
		
		
		
		/** 내가한거, 안됨 ㅜ ㅜ 
		String result1 = "로그인 성공";
		String result2 = "비밀번호가 틀렸습니다.";
		String result3 = "아이디가 틀렸습니다.";

		
		
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
	
	System.out.print("권한을 확인하고자 하는 회원 등급 : ");
	String level = sc.nextLine();
	
	/**
	switch(level) {
	case "관리자" : System.out.println("회원관리, 게시글 관리");
	case "회원" : System.out.println("게시글 작성 , 댓글 작성");
	case "비회원" : System.out.println("게시글 조회"); break;
	default : System.out.println("잘못 입력했습니다");
	}
	**/
	
	switch(sc.nextLine()) {	//	<-- ★ 이렇게 바로 입력해서 비교할 수도..
	case "관리자" : System.out.println("회원관리, 게시글 관리");
	case "회원" : System.out.println("게시글 작성 , 댓글 작성");
	case "비회원" : System.out.println("게시글 조회"); break; // 여기서 break해야 default문까지 넘어가지 않는다.
	default : System.out.println("잘못 입력했습니다"); break;
	
	}
	
	
	}
	

	
	public void practice7() {
		
		/** 내가한거, 예시랑같음 **/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("BMI 지수 : " + bmi);
		
		if (bmi < 18.5) {
			System.out.print("저체중");
		}else if(bmi < 23) {
			System.out.print("정상체중");
		}else if(bmi < 25) {
			System.out.print("과체중");
		}else if(bmi < 30) {
			System.out.print("비만");
		}else {
			System.out.print("고도 비만");
		}

		
	}
	

	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		//★
		char ch = sc.nextLine().charAt(0);
		
		//-------------------------------------------------
		
		// if-else if문 이용해서
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
			System.out.print("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		*/
		
		//-----------------------------------------------------
		
		// **위의 내용의 업그래이드 (중첩 if문 방법 : 공통된 조건을 먼저 검사하고 시작한다!)
		
		/*
		if(num1>0 && num2>0) {	//1_1. 두개의 정수 모두 양수일 경우 => 피 연산자들은 잘 입력했을 경우
			
		// 2. 연산기호가 뭐냐에 따라서 산술연산한 결과 출력
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
				System.out.print("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				}
		}else {		// 1_2. 양수가 아닌 값을 입력한 경우(num1이 양수가 아니거나, num2가 양수가 아니거나, 둘 다 양수가 아니거나)
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		*/
		
		//-----------------------------------------------------------
		
		// ** 위의 내용에서 더 업그레이드
		
		int result=0;		// 연산기호에 맞춰서 산술 연산한 결과를 담아줄 변수 셋팅!
		
		if(num1>0 && num2>0) {
			// 연산기호를 가지고 동등비교하는 걸 switch문으로 바꾼 내용
			switch(ch) {
			case '+' : result = num1 + num2;break;
			case '-' : result = num1 - num2;break;
			case '*' : result = num1 * num2;break;
			case '/' : result = num1 / num2;break;
			case '%' : result = num1 % num2;break;
			default : System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다."); return;
			}
		}else {
			 System.out.println("양수가 아닌 값을 입력하셨습니다. 프로그램을 종료합니다."); return;
		}
		
		// 출력문은 여기에 단 한번만 기술할거임
		System.out.printf("%d %s %d = %d" , num1, ch, num2, result);
		

		
		/** 안됨 ㅜ ㅜ
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
			System.out.print("잘못 입력하셨습니다. 프로그램을 종료합니다.");	return;
		}
		
		System.out.printf("%d %s %d = %d", num1, sign, num2, result);
		**/
	
	}

	
	// ★★★ 어려워!!!!!!
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int midTest = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int finTest = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int homework = sc.nextInt();
		
		System.out.print("출석 회수 : ");
		int attendance = sc.nextInt();
		
		double mid = midTest * 0.2;
		double fin = finTest * 0.3;
		double hw = homework * 0.3;
		double at = attendance;
		
		double sum = mid + fin + hw + at ;

		System.out.println("========== 결과 ==========");

		if(sum>=70 && at>=20 * 0.7) {	// 1_1. 총점이 70점 이상이면서 출석횟수도 20점 만점 기준으로 70%이상인 경우
			System.out.println("중간 고사 점수(20) : " + mid);
			System.out.println("기말 고사 점수(30) : " +fin);
			System.out.println("과제 점수 	  (30) : " + hw);
			System.out.println("출석 점수	  (20) : " + at);
			
			System.out.println("총점 : " + sum);
			System.out.println("PASS");
			
		}else{ // 1_2. 그게 아닐 경우 (총점이 부족할 수도 있고, 출석 횟수가 부족할 수도 있고, 아니면 둘 다 부족할 수도 있을 경우)
			
			if(at<20*0.7){	// 2. 근데 그 중에서도 출석횟수가 부족할 경우
				System.out.println("FAIL [출석 횟수 부족] (" + attendance +"/20)" );	
			}
			// ★ 위아래 두개의 조건문 각각 별개 --> 만일 둘다 부족할 경우 둘 다 실행될 것!!
			
			if(sum < 70) {	// 3. 근데 그 중에서도 총점이 부족할 경우
				System.out.println("FAIL [점수 미달] (총점 " + sum +")");
				}
			}
		
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
			
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수 / 홀수");	
		System.out.println("3. 합격 / 불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");	
		System.out.println("8. 계산기");
		System.out.println("9. Pass / Fail");
		
		System.out.print("선택 : ");
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
		default : System.out.println("잘못입력하셨습니다.");return;
		}
		
		
	}
	
	
	
	
	
	

}
