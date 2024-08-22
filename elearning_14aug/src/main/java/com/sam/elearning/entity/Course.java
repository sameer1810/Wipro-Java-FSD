package com.sam.elearning.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="courses")
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="course_id")
	private long id;
	@Column(name="title")
	private String title;
	@Column(name="description")
	private String description;
	@Column(name="description")
	private boolean launched;
	
	
	public Course() {
		
	}
	
	public Course(String title, String description, boolean launched) {
		this.title = title;
		this.description = description;
		this.launched = launched;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isLaunched() {
		return launched;
	}
	public void setLaunched(boolean launched) {
		this.launched = launched;
	}
	
	
}
