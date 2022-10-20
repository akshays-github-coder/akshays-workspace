package com.cwa.spring.data.jpa.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.cwa.spring.data.jpa.entity.Course;
import com.cwa.spring.data.jpa.entity.Teacher;

@SpringBootTest
public class CourseRepositoryTest {
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Test
	public void printCourses() {
		List<Course> courses = courseRepository.findAll();
		System.out.println("courses = " + courses);
	}
	
	public void saveCourseWithTeacher() {
		Teacher teacher = Teacher.builder().firstName("Priya").lastName("Singh").build();
		Course course = Course.builder().title("Python").credit(6).teacher(teacher).build();
		courseRepository.save(course);
	}
	
	@Test
	public void findAllPagination() {
		Pageable firstPageWithThreeRecords = Sort sort;
		PageRequest.of(0, 3);
		Page
	}
}
