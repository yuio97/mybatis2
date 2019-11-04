package com.scit.mybatis2.bean;

import java.util.List;

public class Stu {
	private String stuId;
	private String stuName;
	private Classes classes;
	private List<Course> course;
	
	
	public Stu() {
		super();
	}


	
	public Stu(String stuId, String stuName, Classes classes, List<Course> course) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.classes = classes;
		this.course = course;
	}



	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}


	
	
}
