package com.scit.mybatis2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.scit.mybatis2.bean.Classes;
import com.scit.mybatis2.bean.Course;
import com.scit.mybatis2.bean.Stu;

public interface StuMapper {
	public Stu getStu(@Param("id")Integer id);
	
	public List<Classes> getClassList(); 
	
	public Integer getStuCount();
	
	public void addStu(@Param("s")Stu stu);
	
	public List<Stu> getCourse();
	
	public List<Course> getStuByCourse();
	
	public List<Stu> getStuByName(@Param("s")Stu stu);
}
