package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

public class ClsService /*extends Student*/{

	public void ex1() {
		//클래스 접근 제한자 확인하기
		
		Student std = new Student();
		// TestVO Tv = new TestVO(); 디폴트 접근 불가
	/*	
		System.out.println(std.v1);
		System.out.println(std.v2);
		System.out.println(std.v3);
		System.out.println(std.v4);
		*/
	/*	
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		*/
	}
	
	public void ex2() {
	// static 객체 2개 생성
		Student std1 = new Student();
		Student std2 = new Student();
	
	// 학생 객체에 name 세팅
		
		std1.setName("홍길동");
		std2.setName("김영희");
	
		System.out.println(std1.schoolName);
		
		// static이 붙은 필드(변수)는 '클래스명.변수명' 으로 사용
		System.out.println(Student.schoolName);
	
		Student.schoolName = "KH";
		System.out.println("변경 후 : " + Student.schoolName);
		
		/* Static
		 * 
		 * 1) 공유 메모리 영역(정적 메모리 영역)
		 *   -> 프로그램 시작시 static 이 붙은 코드들이 static 영역에 생성 
		 *   	and 프로그램이 종료될 때까지 사라지지 않음.
		 * 	 -> static 영역에 생성된 변수는 어디서든지 공유 가능
		 * 
		 * 2) 사용 방법 : 클래스명.변수명
		 * 
		 */
		
		
	}
	
	public void ex3() {
		// 생성자 확인 테스트
		
//		  Student      S1      =      new           Student(); 
		//클래스명 //참조변수	 //생성자 연산  // 기본 생성자
		
//		  User u1 = new User();
//		  System.out.println(u1.getUserId());
//		  System.out.println(u1.getUserAge());
//		  System.out.println(u1.getUserGender());
//		  System.out.println(u1.getUserName());
//		  System.out.println(u1.getUserPassword());
//		  
//		  User u2 = new User();
//		  u2.setUserId("user02");
//		  u2.setUserAge(25);
//		  u2.setUserGender('여');
//		  u2.setUserName("김영희");
//		  u2.setUserPassword("pass02");
//		  System.out.println(u2.getUserId());
//		  System.out.println(u2.getUserAge());
//		  System.out.println(u2.getUserGender());
//		  System.out.println(u2.getUserName());
//		  System.out.println(u2.getUserPassword());
		  
		  User u3 = new User("user03", "pass03"); // 순서 중요
		  System.out.println(u3.getUserId());
		  System.out.println(u3.getUserAge());
		  System.out.println(u3.getUserGender());
		  System.out.println(u3.getUserName());
		  System.out.println(u3.getUserPassword());
		  
	}

	public void ex4() { //매개변수 생성자 예제
		
		User u1 = new User(); //기본 생성자
		User u2 = new User("user02", "pass02");
		//매개변수 5개 생성자
		User u3 = new User("user03", "pass03", "김용기", 30, '남');
		
		System.out.printf("u1 : %s / %s / %s / %d / %c\n", 
			u1.getUserId(), u1.getUserPassword(),u1.getUserName(),
			u1.getUserAge(), u1.getUserGender());
		
		System.out.printf("u2 : %s / %s / %s / %d / %c\n", 
				u2.getUserId(), u2.getUserPassword(),u2.getUserName(),
				u2.getUserAge(), u2.getUserGender());
		
		System.out.printf("u2 : %s / %s / %s / %d / %c\n", 
				u3.getUserId(), u3.getUserPassword(),u3.getUserName(),
				u3.getUserAge(), u3.getUserGender());
		
	}
}
