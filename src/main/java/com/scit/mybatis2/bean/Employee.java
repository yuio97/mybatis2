package com.scit.mybatis2.bean;

import java.util.List;



public class Employee {
	
	private Integer employeeId;
	private String employeeName;
	private String employeeDesc;
	private List<Project> projects;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDesc() {
		return employeeDesc;
	}
	public void setEmployeeDesc(String employeeDesc) {
		this.employeeDesc = employeeDesc;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
	
}
