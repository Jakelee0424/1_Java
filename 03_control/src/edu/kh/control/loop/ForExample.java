package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {

	Scanner sc = new Scanner(System.in);
	
	/* for문 - 끝이 정해져 있는 반복문
	
	for(초기식; 조건식; 증감식;){
			수행문
	}
	
	1) 초기식 : for문을 제어하는 용도의 변수 선언
	2) 조건식 : for문의 반복 여부 지정
	3) 증감식 : 초기식에 사용된 변수에 대해 for 문이 끝날 때마다 증가 또는 감소시켜 결과를 변하게 함
	
	*/
	
	public void ex1() {
		
		for(int i = 1; i<=10 ; i++) { // i가 10이 될때 까지
			System.out.println(i);
		}
	}
	
	public void ex2() {

		for(int i = 3 ; i<=7 ; i++) { // 3~7
			System.out.println(i);
		}
	}

	public void ex3() {
	
		for(int i = 2 ; i <= 15; i++) {
			System.out.println(i);
		}
	}

	public void ex4() { // 1부터 입력받은 수까지 1씩 증가
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1 ; i <= input ; i++ ) {
			System.out.println(i);
		}
	}
	
	public void ex5() { // 1부터 입력받은 수까지 2씩 증가
	
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input ; i += 2) {
			System.out.println(i);
		}
		
	}
	
	public void ex6() { // 1.0 부터 입력받은 수까지 0.5씩 증가
		
		System.out.print("숫자 입력 : ");
		double input = sc.nextDouble();
		
		for(double i = 1.0 ; i <= input ; i += 0.5) {
			System.out.println(i);
		}
		
	}

	public void ex7() { // 알파벳 A ~ Z까지 한줄로 출력
		
		for(char i = 'A' ; i <= 90; i++) {
			System.out.print(i);
		}
		System.out.println("\n--------------------");
		
		for(int i = 'A' ; i <= 'Z'; i++) {
			System.out.print((char)i);
		}
	}

	public void ex8() { // 10 ~ 1까지
	
		for (int i=10; i>=1; i--) {
			System.out.println(i);
		}
	}

	// for 응용 1 : 반복문 이용한 누적
	
	public void ex9() { // 1부터 10까지 모든 정수 합
	
		int sum = 0; // i값 합계 변수
		for(int i = 1 ; i <= 10; i++) {
			sum += i;
		}
		System.out.println("합계 = " + sum);
	}

	public void ex10() { // 정수 5개 입력 - > 입력값 누적
 		
		int sum = 0;
		
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.print("입력 " + i + ":" );
			int input = sc.nextInt();
		
			sum += input;
		}
		System.out.println("합계 = " + sum);
	}

	public void ex11() { // 정수 몇번 받을 지 머저 입력받고 입력된 정수 합계 출력 
	
		System.out.print("입력받을 정수의 개수 = ");
		int fre = sc.nextInt();
		int sum = 0;
		
		for (int i=1 ; i <= fre ; i++) {
			System.out.print("입력 " + i + ": ");
			int input = sc.nextInt();
			sum += input;		
		}
		System.out.println("\n정수의 합은 : " + sum);
	}

	public void ex12() { // 1부터 20까지 1씩 증가하면서 출력 / 단 5의 배수엔 ()붙여서 출력 ex) 1,2,3,4,(5)
	
		for(int i=1 ; i <=20 ; i++) {
			
			if( i % 5 == 0) {
				System.out.print("(" + i + ") ");
			} else {
				System.out.print(i + " ");
			}
		}
		
	}

	public void ex13() { // 1부터 20까지 1씩 증가 / 괄호 표시할 배수 입력

		System.out.print("괄호를 표시할 배수 : ");
		int input = sc.nextInt();
				
		for(int i = 1 ; i <= 20 ; i++){
			if(i % input == 0 ) {
				System.out.print("(" + i +") ");				
			} else {
				System.out.print(i + " ");
			}
			
		}
	}

	public void ex14() { // 구구단 / 하나의 수를 출력 받아/
		
		System.out.print("2~9 사이 숫자 입력 = ");
		int input = sc.nextInt();
		
		if(input < 2 || input > 9) {
			System.out.println("잘못 입력 하셨습니다.");
		} else {
			
			for ( int i = 1 ; i <= 9 ; i++) {
			System.out.printf("%d * %d = %d\n", input, i, input*i);				
			}
				
		}
	}

	public void ex15() { // 19단 출력기 2~19 값 입력
	
		System.out.print("2 ~ 19 사이의 값을 입력하세요 = ");
		int dan = sc.nextInt();
		
		if(dan > 20 || dan <2) {
			System.out.println("잘못 입력 하셨습니다.");
		} else {
			for(int i = 2 ; i <= 19 ; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			} 
			
		}
		
	}
	
	// 중첩 반복문
	
	public void ex16() { // 구구단 모두 출력
	
		for(int i=2 ; i<=9 ; i++) {
			
			for (int j=1 ; j<=9 ; j++) {
				System.out.printf("%2d * %d = %d\n", i, j, i*j);
			
			}
			System.out.println(); //줄 바꿈
		}
	}
	
	public void ex17() { 
		
		for(int i = 9 ; i >= 2 ; i-- ) {
			
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.printf("%d * %d = %d\t", i, j, i*j);
			}
			System.out.println();
		}
	}

	public void ex18() { // 이중 for문으로 12345 다섯줄 만들기

		for(int i = 1 ; i >= 5 ; i++) {
			for(int j = 1 ; j <= 3 ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}

	public void ex19() {
		
		for(int i = 1 ; i <= 3 ; i++) {
			for(int j = 5 ; j >= 1 ; j--) {
				System.out.print(j);
			}
		System.out.println();
		}
		

	}

	public void ex20() {
	
		for(int i = 1 ; i <= 4 ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

	public void ex21() {
		
		for(int i = 4 ; i >= 1 ; i--) {
			
			for(int j = i ; j >= 1 ; j--) {
				System.out.print(j);
			}
		System.out.println();
		}

	}

	public void ex22() { // 숫자세기 count
		
		// 1부터 20까지 1씩 증가 
		// 3 배수의 총 개수 출력 & 3의 배수 합계 출력
		
		int count = 0; // 3의 배수 카운팅을 위한 변수
		int sum = 0; // 합계 변수
			
		for(int i = 1 ; i <= 20 ; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
				count++;
				sum += i;
			}
		}
		System.out.println(": " + count + "개");		
		System.out.println("3의 배수 합계 = "+ sum);		
		
	}

	public void ex23() {
		// 2중 for문 + count를 이용해서 아래 모양 만들기
		
		// 1  2  3  4
		// 5  6  7  8 
		// 9 10 11 12
		
		int count = 1;
		
		for(int i = 1; i <= 3; i++) { // 3줄
			
			for (int j = 1 ; j<=4 ; j++ ) { //4칸
				
				System.out.printf("%3d", count);
				count++;
				
			}
			System.out.println();
				
		}
	}

	public void ex24() {
		
		for(int i = 1 ; i <= 9 ; i++) {
			for (int j = 2 ; j <= 9 ; j++ ) { 

				System.out.printf(j +" X " + i + " = " + j*i + "\t");
			}
			System.out.println();
		}
		
	}
}
