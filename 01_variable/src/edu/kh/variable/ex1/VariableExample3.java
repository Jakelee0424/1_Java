package edu.kh.variable.ex1;

public class VariableExample3 {

	public static void main(String[] args) {
		
		/*
		 형변환(Casting) : 값의 자료형을 변환하는 것(boolean 제외)
		 
		 1. 형변환의 필요성
		 	1) 컴퓨터는 기본적으로 같은 자료형끼리 연산이 가능
		 	2) 다른 자료형과 연산 시 오류 발생
		 	-> 이런 상황을 해결하기 위해 형변환을 실행(자동/강제)
		 */
	
		int num = 10;
		double num2 = 3.5;
		
		System.out.println("자동 형변환 결과 : " + (num + num2)); // 원래 에러 발생, But "자동 형변환" 덕분에 에러 발생 X
		
		int i1 = 3;
		double d1 = i1;
		
		System.out.println("i1 : " + i1);
		System.out.println("d1 : " + d1);
		// double은 실수만 저장 가능 <- 정수가 대입되는 연산 수행 시 실수로 자동 형변환
		
		System.out.println(d1 + num2);
				
		// int -> long 형변환
		
		int i2 = 2_100_000_000;
		long l2 = 10_000_000_000L;
		
		long result2 = i2 + l2; // int + long -> long + long = long
		System.out.println("result2 : " + result2);
		
		
		//char -> int 형변환
		//char 자료형은 문자형이지만, 실제 저장하는 값은 0~65,000번 사이에 있는 숫자
		
		char ch3 = 'V';
		int i3 = ch3;
		System.out.println(i3);
		

		char ch4 = '이';
		int i4 = ch4;
		System.out.println(i4);
			
		
		// 오버플로우 현상은 컴퓨터가 예측할 수 없음 -> 개발자가 예측해야함
		
		int i6 = 2147483647;
		int result6 = i6 + 1;
		System.out.println(result6);
		
		
	}
}
