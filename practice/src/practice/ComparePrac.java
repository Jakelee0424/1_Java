package practice;

public class ComparePrac {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		int c = 5;
		
		System.out.println(a == b); // == 같으면 true
		System.out.println(a != c); // != 다르면 true
		
		
		if(a < b) {} // (조건식이 참이면) {} 실행
		
		int result = a > b ? a++ : b--; // a>b가 참이면 a++, 거짓이면 b--
		
		for(int d = 0; a <= b; a++) {} // for (초기화식, 조건식, 증감식) 
									   // d=0, 
		
		while (a >= b) {} // (조건식) -> a>=될 때까지 {} 실행 
		
		System.out.println(result);
		
		
	}
}
