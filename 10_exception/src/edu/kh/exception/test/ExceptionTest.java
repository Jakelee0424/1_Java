package edu.kh.exception.test;

import java.util.Scanner;

public class ExceptionTest {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			System.out.print("정수 입력 (0 입력시 종료) = ");
//			int input = sc.nextInt();
//
////			int a = 99.9; // 컴파일 에러 - 개발자 잘못 -> 코드로 수정 가능
//			
//			if(input == 0) {
//				break;
//			}
//			
//		}
		
		// 런타임 에러 예제 
		
		// 런타임 에러 : 프로그램 수행 중 발생하는 에러 -> 주로 if문으로 처리 가능	
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40; // java.lang.ArrayIndexOutOfBoundsException
		
		if (3 >= arr.length) {
			System.out.println("배열 범위 초과");
		} else {
			arr[3] = 40;
		}
		
		
	}
	
}
