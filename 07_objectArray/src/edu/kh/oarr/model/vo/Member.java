package edu.kh.oarr.model.vo;

public class Member {

//필드(==멤버 변수)
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region;
	
//생성자 = [접근제한자] 생성자명(==클래스명 동일)(){}
	public Member() {}

	public Member(String memberId, String memberPw, String memberName, int memberAge, String region) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
	}

//메서드
// getter/setter - > 필드에 간접 접근	
	
	public String getMemberId() { // 매개변수 X -> this 참조 변수 불필요 
		return memberId;
	}
	public void setMemberId(String memberId) { // 전달받아온 값이 매개변수, 반환값 없으니까 void
		this.memberId = memberId; // 모든 메서드는 종료시 호출한 곳으로 돌아가는 return 작성
	}							  // 반환값이 없는 경우(void) 컴파일러가 자동 추가	
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	} 
	
	
}
