package edu.kh.inheritance.model.vo;

public class Employee extends Person {

//	private String name;
//	private int age;
//	private String nationality;
	private String company;
	
	
	public Employee() {}

	public Employee(String name, int age, String nationality, String company) {
//		this.name = name;
//		this.age = age;
//		this.nationality = nationality;
		this.company = company;
	}

	// person으로 상속받은 메서드 중 move() 메서드를 재정의
	
	
	
	// Annotation -해당 메소드가 오버라이딩 되었음을 컴파일러에게 알려줌 
	@Override		   // -> 컴파일러가 문법체크(컴파일러 인식용 주석)
	public void move() {
		System.out.println("오버라이딩 된 move");
		System.out.println("효율적으로 빨리 일하고 움직인다.");
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	
}
