package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {

	Scanner sc = new Scanner(System.in);
	// 클래스 안에 스캐너 쓰면, 메서드에서 따로 추가 안해도 댐
	
	public void ex1() {
		
		// if (조건식) {수행문} : 조건식이 true일 때 내부 코드 수행
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
			
		if(input > 0) {//입력된 정수가 양수인지 검사
		
			System.out.print("양수입니다.");	
			
		}
				
		if(input <= 0) {
			
			System.out.print("양수가 아닙니니다.");
			
		}
			
	}
	
	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input % 2 != 0) {
			
			System.out.print("홀수입니다.");
			
		} else { 
			
			if(input == 0) {
				
				System.out.println("0입니다.");
				
			} else	{
				
				System.out.print("짝수입니다.");
				
			}
		}
	}
	
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			
			System.out.println("양수입니다.");
			
		} else if (input < 0 ) {
			
			System.out.println("음수입니다.");	
			
		} else { 
			
			System.out.println("0 입니다.");
		}
	}
						
	public void ex4() {

		// (month) 입력 받아 해당 달에 맞는 계절 출력
		// 겨울일 때 온도가 -15 이하 = "한파 경보", -12 이하 = "한파 주의보" 
		// 여름일 때 온도가 35 이상 = "폭염 경보", 33 이상 = "폭염 주의보"
		// 1~12월 사이 아닐 땐 "해당하는 계절이 없습니다." 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("월(month) 입력 : ");
		int month = sc.nextInt();
		
		System.out.print("기온 입력 : ");
		int temper = sc.nextInt();
		
		String season;
		
		if(month == 1 || month == 2 || month ==12) {
			season = "겨울";
			
			if (temper <= -15) { 
			season += " 한파 경보";
			} 
			else if (temper <= -12){
			season += " 한파 주의보";
			}
			
		} else if(month >= 3 && month <= 5) {
			season = "봄";
		} else if(month >= 6 && month <= 8) {
			season = "여름";
			
			if (temper >= 35) { 
			season += " 폭염 경보";
			} 
			else if (temper >= 33){
			season += " 폭염 주의보";
			}
			
		} else if(month >= 9 && month <= 11) {
			season = "가을";
		} else {
			season = "해당하는 계절이 없습니다.";
		}
		System.out.println(season);
	}
	
	public void ex5() {
		
		// 나이를 입력 받아
		// 13세 이하면 "어린이 입니다."
		// 13세 초과 19세 이하면 : "청소년 입니다."
		// 19세 초과 시 : "성인 입니다". 출력
		
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = sc.nextInt();
		String result;
		
		if(age <= 13) {
			result = "어린이 입니다.";
		} else if(age > 13 && age <= 19) {
			result = "청소년 입니다.";
		} else {
			result = "성인 입니다.";
		}
		
		System.out.println(result);
		
	} // if 어린이, else if 성인, else 청소년이 편함
	
	public void ex6() {
		
		// 점수(100점 만점)를 입력 받아
		// 90점 이상 : A
		// 80점 이상 90점 미만 : B
		// 70점 이상 80점 미만 : C
		// 60점 이상 70점 미만 : D
		// 60점 미만 : F
		// 0점 미만, 100 초과 : "잘못 입력하셨습니다"
		
		Scanner sc = new Scanner(System.in);

		System.out.print("점수 : ");
		int score = sc.nextInt();
		String result;

		if(score >= 90 && score <=100) {
			result = "A";
		} else if(score >= 80 && score < 90) {
			result = "B";
		} else if(score >= 70 && score < 90) {
			result = "C";
		} else if(score >= 60 && score < 90) {
			result = "D";
		} else if(score >= 0 && score< 60){
			result = "F";
		} else{
			result = "잘못 입력하셨습니다.";
		}
		
		System.out.println(result);
	} // 0점 미만, 100 초과 먼저 
	
	public void ex7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("키 : ");
		double hei = sc.nextDouble();
		
		String result;

		if(age >= 12 && age <= 100) {
			result = "탑승 가능";
			if(hei >= 140.0) {
				result = "탑승 가능";
			} else if(hei < 140.0) {
				result = "적정 키가 아닙니다.";
			}
		} else if(age < 12 && age >=0) {
			result = "적정연령이 아닙니다.";
		} else {
			result = "잘못 입력하셨습니다.";
		}
				
		System.out.println(result);
	}
	
	public void ex8() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("키 : ");
		float hei = sc.nextFloat();
		
		String result;
		
		if(age > 0 && age <= 100) {
			if(hei >0 && hei <= 250.0) {
				if(age >= 12 && hei >= 140.0) {
					result = "탑승 가능";
				} else if(age >= 12 && hei < 140.0) {
					result = "나이는 적절하나, 키가 적절치 않음";
				} else if(age < 12 && hei >= 140.0) {
					result = "키는 적절하나, 나이는 적절치 않음";
				} else {
					result = "나이와 키 모두 적절치 않음";
				}
				
			} else {
				result = "키를 잘못 입력 하셨습니다.";	
			}
		} else {
			result = "나이를 잘못 입력 하셨습니다.";
		}
		System.out.println(result);
	
		
	}

	public void ex9() {
		
		Scanner sc = new Scanner(System.in);
		String result;
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		boolean var1 = !(age >= 0 && age <= 100);
		
		if (var1) {
			System.out.println("나이를 잘못 입력 하셨습니다.");
			return;
		} 
		
		System.out.print("키 : ");
		float hei = sc.nextFloat();
		boolean var2 = !(hei >= 0 && hei <= 250);
		
		if (var2) {
			System.out.println("키를 잘못 입력하셨습니다. ");
			return;
		}

		if(age >= 12 && hei >= 140.0) {
			result = "탑승 가능";
		} else if(age >= 12 && hei < 140.0) {
			result = "나이는 적절하나, 키가 적절치 않음";
		} else if(age < 12 && hei >= 140.0) {
			result = "키는 적절하나, 나이는 적절치 않음";
		} else {
			result = "나이와 키 모두 적절치 않음";
		}
		
	System.out.println(result);	
	
	}
	
	public void ex10() {
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		boolean var1 = (age < 0 || age >100);
		boolean var2 = age >= 12;				
		if(var1) {
			System.out.println("나이를 잘못 입력 하셨습니다.");
			return;
		} 
		
		System.out.print("키 : ");
		float hei = sc.nextFloat();
		boolean var3 = (hei < 0 || hei > 250.0);
		boolean var4 = hei >= 140.0;
		if(var3) {
			System.out.println("키를 잘못 입력 하셨습니다.");
			return;
		}

		if((var2)&&(var4)){
			System.out.println("탑승 가능");
		} else if((var2) && !(var4)) {
			System.out.println("나이는 적절하나, 키가 적절치 않음");
		} else if(!(var2) && (var4)) {
			System.out.println("키는 적절하나, 나이가 적절치 않음");
		} else {
			System.out.println("탑승 불가");
		}

	}

}