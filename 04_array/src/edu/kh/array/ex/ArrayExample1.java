package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {

	Scanner sc = new Scanner(System.in);
	
/*
배열 (Array)
- 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
- 묶여진 변수들은 하나의 배열명으로 불려지고
  구분은 index를 이용함(0부터 시작하는 정수)

*/
	
	public void ex1() {
	//변수 vs 배열
		
		int num; // 변수 선언 -> stack 영역에 4byte를 할당하고, 그 안에 num값 부여
		num = 10; // 변수 대입 -> num 안에 10 대입
		System.out.println(num); // -> num자리에 num값을 읽어와서 출력

	
		int[] arr; // 배열 선언 -> stack 영역에 int[](int배열) 공간을 4byte 할당하고, arr이름을 부여
				   //  참조형으로 주소값만 저장
		arr = new int[3]; // heap 영역에 새로운 공간(배열, 객체)을 할당 -> "참조형" 
		
						  // int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
						  // new int[3] : heap 영역에 int 3칸짜리 int[]를 생성
						  // int[]에는 시작 주소 지정
		
						  // 같은 자료형은 연산 가능
				
	// 배열 요소 값 대입
		
		arr[0] = 10;
		arr[1] = 230;
		arr[2] = 23;
		
		System.out.println("arr의 주소값 = " + arr);
		System.out.println("arr의 0번째 = " + arr[0]); // arr 참조하고 있는 0번째 인덱스 얻어옴
		System.out.println("arr의 1번째 = " + arr[1]);
		System.out.println("arr의 2번째 = " + arr[2]);
			
		
	}

	public void ex2() {

		//배열 선언 및 할당
		
		int[] arr = new int[4];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 40;
		arr[3] = 50;

		System.out.println("배열의 길이 = " + arr.length); // .length -> 배열의 길이

		//배열과 반복문
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf("arr[%d]에 저장된 값 : %d\n", i, arr[i]);
		}
		
	}
	
	public void ex3() {
		//5명의 키를 입력 받고 평균 구하기
		
		
		double[] hei = new double[5];
		
		
		for(int i = 0 ; i < hei.length ; i++) {
			System.out.print((i + 1) + "번 키를 입력해주세요 = ");
			hei[i] = sc.nextDouble();
		}
		System.out.println();
		double sum = 0;
		
		for(int j = 0 ; j < hei.length ; j++) {
			
			sum += hei[j];
			
		}
		System.out.printf("키 평균은 = %.2f\n", sum/hei.length);
	}

	public void ex4() {
		
		double[] arr = new double[4];
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.printf("%d번 점수 입력 : ", i+1);
			arr[i] = sc.nextDouble();
			
		}
		
		double sum = 0;
		double avr = 0;
				
		for(int j = 0 ; j < arr.length ; j++) {
			sum += arr[j];
			avr = sum /arr.length;			
			}
		Arrays.sort(arr);
		
		System.out.println();
		System.out.printf("합계 = %d\n", (int)sum);
		System.out.printf("평균 = %.1f\n", avr);
		System.out.printf("최소값 = %d\n", (int)arr[0]);
		System.out.printf("최대값 = %d\n", (int)arr[arr.length -1]);
	
			
	
	}

	public void ex5() {
			
		char[] arr= new char[5]; 
		
		// char[] arr이 참조하는 배열 요소에 A~E대입하기
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (char)('A' + i);
		}
		
		// Arrays 클래스 -> 자바 기본 제공 클래스 중 하나		
		// Arrays.toString(변수배열명) : 모든 요소 값 출력
		
		System.out.println(Arrays.toString(arr));
		
		
		// 배열 선언과 동시에 초기화(배열의 리터럴 표기는 중괄호)
		char[] arr3 = {'A','B','C','D','E'};
		System.out.println(Arrays.toString(arr3));
		
	}

	public void ex6() {
		
		String[] arr = {"파스타", "피자", "자장면"};
		System.out.print("오늘 점심은? : " + arr[(int)(Math.random() * 3)]);
			
	}

	public void ex7() {
		// 배열을 이용한 검색
		
		// 입력받은 정수가 배열에 있는지 없는지 확인
		// 있으면 몇번 인덱스에 존재하는지 출력
		
		int[] arr = {100,200,300,400,500,600,700,800,900,1000};
				
		System.out.print("정수 입력 = ");
		int input = sc.nextInt();
		
		boolean flag = false; // 신호를 나타내기 위한 변수 
							  // flag -- false : 일치하는 값이 존재하지 않음, true : 일치하는 값이 존재 
							  // 검사 전에는 없다고 가정
		
		for(int i = 0 ; i < arr.length ; i++) { // arr 배열 요소 순차 적근
			
			if(arr[i] == input){
				System.out.print(i + "번째 인덱스에 존재");
				
				flag = true; //일치하는 값이 있으므로 true로 변경
			}
			
		}	
		if (!flag) { // flag 상태 검사
			System.out.println("존재하지 않음");
			
		}
	}

	public void ex8() {
		
		String[] arr = {"사과", "딸기", "바나나", "키위", "멜론", "아보카도"};
		
		System.out.print("과일 입력");
		String input = sc.next();
		
		boolean flag = false;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(arr[i].equals(input)) {
				
			System.out.println(i + "번째 인덱스에 존재");
				flag = true;
			}		
			
		}
	
		if(!flag) {
		System.out.println("존재하지 않음");
		}
	}

	public void ex9() {

/*
1. 문자열을 입력받아 한 글자씩 잘라내여 char 배열에 순서대로 저장
2. 문자 하나를 입력 받아 일치하는 문자가 배열에 몇개 존재하는지 확인
3. 단, 일치하는 문자가 없을 경우 "존재하지 않습니다" 출력

// 사용해야하는 기술, 기능
1)배열 검색
2)String.length() : 문자열의 길이
	ex) hello -> length = 5

3) String.charAt(index) : 문자열에서 특정 index에 위치한 문자 하나를 얻어옴
	ex) hello.charAt(1) = e
	
4) Count 숫자세기

*/
		System.out.print("문자열을 입력하세요 : ");
		String input = sc.nextLine();
		char[] arr = new char[input.length()];	
			
		for(int i = 0 ; i < input.length() ; i++) {
			arr[i] = input.charAt(i);
		}
	
		System.out.println("검색할 문자 입력 : ");
		char input2 = sc.next().charAt(0);
		int count = 0;
		
		for(int j = 0 ; j < input.length() ; j++) {
			
			if(arr[j] == input2) {
				System.out.println("" + (j+1) + " 번째 인덱스에 존재");
				count++;
			} 
		
		}
		if(count > 0) {
		System.out.println(count + "개 있습니다.");
		} else {
		System.out.println("존재하지 않습니다.");
			
		}
	}
	

}

