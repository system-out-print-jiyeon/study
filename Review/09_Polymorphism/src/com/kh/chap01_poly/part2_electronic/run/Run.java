package com.kh.chap01_poly.part2_electronic.run;

import com.kh.chap01_poly.part2_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part2_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part2_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part2_electronic.model.vo.Tablet;

public class Run {
	
	public static void main(String[] args) {
		
		Electronic[] arr = new Electronic[3];
		
		arr[0] = new Desktop("�Ｚ", "��ž", 1200000, "Geforce 1070");
		arr[1] = new NoteBook("LG", "�׷�", 1800000, 3);
		arr[2] = new Tablet("����", "�����е�����", 2000000, true);
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
	}

}
