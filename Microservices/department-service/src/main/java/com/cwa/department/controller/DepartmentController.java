package com.cwa.department.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cwa.department.entity.Department;
import com.cwa.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	private static final Logger log = LoggerFactory.getLogger(DepartmentController.class);
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Inside saveDepartment method of DepartmentController");
		return departmentService.saveDepartment(department);
	}

	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		log.info("Inside findDepartmentById method of DepartmentController");
		return departmentService.findDepartmentById(departmentId);
	}
	
	@GetMapping("/")
	public List<Department> findAllDepartment() {
		log.info("Inside findAllDepartment method of DepartmentController");
		return departmentService.findAllDepartment();
	}
		
	@DeleteMapping("/{id}")
	public Department deleteDepartmentById(@PathVariable("id") Long departmentId) {
		log.info("Inside deleteDepartmentById method of DepartmentController");
		return departmentService.deleteDepartmentById(departmentId);	
	}
	
}
