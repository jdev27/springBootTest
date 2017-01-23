/**
 * 
 */
package com.test.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.test.model.Student;

/**
 * @author jeruortiz
 *
 */
@Repository
@Qualifier("fakeStudentDao")
public class FakeStudentDaoImpl implements StudentDao
{

	private static Map<Long, Student> students;

	static
	{
		students = new HashMap<Long, Student>()
		{
			/**
			 * 
			 */
			private static final long serialVersionUID = 1996666255675347081L;

			{
				put(1L, new Student(1L, "name1", "course1"));
				put(2L, new Student(2L, "name2", "course2"));
				put(3L, new Student(3L, "name3", "course3"));
			}
		};
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.test.dao.StudentDao#getAllStudents()
	 */
	@Override
	public Collection<Student> getAllStudents()
	{
		return students.values();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.test.dao.StudentDao#getStudentsById(int)
	 */
	@Override
	public Student getStudentsById(Long id)
	{
		return students.get(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.test.dao.StudentDao#deleteStudentsById(int)
	 */
	@Override
	public void deleteStudentsById(Long id)
	{
		students.remove(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.test.dao.StudentDao#updateStudent(com.test.model.Student)
	 */
	@Override
	public void updateStudent(Student student)
	{
		Long id = student.getId();
		Student s = students.get(id);
		if (s != null)
		{
			students.put(id, student);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.test.dao.StudentDao#insertStudent(com.test.model.Student)
	 */
	@Override
	public void insertStudent(Student student)
	{
		Long id = student.getId();
		Student s = students.get(id);
		if (s == null)
		{
			students.put(id, student);
		}
	}

}
