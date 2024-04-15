package dao;

import java.util.List;

import entity.Course;

public interface CourseDao {
	
	public boolean add(Course course);
	public boolean update(Course course);
	public boolean delete(int id);
	public Course findByID(int id);
	public List<Course> findAll();
	public List<Course> findCoursesByTitle(String title); // Tim tuong doi
	public Course findCoursesByTitle2(String title); // Tim tuyet doi
	
	
	
}
