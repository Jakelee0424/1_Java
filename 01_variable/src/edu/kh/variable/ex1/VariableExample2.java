package edu.kh.variable.ex1;

public class VariableExample2 {

	public static void main(String[] args) {
		
		/*
		  자바 기본 자료형
		  
		 1. 논리형 - boolean (1byte)
		 2. 정수형 - byte(1byte), short(2byte), int(4byte), long(8byte)
		 3. 실수형 - float(4byte), double(8byte)
		 4. 문자형 - char(2byte, 유니코드)
		
		 */
		
		// 변수 선언 : 메모리에 값을 저장할 공간을 할당하는 것.
		// 변수 값 대입(집어 넣기, 초기화) : 변수에 값을 집어 넣는 것.
		
		// Camel 표기법 - 연결되는 두 단어 중 후속 단어의 첫 문자를 대문자로
		
		boolean booleanData;
		// 1. 메모리에 논리값(t/f)을 저장할 공간 1byte를 할당하고,
		// 2. 할당된 공간을 booleanData라고 부르겠다.
		
		booleanData = true;
		//booleanData 변수에 true 값을 대입
		
		System.out.println("booleanData : " + booleanData);
		System.out.println("-----------------------------");
		
		byte byteNumber = 127; 
		// 메모리에 정수 값을 저장할 공간을 1byte 할당하고
		// 할당된 공간을 byteNumber라고 부르겠다.
		// 선언된 byteNumber 변수에 127을 처음으로 집어넣음(초기화)
		
		System.out.println("byteNumer : " + byteNumber);
		System.out.println("---------------------------");
		
		short shortNumber = 32767; // 변수 선언 + 초기화 동시
		int intNumber = 2147483647; // 변수 선언 + 초기화 동시(short, byte는 옛날 코드의 잔재)
		
		System.out.println("shortNumber : " + shortNumber);
		System.out.println("---------------------------");
		
		System.out.println("intNumber : " + intNumber);
		System.out.println("---------------------------");
		
		/* 기본 형태 
		- 자료형 + 변수 = 리터럴(변수에 대입되거나 작성되어지는 값 자체) 
		- 리터럴은 자료형에 따라 표기법이 다름		
		 */
		
		long longNumber = 10000000000l;
		/* The literal 10000000000 of type int is out of range 
		 -> 100억의 값은 int의 범위를 벗어남 -> 뒤에 L or l를 붙여 long 자료형임을 나타냄		 
		*/
		System.out.println("longNumber : " + longNumber);
		System.out.println("---------------------------");
		
		
		float floatNumber = 1.2345f;
		// long이랑 마찬가지. F or f 붙여 float 자료형임을 나타냄
		System.out.println("floatNumber : " + floatNumber);
		System.out.println("---------------------------");
		
		double doubleNumber =3.141592;
		// double이 실수형 중 기본형
		// 리터럴 표기법이 없는 실수는 double로 인식
		// 뒤에 d를 작성할 순 있음
		// 자바는 double을 리터럴 표기법 안붙이는 놈으로 정함
		System.out.println("doubleNumber : " + doubleNumber);
		System.out.println("---------------------------");
		
		
		char ch = 'A';  //문자형 리터럴 표기법 : ''(홑따옴표) -> 문자하나
		char ch2 = 66;
		/*
		 char 자료형에 숫자가 대입될 수 있는 이유
		1. 컴퓨터에는 문자표가 존재하고 있는데
		2. 숫자에 따라 지정된 문자 모양이 매핑되어있고,
		3. 'B' 문자 그대로가 대입되면 변수에 숫자 66으로 변환되어 저장
		    -> 반대로 생각하면 변수에 66이라는 숫자를 저장하는 것이 가능
				
		*/
		
		System.out.println("ch : " + ch + "ch2 : " + ch2);
		System.out.println("ch2 : " + ch2);		
		System.out.println("---------------------------");
		
		
		// 변수 명명 규칙
		
		// 1. 대소문자 구분, 길이제한 X
		int abcdefg12345679;
		int abcdefG12345679;
		
		// 2. 예약어 사용 X
		// ex) double double X
		
		// 3. 숫자 시작 X
		// ex) char 1abc; X
		//     char a2bc; O
		
		// 4. 특수문자 $, _만 사용 가능 (But, 이마저도 안씀)
		int $ky; // 문제는 없는데 개발자가 직접 작성하지 않는게 국룰
		int sky_diving; // _는 DB에서 사용
		
		// 5. 카멜 표기법
		// 변수명 작성 시 여러 단어를 이어서 작성하는 경우, 
		// 띄어쓰기 대신 후속 단어 첫 글자를 대문자로
		char helloWorldAppleBananaTomato;
		
		// 6. 변수명은 언어를 가리지 않음. (하지만 영어 쓰는게 국룰)
		int 인트; // 이렇게 안씀;;
		
		

		int number = 10;
		System.out.println(number);
		
		number = 20;
		System.out.println(number);
		
		
		
		final double PI_VALUE = 3.14; //상수는 모두 대문자 쓰는게 국룰 -> 띄어쓰기 언더바 
		// PI_VALUE = 2.14; 에러남 -> 재 대입 불가 
		
		
		/* 
		 
		 상수(항상 같은 수)
		 
		 1. 한번 값이 대입되면 다른 값 대입 불가
		 2. 자료형 앞에 final 키워드
		 3. 상수의 명명 규칙
		    - 모두 대문자, 여러단어 작성 시 '_'로 띄어쓰기 표기	
		 4. 상수는 사용 경우
		    - 고정된 값 저장 시 (ex PI값)
			- 특정한 값에 의미 부여할 때 (ex 게임 방향키 등)
			  final int LEFT_MOVE = -1;			
			
		*/
		
		
		
		
			System.out.print((char)84);
			System.out.print((char)73);
			System.out.print((char)76);
	
		
		
		
		
		
	}
	
	

}
