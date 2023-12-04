package edu.kh.practice.snack.view;

import java.util.Scanner;
import edu.kh.practice.snack.controller.SnackController;

public class SnackMenu {

	Scanner sc = new Scanner(System.in);
	SnackController scr = new SnackController();
	
	public void menu() {
	
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String kind = sc.next();

		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("맛 : ");
		String flavor = sc.next();

		System.out.print("개수 : ");
		int numOf = sc.nextInt();

		System.out.print("가격 : ");
		int price = sc.nextInt();
	
		scr.saveData(kind, name, flavor, numOf, price);
		System.out.println("\n저장 완료되었습니다.");
	
		System.out.print("저장된 정보를 확인하시겠습니다?(y/n) :");
		char input = sc.next().charAt(0);
		
		if(input == 'y') {
			System.out.println(scr.confirmData());
		}
		
	
	}

}
