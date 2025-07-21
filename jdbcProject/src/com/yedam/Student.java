package com.yedam;
// 속성 -> 필드
// 기능 -> 메소드
// 속성 : 학생번호, 이름, 연락처, 혈액형
public class Student {
	private int stdNo; // std_no, std-no
	private String stdName;
	private String phone;
	private String bloodType;
	//생성자.
	public Student() {
		//기본생성자.
	}
	public Student(int stdNo, String stdName, String phone, String bloodType) {
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.phone = phone;
		this.bloodType = bloodType;
		
	}
	//메소드(getter,setter)
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo; 
	} //end of setStdNo.
	public int getStdNo() {
		return stdNo;
	} //
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdName() {
		return stdName;
	}//
	public void setPhone(String phone) {
		this.phone = phone;	
	}
	public String getPhone() {
		return phone;
	}//
	public void setbloodType(String bloodType) {
		this.bloodType = bloodType;	
	}
	public String getbloodtype() {
		return bloodType;
	}//
}
