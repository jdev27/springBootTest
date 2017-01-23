/**
 * 
 */
package com.test.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author jeruortiz
 *
 */
@Entity
@Table(name = "student")
public class Student implements Serializable
{

	private static final long serialVersionUID = -3571131912446766969L;

	@Id
	// @GenericGenerator(strategy = "sequence", name = "sequence")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// @GeneratedValue
	private Long id;

	@NotNull
	private String name;
	private String course;

	/**
	 * @param id
	 * @param name
	 * @param course
	 */
	public Student(Long id, String name, String course)
	{
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public Student()
	{
	}

	/**
	 * @return the id
	 */
	public Long getId()
	{
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id)
	{
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the course
	 */
	public String getCourse()
	{
		return course;
	}

	/**
	 * @param course
	 *            the course to set
	 */
	public void setCourse(String course)
	{
		this.course = course;
	}

}
