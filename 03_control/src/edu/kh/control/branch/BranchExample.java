package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {

	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		//
		
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.print(i + " ");
			
			if(i==5) {
				break;
			}
		}
	}

	public void ex2() {
		//0 이 입력될 때까지의 모든 정수의 합 구하기
		
		//while문 무조겅 수행, 특정 조건에 종료
		// 1) input에 초기값을 0이 아닌 다른값 while (1 !=0)
		// 2) d0-while 사용
		// 3) 무한 루프 상태의 while 만든 후, 내부 break로 탈출
		
		int input = 0;
		int sum = 0;
		
		while(true) { // 무한 루프
			System.out.print("정수 입력 : ");
			input = sc.nextInt();

			if(input ==0 ) {
				break;
			}
			sum += input;
		}
		System.out.println("합계 = " + sum);
	}
	
	public void ex3() {
		
		//입력 받은 모든 문자열 누적 , 단 exit@ 입력시 문자열 누적을 종료 후 결과 출력
		
		String str =""; //빈 문자열
		
		while(true) {
			
			System.out.print("문자 입력(exit@ 입력 시 종료) = ");
			String input = sc.nextLine();
			
			if(input.equals("exit@")) {
				// String 자료형은 비교 연산자(==)로 같은 문자열인지 판별 불가능 - 기본자료형에서만 가능
				// so, 문자열1.equals(문자열2)로 비교 가능
				
				break;
			}
			str += input + "\n"; 
		}
		System.out.println("----------------------");
		System.out.println(str);	
	}

	public void ex4() {

		for (int i = 2 ; i <= 9; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.printf("%d X %d = %d\t", i, j, i*j);
				
				if(i==j) {
					break;
				}
			}
			System.out.println();
		}
		
	}

	public void ex5() {
		
	// continue : 다음 반복으로 넘어감. 즉 continue에 걸리는 조건만 탈출 후 재반복
		
		// 1-10까지 1씩 증가 하면서 출력
		// 단 3의 배수 제외
		
		for(int i = 1 ; i <= 10 ; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

	public void ex6() {
		
		//1~100까지 1씩 증가
		// 5배수 제외
		// 40때 멈춤
		
		for(int i = 1 ; i<= 100 ; i++) {

			if(i == 40) {
				break;
			}
			
			if(i % 5==0) {
				continue;
			}
			
			System.out.println(i);
		}

	}

	public void RSP() {

		int insertCoin = 0;
		
		System.out.println("[가위 바위 보 게임}");
		System.out.print("몇 판 ? =");
		insertCoin = sc.nextInt();

		int win = 0;	//승패 기록 변수
		int draw = 0;
		int lose = 0;
		
		for (int i = 1 ; i <= insertCoin ; i++) { // 입력 받은 코인 갯수 만큼 반복
			
			System.out.println("\n" + i + "번째 게임");
			System.out.print("가위 바위 보 중 하나를 입력해주세요 = ");
			String input = sc.next();
			
			// Math.random();
			// 난수 생성 -> 0.0이상, 1.0미만의 난수
			
			int random = (int)(Math.random() * 3 + 1); // random에 4미만 난수 생성
			String com = null; 
			
			switch(random){
			case 1: com = "가위" ; break; 
			case 2: com = "바위" ; break;
			case 3: com = "보";	break;
			}
			
			System.out.println("컴퓨터는 [ " + com + " ] 을 선택했습니다.");
		
			if(input.equals(com)) {
				System.out.println("비겼습니다.");
				draw++;
				
			} else {
				
				boolean win1 = input.equals("가위") && com.equals("보");
				boolean win2 = input.equals("바위") && com.equals("가위");
				boolean win3 = input.equals("보") && com.equals("바위");
				
				if (win1 || win2 || win3) {
					System.out.println("플레이어 승!");
					win++;
				} else {
					System.out.println("플레이어 패!");
					lose++;
				}
				
			}
			System.out.println("현재기록" + win + "승" + draw + "무" + lose + "패" );
		}
		
	}

}
