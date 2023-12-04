package edu.kh.op.ex;

import java.util.Scanner;

public class OpExample { // 기능용 클래스

	public void ex1() { // 프린트
		// ex1() method : 객체 지향 프로그래밍에서 객체와 관련된 함수
		// -> OpExample 클래스가 가지고 있는 기능 중 ex1() 이라는 기능이라는 뜻
				
		System.out.println("OpExample 클래스에 ex1() 기능 수행");
		System.out.println("클래스 분리 테스트");
		System.out.println("ㅎㅇ");
		// 이 상태로 Running 불가 -> 메인 메소드에서 실행 가능
		
	}
	
	public void ex2() { //스캐너
		
		Scanner sc = new Scanner(System.in);
		// 실행될 때 ExampleRun -> OpExample -> Scanner 순으로 생성
		
		System.out.print("정수 입력 1 : ");
		int input1 = sc.nextInt();
				
		System.out.print("정수 입력 2 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("%d / %d = %d\n", input1, input2, input1/input2);
		System.out.printf("%d %% %d = %d\n", input1, input2, input1%input2);
		// printf에서 모듈러(%, 나머지 값) 구할 땐 %%사용
		
	}
	
	public void ex3() { // 증감 연산자
				
		int iNum1 = 10, iNum2 = 10;
		iNum1++; iNum2--;
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		// 전위 연산 : 연산자가 앞쪽에 배치 -> 다른 연산자보다 먼저 증가/감소
		int temp1 = 5;
		System.out.println( ++temp1  +  5 ); // ++5 + 5 -> 6 + 5 == 11
		System.out.println("temp1 : " + temp1); // temp1에는 6 저장
		
		// 후위 연산 : 연산자가 뒤쪽에 배치 -> 다른 연산자보다 나중에 증가/감소
		int temp2 = 3;
		System.out.println(temp2-- + 2  ); // 3-- + 2  = 5(당장 값은 5) 
		System.out.println("temp2 : " + temp2); // temp2에는 2 저장
		
		int a = 3;
		int b = 5;				
		int c = a++ + --b;
		System.out.printf("%d / %d / %d\n", a, b, c);
		// a = 4, b = 4, c = 7 
		
	}
	
	public void ex4() { // 비교 연산자(<, >, <=, >=, ==, !=),(true or false)
		
		int a = 10, b = 20, c = 4, d = 5;  
		int temp = 723;
		
		System.out.println(a > b); // false
		System.out.println(a < b); // true
		System.out.println(a == b); // false
		System.out.println(a != b); // true
		System.out.println((a==b) == false); // true
		System.out.println("-------------------");
		System.out.println(c < d); // true
		System.out.println(c+1 <= d); //true -> 산술이 먼저(c+1)
		System.out.println(c >= d-1); //true
		System.out.println( (++c != d) == (--c != d) );
							// (5 != 5) == (4 != 5)
							// false == true
							// false
		System.out.println("-------------------");
		System.out.println("temp는 짝수인가? " + (temp % 2 == 0));
		System.out.println("temp는 짝수인가? " + (temp % 2 != 1));
		System.out.println("temp는 홀수인가? " + (temp % 2 == 1));
		System.out.println("temp는 홀수인가? " + (temp % 2 != 0));
		System.out.println("temp는 3의 배수인가? " + (temp % 3 == 0));
		System.out.println("temp는 4의 배수인가? " + (temp % 4 == 0));
		System.out.println("temp는 5의 배수인가? " + (temp % 5 == 0));
		
	}
	
	public void ex5() { // 논리 연산자(&&: 둘 다 참이면 참, ||: 둘 중 하나만 참이면 참)
		
		int a = 101, b = 5, c = 10;
		
		// a는 100 이상이면서 짝수인가
		System.out.println((a >= 100) && (a % 2 == 0));
		
		// b는 1부터 10까지의 범위 인가
		System.out.println((b >= 1) && (b <= 10));
		
		// c는 10을 초과하거나 짝수인가
		System.out.println((c > 10) || (c % 2 == 0));
		
	}

	public void ex6() { // 논리부정 연산자(!: 논리값을 반대로)
		
		boolean bool1 = true;
		boolean bool2 = !bool1;
		System.out.println("bool1 = " + bool1);
		System.out.println("bool2 = " + bool2);
		
		// 정수 입력 받음 
		// 1) 해당 정수가 1이상 100이하 인지 확인
		// 2) 1이상 100이하가 아닌지 확인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input1 = sc.nextInt();
		
		boolean result1 = ((1 < input1) && (100 >= input1));
		boolean result2 = ((1 > input1) || (100 < input1));
		boolean result3 = !((1 < input1) && (100 >= input1));	
		System.out.printf("%d는 1이상, 100이하의 정수인가? : %b\n", input1, result1);
		System.out.printf("%d는 1미만, 100초과의 정수인가? : %b\n", input1, result2);
		System.out.printf("%d는 1미만, 100초과의 정수인가? : %b\n", input1, result3);
		
	}
	
	public void ex7() { // 복합대입 연산자(+=, -=, *=, /=, %=, 연산 후 다시 대입)
		
		int a = 10;
		
		a++; 
		System.out.println("a에 1증가 = " + a); // a = 11
		a += 4;
		System.out.println("a에 4증가 = " + a); // a = 15
		a -= 10;
		System.out.println("a에 10 감소 = " + a); // a = 5
		a *= 3;
		System.out.println("a의 3배 = " + a); // a = 15
		a /= 6;
		System.out.println("a를 6으로 나눴을 때 몫 = " + a); // a = 2
		a %= 2;
		System.out.println("a를 2로 나눴을 때 나머지 = " + a); // a = 0
		
	}
	
	public void ex8() { // 삼항 연산자(조건식 ? 식1 : 식2 -> true면 1, false면 2)
						// 조건식에는 비교, 논리, 논리부정이 들어감
		int num = 30;		
		String result1 = num > 30 ? "num은 30보다 큰 수 이다. " : "num은 30이하의 수이다. ";  
		System.out.println(result1);
		
		// 입력 받은 정수가 음수인지 양수 인지 구분(0은 양수로)
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수 입력 : ");
		
		int input1 = sc.nextInt();
		String result2 = input1 >= 0 ? "양수 입니다. " : "음수 입니다. ";  
		System.out.println(result2);
		
		
	}
}
