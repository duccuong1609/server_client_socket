package dao.impl;

import java.util.List;

import dao.StudentDAO;
import entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class StudentImpl implements StudentDAO {

	private EntityManager em;

	public StudentImpl() {
		em = Persistence.createEntityManagerFactory("jpa-mssql").createEntityManager();
	}

	@Override
	public List<Student> listStudentsEnrolledInCourse(String title) {
		return em.createNamedQuery("Student.findStudentsEnrolledCourse", Student.class)
				.setParameter("title", "%"+title+"%")
				.getResultList();
	}

	@Override
	public List<Student> listStudentsEnrolledInYear(int year) {
		return em.createNamedQuery("Student.findStudentsEnrolledInYear", Student.class)
				.setParameter("year", year)
				.getResultList();
	}

}
