package edu.kh.inheritance.model.vo;

public class Student extends Person {
	// Student 클래스에 Person 클래스 내용을 연장한다
	// == Student 클래스에 Person 클래스 내용을 추가하여 확장한다
		
//	private String name;
//	private int age;
//	private String nationality;
	private int grade;
	private int classroom;
	
	public Student() {

		// Student 객체 생성시
		// 내부에 상속받은 Person 객체를 생성하기 위한
		// Person 생성자 호출 코드 필요

		// super : 상위
		super(); // Student의 super(상위) == Person
		
		// 부모의 생성자를 호출하는 코드
		// 반드시 자식생성자 최상단에 작성
		// 부모의 생성자 실행(필드 초기화 + 특정기능 수행)
		
		// super() 생성자 덕분에 자식 객체 내부에 부모 객체가 생성
		// super() 미작성시 컴파일러가 자동 추가
	}
	
	
	public Student(String name, int age, String nationality, int grade, int classroom) {
//		this.name = name;
		// 부모의 필드에 private 접근제한자가 있어서 직접 접근 불가
		// 간접 접근 필요 
		// 부모의 세터를 이용할 순 있으나 비효율적이라 잘 안씀 -> setName(name); 
		super(name, age, nationality); // 부모의 생성자 중 매개변수 생성자 호출
		
//		this.age = age;
//		this.nationality = nationality;
		this.grade = grade;
		this.classroom = classroom;
	}

@Override
	public String toString() {
		return super.toString() + " / " + grade + " / " + classroom;	
	}


	//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getNationality() {
//		return nationality;
//	}
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	
	
	
}
