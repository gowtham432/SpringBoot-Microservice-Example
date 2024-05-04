package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentservice;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {

		return departmentservice.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department findDepartment(@PathVariable("id") int deparmentId) {
		 	
		return departmentservice.findByDepartmentId(deparmentId);
	} 
}
