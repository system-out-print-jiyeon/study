package com.kh.run;

import com.kh.variable.*; 	// * <----- ��� Ŭ������ �ǹ�
import com.kh.variable.B_Constant;
import com.kh.variable.C_KeyboardInput;

public class Run { // com.kh.run.Run

	public static void main (String[] args) {
		
		// 1) ������ �޼ҵ尡 �ִ� "Ŭ��������(new)" �ϱ�!
		// [ǥ����] Ŭ������ ������ = new Ŭ������();
		A_Variable a = new A_Variable();
		
		// 2) �޼ҵ� ȣ��
		
		//a.printValue();
		//a.declareVariable();
		//a.initVariable();
		
		
		// �ٸ� Ŭ������ �ִ� �޼ҵ� ȣ���
		// Ŭ���� ���� --> �޼ҵ� ȣ��
		B_Constant b = new B_Constant();
		
		//b.finalConstant();
		
		
		C_KeyboardInput c = new C_KeyboardInput();
		//c.inputScanner1();
		c.inputScanner2();
		//c.inputScanner3();	
		//c.inputScanner4();
		
		
		D_Casting d = new D_Casting();
		//d.casting1();
		//d.casting2();

		
		E_Overflow e = new E_Overflow();
		//e.overflow();
				
		F_Printf f = new F_Printf();
		//f.printfMethod();
	
	
	}
	
	
}
