package com.kh.variable;

// printf 구문(출력 메소드)
public class D_printf {
		
	
	
	/*
	 * * 출력 메소드
	 * System.out.println(출력하고자하는값);
	 * - 단순히 값을 출력만 해줌
	 * 
	 * System.out.println(출력하고자하는값);
	 * - 해당 값을 출력 후  "줄바꿈 (개행)" 까지 해줌
	 *  (ln : line 의 약자)
	 *  
	 *  System.out.printf("출력하고자하는형식", 출력하고자하는값);
	 * 	- 형식에 맞춰서 값들을 출력해주는 역할, 출력 후 줄바꿈 X
	 * 	(f : format 의 약자)
	 * 	- 문자열 안에 그 값이 들어갈 자리를 아래와 같은 형식으로 잡아줘야 함
	 * %d : 정수 
	 * %f : 실수
	 * %c : 문자
	 * %s : 문자열
	 * 
	 * 
	 */
	
	public void printfTest() {
	
		//정수 테스트
		int iNum1 = 10;
		int iNum2 = 20;
		
		// "iNum1 : xx, iNum2 : xx" 을 출력해보기
		// 1. println 사용
		System.out.println("iNum1 : " + iNum1 + " iNum2 : "+ iNum2);
		
		
		// 2. printf 사용
		System.out.printf("iNuml : %d, iNum2 : %d\n", iNum1 ,iNum2);
		// > 출력 후 줄바꿈 기능은 없으므로 \n을 추가 해준다.
		// System.out.println();을 해서 줄바꿈을 해도 된다.
		
		
		// "10+ 20 = 30" ㅇ르 출력해보기
		// 1. println 사용
		System.out.println(iNum1 +" + " + iNum2 + " = " + (iNum1 + iNum2));
		
		// 2. printf 사용
		System.out.printf(" %d + %d = %d\n", iNum1,iNum2, iNum1 + iNum2);
		// 수식이 하나밖에없어서 소괄호를 안써줘도 된다.
		
		// %d 에 대한 옵션
		System.out.printf("%d\n", iNum1);
		System.out.printf("%5d\n", iNum1);
		// > %5d : 5칸의 공간 중 오른쪽 정렬
		System.out.printf("%-5d\n", iNum1);
		// > %-5d : 칸의 공간 중 왼쪽 정렬
		
		// 실수 테스트
		
		double dNum = 4.27546789;
		
		// "dNum : xx.xxxx" 을 출력해보기
		// 1. println 사용
		System.out.println("dNum : " + dNum); // 4.27546789
		
		
		// 2. printf 사용
		System.out.printf("dNum : %f\n", dNum); // 4.275468
		// > %f : 소숫점 아래 7번쨰 자리에서 반올림되어
		//        소숫점 아래 6번쨰 자리 까지만 출력되는 꼴
		
		// %f 에 대한 옵션
		System.out.printf("dNum : %.1f\n",dNum );
		// > %.1f : 소숫점 아래 2번쨰 자리에서 반올림되어
		//          소숫점 아래 1번쨰 자리 까지만 출려되는 꼴
		// .자릿수로 제어 가능
		
		// 문자와 문자열 테스트
		char ch = 'a';
		String str = "Hello";
		
		// %c , %s 에 대한 옵션
		System.out.printf("%c %s\n", ch,str);
		System.out.printf("%C %S\n", ch , str);
		// > %C, %S : 영어 알파벳일 경우 모두 대문자로 변경해서 출력
		
		/*
		 * * printf
		 * 포맷 (형식) 단 한번 제시로 간편하게 여러 값들을 출력 가능하다.
		 * 단, 출력 후 줄바꿈이 일어나지 않는다.
		 * 단, 지정한 포맷의 갯수와 종류, 뒤에 오는 변수의 갯수와 종류,
		 * 순서가 다 맞아 떨어져야 한다.
		 */
	}
}
