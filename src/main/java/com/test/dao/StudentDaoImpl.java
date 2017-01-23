/**
 * 
 */
package com.test.dao;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.model.Student;

/**
 * @author jeruortiz
 *
 */
@Repository
@Transactional
@Qualifier("studentDao")
public class StudentDaoImpl implements StudentDao
{
	@PersistenceContext
	private EntityManager manager;

	@Override
	public Collection<Student> getAllStudents()
	{
		Collection<Student> students = manager.createQuery(
				"Select s From Student s", Student.class)
				.getResultList();
		return students;
	}

	@Override
	public Student getStudentsById(Long id)
	{
		return manager.find(Student.class, id);
	}

	@Override
	public void deleteStudentsById(Long id)
	{
		Student student = getStudentsById(id);
		if (student != null)
		{
			manager.remove(student);
		}
	}

	@Override
	public void updateStudent(Student student)
	{
		manager.merge(student);
	}

	@Override
	public void insertStudent(Student student)
	{
		manager.persist(student);
	}

}
