package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {

		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력하세요.");
		} else {
			for (int i = 1 ; i<=num ; i++) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice1_1() {
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		boolean var = (num >1);
		if(!var) {
			System.out.println("1이상의 숫자를 입력하세요.");
		} else {
			for (int i = 1 ; i<=num ; i++) {
				System.out.print(i + " ");
			}
				
		}
	}
	
	public void practice2() {

		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = num ; i >= 1 ; i--) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice3() {

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		int total = 1;

		if(num < 1) {
			System.out.print("정수를 입력해주세요.");
		} else {
			for (int i = 1 ; i < num ; i++) {
				System.out.print(i + " + ");
				sum += i;
				total = sum + num;
			}
			System.out.println(num + " = " + total);
		}

	}
	
	public void practice4() {		

		System.out.print("첫 번째 숫자를 입력하세요 = ");
		int num1 = sc.nextInt();

		if (num1 < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		} else {
			System.out.print("두 번째 숫자를 입력하세요 = ");
			int num2 = sc.nextInt();

			if (num2 < 1) {
				System.out.print("1 이상의 숫자를 입력해주세요.");
			} else {

				if (num1 < num2) {			
					for(int i = num1 ; i <= num2 ; i++) {
						System.out.print(i + " ");
					} 
				} else {
					for(int i2 = num2 ; i2 <= num1 ; i2++) {
						System.out.print(i2 + " ");
					}
				}
			}
		}
	}
	
	public void practice4_1() {		

		System.out.print("첫 번째 숫자를 입력하세요 = ");
		int num1 = sc.nextInt();

		boolean var1;
		
		if (num1 < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		} else {
			System.out.print("두 번째 숫자를 입력하세요 = ");
			int num2 = sc.nextInt();

			if (num2 < 1) {
				System.out.print("1 이상의 숫자를 입력해주세요.");
			} else {

				if (num1 < num2) {			
					for(int i = num1 ; i <= num2 ; i++) {
						System.out.print(i + " ");
					} 
				} else {
					for(int i2 = num2 ; i2 <= num1 ; i2++) {
						System.out.print(i2 + " ");
					}
				}
			}
		}
	}

	public void practice5() {

		System.out.print("숫자를 입력하세요 : ");
		int dan = sc.nextInt();
		
		if(dan < 2 || dan > 9) {
			System.out.print("다시 입력하세요.");
		} else {
			System.out.printf("\n======%d단======\n", dan);
			for(int i = 2 ; i <= 9 ; i++) {
				System.out.printf("%d * %d = %d\n", dan, dan, i, dan*i);
			}
			
		}
	}

	public void practice6() {
		/*
		 
		 메소드 명 : public void practice6(){}
사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
숫자 : 4 			숫자 : 10
===== 4단 ===== 		2~9 사이 숫자만 입력해주세요.
		 
		 */
		
		System.out.print("숫자를 입력하세요 = ");
		int num = sc.nextInt();
		
		if (num < 2 || num > 9) {
			
			System.out.print("2~9 사이 숫자만 입력하세요");
			
		} else {
			
			System.out.printf("\n=======%d단=======\n", num);
			for(int i = 1 ; i <= 9 ; i++) {
			System.out.printf("%d X %d = %d\n", num, i, num*i);
			
			}		
		}
	}

	public void practice7() {
		/*
	메소드 명 : public void practice7(){}
다음과 같은 실행 예제를 구현하세요.
ex.
정수 입력 : 4
*
**
***
****
		
*/
		
		System.out.print("정수 입력 = ");
		int input = sc.nextInt();
				
		for(int i = 1 ; i <= input; i++) { // input 값(입력한 정수)과 동일한 줄 개수
			for(int j = 1; j <= i ; j++) { // i값과 동일한 j개수
				System.out.print("*");	   // j자리에 "*"입력
			}
		System.out.println();
		}
		
	}

	public void practice8() {
		
		/*		
		메소드 명 : public void practice8(){}
다음과 같은 실행 예제를 구현하세요.
ex.
정수 입력 : 4
****
***
**
*		
		*/
		
		System.out.print("정수 입력 = ");
		int input = sc.nextInt();
		
		for(int i = input ; i >= 1 ; i--) {
			for(int j = i ; j >= 1 ; j--) {
				System.out.print("*");
			}
				System.out.println();
		}
		
	}

	public void practice9() {
		/*
	메소드 명 : public void practice9(){}
다음과 같은 실행 예제를 구현하세요.
ex.
정수 입력 : 4
*
**
***
		
*/
		System.out.print("정수 입력 = ");
		int input =sc.nextInt();
		
		for(int i = 0; i < input; i++) { 
			for(int j = 0 ; j < input ; j++ ) {
				if(j < input-i-1) {

					System.out.print(" ");

				}else{
					
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

	public void practice10() {

		System.out.print("정수 입력 = ");
		int input = sc.nextInt();
		
		for(int i = 1 ; i <= input ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();	
			}
		for(int i = 1 ; i <= input ; i++) {
			for(int j2 = input-1 ; j2 >= i ; j2--) {
			System.out.print("*");
			}
		System.out.println();
		}
	}

	public void practice11() {
		
		System.out.print("정수 입력 = ");
		int input =sc.nextInt();
		
		for(int i = 0; i < input; i++) { 
			for(int j = 1 ; j < input ; j++ ) {
					System.out.print("-");
				} 			
			
			System.out.println();
			
		}
	}

	public void practice11_1() {

		System.out.print("정수 입력 = ");
		
		int input = sc.nextInt();
		for(int i = 1 ; i <= input ; i++ ) {

			for(int j = 1 ; j <= input * 2 - 1; j++) {
				
				if( input-i>=j || input+i<=j) {
					System.out.print(" ");

				}else{
					System.out.print("*");
				}
			}

			System.out.println(); 
		}

	}

	public void practice12() {
	
	System.out.print("정수 입력 = ");
	int input = sc.nextInt();
	
	for(int row = 1 ; row <= input ; row++) {
		
		for(int col = 1 ; col <= input ; col++) {
			
			if(row == 1 || row == input || col == 1 || col == input) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
		}
	}

	public void practice13() {
		
		
		System.out.print("자연수 하나를 입력하세요 =  ");
		int input = sc.nextInt();

		int count = 0;
		
		for(int i = 1; i <= input ; i++) {
			
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			
				if(i % 2 == 0 && i % 3 == 0) {
					count++; 
				}
			}
		}
		
		System.out.println("\ncount : " + count);
		
	}
	
	public void practice14() {
		
		System.out.print("정수 입력 = ");
		int input = sc.nextInt();
		
		for(int i = 1 ; i <= input ; i++) {
			for(int j = 1 ; j <= input*2-1 ; j++) {
				
				if(j <= input-i || j >= input+i ) {
				System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}	
		System.out.println();
		}		

	}
	
	public void practice15() {
		
		System.out.print("정수를 입력하세요 = ");
		int input = sc.nextInt();
		
		for(int i = 1 ; i <= input ; i++) {
			for(int j = 1 ; j <= input ; j++) {
				if(i == 1 || i == input || j == 1 || j == input) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}System.out.println();
		}
		
		
	}

	public void practice16() {
		
		/*
		 1부터 사용자에게 입력 받은 수까지 중에서
1) 2와 3의 배수를 모두 출력하고
2) 2와 3의 공배수의 개수를 출력하세요.
* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
모두 나머지가 0이 나오는 수

		 */
		
		System.out.print("숫자 입력 = ");
		int input = sc.nextInt();
		int count = 0;
		
		if(input < 1) {
			System.out.print("숫자를 다시 입력하세요.");
		} else {
			for(int i = 1 ; i <= input ; i++) {
				if(i % 2 == 0 || i % 3 ==0) {
					System.out.print(i + " ");
				} 
				if(i % 2 == 0 && i % 3 ==0) {
					count++;
				}
			}
			System.out.println();
			System.out.print("공배수의 개수 = " + count);
			
		}
		
		
		
	}
	
}