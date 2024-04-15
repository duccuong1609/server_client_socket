/*
 * @ (#) Main.java	1.0	Apr 1, 2024
 * 
 * Copyright (c) 2024 IUH. All rights reserved.
 */
package test;

import java.util.List;

import dao.CourseDao;
import dao.StudentDAO;
import dao.impl.CourseImpl;
import dao.impl.StudentImpl;
import entity.Course;

public class Main {

	public static void main(String[] args) {
//		Persistence.createEntityManagerFactory("jpa-mssql");
		
		CourseDao courseDao = new CourseImpl();
		StudentDAO studentDAO = new StudentImpl();
		
//		List<Course> courses = courseDao.findCoursesByTitle("po");
//		courses.forEach(x -> System.out.println(x));
//		
//		Course course = courseDao.findCoursesByTitle2("Composition");
//		System.out.println(course);
		
		studentDAO.listStudentsEnrolledInCourse("po")
		    .forEach(x -> System.out.println(x));
				
	}
}
