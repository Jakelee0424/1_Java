package practice;

public class MultiPrac {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;
		
		a = a += 10;
		System.out.println(a); // a = 20
		
		a = a -= 10;
		System.out.println(a); // 20 - 10 = 10
		
		a = a *= 10;
		System.out.println(a); // 10 * 10 = 100
		
		a = a /= 10;
		System.out.println(a); // 100 / 10 = 10
		
		a = a %= 10;
		System.out.println(a); // 10 % 10 = 0
		
		a = a++;
		System.out.println(a); 
		
		a = a--;
		System.out.println(a);
		
	}
	
}
