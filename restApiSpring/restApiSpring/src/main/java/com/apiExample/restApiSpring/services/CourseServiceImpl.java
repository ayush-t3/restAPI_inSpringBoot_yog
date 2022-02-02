package com.apiExample.restApiSpring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.apiExample.restApiSpring.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	private List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(142, "Angular Course", "A basic introduction in Angular"));
		list.add(new Course(143, "Java Core Course", "A basic introduction in Java Programming"));
		list.add(new Course(144, "React.js Course", "A complete course in React.js library"));
		list.add(new Course(145, "Node.js Course", "A complete reference in Node.js"));
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course crs = null;
		for(Course c: list) {
			if(c.getId() == courseId) {
				crs = c;
				break;
			}
		}
		return crs;
	}

	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
	}

	@Override
	public String deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		for(Course c: list) {
			if(c.getId() == courseId) {
				list.remove(c);
				return "Deletion Succeded";
			}
		}
		
		return "Deletion can't occur";
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		Course crs = null;
		for(Course c: list) {
			if(c.getId() == course.getId()) {
				list.remove(c);
				c.setCourseName(course.getCourseName());
				c.setDescription(course.getDescription());
				list.add(c);
				crs = course;
				break;
			}
		}
		return crs;
	}

}
