package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * * Date (java.util)
		 * - Date는 자바 개발할 당시 초창기에 급하게 만든 완성도가 높지 않은 클래스. 다국적으로 쓰기 적합하지 X
		 * 
		 * 
		 * 
		 */

		// 기본생성자를 통해 Date 객체 생성	--> 시스템 날짜(현재날짜)를 담고있음
		Date today  = new Date();
		System.out.println("기본생성자 (오늘 날짜)  : " + today);
		
		// 내가 원하는 날짜(2020년 06월 19일)로 셋팅 가능
		// 1) 매개변수 생성자를 통해서 생성	
		Date date = new Date(2020 - 1900, 6 - 1, 19, 15, 30 ,21);	// Deprecated : 권장하진 않는다. (다만 제공은 해줌)
			// 내부적으로 내가 전달한 년도 + 1900
			// 			내가 전달한 월 + 1  한 값으로 셋팅해야함
		
		
		System.out.println("매개변수 생성자	 : " + date);
		
		
		
		// 2) 기본생성자로 생성한 후 setter메소드로 값 변경
		Date date2 = new Date();
		
		date2.setYear(120);	// 2020 - 1900
		date2.setMonth(5);	// 6 - 1
		date2.setDate(19);
		
		System.out.println("set메소드       	 : " + date2);
		
		
		
		// 내 입맛대로의 포맷을 지정한채로 출력하고자 할 때
		// java.text.SimpleDateFormat 클래스
		
		// 2020년 07월 22일 19시 36분 22초
		// 포맷 지정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		// today --> 포맷 지정한 채로 --> String
		String formatDate = sdf.format(today);
		System.out.println(formatDate);
		
		
		System.out.println(sdf.format(date));
		
		
		
		//★★★ 알아둬야 할 것
		// String에서 제공하는 메소드들
		// Parsing 파싱하는것
		// SimpleDateFormat 포맷지정
		
		
		
		
	}

}
