package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		Animal[] arr = new Animal[5];
		
		arr[0] = new Cat("��ٸ�", "�丣�þ�", "��������", "���");
		arr[1] = new Dog("�̴���", "�ͽ�", 5);
		arr[2] = new Dog("�ֹٸ�", "��ũ���׸���", 6);
		arr[3] = new Cat("�����", "��Ű���Ӱ��", "��������", "���");
		arr[4] = new Dog("�跹��", "ġ�Ϳ�", 2);
		
		for(int i=0; i<arr.length; i++) {
			arr[i].speak();
		}
		
		
		
		

	}

}
