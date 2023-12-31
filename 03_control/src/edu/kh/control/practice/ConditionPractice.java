package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		String result;
		
		if(input < 0) {
			result = "양수만 입력해주세요";
		} else if(input % 2 == 0) {
			result = "짝수입니다.";
		} else {
			result = "홀수입니다.";
		}
		System.out.print(result);
	}

	public void practice2() {

		System.out.print("국어점수: ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수: ");
		int math = sc.nextInt();
		
		System.out.print("영어점수: ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avr = sum / 3 ;
	
		boolean var1 = ((kor >= 40) && (math >= 40) && (eng >= 40));
		boolean var2 = avr >= 60;
		
		if(var1 && var2) {
			System.out.printf("국어: %d\n 수학: %d\n 영어: %d\n 합계: %d\n 평균: %.1f\n 축하합니다, 합격입니다!", kor, math, eng, sum, avr);
		} else {
			System.out.print("불합격입니다."); 
		}
		
	}
	
	public void practice3() {

		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		String result;
		
		switch(month){
		case 1,3,5,7,8,10,12 : result = month + "월은 31일까지 있습니다."; break; 
		case 2: result = month + "월은 28일까지 있습니다."; break;
		case 4,6,9,11 : result = month + "월은 30일까지 있습니다."; break;
		default : result = month + "월은 잘못 입력된 달입니다.";
		}
		
		System.out.println(result);
	
	}
	
	public void practice4() {

		System.out.print("키(m)를 입력해 주세요: ");
		double hei = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요: ");
		double wei = sc.nextDouble();
		
		double bmi = wei/(hei * hei);
		String result;
		
		if (bmi >= 30) {
			result = "고도비만";
		} else if (bmi >= 25) {
			result = "비만";
		} else if (bmi >= 23) {
			result = "과체중";
		} else if (bmi >= 8.5) {
			result = "정상체중";
		} else {
			result = "저체중";
		}
		System.out.printf("BMI지수 : %s\n%s", bmi, result);
	}
	
	public void practice5() {

		System.out.print("중간고사 점수 : ");
		double midScore = sc.nextDouble();
		System.out.print("기말고사 점수 : ");
		double finScore = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double repScore = sc.nextDouble();
		System.out.print("출석 횟수 : ");
		double atten = sc.nextDouble();
		
		double sum = (0.2 * midScore) + (0.3 * finScore) + (0.3 * repScore) + atten;
		String result;
		
		if(atten < 15) {
			System.out.printf("========결과========\nFail [출석횟수부족] (%.0f/20)", atten);
			return;
		} else if(sum < 70) {
			result = "Fail[점수 미달]";
		} else {
			result = "Pass";				
		}
		
		System.out.println("========결과========");
		System.out.printf("중간고사점수    (20) : %.1f\n", 0.2 * midScore);
		System.out.printf("기말고사점수    (30) : %.1f\n", 0.3 * finScore);
		System.out.printf("과제 점수\t(30) : %.1f\n", 0.3 * repScore);
		System.out.printf("출석 점수\t(20) : %.1f\n", atten);
		System.out.printf("총점 : %.1f\n",sum);
		System.out.println(result);
		
	}
		
}
