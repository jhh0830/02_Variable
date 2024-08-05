package com.kh.variable;

import java.util.Scanner;

// ����ڰ� Ű����� �Է��� ���� ������ ����ϴ� ���
public class B_KeyBoardInput {

	public void inputTest1() {// inputTest1 �޼ҵ� ���� ����
		
		/*
		 * * Scanner
		 * ����ڷκ��� ����, �Ǽ�, ���ڿ��� �Է¹��� �� �ְԲ�
		 * ��ȵ� "Ŭ����" (�̸��� �빮�ڷ� ������)
		 * > �ڹٿ��� �⺻������ �����Ǵ� Ŭ������(���� ����� �ƴ�!!)
		 * java.util ��Ű�� ���ο� ������
		 * ��, Ǯ Ŭ�������� java.util.Scanner �� ��
		 */
		// Scanner Ŭ���� ���� ���ǵ� ���� Ű����� �Է¹޴�
		// �޼ҵ带 ȣ���ؼ� ����� ��!!
		
		// 1. Scanner Ŭ������ �뺯���̸��� �����ϱ� (new)
		Scanner sc = new Scanner(System.in);
		// > System.in �� Ű����� �Է¹��� ���� ����Ʈ ������
		// �о���̰ڴ� ��� ����
		
		
		// 2. �� �뺯���̸��� ������ �޼ҵ� ȣ���ϱ�
		// sc.�޼ҵ��();
		// > Scanner Ŭ���� ������ ������ �޼ҵ����
		// ���ӻ��� �°� ȣ���ϸ� ��
		
		// ������� �������� (�̸�, ����, Ű) �� �Է¹޾�
		// ����ϴ� ���α׷�
		
		// �׻� �Է¹ޱ� ������ ������� �Է��� ����� ��������
		System.out.print("����� �̸��� �����Դϱ�? : ");
		
		// �̸� : "������", "�����" , "������", ....
		// > ���ڿ� String Ÿ��
		
		// * ����ڰ� �Է��� ���� ���ڿ��� �޾ƿ��� �޼ҵ�
		// next(), nextLine()
		// > ȣ�� ������ �ۼ��Ѵٸ� �Է¸� �ް� �׳� ������ ��
		
		// ���� ����� ���ÿ� ���� �Է¹޾Ƽ� �ٷ� �����Ѵ�.
		//String name = sc.next();
		// > ����ڰ� ���͸� �Է��ϱ� ������ ��������
		
		//System.out.println(name);
		// > next() : ����ڰ� �Է��� �� �߿��� ���� ("") ����������
		// �Է��� �޾��ش�.
		//
		// ��) "�� ����" �� �Է��� ��� "��" �� �Էµ�
		String name = sc.nextLine();
		// > ����ڰ� ���͸� �Է��ϱ� ������ ��������
		
		// System.out.println(name);
		// > nextLine() : ����ڰ� �Է��� �� �� ������ ���� ���
		// ����� �����ϰ� ���� �������� ��� �Է��� �޾��ش�.
		
		
		// Ư��, ����ڰ� �Է��� ���� ������ ���Ե� ������ ���� ���
		// next ���ٴ� nextLine �޼ҵ带 ����� ��
		// ��) "����� ������ ������" �� ���� �ּ�
		
		System.out.print("����� ���̴� ����Դϱ�? : ");
		
		// ���� : 20, 35, 44, ....
		// > ���� int Ÿ��
		
		// * ����ڰ� �Է��� ���� ���� int �� �޾ƿ��� �޼ҵ�
		// nextInt()
		
		int age = sc.nextInt();
		// > ����ڰ� ���͸� �Է��� �� ���� ��� ����
		
		
		// Ű : 165.0, 182.5, ...
		// > �Ǽ� double Ÿ��
		
		// * ����ڰ� �Է��� ���� �Ǽ� double �� �޾ƿ��� �޼ҵ�
		// nextDouble()
		System.out.print("����� ���̴� ����Դϱ�? : ");
		
		double height = sc.nextDouble();
		// > ����ڰ� ����Ű�� �Է��� �� ���� ��� ����
		// System.out.println(height);
		// name, age, height �� �̿��ؼ� �ϳ��� ���ڿ��� ���
		// "xxx���� ���̴� xx���̰�, Ű�� xxx.xcm�Դϴ�." ����
		
		
		System.out.println(name + "���� ���̴� " + age + "���̰� " + "Ű�� " + height+ " �Դϴ�.");
		
		// Scanner �޼ҵ���� ���� ����� ���ÿ� ���� �Է¹޾�
		// ���ٷ� �����ϴ� ������ ���� ����!!
		
		
	}// inputTest1 �޼ҵ� ���� ��
	
