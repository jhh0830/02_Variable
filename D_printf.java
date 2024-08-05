package com.kh.variable;

// printf ����(��� �޼ҵ�)
public class D_printf {
		
	
	
	/*
	 * * ��� �޼ҵ�
	 * System.out.println(����ϰ����ϴ°�);
	 * - �ܼ��� ���� ��¸� ����
	 * 
	 * System.out.println(����ϰ����ϴ°�);
	 * - �ش� ���� ��� ��  "�ٹٲ� (����)" ���� ����
	 *  (ln : line �� ����)
	 *  
	 *  System.out.printf("����ϰ����ϴ�����", ����ϰ����ϴ°�);
	 * 	- ���Ŀ� ���缭 ������ ������ִ� ����, ��� �� �ٹٲ� X
	 * 	(f : format �� ����)
	 * 	- ���ڿ� �ȿ� �� ���� �� �ڸ��� �Ʒ��� ���� �������� ������ ��
	 * %d : ���� 
	 * %f : �Ǽ�
	 * %c : ����
	 * %s : ���ڿ�
	 * 
	 * 
	 */
	
	public void printfTest() {
	
		//���� �׽�Ʈ
		int iNum1 = 10;
		int iNum2 = 20;
		
		// "iNum1 : xx, iNum2 : xx" �� ����غ���
		// 1. println ���
		System.out.println("iNum1 : " + iNum1 + " iNum2 : "+ iNum2);
		
		
		// 2. printf ���
		System.out.printf("iNuml : %d, iNum2 : %d\n", iNum1 ,iNum2);
		// > ��� �� �ٹٲ� ����� �����Ƿ� \n�� �߰� ���ش�.
		// System.out.println();�� �ؼ� �ٹٲ��� �ص� �ȴ�.
		
		
		// "10+ 20 = 30" ���� ����غ���
		// 1. println ���
		System.out.println(iNum1 +" + " + iNum2 + " = " + (iNum1 + iNum2));
		
		// 2. printf ���
		System.out.printf(" %d + %d = %d\n", iNum1,iNum2, iNum1 + iNum2);
		// ������ �ϳ��ۿ���� �Ұ�ȣ�� �Ƚ��൵ �ȴ�.
		
		// %d �� ���� �ɼ�
		System.out.printf("%d\n", iNum1);
		System.out.printf("%5d\n", iNum1);
		// > %5d : 5ĭ�� ���� �� ������ ����
		System.out.printf("%-5d\n", iNum1);
		// > %-5d : ĭ�� ���� �� ���� ����
		
		// �Ǽ� �׽�Ʈ
		
		double dNum = 4.27546789;
		
		// "dNum : xx.xxxx" �� ����غ���
		// 1. println ���
		System.out.println("dNum : " + dNum); // 4.27546789
		
		
		// 2. printf ���
		System.out.printf("dNum : %f\n", dNum); // 4.275468
		// > %f : �Ҽ��� �Ʒ� 7���� �ڸ����� �ݿø��Ǿ�
		//        �Ҽ��� �Ʒ� 6���� �ڸ� ������ ��µǴ� ��
		
		// %f �� ���� �ɼ�
		System.out.printf("dNum : %.1f\n",dNum );
		// > %.1f : �Ҽ��� �Ʒ� 2���� �ڸ����� �ݿø��Ǿ�
		//          �Ҽ��� �Ʒ� 1���� �ڸ� ������ ����Ǵ� ��
		// .�ڸ����� ���� ����
		
		// ���ڿ� ���ڿ� �׽�Ʈ
		char ch = 'a';
		String str = "Hello";
		
		// %c , %s �� ���� �ɼ�
		System.out.printf("%c %s\n", ch,str);
		System.out.printf("%C %S\n", ch , str);
		// > %C, %S : ���� ���ĺ��� ��� ��� �빮�ڷ� �����ؼ� ���
		
		/*
		 * * printf
		 * ���� (����) �� �ѹ� ���÷� �����ϰ� ���� ������ ��� �����ϴ�.
		 * ��, ��� �� �ٹٲ��� �Ͼ�� �ʴ´�.
		 * ��, ������ ������ ������ ����, �ڿ� ���� ������ ������ ����,
		 * ������ �� �¾� �������� �Ѵ�.
		 */
	}
}
