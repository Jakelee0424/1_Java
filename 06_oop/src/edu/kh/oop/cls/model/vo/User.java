package edu.kh.oop.cls.model.vo;

public class User {

	//속성(==필드)
	// 아이디, 비빌번호, 이름, 나이, 성별(추상화)
	// 데이터 직접 접근 불가원칙 -> 필드는 기본적으로 private(캡슐화)
	
	private String userId;
	private String userPassword;
	private String userName;
	private int userAge;
	private char userGender;

//-------------------------------------------------------------------------------------------
	
	//기능(==생성자 + 메서드)

	// 생성자 : new 연산자로 객체가 생성될 때 
			//	생성된 필드값 초기화 + 기능수행 역할
	
	// 기본 생성자
	public User() {
		
		// 기능 수행
		System.out.println("기본생성자로 User 객체 생성"); 
		
		//필드 초기화 - 객체 생성하면 다 홍길동
		userId = "User01";
		userPassword = "pass01";
		userName = "홍길동";
		userAge = 20;
		userGender = '남';
		
	// 초기화 값에 대한 변경 방법 
		// 1. setter로 새로운 값 대입
		// 2. 매개변수 생성자로 객체가 생성될 때부터 다른 값으로 초기화
		
	}
	
	// 매개변수 생성자
		// 1. 매개변수 - 생성자나 매서드 호출 시 ()안에 작성되어 값을 전달하는 변수
		//			   - 전달 받을 값을 저장하고 있는 매개체 변수 
		// 2. 오버로딩
		// 3. this 참조 변수 - 매개변수로 전달받은 값을 필드에 초기화
		//					 - 객체가 자기 자신을 참조할 수 있도록 하는 변수(자기 자신의 주소값 참조)
		//					 - 모든 객체 내부에 숨겨져 있음.
		//					 - 필드명과 매개변수명을 구분하기 위해 사용(this.필드명 = 매개변수명)
		//  				 - 필드명과 매개변수명이 다르면 this 안써도 댐, but 원칙적으로 필드랑 매개변수랑 같게 써야함
	public User(String userId, String userPassword) {
		
		System.out.println("매개변수 생성자를 이용해서 User 객체 생성");
		System.out.println(userId + "/" + userPassword);
		this.userId = userId;
		this.userPassword = userPassword;
	}
	                  
	// 필드를 전부 초기화 하는 목적의 매개변수 생성자
	
	public User(String userId, String userPassword, String userName, 
					int userAge, char userGender) {
		//this() 생성자  - 같은 클래스의 다른 생성자를 호출할 때 사용
		// 				 - 제일 위에 있어야함
		//				 - 중복코드 제거 -> 코드 길이 감소 & 재사용성 증가
		//				 - but, 가독성때문에 잘 사용 안 함 
		this(userId, userPassword); 
//		this.userId = userId;
//		this.userPassword = userPassword;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
	}
	
	// 자바는 기본적으로 필드명, 생성자명, 메소드명, 변수명의 중복 X
	//		-> 이걸 가능하게 해주는 기능 == "오버로딩(over loading)"
	
	// **오버로딩**
	// 클래스 내 동일한 이름의 메서드(생성자 포함)를 여러개 작성하는 기법 
	//    -> 하나의 이름으로 여러개의 기능을 수행
	
	// [조건]
	// 1) 메서드의 이름이 동일
	// 2) 매개변수의 개수, 타입, 순서, 중 1개라도 달라야 함.
	
	public User(String userId) {} // 매개변수의 개수가 같은 생성자가 없음
	public User(int userAge) {} // 매개변수의 개수는 같지만 타입이 다름
	public User(String userId, int userAge) {} // 개수가 동일하나 타입이 다름
	public User(int userAge, String userId) {} // 개수, 타입이 동일하나 순서가 다름
	
	
	
	
//--------------------------------------------------------------------------------------	
		
	// 캡슐화로 인한 간접 접근 기능(getter/setter)
	public String getUserPassword() {
		return userPassword;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public char getUserGender() {
		return userGender;
	}

	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
}
