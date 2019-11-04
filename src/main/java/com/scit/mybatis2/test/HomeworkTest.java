package com.scit.mybatis2.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.scit.mybatis2.bean.Course;
import com.scit.mybatis2.bean.Stu;
import com.scit.mybatis2.mapper.StuMapper;

public class HomeworkTest {
	public static void main(String[] args) throws IOException {
		Reader reader = Resources.getResourceAsReader("config.xml");
		
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		
		SqlSession session = sessionFactory.openSession();
		
		StuMapper stuMapper = session.getMapper(StuMapper.class);
		
//		List<Stu> course = stuMapper.getCourse();
//		
//		for (Stu s : course) {
//			System.out.println(s.getCourse().size());
//		}
		
//		List<Course> stuByCourse = stuMapper.getStuByCourse();
//		for (Course c : stuByCourse) {
//			System.out.println(c.getStu().size());
//		}
		
		Stu stu = new Stu();
		stu.setStuName("a");
		stuMapper.getStuByName(stu);
		
		session.commit();
		session.close();
	}
}
