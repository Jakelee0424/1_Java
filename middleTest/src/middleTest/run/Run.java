package middleTest.run;

import middleTestIO.Student;
import middleTestService.StudentService;

public class Run {

	public static void main(String[] args) {
		
		StudentService ss = new StudentService();
		
		ss.displayMenu();
	}
	
}

