package edu.kh.oop.cls.run;

import edu.kh.oop.cls.model.service.ClsService;

public class ClsRun {

	public static void main(String[] args) {
		
		ClsService Cls = new ClsService();
		//ClsService의 기본 생성자가 작성되어 있지 않지만
		//사용 가능 -> 컴파일러가 자동 생성
		
//		Cls.ex2();
//		Cls.ex3();
		Cls.ex4();
		
	}
}
