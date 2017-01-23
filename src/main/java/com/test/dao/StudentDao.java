package com.test.dao;

import java.util.Collection;

import com.test.model.Student;

public interface StudentDao
{

	/**
	 * 
	 * @return
	 */
	public Collection<Student> getAllStudents();

	/**
	 * 
	 * @param id
	 *            id
	 * @return test
	 */
	// public Student getStudentsById(int id);

	/**
	 * 
	 * @param id
	 */
	public void deleteStudentsById(Long id);

	/**
	 * 
	 * @param student
	 */
	public void updateStudent(Student student);

	public Student getStudentsById(Long id);

	public void insertStudent(Student student);

}