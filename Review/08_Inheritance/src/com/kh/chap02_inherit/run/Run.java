package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class Run {

	public static void main(String[] args) {

		Car c = new Car("벤틀리", 12.5, "세단", 4);
		
		Airplane a = new Airplane("보잉", 0.2, "제트기", 16, 2);
		
		Ship s = new Ship("낚시배", 2.5, "어선", 1);
		

		System.out.println(c.information());
		System.out.println(a.information());
		System.out.println(s.information());
		
		c.howToMove();
		a.howToMove();
		s.howToMove();
		
		
		
	}

}
