package middleTestService;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import middleTestIO.Student;

public class StudentService {

	private Scanner sc = new Scanner(System.in);
	private ArrayList<Student> list = new ArrayList<Student>();
	
	
	/**
	 * 테스트 학생 추가
	 */
	public StudentService() {
		
		list.add(new Student(2018001006, "홍길동", 1, "국어국문학과", "2018-08-06", "재학", "010-1234-1324", 'M', "서울시 도봉구"));
		list.add(new Student(2020008010, "박춘식", 8, "철학과", "2020-03-02", "재학", "010-1564-3479", 'M', "서울시 도봉구"));
		list.add(new Student(2015003018, "이오리", 3, "고고미술사학과", "2015-09-06", "휴학", "010-5864-1634", 'F', "서울시 도봉구"));
		list.add(new Student(2019005015, "베니마루", 5, "영어영문학과", "2019-03-03", "재학", "010-5464-4684", 'M', "서울시 도봉구"));
		list.add(new Student(2023009001, "신고", 9, "불어불문학과", "2023-03-02", "수료", "010-8462-5689", 'F', "서울시 도봉구"));
		list.add(new Student(2023009011, "네이마루", 9, "불어불문학과", "2023-03-02", "졸업", "010-9416-1354", 'F', "서울시 도봉구"));
		
	}
	
	/**
	 * 메인 메뉴 메서드
	 */
	public void displayMenu() {

		try {

			int input = -1; 

			do {

				System.out.println("\n====== 인문대학 학생 관리 프로그램 vo.1 ======\n");
				System.out.println("1. 전체 학생 조회");
				System.out.println("2. 검색으로 학생 조회");
				System.out.println("3. 학생 정보 추가");
				System.out.println("4. 학생 정보 삭제");
				System.out.println("5. 학생 정보 수정");
				System.out.println("--------------------");				
				System.out.println("0. 프로그램 종료");
				System.out.println("--------------------");	
				System.out.print("번호를 입력하세요 >> ");
				input = sc.nextInt();

				switch(input) {
				
				case 1 : selectStudent(); break;
				case 2 : selectByCategory(); break;
				case 3 : addStudent(); break;
				case 4 : deleteStudent(); break;
				case 5 : setStudent(); break;
				case 0 : System.out.println("\n====== 프로그램을 종료합니다 ======\n"); break;
				default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
					
				}
				
			}while(input != 0);

		}catch(InputMismatchException e) {
			System.out.println("\n잘못 입력하셨습니다. 다시 입력해주세요\n");
			sc.nextLine();
			displayMenu();
		}
	}
	
	/**
	 * 전체 학생 조회 메서드 
	 */
	public void selectStudent() {
		System.out.println("\n====== 1. 전체 학생 조회 ======\n");
		
		if(list.size() != 0) {
			for(Student std: list) {
				System.out.println(std.toString());
			}
			System.out.println();
		}else {
			System.out.println("등록된 학생이 없습니다.");
			System.out.println();
		}
	}
	
	/**
	 * 검색으로 학생 조회 메서드
	 */
	public void selectByCategory() throws InputMismatchException  {
		System.out.println("\n====== 2. 검색으로 학생 조회 ======\n");
		System.out.println("1. 학과별 학생 조회");
		System.out.println("2. 이름으로 학생 조회");
		System.out.println("3. 학번으로 학생 조회");
		System.out.println("--------------------");	
		System.out.println("0. 메인 메뉴");
		System.out.println("--------------------");	
		System.out.print("번호 입력 >> ");
		int num = sc.nextInt();
		
		if (num == 1) {	
			boolean var = false;
			
			System.out.println("[1. 국문]\t[2. 중문]\t[3. 고미사]\t[4. 사학]");
			System.out.println("[5. 영문]\t[6. 독문]\t[7. 노문]\t[8. 철학]\t[9. 불문]");
			System.out.println();
			System.out.println("학과 코드를 입력하세요");
			System.out.println("----------------------------");
			System.out.print("번호 입력 >> ");
			int inputCategory = sc.nextInt();
	
			for(Student std : list) {
				if(std.getMajorCode() == inputCategory) {
					System.out.println("\n" + std.toString());
					var = true;
				}
			} 
			if(!var) {
				System.out.println("\n해당하는 학생이 없습니다.");
			}
				

		}else if(num == 2) {
			sc.nextLine();
			boolean var = false;
			System.out.print("\n학생 이름을 입력하세요(전체 혹은 일부) >> ");
			String input = sc.nextLine();

			for(Student std : list) {
				if(std.getName().contains(input)) {
					System.out.print("\n" + std+ "\n");							
					var = true;
				}
			}
			if(!var) {
				System.out.println("\n해당하는 학생이 없습니다.");
			}
			
		} else if(num == 3) {
			boolean var = false;
			sc.nextLine();
			System.out.print("\n학번을 입력하세요(전체 혹은 일부) >> ");
			String input2 = sc.nextLine();

			for(Student std : list) {
				if(String.valueOf(std.getStudentNo()).contains(input2)) {
					System.out.println("\n" + std);
					var = true;
				} 
			}
			if(!var) {
				System.out.println("\n해당하는 학생이 없습니다.");
			}

		} else if(num == 0) {
			System.out.println();
			displayMenu();
			
		}
	}

