package edu.kh.oarr.model.service;

import java.util.Scanner;
import edu.kh.oarr.model.vo.Employee;

public class EmployeeService {

	Scanner sc = new Scanner(System.in);
	Employee[] ey = new Employee[3];	
	
	
	public void CurrentInfo() {
		ey[0] = new Employee();
		ey[1] = new Employee(1, "홍길동", null, null, 19, 'M', 0, 0.0, "01022223333", "서울잠실");
		ey[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울마곡");
		
		System.out.println(ey[0].information());
		System.out.println(ey[1].information());
		System.out.println(ey[2].information());
		System.out.println("===============================================");
		
		for(int i = 0 ; i <ey.length ; i++) {
			if(ey[i].getEmpNo() == 0) {			
				System.out.print(i + "번 객체의 사번 = ");
				int empNo = sc.nextInt();
				ey[i].setEmpNo(empNo);
			}
			
			if(ey[i].getEmpName() == null) {
				System.out.print(i + "번 객체의 사원명 = ");
				String empName = sc.next();
				ey[i].setEmpName(empName);
			}
			
			if(ey[i].getDept() == null) {
				System.out.print(i + "번 객체의 소속부서 = ");
				String dept = sc.next();
				ey[i].setDept(dept);
			}
			
			if(ey[i].getJob() == null) {
				System.out.print(i + "번 객체의 직급 = ");
				String job = sc.next();
				ey[i].setJob(job);
			}
			
			if(ey[i].getAge() == 0) {
				System.out.print(i + "번 객체의 나이 = ");
				int age = sc.nextInt();
				ey[i].setAge(age);
			}	
			
			if(ey[i].getGender() == '\0') {
				System.out.print(i + "번 객체의 성별 = ");
				char gender = sc.next().charAt(0);
				ey[i].setGender(gender);
			}
		
			if(ey[i].getSalary() == 0) {
				System.out.print(i + "번 객체의 급여 = ");
				int salary = sc.nextInt();
				ey[i].setSalary(salary);
			}
			
			if(ey[i].getBonusPoint() == 0.0) {
				System.out.print(i + "번 객체의 보너스 포인트 = ");
				double bonusPoint = sc.nextDouble();
				ey[i].setBonusPoint(bonusPoint);
			}
		
			if(ey[i].getPhone() == null) {
				System.out.print(i + "번 객체의 전화번호 = ");
				String phone = sc.next();
				ey[i].setPhone(phone);
			}
			if(ey[i].getAddress() == null) {
				System.out.print(i + "번 객체의 주소 = ");
				sc.nextLine();
				String address = sc.nextLine();
				ey[i].setAddress(address);
			}
			
				
		}
		int a = (int)((ey[0].getSalary() + (ey[0].getSalary() * ey[0].getBonusPoint()))*12);
		int b = (int)((ey[1].getSalary() + (ey[1].getSalary() * ey[1].getBonusPoint()))*12);
		int c = (int)((ey[2].getSalary() + (ey[2].getSalary() * ey[2].getBonusPoint()))*12);
		System.out.println("===============================================");
		System.out.println(ey[0].information());
		System.out.println(ey[1].information());
		System.out.println(ey[2].information());
		System.out.println("===============================================");
		System.out.printf(ey[0].getEmpName() + "의 연봉은 %d원\n", a);
		System.out.printf(ey[1].getEmpName() + "의 연봉은 %d원\n", b);
		System.out.printf(ey[2].getEmpName() + "의 연봉은 %d원\n", c);
		System.out.println("===============================================");
		System.out.println("직원들의 연봉의 평균 : " + (a+b+c)/3 + "원");
	}
	
	
}
