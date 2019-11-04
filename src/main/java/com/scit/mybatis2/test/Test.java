package com.scit.mybatis2.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.scit.mybatis2.bean.Classes;
import com.scit.mybatis2.bean.Employee;
import com.scit.mybatis2.bean.Stu;
import com.scit.mybatis2.mapper.EmployeeMapper;
import com.scit.mybatis2.mapper.StuMapper;

public class Test {
	public static void main(String[] args) throws IOException {
		Reader reader = Resources.getResourceAsReader("config.xml");
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		
		SqlSession session = sqlSessionFactory.openSession();
		
		StuMapper stuMapper = session.getMapper(StuMapper.class);
//		Stu selectStuById = stu.getStu(1);
//		
//		System.out.println(selectStuById.getStuName());
//		
//		List<Classes> classList = stu.getClassList();
//		for (Classes c : classList) {
//			System.out.println(c.getStus().size());
//		}
//		System.out.println(stu.getStuCount());
		
//		Stu stu = new Stu();
//		stu.setStuName("嗡嗡嗡");
//		Classes classes = new Classes();
//		classes.setClassId(1);
//		stu.setClasses(classes);
//		
//		stuMapper.addStu(stu);
//		//获取主键值
//		System.out.println(stu.getStuId());
		
		
		EmployeeMapper emMapper = session.getMapper(EmployeeMapper.class);
		List<Employee> all = emMapper.getAll();
		System.out.println(all);
		session.commit();
		session.close();
	}
}
