package com.scit.mybatis2.bean;

public class Teacher {
	private String teacherId;
	private String teacherName;
	private String teacherNumber;
	private String teacherAge;
	
	
	public Teacher() {
		super();
	}


	public Teacher(String teacherId, String teacherName, String teacherNumber, String teacherAge) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherNumber = teacherNumber;
		this.teacherAge = teacherAge;
	}


	public String getTeacherId() {
		return teacherId;
	}


	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}


	public String getTeacherName() {
		return teacherName;
	}


	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}


	public String getTeacherNumber() {
		return teacherNumber;
	}


	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}


	public String getTeacherAge() {
		return teacherAge;
	}


	public void setTeacherAge(String teacherAge) {
		this.teacherAge = teacherAge;
	}
	
	
	
}