	public void inputTest2() { // inputTest2 �޼ҵ� ���� ����
		// ������� ���������� �Է¹޾� ����ϴ� ���α׷�
		// ����ϴ� ���α׷�
		
		// Scanner Ŭ������ �뺯���̸��� ���� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		// �� ���� �������� ���۴� ������
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		// �� ���� �������� ���ۿ��� ���๮�� (\n) ��������
		
		// �� �������� ���� �ڵ�� �Ѿ�� ����
		// �ش� �̽��� �ذ��ϱ� ���� ���� ������ ���� �Ѿ ����!!
		// > ���۸� ����ִ� �޼ҵ� : nextLine();
		sc.nextLine();
		// ���÷� System.out.println();�̰ɷ� �ѹ� ����ġ�°�ó�� �Ѵ� �����ϸ��
		// ���۸� ����ִ� �뵵�� nextLine �޼ҵ带 ȣ���ϰ� �ʹٸ�
		// ������ �����ϴ� ������ �����ϰ� �׳� ȣ�⸸ ���ָ� ��
		
		
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		String address = sc.nextLine();
		// ��? �̹� �Է��� �����ϰ� ����ڰ� ����Ű�� �Ƴ�?
		// > ����ڰ� Ű����� �Է��� �ɷ� �����ؼ� �̽��� �߻��Ѱ�
		
		// �ּҸ� �Է¹��� �ʰ� ��ٷ� Ű�� �Է��ϴ� �κ�����
		// �帧�� �Ѿ ���� ���� �˼��ִ�.
		System.out.print("Ű�� �Է��ϼ��� : ");
		double height = sc.nextDouble();
		sc.nextLine();
		// > nextLine �� ������ �ٸ� �Է¿� �޼ҵ����
		// ��� �Է¸� �ް� ���� ������ ������ ������� �ʴ´�.
		// Ȥ�� �𸣴� �׻� ���۸� ���� nextLine �޼ҵ带 ȣ���ϴ�
		// ������ ������!!
		
		// name, age, address, height ���������� ����غ���
		System.out.println("*** "+ name + " ���� ��������  ***");
		System.out.println("���̴� : " + age);
		System.out.println("�ּ� : " + address);
		System.out.println("Ű :  " + height);
		
		
	}// inputTest2 �޼ҵ� ���� ��
	
	// �� �̿��� Ÿ���� ���� �Է¹��� ���
	
