package com.kh.operator;

public class G_Compound {

	/*
	 * * 복합 산술 대입 연산자 : 산술연산자 (+-/*%)와 대입연산자를 함께 사용하는 연산자
	 * 					 연산처리 속도가 훨씬 빠르므로 사용을 권장
	 * 
	 * += -= *= /= %=
	 * 
	 * a = a + 3;		=>		a += 3;
	 * a = a - 3;		=>		a -= 3;
	 * a = a * 3;		=>		a *= 3;
	 * a = a / 3;		=> 		a /= 3;
	 * a = a % 3;		=> 		a %= 3;
	 * 
	 */
	
	public void method() {
		
		int num = 12;
		
		System.out.println("기존의 num : " + num);		//12
		
		// num을 증가시키기
		num = num + 3;
		System.out.println("3증가시킨 num : " + num);
		
		// num을 또 3 증가시키기
		/*
		num++;
		num++;
		num++;
		*/		// --> 1씩밖에 못 증가시킴
		
		num += 3;
		//num =+ 3;		<--  num에 양수(+)3을 대입하는 구문
		System.out.println("또 3 증가시킨 num : " + num);
		
		// num을 5감소시키기
		num -= 5;	//num = num - 5
		System.out.println("5감소시킨 num : " + num);
		
		// num을 6배 증가시키기
		num *= 6;	//num = num * 5
		System.out.println("6배 증가시킨 num : " + num);
		
		// num을 2배 감소시키기
		num /= 2;	//num = num / 2
		System.out.println("2배 감소시킨 num : " + num);
		
		// num을 4로 나눴을 때의 나머지
		num %= 4;	//num = num % 4
		System.out.println("최종 num : " + num);
		
		String str = "Hello";
		System.out.println("str : " + str);
		
		str += "World";	// str = str + "World";
		System.out.println("str : " + str);
		
		str += 'A';	//str = str + A
		System.out.println(str);
		
		str += 1;		// str = str + 1;
		System.out.println(str);
	}
	
	
	
}
