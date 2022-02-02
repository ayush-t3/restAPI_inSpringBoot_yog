package com.apiExample.restApiSpring.services;

import java.util.List;

import com.apiExample.restApiSpring.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public void addCourse(Course course);
	public String deleteCourse(long courseId);
	public Course updateCourse(Course course);
}
