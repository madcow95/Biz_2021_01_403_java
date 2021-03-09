package com.callor.student.VO;

public class StudentVO {
	
	String stuName;
	String major;
	String addr;
	String phone;
	
	int stuNum;
	int grade;
	int ban;
	
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentVO(String stuName, String major, String addr, String phone, int stuNum, int grade, int ban) {
		super();
		this.stuName = stuName;
		this.major = major;
		this.addr = addr;
		this.phone = phone;
		this.stuNum = stuNum;
		this.grade = grade;
		this.ban = ban;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	@Override
	public String toString() {
		return "StudentVO [stuName=" + stuName + ", major=" + major + ", addr=" + addr + ", phone=" + phone
				+ ", stuNum=" + stuNum + ", grade=" + grade + ", ban=" + ban + "]" + "\n";
	}
	
	

}
