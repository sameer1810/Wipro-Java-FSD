package com.sam.elearning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.elearning.entity.Review;

import jakarta.transaction.Transactional;

public interface ReviewRepository extends JpaRepository<Review, Long> {

	List<Review> findByCourseId(Long courseId);
	
	@Transactional
	void deleteByCourseId(long courseId);
	
	
}
