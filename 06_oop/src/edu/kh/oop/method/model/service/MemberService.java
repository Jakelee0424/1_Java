package edu.kh.oop.method.model.service;

import java.util.Scanner;
import edu.kh.oop.method.model.vo.Member;

public class MemberService {

//필드
	private Scanner sc = new Scanner(System.in);
	
	private Member memberInfo = null; // 가입한 회원의 정보 저장 변수
	private Member logInMember = null; // 로그인한 회원의 정보 저장 변수	
	
//기능(생성자 + 메서드)
	
	// 메뉴화면 출력 기능 메서드
	public void displayMenu() {
		
		int menuNum = 0; // 메뉴 선택용 변수
		
		do {
			
			System.out.println("\n======회원 정보 관리 프로그램=====");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
		
			System.out.print("메뉴 입력 = ");
			menuNum = sc.nextInt();
			sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거용
			
			 switch(menuNum) {
			 
			 case 1 : System.out.println(signUp()); break;
			 case 2 : System.out.println(logIn()); break;
			 case 3 : System.out.println(selectMember()); break;
			 case 4 :  
				 
				 int result = updateMember();
				 if(result == -1) {
					 System.out.println("로그인 후 이용해주세요");
				 }else if(result == 0) {
					 System.out.println("비밀번호 불일치");
				 }else {
					 System.out.println("회원 정보가 수정되었습니다.");
				 }
				 break;
			 
			 case 0 : System.out.println("프로그램 종료"); break;
			 default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			
			 }
			
		}while(menuNum != 0);
	}
	
	// 회원가입 기능 메서드
	public String signUp() {
		// 해당 메소드가 끝나고 호출한 곳으로 갈때 
		// String 자료형을 가지고 돌아간다.
		// 반환형이 void가 아닌데 return 없으면 에러
		
		System.out.println("\n**** 회원 가입 *****");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		System.out.print("비밀번호 확인 : ");
		String memberPw2 = sc.next();
		
		System.out.print("이름 : ");
		String memberName = sc.next();

		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		
		// 비밀번호, 비밀번호 확인이 일치하면 회원가입 
		// 일치하지 않으면 회원가입 실패
		 
		if(memberPw.equals(memberPw2)) {
		// 비밀번호 일치 시 멤버객체 생성
		// 생성된 객체의 주소를 필드에 저장
			
			memberInfo = new Member(memberId, memberPw, memberName, memberAge);
			
			return "회원가입 성공\n";
			// 출력 구문 메소드를 호출한 곳에서 한 번만 쓰고, return으로 전달 값 작성
			// return -> 현재 메소드를 종료하고, 호출한 곳으로 돌아감
			// return 값; -> 호출한 곳으로 값을 가지고 돌아감
			// return 아래 코드 작성 불가
			
		} else {		
			return "회원가입 실패 : 비밀번호 불일치 \n ";
		}
		
	}
	
	// 로그인 기능 메서드
	public String logIn() {
		System.out.println("\n****** 로그인 ******");
		
		// 회원가입을 했는지부터 확인 -> memberInfo가 객체를 참조하고 있는지부터 확인
		
		if(memberInfo == null) { // 회원가입 안 한 경우
			return "회원가입을 먼저 진행해주세요";
		} 
		
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		// 회원 가입 정보(memberInfo가 참조하는 member객체)에
		// 저장된 아이디, 비밀번호가 같은지 먼저 확인 후
		// 같으면 "로그인 성공", 아니면 "일치하지 않습니다"
		
		if(memberId.equals(memberInfo.getMemberId()) && memberPw.equals(memberInfo.getMemberPw())) {
			
			logInMember = memberInfo; // 얕은 복사 
			//회원가입 정보를 logInMember에 대입하여 어떤 회원이 로그인 했는지 구분함		
			return logInMember.getMemberName() + " 님 환영합니다.\n";
			
		} else {
			return "아이디 또는 비밀번호가 일치하지 않습니다.\n";
			
		}
		
		
		
	}
	
	// 회원 정보 조회 기능 메서드
	public String selectMember() {
		
		System.out.println("\n****** 회원 정보 조회 ******");
		
		if(logInMember == null) {
			return "로그인 후 이용해주세요\n";
		}else{
			// return "이름 : "+ memberInfo.getMemberName() + "\n아이디 : " 
			//	+ memberInfo.getMemberId() + "\n나이 : " + memberInfo.getMemberAge()+ "\n";
			 
			String str = "이름 : " + logInMember.getMemberName();
			str += "\n아이디 : " + logInMember.getMemberId();
			str += "\n나이 : " + logInMember.getMemberAge();
			return str;
		}
	}

	// 회원 정보 수정 기능 메서드
	public int updateMember() {
		System.out.println("\n *********회원 정보 수정**********");
				
		if(logInMember == null) {
			return -1;
		}
		System.out.print("수정할 이름 입력 = \n");
		String newName = sc.next();

		System.out.print("수정할 나이 입력 = \n");
		int newAge = sc.nextInt();

		System.out.print("비밀번호 입력 = \n");
		String pass = sc.next();

		if(pass.equals(logInMember.getMemberPw())) {
			memberInfo.setMemberName(newName);
			memberInfo.setMemberAge(newAge);
			return 1;
		}else {
			return 0;
		}

	}


}
