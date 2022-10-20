package com.cwa.spring.data.jpa.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cwa.spring.data.jpa.entity.Course;
import com.cwa.spring.data.jpa.entity.Teacher;

@SpringBootTest
public class TeacherRepositoryTest {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Test
	public void SaveTeacher() {
		Course courseDBA = Course.builder().title("DBA").credit(5).build();
		Course courseJava = Course.builder().title("Java").credit(6).build();
		Teacher teacher = Teacher.builder().firstName("Qutub").lastName("Khan").courses(List.of(courseDBA, courseJava)).build();
		
		teacherRepository.save(teacher);
	}
}