package edu.kh.inheritance.model.Service;

import java.util.Scanner;
import edu.kh.inheritance.model.vo.Employee;
import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class inheritanceService {

	Scanner sc = new Scanner(System.in);
	
	// 상속의 특징 : 코드 추가 및 수정에 용이함 
	// -> 부모에게 정의하면 상속받은 자식들은 모두 부모의 것을 그대로 받아씀
	
	
	public void ex1() { //상속 확인 예제
		
		// Person을 상속받은 Student가 Person필드, 메소드를 사용할 수 있는가?
		
		Person p = new Person();
		p.setName("홍길동");
		p.setAge(31);
		p.setNationality("대한민국");
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		p.breath();
		System.out.println("---------------------------");
	
		
		Student s = new Student();
		
		s.setGrade(3);
		s.setClassroom(4);
		System.out.println(s.getGrade());
		System.out.println(s.getClassroom());
		
		// 부모 클래스로 상속받은 필드, 메서드
		s.setName("이재경");
		s.setAge(10);
		s.setNationality("미국");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getNationality());
		s.breath();
		System.out.println("---------------------------");
		
		
		Employee e = new Employee();
		
		e.setCompany("kh");
		System.out.println(e.getCompany());
		
		// 부모 클래스로 상속받은 필드, 메서드
		e.setName("jake");
		e.setAge(50);
		e.setNationality("스페인");
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getNationality());
		e.breath();
	}

	public void ex2() { //super 생성자 사용법
		
		// Student 매개변수 생성자
		
		Student s = new Student("김철수", 17, "한국", 6, 3);
		// 부모의 필드에는 접근이 안됨 -> this로 값 전달이 안됨
		
		
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getNationality());
		System.out.println(s.getGrade());
		System.out.println(s.getClassroom());
		
	}

	public void ex3() { //overriding 확인 예제
		
		Student s = new Student();
		Employee e = new Employee();
		
		s.move();
		e.move(); // Student 클래스의 move 메소드를 Employee가 오버라이드
		
	}
	
	public void ex4() { //Object클래스 확인
		//모든 클래스는 Object클래스의 후손
		//모든 클래스의 최상위 부모는 Object
		//   -> 컴파일러가 자동으로 extends Object 구문 추가
		
		Person p = new Person();
		//Object를 상속받은 Person객체 생성
		
		Student s = new Student();
		//Person을 상속받은 Student객체 생성

		// => Object -> Person -> Student 순서의 상속관계
		
		System.out.println(p.hashCode());
		System.out.println(s.hashCode());
	
		String str = "abc";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(str.hashCode());
		System.out.println(sc.hashCode());
	}
	
	public void ex5() { //toString 
		Person p = new Person("김철수", 17, "한국");
		
		System.out.println(p.toString());
		System.out.println(p); // 컴파일러가 toString으로 자동 호출
	
		Student s = new Student("이백점", 18, "미국", 6, 3);
		System.out.println(s.toString());
	}
	
}
