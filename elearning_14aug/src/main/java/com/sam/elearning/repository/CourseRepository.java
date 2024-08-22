package com.sam.elearning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.elearning.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

	List<Course> findByLaunched(boolean launched);
	
	List<Course> findByTitleContaining(String title);
	
}
