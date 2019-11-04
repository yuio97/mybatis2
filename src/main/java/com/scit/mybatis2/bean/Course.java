package com.scit.mybatis2.bean;

import java.util.List;

public class Course {
	private Integer id;
	private String name;
	private List<Stu> stu;
	public Course() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Stu> getStu() {
		return stu;
	}
	public void setStu(List<Stu> stu) {
		this.stu = stu;
	}
	
	
}
