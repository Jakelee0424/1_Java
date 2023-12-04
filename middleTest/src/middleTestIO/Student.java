package middleTestIO;

public class Student {

	private int studentNo;
	private String name;
	private int majorCode;
	private String major;
	private String enrollDate;
	private String status;
	private String phoneNo;
	private char gender;
	private String address;
	
	public Student() {}

	public Student(int studentNo, String name, int majorCode, String major, String enrollDate, String status,
			String phoneNo, char gender, String address) {
		super();
		this.studentNo = studentNo;
		this.name = name;
		this.majorCode = majorCode;
		this.major = major;
		this.enrollDate = enrollDate;
		this.status = status;
		this.phoneNo = phoneNo;
		this.gender = gender;
		this.address = address;
	}

	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMajorCode() {
		return majorCode;
	}
	public void setMajorCode(int majorCode) {
		this.majorCode = majorCode;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "[학번 : " + studentNo + "], [이름 :" + name + "], [학과코드 : " + majorCode + "], [전공 : " + major
				+ "], [입학날짜 : " + enrollDate + "], [학적상태 :" + status + "], [연락처 : " + phoneNo + "], [성별 : " + gender
				+ "], [주소 : " + address + "]";
	}
	
	

	

	
	
}
