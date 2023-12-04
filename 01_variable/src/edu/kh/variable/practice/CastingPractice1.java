package edu.kh.variable.practice;

public class CastingPractice1 {

	public static void main (String[] args) {
		
		/*
		선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+, -, *, /)과 
		형변환을 이용하여 주석에 작성되 값과 같은 결과가 나타나도록 코드를 완성하세요
		*/

		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		 
		System.out.println( iNum1 / iNum2 ); // 2
		System.out.println( (int)dNum ); // 2
		System.out.println( iNum2 * dNum ); // 10.0
		System.out.println( (double)iNum1 ); // 10.0
		System.out.println( (float)iNum1 / iNum2 ); // 2.5
		System.out.println( dNum ); // 2.5
		System.out.println( (int)fNum ); // 3
		System.out.println( (int)(iNum1 / fNum) ); // 3
		
		System.out.println( (float) iNum1 / fNum );// 3.3333333
		// float -> 소수점 아래 8번째까지 연산 후 반올림
		System.out.println( (double) iNum1 / fNum ); // 3.3333333333333335
		// double -> 소수점 아래 16번째 자리까지 연산 후 반올림
		// double은 5로 끝남 : 컴퓨터는 숫자를 2진수로 표현하되 무한히 반복되는 경우가 많음 
		// 						-> 일정한 크기만큼 계산하고 적당한 위치에서 잘라냄 
		//						-> 자르는 위치에 따라 숫자가 다르게 나올 수 있음
		//						-> 즉, 2진수로 소수점 이하를 정확하게 표현하기 어렵기 떄문에
		//						-> 근사치를 출력함
		
		System.out.println( "'" + ch + "'" ); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( (int)(ch+iNum1) ); // 75
		System.out.println( "'" + (char)(ch+iNum1) + "'" ); // 'K'
		// ch 와 iNum1 더하기 => int로 자동형변환
		// 그 값을 char로 강제형변환
		// 양옆에 +로 문자열 연결

	
	}
}
