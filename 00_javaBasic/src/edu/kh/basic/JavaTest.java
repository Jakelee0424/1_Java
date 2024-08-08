package edu.kh.basic;


//(한 줄 주석) - 컴파일러가 해석하지 않는 부분, 주로 코드 설명
/*(범위 주석) */

//컴파일러(Compiler) - 코드를 2진수(0,1)로 변환하는 번역기

/* Java 코드 실행 순서
1. 코드작성 
2. 실행 ( 컴파일러가 2진수로 번역 -> JVM이 실행 )
*/

public class JavaTest {

	// 클래스(Class) - 자바 코드가 작성되는 영역 
	
	public void test() {
		int testNo = 0;
	}
	
	public static void main(String[] args) {
		
	// 메인 메서드(main method) - 자바 애플리케이션(프로그램)을 실행하기 위해 반드시 필요한 메서드
		
		System.out.println("123");		
		System.out.println("456");		
		System.out.println("-----------------");		
		
		// ctrl + alt + 방향키 : 해당 줄 복사
		
		System.out.println(1+2);	
		System.out.println(5*4);	
		System.out.println(12%7);	
		System.out.println(465/5);	
		System.out.println("1 + 2");
		System.out.println("-----------------");		
		
		// "" 안에 작성된 코드는 단순 문자열로 인식
		// "" 안에 작성되지 않는 코드는 숫자 or 변수로 인식 
		
		System.out.println("1" + 2);
		System.out.println(1 + "2");
		System.out.println("1" + "2");
		System.out.println("14 * 19 = " + 266);
		System.out.println("14 * 19 = " + 266 + 312);
		System.out.println("14 * 19 = " + (266 + 312));
		
		// 자바는 사칙연산의 우선순위를 그대로 따름
		// 우선 계산을 원하면 () 사용
		
		// '+'의 역할 -> 숫자 + 숫자 = 덧셈 연산 결과
		//               문자열 + 숫자 or 문자열 + 문자열  = 이어쓰기                   
		
	
	}
}


