package edu.kh.exception.model.service;

import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionService {

	// 예외 : 소스 코드의 수정으로 해결 가능한 오류
	// 1) Unchecked Exception : 선택적으로 예외 처리
	// 2) Checked Exception : 필수적으로 예외 처리
	
	private Scanner sc = new Scanner(System.in);

	public void ex1() { // 예외처리 try / catch
		System.out.println("두 정수를 입력받아 나누기한 몫을 출력");
		
		System.out.print("1번 정수 입력 = ");
		int input1 = sc.nextInt();
		
		System.out.print("2번 정수 입력 = ");
		int input2 = sc.nextInt();
		
		try {
		System.out.println("두 정수의 몫은 = " + input1 / input2);
		}catch(ArithmeticException e) {
			System.out.println("실패");
		}
		
		System.out.println("두 정수의 몫은 = " + input1 / input2);
		// 정수 2 : 0 입력시 -> java.lang.ArithmeticException 
		
		// 일부 예외는 try-catch 사용 안해도 예외 상황을 방지할 수 있다.
		// 일부 예외 == 대부분 unchecked Exception
		
	}

	public void ex2() { // 여러가지 예외에 대한 처리 방법
		
//		System.out.println("두 정수를 입력받아 나누기한 몫을 출력");
//		
//		System.out.print("1번 정수 입력 = ");
//		int input1 = sc.nextInt();
//		
//		System.out.print("2번 정수 입력 = ");
//		int input2 = sc.nextInt();
//	
//		System.out.println("두 정수의 몫은 = " + input1 / input2);
//		// 정수 2 : 0 입력시 -> java.lang.ArithmeticException 
//		
//		
//		System.out.print("입력 1 : ");
//		int num1 = sc.nextInt();
//		//java.util.InputMismatchException -> 입력값 정수 아닐때 
//		
//		String str = null;
//		
//		System.out.println(str.charAt(0));
//		// java.lang.NullPointerException -> 참조하지 않는 참조변수를 수행시 발생
		
		
		try {
			System.out.println("두 정수를 입력받아 나누기한 몫을 출력");
			System.out.print("1번 정수 입력 = ");
			int input1 = sc.nextInt();
			System.out.print("2번 정수 입력 = ");
			int input2 = sc.nextInt();
		
			System.out.println("두 정수의 몫은 = " + input1 / input2);
			// 정수 2 : 0 입력시 -> java.lang.ArithmeticException 
			
			System.out.print("입력 1 : ");
			int num1 = sc.nextInt();
			//java.util.InputMismatchException -> 입력값 정수 아닐때 
			
			String str = null;
			
			System.out.println(str.charAt(0));
			// java.lang.NullPointerException
		
		}catch(Exception e) { // Exception 하나로 모두 가능 -> 예외처리 + 다형성
							  // 이 경우 뭐가 잘못된지 모름 
							  // and catch 하나하나 입력	
			System.out.println("실패");
			
		}
		
		
	}

	public void ex3() { // try - catch -finally
	
	// finally : try 구문에서 예외가 발생 하든 말든 무조건 마지막에 수행		
		
		try {
			
			System.out.println(4/0);
			
		}catch(ArithmeticException e) {
			
			System.out.println("예외처리 됨");
			
			// catch문 매개변수 활용
			// 매개변수 e : 예외 관련 정보 + 예외 관련 기능
			
			System.out.println(e.getClass()); // 어떤 예외 클래스인가?
			System.out.println(e.getMessage()); // 예외 발생시 출력된 내용
			System.out.println(e); // == e.toString
			e.printStackTrace(); // 전체를 보여줌
			
		}finally{
			System.out.println("무조건 수행됨");
		}
		
	}
	
	public void ex4() { // 던지기
		// throws : 호출한 메서드에게 예외를 던짐
		// 		  -> 호출한 메서드에게 예외를 처리하라고 위임하는 행위
		
		// throw : 예외 강제 발생 구문
		
		try {
		methodA();
		} catch(Exception e) { //Exception = 모든 예외의 최상위 부모
							   //Exception이 catch의 매개변수로 쓰였다
							   // == 예외 종류 안가리고 모두 처리 
		
			e.printStackTrace(); // 발생한 예외의 메서드와 위치 추적
		}
	}
	public void methodA() throws IOException{
		methodB();
	}
	public void methodB() throws IOException{
		methodC();
	}
	public void methodC() throws IOException{
		
		//예외 강제 발생 구문
		throw new IOException();
		
	}
}
