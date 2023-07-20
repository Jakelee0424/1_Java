package edu.kh.array.practice.sevice;

import java.util.Scanner;
import java.util.Arrays;

public class PracticeService {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
	/*	
1. 길이가 9인 배열을 선언 및 할당하고, 
2. 1부터 9까지의 값을 반복문을 이용하여
3. 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
4. 짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
[실행 화면]
1 2 3 4 5 6 7 8 9
짝수 번째 인덱스 합 : 25
		
		
		*/
		
	int[] arr = new int[9];
	int sum = 0;
	
	for(int i = 0 ; i < arr.length ; i++) {
		arr[i] += i+1;
		System.out.print(arr[i]+ " ");
		if(i % 2 == 0) {
			sum += arr[i];
			} 
		}
	System.out.println("\n짝수 번째 인덱스 합 = " + sum);
	}

	public void practice2() {
/*

길이가 9인 배열을 선언 및 할당하고, 
9부터 1까지의 값을 반복문을 이용하여 순서대로 배열의 각 인덱스 요소에 대입하고 출력
홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급
*/
	
		int[] arr = new int[9];

		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.print(arr[i]);
			}
		
	
	}

	public void practice3() {
		/*

사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
[실행 화면]
양의 정수 : 5
1 2 3 4 5
		*/
			System.out.print("양의 정수 = ");
			int input = sc.nextInt();
			int[] arr = new int[input];
			
			for(int i = 0 ; i < input ; i++) {
				arr[i] = i+1;
			}
			System.out.println(Arrays.toString(arr));
		}
	
	public void practice4() {
		
		/*
정수 5개를 입력 받아 배열을 초기화 하고
검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
		 */
		
		
		int[] arr = new int[5];
		boolean var = false;
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print(i+1 + "번째 정수 입력 = ");
			arr[i] = sc.nextInt();
		}
		System.out.print("검색할 정수 입력 = ");
		int num = sc.nextInt();
		for(int j = 0 ; j < arr.length ; j++) {
			if(num == arr[j]) {
				System.out.println("인덱스 = " + j);
				var = true;
			} 
		}
		if(!var) {
			System.out.println("존재하지 않습니다.");
		}
	}
	
	public void practice5() {
		
		/*
		 * 
		문자열을 입력 받아 문자 하나하나를 배열에 넣고 
		검색할 문자가 문자열에 몇 개 들어가 있는지
개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		
		*/
		int count = 0;
		
		System.out.print("문자열을 입력하세요 = ");
		String input = sc.next();
				
		char[] arr = new char[input.length()];
		
		for(int i = 0 ; i <input.length() ; i++) {
			arr[i] = input.charAt(i);
		}
				
		System.out.print("찾을 문자를 입력하세요 =");
		char word = sc.next().charAt(0);
		
		System.out.print(input + "에 "+ word + "가 존재하는 위치는 ");
		for (int i = 0 ; i < input.length() ; i++) {
			if(word == arr[i]) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(word + "개수 = " + count);
		
	}

	public void practice6() {
		
		/*
사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.

	*/
		int sum = 0;
		
		System.out.print("배열 길이 입력 = ");
		int[] arr = new int[sc.nextInt()];
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(i + "번째 인덱스 값 입력 = ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("인덱스의 총 합은 = " + sum);
	}

	public void practice7() {
/*
 * 주민등록번호 번호를 입력 받아 성별을 나타내는 숫자 이후부터 *로 가리고 출력하세요
 */
		
		System.out.print("주민등록번호를 입력하세요(-포함) = ");
		String num = sc.nextLine();
		char[] arr = new char[num.length()];

		for(int i = 0 ; i < num.length() ; i++) {
			arr[i] = num.charAt(i);

			if(i < 8) {
				System.out.print(arr[i]);	
			} else { 
				System.out.print("*");

			}
		}
	}
}