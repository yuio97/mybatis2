package com.scit.mybatis2.bean;

import java.util.List;

public class Classes {
	private Integer classId;
	private String className;
	private String classInfo;
	private Teacher teacher;
	private List<Stu> stus ;
	public Classes() {
		super();
	}
	public Classes(Integer classId, String className, String classInfo, Teacher teacher) {
		super();
		this.classId = classId;
		this.className = className;
		this.classInfo = classInfo;
		this.teacher = teacher;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassInfo() {
		return classInfo;
	}
	public void setClassInfo(String classInfo) {
		this.classInfo = classInfo;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public List<Stu> getStus() {
		return stus;
	}
	public void setStus(List<Stu> stus) {
		this.stus = stus;
	}

	
	
}
