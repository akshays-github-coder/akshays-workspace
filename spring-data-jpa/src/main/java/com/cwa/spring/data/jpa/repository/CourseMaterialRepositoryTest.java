package com.cwa.spring.data.jpa.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cwa.spring.data.jpa.entity.Course;
import com.cwa.spring.data.jpa.entity.CourseMaterial;

@SpringBootTest
public class CourseMaterialRepositoryTest {

	@Autowired
	private CourseMaterialRepository courseMaterialRepository;
	
	public void SaveCourseMaterial() {
		
		Course course = Course.builder().title("DSA").credit(6).build();
		CourseMaterial courseMaterial = CourseMaterial.builder().url("www.amazon.com") // .course(course)
				.build();
		courseMaterialRepository.save(courseMaterial);
	}
	
	@Test
	public void printAllCourseMaterials() {
		List<CourseMaterial> courseMaterials = courseMaterialRepository.findAll();
		System.out.println("courseMaterials = " + courseMaterials);
	}
}
