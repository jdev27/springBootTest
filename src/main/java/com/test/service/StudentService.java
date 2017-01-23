package com.test.service;

import java.util.Collection;

import com.test.model.Student;

public interface StudentService
{

	public abstract Collection<Student> getAllStudents();

	public abstract Student getStudentsById(Long id);

	public abstract void deleteStudentsById(Long id);

	public abstract void updateStudent(Student student);

	public abstract void insertStudent(Student student);

}