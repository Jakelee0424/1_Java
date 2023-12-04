package edu.kh.op.ex;

import java.util.Scanner;

public class OpExample { // ��ɿ� Ŭ����

	public void ex1() { // ����Ʈ
		// ex1() method : ��ü ���� ���α׷��ֿ��� ��ü�� ���õ� �Լ�
		// -> OpExample Ŭ������ ������ �ִ� ��� �� ex1() �̶�� ����̶�� ��
				
		System.out.println("OpExample Ŭ������ ex1() ��� ����");
		System.out.println("Ŭ���� �и� �׽�Ʈ");
		System.out.println("����");
		// �� ���·� Running �Ұ� -> ���� �޼ҵ忡�� ���� ����
		
	}
	
	public void ex2() { //��ĳ��
		
		Scanner sc = new Scanner(System.in);
		// ����� �� ExampleRun -> OpExample -> Scanner ������ ����
		
		System.out.print("���� �Է� 1 : ");
		int input1 = sc.nextInt();
				
		System.out.print("���� �Է� 2 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("%d / %d = %d\n", input1, input2, input1/input2);
		System.out.printf("%d %% %d = %d\n", input1, input2, input1%input2);
		// printf���� ��ⷯ(%, ������ ��) ���� �� %%���
		
	}
	
	public void ex3() { // ���� ������
				
		int iNum1 = 10, iNum2 = 10;
		iNum1++; iNum2--;
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		// ���� ���� : �����ڰ� ���ʿ� ��ġ -> �ٸ� �����ں��� ���� ����/����
		int temp1 = 5;
		System.out.println( ++temp1  +  5 ); // ++5 + 5 -> 6 + 5 == 11
		System.out.println("temp1 : " + temp1); // temp1���� 6 ����
		
		// ���� ���� : �����ڰ� ���ʿ� ��ġ -> �ٸ� �����ں��� ���߿� ����/����
		int temp2 = 3;
		System.out.println(temp2-- + 2  ); // 3-- + 2  = 5(���� ���� 5) 
		System.out.println("temp2 : " + temp2); // temp2���� 2 ����
		
		int a = 3;
		int b = 5;				
		int c = a++ + --b;
		System.out.printf("%d / %d / %d\n", a, b, c);
		// a = 4, b = 4, c = 7 
		
	}
	
	public void ex4() { // �� ������(<, >, <=, >=, ==, !=),(true or false)
		
		int a = 10, b = 20, c = 4, d = 5;  
		int temp = 723;
		
		System.out.println(a > b); // false
		System.out.println(a < b); // true
		System.out.println(a == b); // false
		System.out.println(a != b); // true
		System.out.println((a==b) == false); // true
		System.out.println("-------------------");
		System.out.println(c < d); // true
		System.out.println(c+1 <= d); //true -> ����� ����(c+1)
		System.out.println(c >= d-1); //true
		System.out.println( (++c != d) == (--c != d) );
							// (5 != 5) == (4 != 5)
							// false == true
							// false
		System.out.println("-------------------");
		System.out.println("temp�� ¦���ΰ�? " + (temp % 2 == 0));
		System.out.println("temp�� ¦���ΰ�? " + (temp % 2 != 1));
		System.out.println("temp�� Ȧ���ΰ�? " + (temp % 2 == 1));
		System.out.println("temp�� Ȧ���ΰ�? " + (temp % 2 != 0));
		System.out.println("temp�� 3�� ����ΰ�? " + (temp % 3 == 0));
		System.out.println("temp�� 4�� ����ΰ�? " + (temp % 4 == 0));
		System.out.println("temp�� 5�� ����ΰ�? " + (temp % 5 == 0));
		
	}
	
	public void ex5() { // �� ������(&&: �� �� ���̸� ��, ||: �� �� �ϳ��� ���̸� ��)
		
		int a = 101, b = 5, c = 10;
		
		// a�� 100 �̻��̸鼭 ¦���ΰ�
		System.out.println((a >= 100) && (a % 2 == 0));
		
		// b�� 1���� 10������ ���� �ΰ�
		System.out.println((b >= 1) && (b <= 10));
		
		// c�� 10�� �ʰ��ϰų� ¦���ΰ�
		System.out.println((c > 10) || (c % 2 == 0));
		
	}

	public void ex6() { // ������ ������(!: ������ �ݴ��)
		
		boolean bool1 = true;
		boolean bool2 = !bool1;
		System.out.println("bool1 = " + bool1);
		System.out.println("bool2 = " + bool2);
		
		// ���� �Է� ���� 
		// 1) �ش� ������ 1�̻� 100���� ���� Ȯ��
		// 2) 1�̻� 100���ϰ� �ƴ��� Ȯ��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input1 = sc.nextInt();
		
		boolean result1 = ((1 < input1) && (100 >= input1));
		boolean result2 = ((1 > input1) || (100 < input1));
		boolean result3 = !((1 < input1) && (100 >= input1));	
		System.out.printf("%d�� 1�̻�, 100������ �����ΰ�? : %b\n", input1, result1);
		System.out.printf("%d�� 1�̸�, 100�ʰ��� �����ΰ�? : %b\n", input1, result2);
		System.out.printf("%d�� 1�̸�, 100�ʰ��� �����ΰ�? : %b\n", input1, result3);
		
	}
	
	public void ex7() { // ���մ��� ������(+=, -=, *=, /=, %=, ���� �� �ٽ� ����)
		
		int a = 10;
		
		a++; 
		System.out.println("a�� 1���� = " + a); // a = 11
		a += 4;
		System.out.println("a�� 4���� = " + a); // a = 15
		a -= 10;
		System.out.println("a�� 10 ���� = " + a); // a = 5
		a *= 3;
		System.out.println("a�� 3�� = " + a); // a = 15
		a /= 6;
		System.out.println("a�� 6���� ������ �� �� = " + a); // a = 2
		a %= 2;
		System.out.println("a�� 2�� ������ �� ������ = " + a); // a = 0
		
	}
	
	public void ex8() { // ���� ������(���ǽ� ? ��1 : ��2 -> true�� 1, false�� 2)
						// ���ǽĿ��� ��, ��, �������� ��
		int num = 30;		
		String result1 = num > 30 ? "num�� 30���� ū �� �̴�. " : "num�� 30������ ���̴�. ";  
		System.out.println(result1);
		
		// �Է� ���� ������ �������� ��� ���� ����(0�� �����)
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("���� �Է� : ");
		
		int input1 = sc.nextInt();
		String result2 = input1 >= 0 ? "��� �Դϴ�. " : "���� �Դϴ�. ";  
		System.out.println(result2);
		
		
	}
}
