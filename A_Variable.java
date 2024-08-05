package com.kh.variable;
//풀 네임 : com.kh.variable.A_Variable
public class A_Variable {// A_Variable 클래스 영역 시작
	
	// 변수 사용 이유
	// 시급과 근무시간 근무일수를 곱해 월급을 계산하는 예제
	public void printSalary() {// printSalary 메소드 영역 시작
		
		// 변수 사용 전 
		System.out.println("===== 변수 사용 전 =====");
		
		System.out.println("시급 : 9800 원");
		System.out.println("근무시간 : 일 6 시간");
		System.out.println("근무일수 : 매달 5일");
		
		// 월급 = 시급 X 근무시간 X 근무일수
		// "김갑생 : xxxxx 원" 형식으로 출력
		
		// 1. 자바에서 곱셈 연산은 * 기호로 나타낸다.
		// 2. 자바에서 여러개의 텍스트를 한줄로 연이어주고 싶다면 + 기호를 쓸 수 있다.
		
		// 각 직원들의 급여를 계산하고 바로 출력해보기
		//System.out.println("김갑생 : 9800 * 6 * 5 원");
		// > 우리가 원하는 결과 "깁갑생 294000원 "
		// > 실제 나온 결과 : "김갑생 : 9800 * 6 * 5 원"
		System.out.println("김갑생 : " + (9800 * 6 * 5) + "원");
		System.out.println("홍길동 : " + (9800 * 6 * 5) + "원");
		System.out.println("박말똥 : " + (9800 * 6 * 5) + "원");
		// > 결과물은 잘 출력 되나, 무슨의미인지 한번에 파악하기 어려움
		// > 코드 수정시 실수를 하게 되면 프로그램의 정확도가 떨어짐
		
		// 변수 사용 후
		System.out.println("===== 변수 사용 후 =====");
		//시급과 근무시간과 근무일수를 담을 수 있는 변수 먼저 생성
		int pay = 10100; // 시급
		int time = 6; // 근무시간
		int day = 5; // 근무일수
		
		System.out.println("시급 : "+ pay + "원" );
		System.out.println("근무시간 : 일"+ time + "시간");
		System.out.println("근무일수 : "+ day + " 일");
		
		//시급 (pay) * 근무시간(time) * 근무일수 (day)
		System.out.println("김갑생 :"+pay * time * day+" 원");
		System.out.println("홍길동 :"+pay * time * day+" 원");
		System.out.println("박말똥 :"+pay * time * day+" 원");
		
		
		/*
		 * *변수를 사용하는 이유
		 * 1. 변수는 우선적으로 값에 의미를 부여할 목적으로 사용(가독성이 좋음)
		 * 2. 단 한번 값을 잘 기록해두고 
		 * 필요할 때마다 계속 꺼내서 사용할 목적으로 사용(코드의 재사용성 높아짐)
		 * 3. 유지보수를 보다 쉽게 할 수 있다.
		 * 
		 * 
		 */
	}// printSalary 메소드 영역 끝
	
	
	// 변수의 선언 및 자료형 개념
	public void declareVariable() { //declareVariable() 메소드 시작
		
		/*
		 * * 변수의 선언
		 * 값을 기록해두기 위한 변수를 메모리 공간에 확보해 두겠다.
		 * 즉, 값을 담아둘 상자 (박스) 를 만들겠다.
		 * 
		 * [ 표현번 ]
		 * 자료형 변수명;
		 * 
		 * - 자료형 : 변수의 크기 및 모양을 지정하는 부분
		 * - 변수명 : 변수의 이름을 정하는 부분 (의미부여)
		 * 
		 * * 변수 선언 시 주의할 점
		 * 1. 변수명은 소문자로 시작하게끔 이름을 지어줄 것
		 * (단, 낙타 표기법은 지키기)
		 * 2. 같은 영역 ({ 여기 }) 안에서는 동일한 변수명으로 선언 불가
		 * 3. 해당 영역 ({ 여기 }) 내에 선언된 변수는 
		 * 		그 영역 안쪽에서만 사용 가능함 > 지역변수 개념
		 * 
		 * 
		 */
		
		// ----- 자료형에 대한 개념 -----
		// 1. 논리형 (논리값 : 어떤 질문에 대해 예 - true 또는 아니오 - false 로 대답이 나는 값)
		boolean isTrue; // 1byte 짜리 빈 상자가 만들어짐
		
		// 2. 숫자형
		// 2_1. 정수형
		// 정수값 : 소수점이 없는 숫자값
		byte bNum; // 1byte 짜리 빈 상자가 만들어짐 (-128 ~ 127)
		short sNum;// 2byte 짜리 빈 상자가 만들어짐 (-32XXX ~ 32XXX)
		int iNum; // 4byte 짜리 빈 상자가 만들어짐 (-21억xxx ~ 21억xxx)
		long lNum; // 8byte 짜리 빈 상자가 만들어짐 (제일 큰 범위)
		// > 정수형 자료형들 중에서 제일 기본은 int 임!!
		// 컴퓨터 일을할때 사용하는 값이 4byte라서 그런거임
		
		
		
		// 2_2. 실수형
		// 실수값 : 소숫점이 있는 숫자값
		float fNum; // 4byte 짜리 빈 상자가 만들어짐 (소숫점 아래 7자리 까지 표현)
		double dNum; // 8byte 짜리 빈 상자가 만들어짐 (소숫점 아래 15자리 까지 표현)
		// > 실수형 자료형들 중에서 제일 기본은 double 임!!
		// 수학에서는 소숫점이 길면 길수록 정확도가 높기 때문에 (근사값이 더 정확해져서?)
		
		
		// 3. 문자형
		// 문자값 : 글자 단 한개를 나타내는 값
		char ch; // 2byte 짜리 빈 상자가 만들어짐
		
		// --- 여기까지 총 8 개의 자료형 = 기본자료형 ---
		
		// 4. 문자열형
		// 문자열값 : 글자들이 나열되어있는 형태의 값
		String str; // 4byte 짜리 빈 상자가 만들어짐
		
		// --- 문자열형은 참조자료형 ---
		
		// --- 여기까지 총 9개의 빈 박스가 생성됨 ---
		
		/*
		 * * 변수에 값 대입
		 *  변수에 값을 담겠다. 기록하겠다.
		 *  [ 표현법 ]
		 * 변수명 = 값;
		 * 
		 * - = 은 값을 대입하는 용도임(대입연산자)
		 * 
		 */
		
		
		isTrue = false;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		// long 임을 알려주기 위해 l 또는 L 을 표기해주는 편
		// (대문자 L 을 더 권장 소문자는 숫자 1과 혼동이 올수도있어서)
		
		fNum = 4.0f;
		// > float 임을 알려주기 위해 f를 붙여서 씀 (반드시 안쓰면 오류남)
		dNum =  8.0;
		
		ch = 'A';
		// > 반드시 '' (홑따옴표) 안에 기술한다.
		
		str= "ABC";
		// > 반드시 "" (쌍따옴표) 안에 기술한다.
		
		// 각 변수에 담긴 값들 출력해보기 
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
		
		
	}//declareVariable() 메소드 끝

