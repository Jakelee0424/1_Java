package practice;

import java.util.Scanner;

public class dd {
	
	public static void main(String[] args) {

		long a = 1234567891212381923l;
		
		String str = Long.toString(a);
				
		System.out.println(str);

		char[] b = str.toCharArray();
		int[] c =  new int[b.length];

		for(int i = 0 ; i < b.length ; i++) {
			c[i] = (int)Character.getNumericValue(b[b.length-1-i]);
//			System.out.print(b[i]);
			System.out.print(c[i]);
		}	
//		for(int i = 0 ; i < b.length ; i++) {
//			c[i] = (char) (b[b.length-1]-i);
//			
//			System.out.println(c[i]);

//		}		
		
    }
	
}