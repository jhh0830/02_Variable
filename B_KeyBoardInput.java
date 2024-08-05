package com.kh.variable;

import java.util.Scanner;

// 사용자가 키보드로 입력한 값을 변수에 기록하는 방법
public class B_KeyBoardInput {

	public void inputTest1() {// inputTest1 메소드 영역 시작
		
		/*
		 * * Scanner
		 * 사용자로부터 정수, 실수, 문자열을 입력받을 수 있게끔
		 * 고안된 "클래스" (이름이 대문자로 시작함)
		 * > 자바에서 기본적으로 제공되는 클래스임(내가 만든게 아님!!)
		 * java.util 패키지 내부에 존재함
		 * 즉, 풀 클래스명이 java.util.Scanner 가 됨
		 */
		// Scanner 클래스 내에 정의된 값을 키보드로 입력받는
		// 메소드를 호출해서 사용할 것!!
		
		// 1. Scanner 클래스를 대변할이름을 생성하기 (new)
		Scanner sc = new Scanner(System.in);
		// > System.in 은 키보드로 입력받은 값을 바이트 단위로
		// 읽어들이겠다 라는 뜻임
		
		
		// 2. 그 대변할이름을 가지고 메소드 호출하기
		// sc.메소드명();
		// > Scanner 클래스 내부의 유용한 메소드들을
		// 쓰임새에 맞게 호출하면 됨
		
		// 사용자의 인적사항 (이름, 나이, 키) 을 입력받아
		// 출력하는 프로그램
		
		// 항상 입력받기 전에는 사용자의 입력을 제대로 유도하자
		System.out.print("당신의 이름은 무엇입니까? : ");
		
		// 이름 : "정진혁", "백상현" , "조강현", ....
		// > 문자열 String 타입
		
		// * 사용자가 입력한 값을 문자열로 받아오는 메소드
		// next(), nextLine()
		// > 호출 구문만 작성한다면 입력만 받고 그냥 끝나게 됨
		
		// 변수 선언과 동시에 값을 입력받아서 바로 대입한다.
		//String name = sc.next();
		// > 사용자가 엔터를 입력하기 전까지 대기상태임
		
		//System.out.println(name);
		// > next() : 사용자가 입력한 값 중에서 공백 ("") 이전까지만
		// 입력을 받아준다.
		//
		// 예) "김 가현" 을 입력한 경우 "김" 만 입력됨
		String name = sc.nextLine();
		// > 사용자가 엔터를 입력하기 전까지 대기상태임
		
		// System.out.println(name);
		// > nextLine() : 사용자가 입력한 값 중 개행이 있을 경우
		// 공백과 무관하게 개행 이전까지 모두 입력을 받아준다.
		
		
		// 특히, 사용자가 입력한 값에 공백이 포함될 여지가 있을 경우
		// next 보다는 nextLine 메소드를 사용할 것
		// 예) "서울시 마포구 공덕동" 와 같은 주소
		
		System.out.print("당신의 나이는 몇살입니까? : ");
		
		// 나이 : 20, 35, 44, ....
		// > 정수 int 타입
		
		// * 사용자가 입력한 값을 정수 int 로 받아오는 메소드
		// nextInt()
		
		int age = sc.nextInt();
		// > 사용자가 엔터를 입력할 때 까지 대기 상태
		
		
		// 키 : 165.0, 182.5, ...
		// > 실수 double 타입
		
		// * 사용자가 입력한 값을 실수 double 로 받아오는 메소드
		// nextDouble()
		System.out.print("당신의 나이는 몇살입니까? : ");
		
		double height = sc.nextDouble();
		// > 사용자가 엔터키를 입력할 때 까지 대기 상태
		// System.out.println(height);
		// name, age, height 를 이용해서 하나의 문자열로 출력
		// "xxx님의 나이는 xx살이고, 키는 xxx.xcm입니다." 형식
		
		
		System.out.println(name + "님의 나이는 " + age + "살이고 " + "키는 " + height+ " 입니다.");
		
		// Scanner 메소드들은 변수 선언과 동시에 값을 입력받아
		// 곱바로 대입하는 구조로 많이 쓴다!!
		
		
	}// inputTest1 메소드 영역 끝
	
