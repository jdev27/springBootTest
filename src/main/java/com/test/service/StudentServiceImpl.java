/**
 * 
 */
package com.test.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.test.dao.StudentDao;
import com.test.model.Student;

/**
 * @author jeruortiz
 *
 */
@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	@Qualifier("studentDao")
	private StudentDao studentDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.test.service.StudentService#getAllStudents()
	 */
	@Override
	public Collection<Student> getAllStudents()
	{
		return studentDao.getAllStudents();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.test.service.StudentService#getStudentsById(int)
	 */
	@Override
	public Student getStudentsById(Long id)
	{
		return studentDao.getStudentsById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.test.service.StudentService#deleteStudentsById(int)
	 */
	@Override
	public void deleteStudentsById(Long id)
	{
		studentDao.deleteStudentsById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.test.service.StudentService#updateStudent(com.test.model.Student)
	 */
	@Override
	public void updateStudent(Student student)
	{
		studentDao.updateStudent(student);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.test.service.StudentService#insertStudent(com.test.model.Student)
	 */
	@Override
	public void insertStudent(Student student)
	{
		studentDao.updateStudent(student);
	}

}