	/**
	 * 학생 추가 메서드
	 */
	public void addStudent() throws InputMismatchException {
		boolean var = false;
		
		System.out.println("\n====== 3. 학생 정보 추가 ======\n");
		System.out.print("학번(전체) >> ");
		int studentNo = sc.nextInt();
		
		for(Student std : list) {
			if(std.getStudentNo() == studentNo) {
				System.out.println("해당 학번 학생이 이미 존재합니다.");
				var = true;
			}
		}
		if(!var) {

			sc.nextLine();
			System.out.print("이름 >> ");
			String name = sc.nextLine();

			System.out.print("학과코드 >> ");
			int majorCode = sc.nextInt();

			sc.nextLine();
			System.out.print("전공 >> ");
			String major = sc.nextLine();

			System.out.print("입학날짜 >> ");
			String enrollDate = sc.nextLine();

			System.out.print("학적상태 >> ");
			String status = sc.nextLine();

			System.out.print("연락처 >> ");
			String phoneNo = sc.nextLine();

			System.out.print("성별(M/F) >> ");
			char gender = sc.next().charAt(0);

			sc.nextLine();
			System.out.print("주소 >> ");
			String address = sc.nextLine();

			list.add(new Student(studentNo, name, majorCode, major, enrollDate, status, phoneNo, gender, address));
			System.out.println("학생 등록 완료\n");
		}	
	}
	
	/**
	 * 정보 삭제 메서드
	 */
	public void deleteStudent() throws InputMismatchException {
		System.out.println("\n====== 4. 학생 정보 삭제 ======\n");

		System.out.println("1. 이름으로 학생 검색");
		System.out.println("2. 학번으로 학생 검색");
		System.out.println("--------------------");	
		System.out.println("0. 메인 메뉴");
		System.out.println("--------------------");	
		System.out.print("번호 입력 >> ");
		int num = sc.nextInt();

		sc.nextLine();
		if(num == 1) {
			System.out.print("\n학생 이름을 입력하세요(전체 혹은 일부) >> ");
			String input = sc.nextLine();
			
			Iterator<Student> iterator = list.iterator();
			boolean var = false;
			
			 while (iterator.hasNext()) {
			        Student std = iterator.next();
			       
			        if (std.getName().contains(input)) {
			            
			        	System.out.print(std + "\n");
			            System.out.print("해당 학생의 정보 제거를 진행하시겠습니까? (y/n)>> ");
			            char yes = sc.next().toUpperCase().charAt(0);

			            if (yes == 'Y') {
			                iterator.remove(); 
			                System.out.println("\n학생정보 제거가 완료되었습니다.\n"); 
			                var = true;
			            } else {
			                System.out.println("\n학생정보 제거가 완료되지 않았습니다.\n");
			                var = true;
			            }
			        }
			    }
			    if (!var) {
			        System.out.println("\n해당하는 학생이 없습니다.");
			    }
			

		}else if(num == 2) {
			System.out.print("\n학번을 입력하세요(전체 혹은 일부) >> ");
			String input2 = sc.nextLine();
			
			boolean var = false;
			Iterator<Student> iterator = list.iterator(); 

			while (iterator.hasNext()) {
				Student std2 = iterator.next();
				
				if (String.valueOf(std2.getStudentNo()).contains(input2)) {
					
					System.out.println(std2 + "\n");
					System.out.print("제거를 진행하시겠습니까? (y/n)>> ");
					char yes = sc.next().toUpperCase().charAt(0);

					if (yes == 'Y') {
						iterator.remove(); 
						System.out.println("학생정보 제거가 완료되었습니다.");
						var = true;
					} else {
						System.out.println("학생정보 제거가 완료되지 않았습니다.");
						var = true;
					}
					break; 
				}
			}
			if (!var) {
				System.out.println("\n해당하는 학생이 없습니다.");
			}
		} else if(num == 0) {
			displayMenu();

		}

	} 

