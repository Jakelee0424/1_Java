package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
/*�޼ҵ� �� : public void practice1(){}
	��� ����� ������ ����� ������������ �Ѵ�. �ο� ���� ���� ������ Ű����� �Է� �ް�
	1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ϼ���.

	[����ȭ��]
	�ο� �� : 29
	���� ���� : 100
	1�δ� ���� ���� : 3
	���� ���� ���� : 13 */
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int num1 = sc.nextInt();
				
		System.out.print("���� ���� : ");
		int num2 = sc.nextInt();
		
		System.out.printf("1�δ� ���� ���� : %d\n", num2 / num1);
		System.out.printf("���� ���� ���� : %d\n", num2 % num1);
		
	}
	/*
	�޼ҵ� �� : public void practice2(){}
	Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���.
	ex.
	�̸� : ȫ�浿
	�г�(������) : 3
	��(������) : 4
	��ȣ(������) : 15
	����(���л�/���л�) : ���л�
	����(�Ҽ��� �Ʒ� ��° �ڸ�����) : 85.75
	3�г� 4�� 15�� ȫ�浿 ���л��� ������ 85.75�̴�
	*/
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�г�(���� �Է�) : ");
		int SchoolGrade = sc.nextInt();
		
		System.out.print("��(���� �Է�) : ");
		int numOfClass = sc.nextInt();
		
		System.out.print("��ȣ(���� �Է�) : ");
		int numOfStudent = sc.nextInt();
		
		sc.nextLine(); // ���๮�� (/n)�� ���� 
		System.out.print("���� : ");
		String gender = sc.nextLine();	
		
		System.out.print("���� : ");
		double grade = sc.nextDouble();
		
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.", SchoolGrade, numOfClass, numOfStudent, name, gender, grade);
		
	}
	
	/*
		�޼ҵ� �� : public void practice3(){}
		����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�, 
		�� ���� ���� �հ�(����+����+����)�� ���(�հ�/3.0)�� ���ϼ���.
		�� ���� ������ ���� 40 �̻�, ����� 60�̻� �հ� , �ƴϸ� ���հ�
		
		[����ȭ��]
		���� : 60
		���� : 80
		���� : 40
		�հ� : 180
		��� : 60.0
		
	*/
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
				
		System.out.print("���� : ");
		int eng = sc.nextInt();
		
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		float avr = (float)sum/3;
		
		System.out.printf("�հ� : %d\n", sum);
		System.out.printf("��� : %.1f\n", (float)avr);
		
		boolean result = (kor > 40) && (eng > 40) && (math > 40) && (avr >= 60);
		System.out.println(result ? "�հ�" : "���հ�");
		System.out.println((kor > 40) && (eng > 40) && (math > 40) && (avr >= 60 || avr < 60)  ? "�հ�" : "���հ�");
		
			
		
				
	}
}