package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {

	Scanner sc = new Scanner(System.in);
	
	/* while 문
	 1) 별도의 초기식, 증감식이 존재하지 않고,
	 2) 반복 종료 조건을 자유롭게 설정하는 반복문
	 
	  - 확실히 언제 반복이 끝날지는 모르지만,
	    언젠가 반복 조건이 false가 되는 경우 반복을 종료함.	
	    
	  3) while(조건식) { 
	  
	  조건식이 true일 때 수행할 반복문
	  	  
	  }
	  
	*/
	
	public void ex1() {
	
		int input = 0; //while문의 종료 조건으로 쓸 예정 
		
		while(input != 9) {
			System.out.println("\n---------메뉴 선택---------");
			System.out.print("1. 김밥\n2. 라면\n3. 떡볶이\n9. 종료\n");
			System.out.print("메뉴 선택 = ");
			input = sc.nextInt();
						
			switch(input) {
			case 1: System.out.println("김밥을 주문했습니다."); break; 
			case 2: System.out.println("라면을 주문했습니다."); break; 
			case 3: System.out.println("떢볶이를 주문했습니다."); break; 
			case 9: System.out.println("메뉴선택을 종료합니다."); break; 
			default: System.out.println("잘못 입력하셨습니다.");
			
			}
		}
		
	}

	public void ex2() {
		
		//입력되는 모든 정수의 합 구하기
		// 단 0이 입력되면 반복 종료 후 결과 출력
		int input = -1;
		int sum = 0;
		
		while(input !=0) {
			
			System.out.print("정수 입력 : ");
			input=sc.nextInt();
			sum += input;
			
			
		}
		System.out.printf("정수 합 = %d\n\n", sum);
	}
	
	public void ex3() {

		//입력되는 모든 정수의 합 구하기
		// 단 0이 입력되면 반복 종료 후 결과 출력
		// do - while -> do를 먼저 진행한 후, while 진행
		// while문을 최소 한번을 수행하는 반복문
		
		int input = 0;
		int sum = 0;

		do{
			System.out.print("정수 입력 : ");
			input=sc.nextInt();
			sum += input;
			
		} while(input != 0); 
		
		System.out.printf("정수 합 = %d\n\n", sum);
	}


	
}
