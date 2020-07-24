package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		Animal[] arr = new Animal[5];
		
		arr[0] = new Cat("김꾸망", "페르시안", "지수네집", "흰색");
		arr[1] = new Dog("이달콩", "믹스", 5);
		arr[2] = new Dog("최바리", "요크셔테리어", 6);
		arr[3] = new Cat("김꾸이", "터키쉬앙고라", "지수네집", "흰색");
		arr[4] = new Dog("김레오", "치와와", 2);
		
		for(int i=0; i<arr.length; i++) {
			arr[i].speak();
		}
		
		
		
		

	}

}
