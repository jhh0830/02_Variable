package com.kh.variable;


// 형변화의 개념
public class C_Cast {
	/*
	 * * 형변환
	 * 값의 자료형을 바꾸는 개념 (byte 를 int 로, int 를 double 로, ...)
	 * (byte 를 int 로, int 를 double 로, ..)
	 * 
	 * * 컴퓨터 상에서의 값 처리 규칙
	 * 1. 대입연산자 (=) 를 기준으로 왼쪽과 오른쪽은 같은 자료형이야만 함!!
	 * > 즉, 변수에는 같은 자료형에 해당하는 값만 대입 가능함
	 * (다른 자료형의 값을 변수에 대입하고자 한다면 "형변환"이 필수)
	 * [ 표현법 ]
	 * 자료형 변수명 = (바꿀자료형)값;
	 * 
	 * 
	 * 2. 같은 자료형끼리만 연산이 가능함!!
	 * > 즉, 다른 자료형끼리 연산을 하고싶다면 적어도 한놈은 다른쪽에
	 * 타입을 맞춰준 다음에 연산해야함
	 * (다른 자료형의 값끼리 연산하고 싶다면 "형변환" 이 필수)
	 * 
	 * [ 표현법 ]
	 * 값 + (바꿀자료형)값;
	 * 
	 * * 형변환의 종류
	 * 
	 * 1. 자동형변환
	 * 자동으로 형변환이 진행되기 때문에 개발자인 내가 직접
	 * 형변환을 할 필요가 없음
	 * 
	 * 2. 강제형변환
	 * 자동으로 형변환이 진행되지 않기 때문에 개발자인 내가 직접
	 * 형변환을  꼭 해줘야함
	 * > 큰 바이트의 자료형 --> 작은 바이트의 자료형
	 * [ 표현법 ]
	 * (바꿀자료형)값
	 * 
	 * (바꿀자료형) : 형변환 연산자, cast 연산자
	 * 
	 * 
	 */
	
	// 자동형변환 개념
	// 작은 바이트 --> 큰 바이트로 자동으로 형변환 되는 경우
	public void autoCasting() {// autoCasting() 메소드 영역 시작
		
		// 1. int (4byte) --> double(8byte)
		int i1 = 10;
		double d1 = i1;
		
		System.out.println("i1 : " + i1); // 10
		System.out.println("d1 : " + d1); // 10.0
		
		
		// > 자동으로 형변환이 되었다.
		// 10 --> 10.0
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result2 = /* (double)로 형변환이 된겅 */i2 + d2;
		
		System.out.println("i2 : " + i2); // 12
		System.out.println("d2 : " + d2); // 3.3
		System.out.println("result2 : " + result2);
		
		//2. int (4byte) --> long (8byte)
		int i3 = 1000;
		long l3 = /* (long) 으로 바뀜*/i3;
		long l4 = 2000;
		
		// > L 을 붙이지 않아도 문제가 없는 이유
		// 내부적으로 자동형변환이 되기 때문에
		
		
		//특이케이스 3. long (8byte) --> float (4byte)
		long l5 = /* (long)*/1000000;
		
		float f5 = /* (float) */l5;
		
		System.out.println("f5 : " + f5);
		// > 자동형변환이 되었다.
		// 정수가 실수로 변환될 경우에는 큰 사이즈의 정수가
		// 작은 사이즈의 실수에 대입 가능
		// 4byte 짜리 float 는 사실 8byte 짜리 long 형 보다
		// 담을 수 있는 값의 범위가 더 크기 때문
		// (32 개의 0 과 1 로 표현할 수 있는 실수 값의 범위가 훨씬 큼)
		
		
		// 4. char (2byte) <--> int (4byte)
		char ch = 65;
		System.out.println("ch : " + ch);// A
		
		int num = 'A';
		System.out.println("num : " + num); // 65
		
		// > 자동형변환이 되었다.
		// char 의 범위 : 0 ~65xxx
		// 				각 문자마다 고유의 정수값이 정해져 있다.
		//				음수값은 오류가 난다. 
		// 참고) 아스키코드표
		// 0 ~ 127 까지의 정수값으로 (총 128 개의 문자만 표현 가능)
		// 영문자 대소문자, 숫자, 특수문자를 1:1 로 매칭시킨 표
		// 총 128 개의 숫자만으로 전 세계의 모든 문자를 표현하기에는 제한적임!!
		// 그래서 나온 개념이 유니코드표
		// 0 ~ 65535 까지의 정수값으로 (총 65536 개의 문자 표현 가능)
		// 영문자 대소문자, 숫자, 특수문자 + a (한글, 중국어 등 다른 문자 포함)
		
		System.out.println('김');
		System.out.println((int)'김');
		
		int sum = 'A' + 32;
		System.out.println("sum : " + sum);// ??
		// 'A' --> 65
		// 65 + 32 = 97
		
		System.out.println("sum : " + (char)sum);// 'a'
		// > 문자와 정수 사이에 산술 연산 또한 가능하다.
		// > 영문자 대문자와 소문자는 32 차이가 난다.
		
		// 특이케이스 5. byte, short 간의 연산
		
		byte b1 = 1;
		byte b2 = 10;
		byte result = (byte)(b1 + b2);
		// > byte 끼리 연산 시 무조건 결과는 int로 나오게 되어 있음
		// 강제로 형변환을 하면 byte 변수에 저장 가능
		// (short 끼리의 연산도 마찬가지임)
		
		
	}// autoCasting() 메소드 영역 끝
	
	// 강제형변환 (명시적형변환) 개념
	// 큰 바이트 --> 작은 바이트 자료형으로 변환되는 경우
	
	public void forceCasting() {
		
		// 1. double (8byte) --> float (4byte)
		float f1 = 4.0f;
		// > 반드시 f를 붙여줘야함
		
		double d2 = 8.0;
		float f2 = (float)d2; // 8.0

		// 2. double (8byte) --> int(4byte)
		// 데이터 손실이 일어나기 때문에 신중히 해야하는 케이스임!!
		double d3 = 10.89;
		int i3 = (int)d3;// 10.89 --> ??
		System.out.println("i3 : " + i3);//
		// > 10 소숫점 아래 내용이 절삭 (즉 ,데이터 손실)
		
		int iNum = 10;
		double dNum = 5.89;
		
		//int iSum = iNum + dNum;
		// > iNum 이 double 형으로 자동형변환이 되고
		// 덧셈연산이 그 이후에 이루어짐 (결과도 double)
		
		// 해결방법1) 연산결과를 int 형에 맞춰서 강제형변환
		int iSum = (int)(iNum + dNum);
		System.out.println("iSum : " + iSum); // 15
		// 10 --> 10.0 
		// 10.0 + 5.89 = 15.89
		// 15.89 --> 15
		
		// 해결방법2) 결과값을 double 형 변수에 담는다
		double dSum = iNum + dNum;
		System.out.println("dSum : " + dSum);
		
		// 그래도 결과를 int 로 취급하고 싶다면?
		// 해결방법 1 말고도 다른 해결방법이 있긴 함
		int iSum2 = iNum + (int)dNum;
		// > 덧셈 연산 전에 애초에 dNum 을 int 형으로 강제형변환
		// 자동형변환은 iNum 이 double로 변환되서 연산이 되는 것인데
		// 그 전에
		System.out.println("iSum2 : " + iSum2);
	
	
	}
	
}