	//변수 선언과 동시에 값 대입
	public void initVariable() { // initVariable() 메소드 시작
		/*
		 * * 변수 선언과 동시에 값 대입
		 * 변수에 "처음으로 값을 대입하는 행위" 를 "초기화" 라고 한다.
		 *  
		 *  [ 표현법 ]
		 *  
		 *  자료형 변수명 = 값;
		 *  
		 */
		
		// 1. 논리형
		boolean isTrue =  3 < 5;
		// > 3 이 5 보닥 작습니까? true
		
		// 2. 숫자형
		// 2_1. 정수형
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		// 2_2. 실수형
		float fNum = 4.0f;
		double dNum = 8.0;
		
		// 3. 문자형
		char ch = '김';
		
		// 4. 문자열형 (참조자료형)
		String str = "자바 공부중";
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
		
	} // initVariable() 메소드 끝
	//상수 개념
	public void constant() {// constant 메소드 영역  시작
		/*
		 * * 상수
		 * 변하지 않는 고정적인 값을 담을 수 있는 공간
		 * 
		 * [ 표현법 ]
		 * 선언 후 초기화
		 * final 자료형 상수명; // 빈 상자 만들기
		 * 상수명 = 값; // 값 초기화 후 절대 못바꿈
		 * 
		 * 선언과 동시에 초기화
		 * final 자료형 상수명 = 값;
		 * 
		 * 
		 * 상수명은 관례상 모두 대문자로 기술한다.
		 * 
		 */
		
		int age = 20; // qustn (값 변화 가능)
		System.out.println("age :  " + age);
		
		age = 21;
		System.out.println("변경된 age : " + age);
		
		final int AGE = 20; // 상수 (값 변화 불가능)
		System.out.println("AGE : " + AGE);
		
		// AGE =21;
		// > 나이와 같이 자주 바뀌는 값들은 상수로 지정하면 불편함
		
		
		
	}// constant 메소드 영역 끝
	// 데이터 오버플로우
	public void overflow() {
		byte bNum =127;
		System.out.println("before : " + bNum); //127나오는게 정배 
		
		bNum++;
		// > 기존 bNum 변수에 들어있는 값에 1을 증가 시킨 후
		// 그 결과를 다시 bNum 변수에 대입하겠다.
		System.out.println("after : " + bNum); //128?	
		// > 128이 아닌 -128 이 출력된다.
	}
	
}// A_Variable 클래스 영역 끝


