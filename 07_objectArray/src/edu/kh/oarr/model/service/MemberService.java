package edu.kh.oarr.model.service;

import java.util.Scanner;
import edu.kh.oarr.model.vo.Member;

public class MemberService {
//필드
		private Scanner sc = new Scanner(System.in);
		
		private Member[] memberArr = new Member[5]; //member 5칸짜리 객체배열 선언 및 할당
		private Member logInMember; // 로그인한 회원의 정보 저장 변수	
		
		public MemberService() {
			memberArr[0] = new Member("user01", "pass01", "홍길동", 30, "서울");
			memberArr[1] = new Member("user02", "pass02", "게보린", 25, "경기");
			memberArr[2] = new Member("user03", "pass03", "고길동", 40, "강원");
		  //memberArr[3] = null 
		}
		
//기능(생성자 + 메서드)
		
		// 메뉴화면 출력 기능 메서드
		public void displayMenu() {
			
			int menuNum = 0; // 메뉴 선택용 변수
			
			do {
				
				System.out.println("\n====== 회원 정보 관리 프로그램 vo.2 =====");
				System.out.println("1. 회원 가입");
				System.out.println("2. 로그인");
				System.out.println("3. 회원 정보 조회");
				System.out.println("4. 회원 정보 수정");
				System.out.println("5. 회원 검색(지역)");
				System.out.println();
				System.out.println("9. 로그아웃");				
				System.out.println("0. 프로그램 종료");
				System.out.println();
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
					 
				 case 5 : searchRegion(); break;
				 case 9 : System.out.println(logOut()); break;
				 case 0 : System.out.println("프로그램 종료"); break;
				 default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				
				 }
				
			}while(menuNum != 0);
		}

		// memberArr에 비어있는 인덱스 번호 반환
		// 비어있는 인덱스가 없다면 -1 반환
		public int emptyIndex() {
			
			for(int i = 0 ; i < memberArr.length ; i++ ) {
				if (memberArr[i] == null) {
					return i;
				}
			}
			return -1; // for문에서 return 되지 않음 == 배열에 빈칸이 없다.
		}

		// 회원가입 기능 메서드
		public String signUp() {
			
			System.out.println("\n********* 회원 가입 *********");
			
			// 객체배열 memberArr에 가입한 회원정보 저장
			// 저장할 공간이 있는지 먼저 확인 -> 빈 공간의 인덱스 번호를 얻어오기 --> 새로운 매서드(emptyIndex)
			int index = emptyIndex();//비어있는 index번호 가져옴
				
			if(index == -1) { // 비어있는 인덱스가 없음 -> 회원가입 불가
				return "회원가입이 불가능 합니다(인원 수 초과)";
			} else {
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
			
			System.out.print("지역 : ");
			String region = sc.next();
				// 비밀번호, 비밀번호 확인이 일치하면 회원가입 
				// 일치하지 않으면 회원가입 실패
			 
				if(memberPw.equals(memberPw2)) {
					// 비밀번호 일치 시 멤버객체 생성
					// 생성된 객체의 주소를 필드에 저장
					
					memberArr[index] = new Member(memberId, memberPw, memberName, memberAge, region);
					
					return "\n 회원가입 성공 \n";
				// 출력 구문 메소드를 호출한 곳에서 한 번만 쓰고, return으로 전달 값 작성
				// return -> 현재 메소드를 종료하고, 호출한 곳으로 돌아감
				// return 값; -> 호출한 곳으로 값을 가지고 돌아감
				// return 아래 코드 작성 불가
				
				} else {		
					return "회원가입 실패 : 비밀번호 불일치 \n ";
				}
			}
		}
		
		// 로그인 기능 메서드
		public String logIn() {
			System.out.println("\n****** 로그인 ******");
		
			System.out.print("아이디 : ");
			String memberId = sc.next();
			
			System.out.print("비밀번호 : ");
			String memberPw = sc.next();
			
			// 저장된 아이디, 비밀번호가 같은지 먼저 확인 후
			// 같으면 "로그인 성공", 아니면 "일치하지 않습니다"
			
			for(int i = 0 ; i < memberArr.length ; i++) {

				if(memberArr[i].getMemberId().equals(memberId) && memberArr[i].getMemberPw().equals(memberPw)) {
					logInMember = memberArr[i];
					break;
				} 
			}
			if(logInMember == null) { 
				return "아이디 또는 비밀번호가 일치하지 않습니다.\n";
			}else {
				return logInMember.getMemberName() + " 님 환영합니다.\n";	
			}
		}	
		
		// 로그아웃
		public String logOut() {
			logInMember = null;
			return "\n****** 로그아웃 ******";
		} 
		
		// 회원 정보 조회 기능 메서드
		public String selectMember() {
			
			System.out.println("\n****** 회원 정보 조회 ******");
			if(logInMember == null) {
					return "로그인 후 이용해주세요\n";
				}
				// return "이름 : "+ memberInfo.getMemberName() + "\n아이디 : " 
				//	+ memberInfo.getMemberId() + "\n나이 : " + memberInfo.getMemberAge()+ "\n";
				 
				String str = "이름 : " + logInMember.getMemberName();
				str += "\n아이디 : " + logInMember.getMemberId();
				str += "\n나이 : " + logInMember.getMemberAge();
				str += "\n지역 : " + logInMember.getRegion();
				return str;
			
		
	}
		
		// 회원 정보 수정 기능 메서드
		public int updateMember() {
			System.out.println("\n *********회원 정보 수정**********");  
					
			if(logInMember == null) {
				return -1;
			}
			System.out.print("수정할 이름 입력 = ");
			String newName = sc.next();

			System.out.print("수정할 나이 입력 = ");
			int newAge = sc.nextInt();
			
			System.out.print("수정할 지역 입력 = ");
			String newRegion = sc.next();
			
			System.out.print("비밀번호 입력 = ");
			String pass = sc.next();

			if(pass.equals(logInMember.getMemberPw())) {
				logInMember.setMemberName(newName);
				logInMember.setMemberAge(newAge);
				logInMember.setRegion(newRegion);
				
				return 1;
			}else {
				return 0;
			}

		}

		// 회원 검색(지역) 메서드
		private void searchRegion() {
			System.out.println("\n *********회원 검색(지역)**********");  

			System.out.print("검색할 지역을 입력하세요 : ");
			String inputRegion = sc.next();

			boolean flag = true; // 검색 결과 신호용 변수

			for(int i = 0 ; i < memberArr.length ; i ++) {
				if(memberArr[i] == null) {
					break;
				} 
				if(memberArr[i].getRegion().equals(inputRegion)) {
					System.out.println("아이디 : " + memberArr[i].getMemberId());
					System.out.print("비밀번호 : " + memberArr[i].getMemberPw() + "\n");
					flag = false;
				}

			}

			if(flag == true) {
				System.out.println("일치하는 검색 결과가 없습니다.");
			}

		}
}
