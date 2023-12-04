package edu.kh.practice.snack.controller;

import edu.kh.practice.snack.model.vo.Snack;
import edu.kh.practice.snack.view.SnackMenu;

public class SnackController {

	private Snack s = new Snack();
	
	public SnackController() {}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) { //정보 저장
	
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "";
	}
	
	public String confirmData() { // 저장된 데이터 반환 메소드
		
		return s.information();
		
	}
	
}

