package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {

	Scanner sc = new Scanner(System.in);
		
	/* switch
	 - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용
	 
	 switch (식){
	 case 1: 수행코드 1; break;
	 case 2: 수행코드 2; break;
	 ...
	 default: case를 모두 만족하지 않은 코드; 
	 
	*/
	
	public void exs1() {
		
		System.out.print("월 : ");
		int month = sc.nextInt();
		String result; 
		
		switch(month) {
		case 1 : result = "봄"; break;
		default : result = "다시";
		}
		
		System.out.println(result);
	}
	
	public void ex1() {
		
		// 정수 입력 받아
		// 1이면 "빨강"
		// 2 - 주황
		// 3 - 노랑 
		// 4 - 초록
		// 아니면 흰색

		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		String result;
		
		switch (input) {
		
		case 1 : result = "빨강"; break;
		case 2 : result = "주황"; break;
		case 3 : result = "노랑"; break;
		case 4 : result = "초록"; break;
		default : result = "흰색";
		}
		
		System.out.println(result);
	}
	
	public void ex2() {
		
		System.out.print("달 입력: ");
		int month = sc.nextInt();
		String result;
		
		switch (month) {
		
		case 3,4,5: result="봄"; break;
		case 6,7,8: result="여름"; break;
		case 9,10,11: result="가을"; break;
		case 1,2,12: result="겨울"; break;
		default: result="오류";		 
		
		// case 3 : case 4 : .... java 14부터 ,으로 가능 
		}
		
		System.out.println(result);
		
	}
	
}