	public void inputTest3() {// inputTest3 �޼ҵ� ���� ����
		
		/*
		 * * Scanner Ŭ�������ü� �����ϴ� ���� �Է¹޴� �޼ҵ��
		 * ���ڿ��� �Է¹��� �� : next(), nextLine();
		 * �������� �Է¹��� �� : nextInt(), nextByte(), nextShort(), nextLong()
		 * �Ǽ����� �Է¹��� �� : nextDouble(), nextFloat()
		 * ������ �Է¹��� �� : nextBoolean()
		 * �׷� ���ڰ��� �Է� ���� ��쿡��?? nextChar()?
		 * 
		 * 
		 */
		
		// ������� �������� (�̸�, ����, ����, Ű)�� �Է¹޾Ƽ�
		// ����ϴ� ���α׷�
		
		// Scanner Ŭ������ �뺯���̸� ���� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : "); //String
		String name =sc.nextLine();
		
		System.out.print("������ �Է��ϼ��� (M/F): "); // char
		// char gender = sc.nextChar();
		// > nextChar ��� �޼ҵ�� �������� ����
		
		/*
		 * * ���ڿ��� index ����
		 * index : ����, ��ȣ, ���� �̷� ��
		 * 
		 * ��) "apple" ���ڿ��� �ε���
		 * 		01234
		 * > ���ڿ����� 0���� �����ϴ� �� ������ �ڸ���
		 * 
		 * "hello" ��� ���ڿ����� 2�� �ε����� ���ڴ�? '1'
		 *  01234
		 *  
		 *  "Male" �̶�� ���ڿ����� 0�� �ε����� ���ڴ�? 'M'
		 *  "Female" �̶�� ���ڿ����� 0�� �ε����� ���ڴ�? 'F'
		 *	[ ǥ���� ]
		 * ���ڿ�������.charAt(������ġ��);
		 * 
		 * - ������ ��
		 * ���� ���ڿ��� ���ڼ� ���� �� ������ ū �ε��� ���� �����Ѵٸ�?
		 * ��) "apple" ���ڿ��� 10��° �ε����� ����? X
		 *      "hi" ���ڿ��� 2��° �ε����� ����? X
		 * StringIndexOutOfBoundsException ������ �߻���
		 * 
		 * 
		 * 
		 */
		char gender = sc.nextLine().charAt(0);
		// > �켱 ���ڿ��� �Է¹��� �� ��ٷ� 0��° ���ڸ� ������ ��
		
		System.out.print("���̸� �Է��ϼ��� :  "); // int
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("Ű�� �Է��ϼ��� (cm) : ");// double
		double height = sc.nextDouble();
		sc.nextLine();
		
		// �Է¹��� ������ ����غ���
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("Ű : " + height);
		
		
		
		
	}// inputTest3 �޼ҵ� ���� ��
	
	//charAt ����
	public void inputTest4() {
		Scanner sc = new Scanner(System.in);
		
		//����ڷκ��� ������ �̻��� ���ڿ��� �Է¹ޱ�
		System.out.print("������ �̻��� ���ڿ��� �Է��غ����� : ");
		
		String str = sc.nextLine();
		char a = str.charAt(0);
		char b =str.charAt(1);
		char c= str.charAt(2);
		
		//str�� ���� ����
		// ù��° ����, �ι�° ����, ����° ���ڸ� �̾Ƽ� ����ϱ�
		// ù��° ���� : h
		// �ι�° ���� : e
		// ����° ���� : l
		
		
		
		
		System.out.println("ù��° ���� : " + a);
		System.out.println("ù��° ���� : " + b);
		System.out.println("����° ���� : " + c);
		
	}
	
	
	public void inputTest5() {
		
		Scanner sc = new Scanner(System.in);
		// �� ������ Ű����� �Է¹޾�
		// ���� ����, ����, ����, ������ ����� ����ϱ�
		
		/*
		 * ���࿹��)
		 * ù��° ���� : 10
		 * �ι�° ���� : 2
		 * -------------
		 * ���� ��� : 12
		 * ���� ��� : 8
		 * ���� ��� : 20
		 * ������ : 5
		 * 
		 *  ��Ʈ) ���� : + , ���� : -, ���� : * , ������ : /
		 *
		 * 
		 * 
		 */
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		
		int one = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		sc.nextLine();
		int two = sc.nextInt(); // sc.nextInt �� �׳� Scanner �������� ����Ǿ��ִ°� �ƴѰ���?
		//���� �繰�Կ� �ּҰ� ��¦ �ٸ� ���� ����Ǵ°� �ƴұ�? �ƴϸ� stack�� ���°� �ƴ϶� heap�� ���� �׸�������
		sc.nextLine(); 
		// ���آZ�µ� Ȥ�� ���� �̸� ���ִ°� ���� 
		//�̰� �Ⱦ��� �Ĺ������� �̷��� �Ƚᵵ �ڵ����� ���۸� ����ִ°� ��������?
		System.out.println("���� ��� : "+ (one+two) +" / ���� ��� : "+(one-two)+" \n"+ "���� ��� : "+ (one*two) +" / ������ ��� : "+ (one/two) );
		
		int result1 = one + two;
		int result2 = one - two;
		int result3 = one * two;
		int result4 = one / two;
		
		System.out.println("���� ��� : "+result1+" ���� ��� : "+result2+" ���� ��� : " + result3 + "������ ��� : " + result4);
		
	}
	
}
