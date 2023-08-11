package test.menu.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import menu.io.Menu;

public class MenuService {

	private Scanner sc = new Scanner(System.in);
	private ArrayList<Menu> list = new ArrayList<Menu>();
	
	
	/**
	 * 테스트 메뉴 추가
	 */
	public MenuService() {
		
		list.add(new Menu(1, "식사", "돼지김치찌개", 15000)); 
		list.add(new Menu(2, "식사", "육회비빔밥", 13000)); 
		list.add(new Menu(3, "사이드", "물만두", 7000)); 
		list.add(new Menu(4, "사이드", "해물파전", 10000)); 
		list.add(new Menu(5, "음료", "콜라", 3000)); 
		list.add(new Menu(6, "음료", "사이다", 3000)); 
		list.add(new Menu(7, "주류", "소주", 5000)); 
		
	}
	
	/**
	 * 메인 메뉴 메서드
	 */
	public void displayMenu() {

		try {

			int input = -1; 

			do {

				System.out.println("====== 메뉴 관리 프로그램 vo.1 ======\n");
				System.out.println("1. 전체 메뉴 조회");
				System.out.println("2. 카테고리별 메뉴 조회");
				System.out.println("3. 메뉴 추가");
				System.out.println("4. 메뉴 삭제");
				System.out.println("5. 메뉴 수정");
				//		System.out.println("6. 오늘의 메뉴 추천");
				System.out.println("0. 프로그램 종료");
				System.out.print("번호를 입력하세요 >> ");
				input = sc.nextInt();

				switch(input) {
				
				case 1 : selectMenu(); break;
				case 2 : selectMenuByCategory(); break;
				case 3 : System.out.println("====== 3. 메뉴 추가 ======\n"); break;
				case 4 : System.out.println("====== 4. 메뉴 삭제 ======\n"); break;
				case 5 : System.out.println("====== 5. 메뉴 수정 ======\n"); break;
				case 0 : System.out.println("====== 0. 프로그램 종료 ======\n"); break;
				default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
					
				}
				
			}while(input != 0);

		}catch(InputMismatchException e) {
			System.out.println("\n잘못 입력하셨습니다. 다시 입력해주세요\n");
			sc.nextLine();
			displayMenu();
		}
	}
	
	/**
	 * 전체 메뉴 조회 메서드 
	 */
	public void selectMenu() {
		System.out.println("\n====== 1. 전제 메뉴 조회 ======\n");
		
		if(list.size() != 0) {
			for(Menu temp: list) {
				System.out.println(temp.toString());
			}
		}else {
			System.out.println("등록된 메뉴가 없습니다.");
			displayMenu();
		}
	}
	
	/**
	 * 카테고리별 메뉴 조회 메서드
	 */
	public void selectMenuByCategory() {
		System.out.println("\n====== 2. 카테고리별 메뉴 조회 ======\n");
		
		System.out.println("카테고리 번호를 입력하세요");
		System.out.println("1. 식사");
		System.out.println("2. 사이드");
		System.out.println("3. 음료");
		System.out.println("4. 주류");
		
		System.out.print("번호 입력 >> ");
		int inputCategory = sc.nextInt();
		
		switch(inputCategory) {

		case 1 : System.out.println(list.); break;
		case 2 : System.out.println(); break;
		case 3 : System.out.println(); break;
		case 4 : System.out.println(); break;
		default : System.out.println("잘못 입력하셨습니다."); 
		
		}
		
	}

	/**
	 * 메뉴 추가 메서드
	 */
	public void addMenu() {
		System.out.println("\n====== 3. 메뉴 추가 ======\n");
		
		System.out.println("메뉴번호를 입력하세요 ");
		System.out.print("메뉴번호 >> ");
		int inputMenuNum = sc.nextInt();
		
		System.out.println("카테고리 번호를 입력하세요.");
		
		System.out.print("메뉴번호 >> ");
		
		
	}

}
