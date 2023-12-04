package edu.kh.control.conditionA;

import java.util.Scanner;

public class ConditionExampleAnswer {

	Scanner sc = new Scanner(System.in);
	
	public void exa5() {
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		String result;
		
		if(age <= 13) {
			result = "어린이 입니다.";
		} else if( age > 19) {
			result = "성인 입니다.";
		} else {
			result = "청소년 입니다.";
		}
		System.out.println(result);
	} 
	
	public void exa6() {
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		String result;

		if(score < 0 || score > 100) {
			result = "잘못 입력하셨습니다";
		} else if(score >=  90) {
			result = "A";
		} else if(score >= 80) {
			result = "B";
		} else if(score >= 70) {
			result = "C";
		} else if(score >= 60){
			result = "D";
		} else{
			result = "F";
		}
		System.out.println(result);
	}  
	
	public void exa7() {

		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age < 0 || age>100) {
			result = "잘못 입력하셨습니다.";
		} else 		{
		
			System.out.print("키 : ");
			double hei = sc.nextDouble();
		
			if(age < 12 ) {
				result = "적정 연령이 아닙니다.";
			} else if(hei < 140.0) {
				result = "적정 키가 아닙니다.";
			} else {
				result = "탑승 가능";
			}
						
		System.out.println(result);
	}
}
	
	public void exa8() {
	
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if (age < 0 || age >100) {
			result = "나이를 잘못 입력하셨습니다.";
			
		} else {
			System.out.print("키 입력 : ");
			double hei = sc.nextDouble();
			
			if(hei < 0 || hei > 250) {
				result = "키를 잘못 입력하셨습니다.";
				
			} else {
				
				if(age < 12 && hei >= 140) {
					result = "키는 적절하나 나이는 적절치 않음.";
				} else if(age >= 12 && hei <140) {
					result = "나이는 적절하나 키가 적절치 않음.";
				} else if(age <12 && hei <140) {
					result = "나이와 키 모두 적절치 않음.";
				} else {
					result = "탑승 가능";
				}
				
			}
		}
		System.out.print(result);
	}
}