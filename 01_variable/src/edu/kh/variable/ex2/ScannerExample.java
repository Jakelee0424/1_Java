package edu.kh.variable.ex2;

import java.util.Scanner; // -> java.util 패키지에서 Scanner를 수입함
// import: 다른 패키지에 존재하는 클래스를 얻어오는 구문

public class ScannerExample {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //  스캐너 생성
		// Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게하는 역할
		
		System.out.print("정수 1 입력 : ");
				
		int input1 = sc.nextInt(); // 입력 받은 정수를 input1에 대입 
		// nextInt : 다음 입력된 정수를 읽어옴(키보드로 입력된)	
		
		System.out.print("정수 2 입력 : ");
		int input2 = sc.nextInt();
		
		System.out.println("두 수의 합은 : " + (input1 + input2));
		System.out.printf("%d + %d = %d\n", input1, input2, input1+input2);
	
		
	}
}
