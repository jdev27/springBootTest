/**
 * 
 */
package com.test.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Student;
import com.test.service.StudentService;

/**
 * @author jeruortiz
 *
 */
@RestController
@RequestMapping("/students")
public class StudentController
{
	@Autowired
	private StudentService studentService;

	@RequestMapping(method = GET)
	public Collection<Student> getAllStudents()
	{
		return studentService.getAllStudents();
	}

	@RequestMapping(value = "/{id}", method = GET)
	public Student getStudentsById(@PathVariable Long id)
	{
		return studentService.getStudentsById(id);
	}

	@RequestMapping(value = "/{id}", method = DELETE)
	public void deleteStudentsById(@PathVariable Long id)
	{
		studentService.deleteStudentsById(id);
		System.out.println("id: {id} Deleted " + id);
	}

	@RequestMapping(method = PUT, consumes = APPLICATION_JSON_VALUE)
	public String UpdateStudents(
			@RequestBody Student student)
	{
		studentService.updateStudent(student);
		return "Updated";
	}
	@RequestMapping(method = POST, consumes = APPLICATION_JSON_VALUE)
	public String insertStudents(
			@RequestBody Student student)
	{
		studentService.insertStudent(student);
		return "inserted";
	}
}
