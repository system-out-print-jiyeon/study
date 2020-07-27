package com.kh.exception.run;

import com.kh.exception.controller.CheckedException;
import com.kh.exception.controller.UncheckedException;

public class Run {

	public static void main(String[] args) {
		
		// 에러들의 종류
		// 예외란 뭔지
		// 예외처리를 왜 해야만 하는지
		// 예외처리를 하는 방법
		
		/*
		 * * 에러 종류
		 * - 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러 --> 소스코드로 해결 안됨 --> 심각한 에러
		 * - 컴파일 에러 : 소스코드 문법상 오류 --> 빨간줄로 애초에 알려줌
		 * - 런타임 에러 : 코드상으로는 문제가 없는데 프로그램 실행할 때 발생하는 에러 (사용자의 실수일수도 있고, 개발자가 예측가능한 경우를 제대로 처리 안해놓은 경우)
		 * 
		 * - 논리 에러 : 문법상으로도 문제가 없고 실행했을 때도 굳이 문제가 되지 않지만 프로그램 의도상 맞지 않는 것.
		 * 
		 * * 우리는 시스템에러를 제외한 컴파일에러, 런타임에러, 논리에러와 같은 비교적 덜 심각한 것들을 가지고 작업
		 *   => 이런것들을 "예외"라고 한다.  --> Exception
		 * 
		 * * 이런 예외들이 "발생"했을 경우에 대해서 "처리"하는 방법  => "예외처리"
		 * 
		 * * "예외처리"를 안해놓으면 해당 예외 발생시 프로그램이 비 정상적으로 종료되어버림
		 * 
		 */
		
	
		UncheckedException ex1 = new UncheckedException();
		//ex1.method1();
		//ex1.method2();
		
		
		CheckedException ex2 = new CheckedException();
		ex2.method1();  // 여기서마저도 떠넘기게되면 결국은 JVM이 처리해주긴 함..
		
		
	}

}
