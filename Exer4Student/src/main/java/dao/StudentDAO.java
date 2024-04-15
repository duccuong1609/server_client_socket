package dao;

import java.util.List;

import entity.Student;

public interface StudentDAO {
	public List<Student> listStudentsEnrolledInCourse(String title);
	public List<Student> listStudentsEnrolledInYear(int year);
}
