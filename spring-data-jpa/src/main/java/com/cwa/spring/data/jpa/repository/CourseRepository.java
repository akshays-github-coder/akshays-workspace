package com.cwa.spring.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cwa.spring.data.jpa.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
