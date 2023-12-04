package edu.kh.oop.method.model.vo;

public class Member {

	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	
	
	public Member() {} // 기본 생성자 : 반환형 X , 클래스와 이름 같아야함
	
	public Member(String memberId, String memberPw,	
			String memberName, int memberAge) { // 매개변수 생성자

		// 매개변수로 값 전달 -> 필드로 대입
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		//alt + shift + s -> (o)constructor using 어쩌구
	}
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
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
	// alt + shift + s -> r
}