	/**
	 * 학생 정보 수정 메서드
	 */
	public void setStudent() throws InputMismatchException{
		boolean var = false;
		
		System.out.println("\n====== 5. 학생 정보 수정 ======\n");
				
		System.out.println("정보수정을 원하는 학생의 학번를 입력하세요(전체)\n");
		System.out.print("학번 입력 >>  ");
		int input = sc.nextInt();
		
		for(Student std : list) {
			if(std.getStudentNo() == input) {
				System.out.println(std+ "\n");
				
				System.out.print("수정을 진행하시겠습니까? (y/n)>> ");
				char yes = sc.next().toUpperCase().charAt(0);

				if(yes == 'Y') {
					System.out.println("\n====== 수정 진행 ======\n");
					System.out.println("1. 학번");
					System.out.println("2. 이름");
					System.out.println("3. 학과코드");
					System.out.println("4. 전공명");
					System.out.println("5. 입학날짜");
					System.out.println("6. 학적상태");
					System.out.println("7. 연락처");
					System.out.println("8. 성별");
					System.out.println("9. 주소");
					System.out.println("----------------------------");
					System.out.println("0. 전체 수정");
					
					System.out.print("\n수정을 원하는 항목을 선택하세요. >>  ");
					int input2 = sc.nextInt();
					sc.nextLine();
					
					switch(input2) {
					case 1 : 
					System.out.print("학번 >> ");
					int studentNo = sc.nextInt();
					list.get(list.indexOf(std)).setStudentNo(studentNo); 
					System.out.println("수정이 완료되었습니디.");
					var= true;
					break;
					
					case 2 : 
					System.out.print("이름 >> ");
					String name = sc.nextLine();
					list.get(list.indexOf(std)).setName(name); 
					System.out.println("수정이 완료되었습니디.");
					var= true;
					break;
					
					case 3 : System.out.print("학과코드 >> ");
					int majorCode = sc.nextInt();
					list.get(list.indexOf(std)).setMajorCode(majorCode); 
					System.out.println("수정이 완료되었습니디.");
					var= true;
					break;
					
					case 4 : 
					System.out.print("전공 >> ");
					String major = sc.nextLine();
					list.get(list.indexOf(std)).setMajor(major);
					System.out.println("수정이 완료되었습니디.");
					var= true;
					break;
					
					case 5 : 
					System.out.print("입학날짜 >> ");
					String enrollDate = sc.nextLine();
					list.get(list.indexOf(std)).setEnrollDate(enrollDate);
					System.out.println("수정이 완료되었습니디.");
					var= true;
					break;
					
					case 6 : 
					System.out.print("학적상태 >> ");
					String status = sc.nextLine();
					list.get(list.indexOf(std)).setStatus(status);
					System.out.println("수정이 완료되었습니디.");
					var= true;
					break;
					
					case 7 : 
					System.out.print("연락처 >> ");
					String phoneNo = sc.nextLine();
					list.get(list.indexOf(std)).setPhoneNo(phoneNo);
					System.out.println("수정이 완료되었습니디.");
					var= true;
					break;
					
					case 8 : System.out.print("성별(M/F) >> ");
					char gender = sc.next().charAt(0);
					list.get(list.indexOf(std)).setGender(gender); 
					System.out.println("수정이 완료되었습니디.");
					var= true;
					break;
					
					case 9 : 
					System.out.print("주소 >> ");
					String address = sc.nextLine();
					list.get(list.indexOf(std)).setAddress(address);
					System.out.println("수정이 완료되었습니디.");
					var= true;
					break;
					
					case 0 : 
					System.out.print("학번 >> ");
					int studentNo2 = sc.nextInt();
					list.get(list.indexOf(std)).setStudentNo(studentNo2);
					
					sc.nextLine();
					System.out.print("이름 >> ");
					String name2 = sc.nextLine();
					list.get(list.indexOf(std)).setName(name2);
					
					System.out.print("학과코드 >> ");
					int majorCode2 = sc.nextInt();
					list.get(list.indexOf(std)).setMajorCode(majorCode2);
					
					sc.nextLine();
					System.out.print("전공 >> ");
					String major2 = sc.nextLine();
					list.get(list.indexOf(std)).setMajor(major2);
					
					System.out.print("입학날짜 >> ");
					String enrollDate2 = sc.nextLine();
					list.get(list.indexOf(std)).setEnrollDate(enrollDate2);
					
					System.out.print("학적상태 >> ");
					String status2 = sc.nextLine();
					list.get(list.indexOf(std)).setStatus(status2);
					
					System.out.print("연락처 >> ");
					String phoneNo2 = sc.nextLine();
					list.get(list.indexOf(std)).setPhoneNo(phoneNo2);
					
					System.out.print("성별(M/F) >> ");
					char gender2 = sc.next().charAt(0);
					list.get(list.indexOf(std)).setGender(gender2);
					
					sc.nextLine();
					System.out.print("주소 >> ");
					String address2 = sc.nextLine();
					list.get(list.indexOf(std)).setAddress(address2);
					
					System.out.println("수정이 완료되었습니디.");
					var= true;
						
					}
					
					
				}
			} 
		}

		if(!var) {
			System.out.println("\n해당하는 학생이 없습니다.");
		}
	}
}
