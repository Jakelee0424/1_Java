package edu.kh.oop.cls.model.vo;


class TestVO {

// [접근제한자(default)][예약어(x)] class 클래스명
	// default : 같은 패키지 안에서만 import 가능

// Student와 같은 패키지에 있기 때문에 
// public, protected, (default)는 접근 가능
// 단, private은 접근 불가
	
	public void ex() {
		
	
		Student std = new Student();
	/*	
			System.out.println(std.v1);
			System.out.println(std.v2);
			System.out.println(std.v3);
			System.out.println(std.v4);
			
		*/
	}
	
}
