package edu.kh.oop.method.model.run;

import edu.kh.oop.method.model.service.MemberService;

public class MemberRun {

	public static void main(String[] args) {
		
		MemberService ms = new MemberService();
		//MemberService의 기본 생성자가 작성되어 있지 않지만 자동 생성
		
		ms.displayMenu(); // 메서드 호출 ->() 필수
		
	}
}
