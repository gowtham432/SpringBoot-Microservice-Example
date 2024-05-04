package com.example.demo.ValueObjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	
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
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
