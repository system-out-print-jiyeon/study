package com.method.hw1.run;

import com.method.hw1.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		
		NonStaticSample n = new NonStaticSample();
		n.printLottoNumbers();
		n.outputChar(5, 'a');
		System.out.println(n.alphabette());
		System.out.println("4. apple의 2번 4번 인덱스 사이의 값 출력 : " + n.mySubstring("apple", 2, 4));
		
		

	}

}
