package edu.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice3 {

public void prac1(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	
	System.out.print("하나의 문자를 입력하세요 : ");
	char input1 = sc.next().charAt(0); 
}
	
	
public void prac2(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수를 입력하세요 : ");
		double kor = sc.nextDouble();
		
		System.out.print("영어 점수를 입력하세요 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 점수를 입력하세요 : ");
		double math = sc.nextDouble();
		System.out.println("총점 = " + (int)(kor+eng+math));
		System.out.println("평균 = " + (int)(kor+eng+math)/3);
	}
}
