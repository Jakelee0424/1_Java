package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// Service : 특정 기능(business logic)을 제공하는 클래스, 실행 X

public class AbstractionService {

	public void ex1() {
		//국민 객체 만들기
		
		People p1 = new People();
		// people p1 : people 객체의 주소를 저장하여 참조하는 변수 p1
		// new people() : 새로운 people 객체를 heap 영영에 생성
		
		// 클래스 이름이 자료형처럼 사용
		// -> 클래스를 '사용자 정의 자료형'이라고 함
		
		//p1.name = "홍길동";
		p1.setName("홍길동");
		p1.setAge(25);
		p1.setGender('남');
		p1.setPhone("010-2306-3305");
		p1.setpNo("120154-1458632");
		p1.setAddress("서울시 중구 남대문로 120 대일빌딩");
		
		System.out.println("p1의 name은 = " + p1.getName());
		System.out.println("p1의 age은 = " + p1.getAge());
		System.out.println("p1의 gender은 = " + p1.getGender());
		System.out.println("p1의 phone은 = " + p1.getPhone());
		System.out.println("p1의 pNo은 = " + p1.getpNo());
		System.out.println("p1의 address은 = " + p1.getAddress());
		
		System.out.println("===============================================");
		People p2 = new People();
		
		p2.setName("이재경");
		p2.setAge(31);
		p2.setGender('남');
		p2.setPhone("010-2306-3305");
		p2.setpNo("920224-1155229");
		p2.setAddress("서울시 도봉구 도봉로 110길 95-1");
		
		System.out.println("p2의 name은 = " + p2.getName());
		System.out.println("p2의 age은 = " + p2.getAge());
		System.out.println("p2의 gender은 = " + p2.getGender());
		System.out.println("p2의 phone은 = " + p2.getPhone());
		System.out.println("p2의 pNo은 = " + p2.getpNo());
		System.out.println("p2의 address은 = " + p2.getAddress());
	}
}