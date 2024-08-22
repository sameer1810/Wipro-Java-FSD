package com.sam.elearning.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sam.elearning.entity.Course;
import com.sam.elearning.repository.CourseRepository;

@RestController
@RequestMapping("/api")
public class CourseController {

	@Autowired
	CourseRepository courseRepository;
	
	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getAllCourses(@RequestParam(required = false) String title){
		
		List<Course> courses = new ArrayList<>();
		
		
		if(title==null) {
			courseRepository.findAll().forEach(courses::add);
		}
		else {
			courseRepository.findByTitleContaining(title).forEach(courses::add);
		}
		
		if(courses.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(courses,HttpStatus.OK);
	}
	
	@GetMapping("/courses/launched")
	public ResponseEntity<List<Course>> getLaunchedCourses(){
		
		List<Course> courses = courseRepository.findByLaunched(true);
		
		if(courses.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(courses,HttpStatus.OK);
	}
	
	
	@GetMapping("/courses/{id}")
	public ResponseEntity<Course> getCourseById(@PathVariable("id") long id) throws Exception{
		
		Course course = courseRepository.findById(id)
				.orElseThrow(()-> new Exception("Not Found course with ID: "+ id));
		
		return new ResponseEntity<>(course,HttpStatus.OK);
	}
	
	@PostMapping("/courses")
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        
            Course newCourse = courseRepository.save(new Course(course.getTitle(), course.getDescription(), true));
            return new ResponseEntity<>(newCourse, HttpStatus.CREATED);
        
	}
	
	@PutMapping("/courses/{id}")
	public ResponseEntity<Course> updateCourse(@PathVariable("id") long id, @RequestBody Course course) throws Exception {
		Course courseToUpdate = courseRepository.findById(id)
				.orElseThrow(() -> new Exception("Not found course with id : " + id));
		
		courseToUpdate.setTitle(course.getTitle());
		courseToUpdate.setDescription(course.getDescription());
		courseToUpdate.setLaunched(course.isLaunched());
		
		return new ResponseEntity<>(courseRepository.save(courseToUpdate),HttpStatus.OK);
	}
	

	@DeleteMapping("courses/{id}")
	public ResponseEntity<Course>  deleteCourse(@PathVariable("id") long id){
		
		courseRepository.deleteById(id);
	
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("courses/{id}")
	public ResponseEntity<HttpStatus>  deleteCourse(){
		
		courseRepository.deleteAll();
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
