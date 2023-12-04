package edu.kh.oop.cls.model.vo;

public class Student { //클래스 선언
//[접근제한자(public)][예약어(x)] class 클래스명
	
	//접근제한자 public : 같은 프로젝트 내에서 어떤 클래스에서든 import 가능

	
	//1. 필드(field) : 객체의 속성을 작성하는 클래스 내부 영역
	//== 멤버 변수
	//		    1) 인스턴스 변수 : 필드에 작성되는 일반 변수 
	//			2) 클래스 변수(static 변수) : 필드에 static 예약어가 작성된 변수
	
	//                        필드 구성
	//   [접근제한자]   |      [예약어]     |	  자료형     |    변수명
	/*    + public 		|   final			|	기본 자료형	 |
		  # protected	|   static			|	(참조형)	 |
		  ~ (default)	| 	final static	|	배열		 |
		  - private		|	static final	|	클래스명	 |
	*/
				//1) 접근 제한자 - 직접 접근의 범위 한정

	public int v1 = 10;
	protected int v2 = 20;
	int v3 = 30;
	private int v4 = 40;
	
	public void ex() {
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);	
	}
	
	public static String schoolName = "kh고등학교";
	
	private String name;{
		name = "김길동";
		}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//----------------------------------------------------------------------------------------------------------
	
	//2. 생성자(constructor) :  
		// new 연산자를 통해 객체를 생성할 때 
		// 생성된 객체의 필드 값 초기화 + 지정된 기능을 수행하는 역할
	
		// 생성자 작성 규칙
		// 1) 생성자명 == 클래스명(반드시)
		// 2) 반환형이 존재하지 않음(like void)
		
		//생성자 종류
		// 1) 기본 생성자 
			// [접근제한자] 클래스명 () {코드}
			public Student() {
				System.out.println("기본 생성자에 의해서 Student 객체가 생성됨");
				// 객체 생성될 시 수행할 코드
			}
	
		// 2) 매개변수 생성자
	
	
	
	
	//3. 메서드(method) : 게터, 세터 포함

}
