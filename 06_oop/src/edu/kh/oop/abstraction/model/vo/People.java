package edu.kh.oop.abstraction.model.vo;

// VO(Value Object) : 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지

public class People { // 국민 클래스

// 클래스: 객체의 특성(속성 + 기능)을 정의한 것
	// == 객체를 만들기 위한 설계도

// 캡슐화 
	// 데이터와 기능을 하나로 묶어서 관리하는 기법
	// 데이터(속성)에는 접근 제한(private)이 원칙
		// 직접접근이 불가능 -> 간접 접근 방법을 제공
	// 기능(메서드)에는 	

// 필드 == 필드변수 == 멤버변수 == 클래스 변수	
	
// 속성 : 값(data)
	// 값을 저장하기 위한 변수 선언 -> 국민이라면 공통적으로 가지고 있는 속성만 작성(추상화)
		// ex) 이름, 성별, 주민번호, 주소, 전화번호, 나이 등..
	
	private String name; //데이터 직접 접근 제한(private)	
	private char gender;
	private String pNo;
	private String address;
	private String phone;
	private int age;
	
	
// 기능 : 행동(method)
	
	public void tax() {
		System.out.println("세금을 냅니다.");
	}
	
	public void vote() {
		System.out.println("투표를 합니다.");
	}

	
	
	
	// 캡슐화에서 사용할 간접 접근 기능(getter / setter)	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



		
}
