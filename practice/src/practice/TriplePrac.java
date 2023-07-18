package practice;

public class TriplePrac {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		
		int result1 = a > b ? a++ : --b;
		// a>b가 참이면 a++,  거짓이면 --b
		
		int result2 = a < b ? ++a : (b == 0 ? a-- : b++);
		// a<b가 참이면 a++, 거짓이면 ()로
		//					-> b==0이 참이면 a--, 아니면 b++
		
		
		System.out.println(result1);		
		System.out.println(result2);		
		
				
	}
	
}
