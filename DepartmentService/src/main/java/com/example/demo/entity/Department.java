package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int departmentId;
	private String departmentName;
	private String departmentAdress;
	private String departmentCode;
	public Department(int departmentId, String departmentName, String departmentAdress, String departmentCode) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAdress = departmentAdress;
		this.departmentCode = departmentCode;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAdress() {
		return departmentAdress;
	}
	public void setDepartmentAdress(String departmentAdress) {
		this.departmentAdress = departmentAdress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	
	
	
}
