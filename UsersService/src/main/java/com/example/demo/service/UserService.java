package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.ValueObjects.Department;
import com.example.demo.ValueObjects.ResponseTemplateVO;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;
	
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return (User) userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(int userId) {
		// TODO Auto-generated method stub
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepository.findByUserId(userId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		
		return vo;
	} 
}
