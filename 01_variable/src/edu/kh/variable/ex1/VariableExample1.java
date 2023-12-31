package edu.kh.variable.ex1;

public class VariableExample1 {

	// .java 파일과 class 오른쪽에 작성된 이름은 같아야 한다.
	
	public static void main(String[] args) {
		System.out.println(2 * 3.14159265112489124 * 5);
		System.out.println(3.141592653589793 * 5 * 5);
		
		/*
		 1. 변수(Variable) - 메모리(RAM)에 값을 기록하는 공간
		    -> 공간에 기록되는 값(Data)이 변할 수 있기 때문에 변수라고 칭함
		 
		 2. 변수는 여러 종류가 존재 - 저장되는 값의 형태, 크기가 다름
		 
		 3. 장점
			1) 가독성 좋아짐
			2) 재사용성 증가(한번 만든 변수 계속 사용)
		 	3) 코드 길이 감소
		 	4) 유지 보수성 증가(코드 수정이 간단)		 
		 */
		
		// 아래는 변수 사용 예
		
		double pi = 3.141592653589793; // 원주율
		float pi2 = 3.141592653589793f;
		int r = 5; // 반지름(radius)	
		int h = 20; // 높이(height)
		
		System.out.println("-----------------------");
		System.out.println("원의 둘레는 " + 2 * pi * r);
		System.out.println("원의 넓이는 " + pi * r * r);
		System.out.println("원기둥의 부피는 " + pi * r * r * h);
		System.out.println("구의 겉넓이는 " + 4 * pi * r * r);
		System.out.println("구의 겉넓이는 " + 4 * pi2 * r * r);
		
		
	}
	
}
