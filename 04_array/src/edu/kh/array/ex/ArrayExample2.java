package edu.kh.array.ex;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayExample2 {

	Scanner sc = new Scanner(System.in);
	
	public void shallowCopy() {
		
		/* 얕은 복사(shallow)
		주소를 복사하여 서로 다른 두 변수가 하나의 배열을 참조
		*/
		
		int[] arr = {1,2,3,4,5};
		
		int[] copyArr = arr; // 주소만 복사
		
		System.out.println("변경 전");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copyArr));
		
		System.out.println("변경 후");
		
		copyArr[2] = 999;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copyArr));
		
	}

	public void deepCopy() {
		
		/* 깊은 복사(deep)
			같은 자료형의 새로운 배열을 만들어서 기존 배열의 데이터를 모두 복사하는 방법 */
		
		int[]arr = {1,2,3,4,5};
		
		// 1. for문 이용
		
		int[] copyArr1 = new int[arr.length]; // 5칸 짜리 배열 생성
		
		for(int i = 0 ; i < arr.length ; i++) {
			copyArr1[i] = arr[i];
		}
		
		// 2. System.arraycopy(원본배열, 복사시작인덱스번호, 복사할배열, 복사할 배열의 시작인덱스, 복사할 길이);
	
		int[] copyArr2 = new int[arr.length];
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		
		// 3. 복사할 배열 참조 변수에 Arrays.copyOf(원본 배열, 복사길이);
		
		int[] copyArr3 = Arrays.copyOf(arr, arr.length);
				
		System.out.println("변경 전");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copyArr1));
		System.out.println(Arrays.toString(copyArr2));
		System.out.println(Arrays.toString(copyArr3));
		
		// 값 변경 후 확인
		
		copyArr1[4] = 0;
		copyArr2[4] = 999;
		copyArr3[4] = 5000;

		System.out.println("변경 후");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copyArr1));
		System.out.println(Arrays.toString(copyArr2));
		System.out.println(Arrays.toString(copyArr3));
	}

	public void lotto() {
		
		//1. 1~45 중복 없는 난수 6개 생성
		//2. 생성된 난수가 오름차순으로 정렬
		
//		1) 정수 6개 저장할 배열 선언 및 할당
		int[] arr = new int[6];
		
//		2) 생선된 배열을 처음부터 끝까지 순차접근하는 for문 작성
		for(int i = 0 ; i < arr.length ; i++) {
			
//		3) 1~45사이 난수 생성
			int random = (int)(Math.random()*45 +1);
			
//		4) 생성된 난수를 arr에 대입
			arr[i] = random;
			
//		5) 중복검사를 위한 for문
			for(int x = 0 ; x < i ; x++) {

//		6) 현재 생성된 난수와 같은 수가 앞쪽 요소에 있는지 검사
			if(random == arr[x]) {
				i--; // 난수 새로 생성하기 위해 i값 감소
				break; // 중복데이터 발견하면 뒤쪽 값 비교할 필요 없음.
				}
			}
		}
//		7) 오름차순 정렬 -> 선택,삽입,버블,퀵 등등; ->자바가 정렬 방법을 미리 만들어서 제공하고 있음.
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		

	}
	
}
