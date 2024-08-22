package com.sam.springjdbc_prj_09aug;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDao {

	// to initialize a database connection
		public void setDataSource(DataSource ds);
		
		// to create a student record in the student table
		public void create (String name, Integer age);
		
		// to list all the students from the student table
		public List<Student> listStudents();
		
		// to list a student based on id
		public Student getStudent(Integer id);
		
		//to update the age of a student
		public void update(Integer id, Integer age);
		
		// to delete a student based on id
		public void delete(Integer id);

	}

