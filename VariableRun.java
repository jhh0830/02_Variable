package com.kh.variable.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyBoardInput;
import com.kh.variable.C_Cast;
import com.kh.variable.D_printf;


public class VariableRun {
	public static void main(String[] args) {
		// 1. 대변할이름 생성
		A_Variable a = new A_Variable();
		// 2. 대변할 이름을 통해서 메소드 호출
		//a.printSalary();
		//a.declareVariable();
		//a.initVariable();
		//a.constant();
		//a.overflow();
		B_KeyBoardInput b = new B_KeyBoardInput();
		//b.inputTest1();
		//b.inputTest2();
		//b.inputTest3();
		//b.inputTest4();
		//b.inputTest5();
		C_Cast c = new C_Cast();
		//c.autoCasting();
		//c.forceCasting();
		D_printf d = new D_printf();
		d.printfTest();
		
		
		
	}
}
