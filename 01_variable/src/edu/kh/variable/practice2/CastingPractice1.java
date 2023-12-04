package edu.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice1 {
	
	public void ex1(String[] args) {
	
		/*
		키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요.
		ex. 문자 : A
		A unicode : 65
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("하나의 문자를 입력하세요 : ");
		char input1 = sc.next().charAt(0); // 메서드 체이닝
		//charAt(0); => 문자열의 위치를 뽑아냄(인덱스, 0부터 시작)
		
		/*
		
		System.out.print("하나의 문자를 입력하세요 : ");
		Stirng input1 = sc.next()
		char result = input1.charAt(0);  위랑 동일
		
		*/
		
		 
		
		System.out.printf("%s의 unicode는 %d 입니다.\n", input1, (int)input1);
		System.out.println(input1 + "의 unicode는 " + (int)input1 +" 입니다.");
		
		
		
	}
}