	public void inputTest2() { // inputTest2 메소드 영역 시작
		// 사용자의 인적사항을 입력받아 출력하는 프로그램
		// 출력하는 프로그램
		
		// Scanner 클래스를 대변할이름을 먼저 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		// 이 시점 기준으로 버퍼는 깨끗함
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		// 이 시점 기준으로 버퍼에는 개행문자 (\n) 남아있음
		
		// 이 시점에서 다음 코드로 넘어가기 전에
		// 해당 이슈를 해결하기 위해 버퍼 공간을 비우고 넘어갈 것임!!
		// > 버퍼를 비워주는 메소드 : nextLine();
		sc.nextLine();
		// 예시로 System.out.println();이걸로 한번 엔터치는것처럼 한다 생각하면됨
		// 버퍼를 비워주는 용도로 nextLine 메소드를 호출하고 싶다면
		// 변수에 대입하는 구문을 제외하고 그냥 호출만 해주면 됨
		
		
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		// 어? 이미 입력을 뭐나하고 사용자가 엔터키를 쳤나?
		// > 사용자가 키보드로 입력한 걸로 간주해서 이슈가 발생한것
		
		// 주소를 입력받지 않고 곧바로 키를 입력하는 부분으로
		// 흐름이 넘어가 버린 것을 알수있다.
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		// > nextLine 을 제외한 다른 입력용 메소드들은
		// 모두 입력만 받고 버퍼 공간을 깨끗이 비워두지 않는다.
		// 혹시 모르니 항상 버퍼를 비우는 nextLine 메소드를 호출하는
		// 습관을 들이자!!
		
		// name, age, address, height 변수값들을 출력해보기
		System.out.println("*** "+ name + " 님의 개인정보  ***");
		System.out.println("나이는 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("키 :  " + height);
		
		
	}// inputTest2 메소드 영역 끝
	
	// 그 이외의 타입의 값을 입력받은 방법
	
	public void inputTest3() {// inputTest3 메소드 영역 시작
		
		/*
		 * * Scanner 클래스에ㅓ서 제공하는 값을 입력받는 메소드들
		 * 문자열을 입력받을 때 : next(), nextLine();
		 * 정수값을 입력받을 때 : nextInt(), nextByte(), nextShort(), nextLong()
		 * 실수값을 입력받을 때 : nextDouble(), nextFloat()
		 * 논리값을 입력받을 때 : nextBoolean()
		 * 그럼 문자값을 입력 받을 경우에는?? nextChar()?
		 * 
		 * 
		 */
		
		// 사용자의 인적사항 (이름, 성별, 나이, 키)을 입력받아서
		// 출력하는 프로그램
		
		// Scanner 클래스를 대변할이름 먼저 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : "); //String
		String name =sc.nextLine();
		
		System.out.print("성별을 입력하세요 (M/F): "); // char
		// char gender = sc.nextChar();
		// > nextChar 라는 메소드는 존재하지 않음
		
		/*
		 * * 문자열의 index 개념
		 * index : 색인, 번호, 순번 이런 뜻
		 * 
		 * 예) "apple" 문자열의 인덱스
		 * 		01234
		 * > 문자열에서 0부터 시작하는 각 글자의 자릿수
		 * 
		 * "hello" 라는 문자열에서 2번 인덱스의 문자는? '1'
		 *  01234
		 *  
		 *  "Male" 이라는 문자열에서 0번 인덱스의 문자는? 'M'
		 *  "Female" 이라는 문자열에서 0번 인덱스의 문자는? 'F'
		 *	[ 표현법 ]
		 * 문자열변수명.charAt(뽑을위치값);
		 * 
		 * - 주의할 점
		 * 만약 문자열의 글자수 보다 더 범위가 큰 인덱스 값을 제시한다면?
		 * 예) "apple" 문자열의 10번째 인덱스의 글자? X
		 *      "hi" 문자열의 2번째 인덱스의 글자? X
		 * StringIndexOutOfBoundsException 오류가 발생함
		 * 
		 * 
		 * 
		 */
		char gender = sc.nextLine().charAt(0);
		// > 우선 문자열을 입력받은 후 곧바로 0번째 글자만 추출한 것
		
		System.out.print("나이를 입력하세요 :  "); // int
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("키를 입력하세요 (cm) : ");// double
		double height = sc.nextDouble();
		sc.nextLine();
		
		// 입력받은 정보를 출력해보기
		
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		
		
		
		
	}// inputTest3 메소드 영역 끝
	
	//charAt 연습
	public void inputTest4() {
		Scanner sc = new Scanner(System.in);
		
		//사용자로부터 세글자 이상의 문자열을 입력받기
		System.out.print("세글자 이상의 문자열을 입력해보세요 : ");
		
		String str = sc.nextLine();
		char a = str.charAt(0);
		char b =str.charAt(1);
		char c= str.charAt(2);
		
		//str로 부터 각각
		// 첫번째 글자, 두번째 글자, 세번째 글자를 뽑아서 출력하기
		// 첫번째 글자 : h
		// 두번째 글자 : e
		// 세번째 글자 : l
		
		
		
		
		System.out.println("첫번째 글자 : " + a);
		System.out.println("첫번째 글자 : " + b);
		System.out.println("세번째 글자 : " + c);
		
	}
	
	
	public void inputTest5() {
		
		Scanner sc = new Scanner(System.in);
		// 두 정수를 키보드로 입력받아
		// 각각 덧셈, 뺄셈, 곱셈, 나눗셈 결과를 출력하기
		
		/*
		 * 실행예시)
		 * 첫번째 정수 : 10
		 * 두번째 정수 : 2
		 * -------------
		 * 덧셈 결과 : 12
		 * 뺄셈 결과 : 8
		 * 곱셈 결과 : 20
		 * 나눗셈 : 5
		 * 
		 *  힌트) 덧셈 : + , 뺄셈 : -, 곱셈 : * , 나눗셈 : /
		 *
		 * 
		 * 
		 */
		System.out.print("첫번째 정수를 입력하세요 : ");
		
		int one = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		sc.nextLine();
		int two = sc.nextInt(); // sc.nextInt 는 그냥 Scanner 같은곳에 저장되어있는게 아닌가봄?
		//같은 사물함에 주소가 살짝 다른 곳에 저장되는게 아닐까? 아니면 stack에 가는게 아니라 heap에 가서 그른가보다
		sc.nextLine(); 
		// 안해줫는데 혹시 몰라서 미리 해주는거 같다 
		//이걸 안쓰고 후버전에는 이런걸 안써도 자동으로 버퍼를 비워주는게 나오려나?
		System.out.println("덧셈 결과 : "+ (one+two) +" / 뺄셈 결과 : "+(one-two)+" \n"+ "곱셈 결과 : "+ (one*two) +" / 나눗셈 결과 : "+ (one/two) );
		
		int result1 = one + two;
		int result2 = one - two;
		int result3 = one * two;
		int result4 = one / two;
		
		System.out.println("덧셈 결과 : "+result1+" 뺄셈 결과 : "+result2+" 곱셈 결과 : " + result3 + "나눗셈 결과 : " + result4);
		
	}
	
}
