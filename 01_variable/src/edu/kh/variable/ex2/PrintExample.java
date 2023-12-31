package edu.kh.variable.ex2;

public class PrintExample {

	public static void main(String[] args) {
		
		// System.out.print() : 단순 출력(출력 후 줄바꿈 X)
		// System.out.println() : 출력 후 줄바꿈
		// print <-> println : 줄바꿈만 다름, 괄호 내용 출력은 동일
		
		System.out.print(1);
		System.out.print(2);
		
		System.out.println(3);
		System.out.println(4);
		
		
		
		// System.out.printf() : 출력될 문자열 형식을 패턴으로 지정하는 출력 구문
		
		int iNum1 = 10;
		int iNum2 = 5;
		
		// 10 + 5 = 15
		System.out.println(iNum1 + " + " +  iNum2 + " = " + (iNum1+iNum2) );
		
		
		/* 
		printf:
		
		%d: 정수형
		%o: 8진수
		%x: 16진수
		%c: 문자
		%s: 문자열
		%f: 실수(소수점 아래 6자리)
		%e: 지수형태표현
		%g: 대입값그대로
		%A: 16진수 실수
		%b: 논리형
		
	
		System.out.printf("패턴", 패턴에 들어갈 값);
		ex) 10 + 5 = 15
		
		*/
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1+iNum2);
		// 줄바꿈 하려면 \n
		
		//10 + 10 * 5/2 = 35
		
		int iNum3 = 2;
		
		System.out.printf("%d + %d * %d/%d = %d\n", iNum1, iNum1, iNum2, iNum3, iNum1+iNum1*iNum2/iNum3);
		
		iNum3 = 3;
		System.out.printf("%d\n", iNum3);
		System.out.printf("%5d\n", iNum3); // 5칸 공간 확보 후 오른쪽 정렬
		System.out.printf("%-5d\n", iNum3); // 5칸 공간 확보 후 왼쪽 정렬

		
		//소수점 자리 제어
		System.out.printf("%f\n", 10/4.0); //2.500000
		System.out.printf("%.2f\n", 10/4.0); //2.50
		System.out.printf("%.0f\n", 10/4.0); //소수점 표현 X, 반올림
		
		//문자, 문자열, boolean		
		boolean isTrue = false;
		char ch = '이';
		String str = "하염";
		
		//false / 이 / 하염
		System.out.printf("%b / %c / %s\n", isTrue, ch, str);
		
		
		//escape 탈출문자 : 일반 문자가 아닌 특수문자 표현
		
		//      \ 
		System.out.println("\\"); // 백슬래시 출력법
		System.out.println("a\tb\tc\td"); // \t = tab 출력
		System.out.println("\u0041"); //유니코드 escape : 유니코드는 16진수 -> A=65 -> 65/4 = 몫4, 나머지 1 -> u0041
	
	}
	
}
