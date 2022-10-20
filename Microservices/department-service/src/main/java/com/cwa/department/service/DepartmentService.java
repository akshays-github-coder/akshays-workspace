package com.cwa.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cwa.department.entity.Department;
import com.cwa.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
 
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside saveDeparment method of class DepartmentService");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("Inside findByDepartmentId method of class DepartmentService");
		return departmentRepository.findByDepartmentId(departmentId);
	}
	
	public List<Department> findAllDepartment() {
		log.info("Inside findAllDepartment method of class DepartmentService");
		return departmentRepository.findAll();
	}

	public Department deleteDepartmentById(Long departmentId) {
		
		return departmentRepository.deleteDepartmentById(departmentId);
	}

	
}

