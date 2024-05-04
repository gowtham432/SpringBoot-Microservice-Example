package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ValueObjects.ResponseTemplateVO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userservice;
	
	@PostMapping("/")
	private User saveUser(@RequestBody User user) {
		
		return userservice.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getUserwithDepartment(@PathVariable("id") int userId) {
		return userservice.getUserWithDepartment(userId);
	}
}
