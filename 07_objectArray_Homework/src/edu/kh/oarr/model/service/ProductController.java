package edu.kh.oarr.model.service;

import edu.kh.oarr.model.vo.Product;
import java.util.Scanner;

import javax.swing.text.InternationalFormatter;

public class ProductController {

	Scanner sc = new Scanner(System.in);
	
	private Product[] pro = new Product[10];
	int count = 0;	
	
	public void mainMenu() { //메뉴 출력
		
		int menuNum = 0; // 메뉴 선택용 변수
		do {
			System.out.println("\n====== 제품 관리 메뉴 =====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println();
			System.out.println("0. 프로그램 종료");
			System.out.println("===========================");
			System.out.print("메뉴 입력 = ");
			menuNum = sc.nextInt();
			sc.nextLine();

			switch(menuNum) {

			case 1 : count++; productInput(); break;
			case 2 : productPrint(); break;
			case 0 : System.out.println("\n**** 프로그램 종료 ****"); break;
			default : System.out.println("다시 입력해주세요");
			}

		} while(menuNum != 0);
	}

	public void productInput() { // 제품정보 추가
		
		for(int i = 0 ; i < 10 ; i++) {
			if(pro[i] == null) {
			
			System.out.println("**** 제품정보 입력 ****");
			System.out.print("1) 제품 번호 = ");
			int pld = sc.nextInt();

			sc.nextLine();
			System.out.print("2) 제품명 = ");
			String pName = sc.nextLine();

			System.out.print("3) 제품 가격 = ");
			int price = sc.nextInt();

			System.out.print("4) 제품 세금 = ");
			double tax = sc.nextDouble();
			
			pro[i] = new Product(pld, pName, price, tax);
			System.out.print("제품등록 완료!");
			break;	
			}
				
		}
	}

	public void productPrint() { // 제품정보 조회
		System.out.println("1.제품번호로 검색하기\n2.제품명으로 검색하기");
		System.out.print("\n메뉴 선택 = ");
		int choice = sc.nextInt();
		int pldInput = 0;
		String pNameInput = null;
		
		if(choice == 1) {
			System.out.println("제품번호를 입력해주세요 = ");
			pldInput = sc.nextInt(); 

			for(int i = 0 ; i < 100 ; i++) {
				if(pldInput == pro[i].getPld()) {
					System.out.println(pro[i].information());
				}
				break;
			} 
		}
		
		if(choice == 2) {
			System.out.println("제품명를 입력해주세요 = ");
			pNameInput = sc.next(); 

			for(int i = 0 ; i < 100 ; i++) {
				if(pNameInput.equals(pro[i].getpName())){
					System.out.println(pro[i].information());
				}
				break;
			}
		}
	}
	
}
	

