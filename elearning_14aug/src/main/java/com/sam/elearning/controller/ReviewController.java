package com.sam.elearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sam.elearning.entity.Review;
import com.sam.elearning.repository.CourseRepository;
import com.sam.elearning.repository.ReviewRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@Controller
@RequestMapping("/api")
public class ReviewController {
	
	private static final Long id = null;

	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	ReviewRepository reviewRepository;

	@GetMapping("/courses/{courseId}/reviews")
	public ResponseEntity<List<Review>> getAllReviewsByCourseId(@PathVariable(value="courseId") long courseId) throws Exception{
		
		if(!courseRepository.existsById(courseId))
			throw new Exception("Not found course with id " + courseId);
		
		List<Review> reviews = reviewRepository.findByCourseId(courseId);
		return new ResponseEntity<>(reviews,HttpStatus.OK);
		
	}
	
	@GetMapping("/reviews/{id}")
	public ResponseEntity<Review> getReviewsByCourseId(@PathVariable(value="id") long id) throws Exception{
		
		Review review = reviewRepository.findById(id)
				.orElseThrow(() -> new Exception("Not found review with id " + id));
		
		return new ResponseEntity<>(review,HttpStatus.OK);
	}
	
	@PostMapping("/courses/{courseId}/review")
	public ResponseEntity<Review> createReview(@PathVariable(value="courseId") long courseId, @RequestBody Review courseReview) throws Exception{

		Review review = courseRepository.findById(courseId).map(course -> {
			courseReview.setCourse(course);
			return reviewRepository.save(courseReview);
		}).orElseThrow(() -> new Exception("Not found course with Id " + courseId));
		return new ResponseEntity<>(courseReview,HttpStatus.CREATED);
	}
	
	@PutMapping("/review/{id}")
	public ResponseEntity<Review> updateReview(@PathVariable(value="id") long id, @RequestBody Review courseReview) throws Exception{
	
		Review review = reviewRepository.findById(id)
				.orElseThrow(() -> new Exception("Not found review with Id " + id));
		review.setContent(courseReview.getContent());
		return new ResponseEntity<>(reviewRepository.save(review),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/review/{id}")
	public ResponseEntity<Review> deleteReview(@PathVariable(value="id") long id){
	
		reviewRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/course/{courseId}/reviews")
	public ResponseEntity<Review> deleteAllReview(@PathVariable(value="id") long courseId) throws Exception{
	
		if(!courseRepository.existsById(courseId)) {
			throw new Exception("Not found review with Id " + courseId);
		}
		reviewRepository.deleteByCourseId(courseId);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
