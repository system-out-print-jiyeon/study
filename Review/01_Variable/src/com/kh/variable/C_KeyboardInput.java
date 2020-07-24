package com.kh.variable;

import java.util.Scanner;

public class C_KeyboardInput {
	
	// 사용자가 키보드로 입력한 값을 변수에 기록하는 방법
	
	public void inputScanner1() {
		
		// 사용자에게 간단한 인적사항(이름, 나이, 키) 입력받은 후 ㅊ눌력
		
		// java.util.Scanner 클래스의 메소드를 가지고 사용자가 입력한 값을 가지고 올 수 있음!!
		// 클래스 생성 --> 메소드 호출!
		
		Scanner sc = new Scanner(System.in);
		
		// 입력받고자 하는 내용을 먼저 출력해서 입력을 유도해줘야지!!
		System.out.print("당신의 이름은 무엇입니까 : ");
		
		// 사용자가 입력한 문자열을 뽑아오는 메소드 (next(), nextLine())
		// String name = sc.next(); // <-- 이 지연 이라고 치면 "이" 만 나옴
		// next() : 사용자가 입력한 값 중 공백이 있을 경우 공백 이전까지의 값만 읽어오게됨!!
		
		String name = sc.nextLine();
		// nextLine() : 사용자가 입력한 값 모두 다 읽어옴!!
		
		
		System.out.print("당신의 나이는 몇살입니까 : ");
		// 사용자가 입력한 정수값을 뽑아오는 메소드(nextInt())
		int age = sc.nextInt();
		
		System.out.print("당신의 키는 몇 cm입니까 : ");
		// 사용자가 입력한 실수값을 뽑아오는 메소드(nextDouble())
		double height = sc.nextDouble();
		
		// 잘 담겼는지 확인해보자!!
		// "xxx님은 xx세 이며,키는 xxxcm입니다."
		System.out.println(name + "님은 " + age + "세 이며, 키는 " + height + "cm입니다.");
		
		
	}
	
	public void inputScanner2() {
		
		// 이름, 나이, 주소, 키
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		/*
		 * sc.nextLine() : 버퍼에서 "엔터"까지 싹 읽어오는 메소드 ("엔터" 비워짐!)
		 * sc.nextLine() 이외의 메소드 : 버퍼에서 "엔터"는 읽어오지 않음!! (사용자가 입력한 값만을 읽어옴 == "엔터" 남아있음)
		 */
		
		// 현재 이 시점에 버퍼에 엔터가 남아있으므로
		// 버퍼에 남아있는 엔터를 비워주는 과정을 추가하면 됨!!
		
		sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키(cm단위) : ");
		double height = sc.nextDouble();
		
		
		sc.nextLine();
		
		System.out.print("성별 : ");
		String gender = sc.nextLine();
		
		// 출력
		// "xxx님은 xx살이며, 사는 곳은 xxx이고, 키는 xxxcm입니다."
		
		System.out.println(name + "님은 " + age + "살이며, 사는 곳은 " 
						+ address + "이고, 키는 " + height + "cm 입니다.");
		
		System.out.printf("%s님은 %d살이며, 사는 곳은 %s이고, 키는 %.2fcm 입니다", name, age, address, height);
		
		//System.out.println("성별 : " + gender);
		
		
	}
	
	
	public void inputScanner3() {
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열을 입력받을 때 --> sc.nextLine()
		// 정수형을 입력받을 때 --> sc.nextInt()
		// 실수형을 입력받을 때 --> sc.nextDouble()
		
		// 문자를 입력받을 때 --> sc.nextChar() 	???
		
		// 이름, 성별(M/F), 나이, 키
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");		// Male Female
		// char gender = sc.nextChar();	<-- nextChar 는 없음!!!
		char gender = sc.nextLine().charAt(0);
		//				"Male".charAt(0);
		
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println("키(cm단위) : ");
		double height = sc.nextDouble();
		
		// 출력을 통해서 확인!!
		// ㅇㅇㅇ님의 개인정보
		// 성별 : ㅇ
		// 나이 : ㅇㅇ
		//키 : ㅇㅇㅇ.ㅇ
		
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		
		System.out.println("=== 환영합니다^.^ ===");
		
	}

	public void inputScanner4() {
		
		// 사용자에게 두 개의 정수값 입력받은 후
		// 덧셈 연산한 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		/*
		 * int result = num1 + num2 ;
		System.out.print("덧셈결과 : " + result);
		*/
		
		System.out.print("덧셈결과 : " + (num1 + num2));	// "덧셈결과 : 10" + num2 => "덧셈결과 : 105"
		// + - * / %
	}
	
	
	/*
	 * ** 정리 **
	 * 
	 * 1. 콘솔창(모니터)에 출력하기 위해서 : System.out.println() 메소드 이용
	 * 2. 콘솔창(키보드)으로 입력받기 위해서 : Scanner sc = new Scanner(System.in);
	 * 								sc.nextLine(), sc.next(), sc.nextInt(), sc.nextDouble()
	 * 
	 * - 주의할 점
	 *  > sc.nextXXX() 뒤에  sc.nextLine() 메소드가 와야되는 경우
	 *  	버퍼에 남은 엔터를 빼주는 과정 필수!! => sc.nextLine(); 한 번 더 써주면 됨!!
	 *  
	 *  > '문자' 값을 입력받기 위해서는 sc.nextLine() 메소드를 통해 문자열로 먼저 받아주고
	 *  	그 뒤에 .charAt(0) 메소드를 통해 문자를 추출하는 과정!
	 * 
	 */
	
	
}
